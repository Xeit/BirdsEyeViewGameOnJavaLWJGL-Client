import Engine.KeyInput;
import Engine.MaxFPS;
import Engine.Values.*;
import Network.NetworkClient;
import Network.NetworkValues;
import UI.*;
import org.lwjgl.*;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;


import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.*;
import java.util.concurrent.TimeUnit;

import static Engine.Keys.inGameKeys;
import static Engine.Keys.textInput;
import static Engine.Values.textFromKeyboard.text;
import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

import static Engine.Values.Window.*;


public class MainClass
{
    // The window handle
    private GLFWKeyCallback keyCallback;


    

    public int widthWindow = 1200;
    public int heightWindow = 800;


    private void run() throws IOException, InterruptedException {
        System.out.println("Hello LWJGL " + Version.getVersion() + "!");

        init();
        //network();
        loop();

        // Free the window callbacks and destroy the window
        glfwFreeCallbacks(window);
        glfwDestroyWindow(window);

        // Terminate GLFW and free the error callback
        glfwTerminate();
        glfwSetErrorCallback(null).free();
    }

    private void init()
    {
        // Setup an error callback. The default implementation
        // will print the error message in System.err.
        GLFWErrorCallback.createPrint(System.err).set();

        // Initialize GLFW. Most GLFW functions will not work before doing this.
        if ( !glfwInit() )
            throw new IllegalStateException("Unable to initialize GLFW");

        // Configure GLFW
        glfwDefaultWindowHints(); // optional, the current window hints are already the default
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE); // the window will stay hidden after creation
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE); // the window will be resizable

        // Create the window
        window = glfwCreateWindow(widthWindow, heightWindow, "Game", NULL, NULL);
        if ( window == NULL )
            throw new RuntimeException("Failed to create the GLFW window");

        // Get the thread stack and push a new frame
        try ( MemoryStack stack = stackPush() )
        {
            IntBuffer pWidth = stack.mallocInt(1); // int*
            IntBuffer pHeight = stack.mallocInt(1); // int*

            // Get the window size passed to glfwCreateWindow
            glfwGetWindowSize(window, pWidth, pHeight);

            // Get the resolution of the primary monitor
            GLFWVidMode vidmode = glfwGetVideoMode(glfwGetPrimaryMonitor());

            // Center the window
            glfwSetWindowPos(
                    window,
                    (vidmode.width() - pWidth.get(0)) / 2,
                    (vidmode.height() - pHeight.get(0)) / 2
            );
        } // the stack frame is popped automatically

        // Make the OpenGL context current
        glfwMakeContextCurrent(window);
        // Enable v-sync
        glfwSwapInterval(0);


        Engine.Values.Player.initiateTestPlayer();
        Engine.Textures.MapTiles.initiateMapTiles();

        Engine.LoadMap.LoadMap();

        // Make the window visible
        glfwShowWindow(window);
    }

    private void loop() throws InterruptedException {
        // This line is critical for LWJGL's interoperation with GLFW's
        // OpenGL context, or any context that is managed externally.
        // LWJGL detects the context that is current in the current thread,
        // creates the GLCapabilities instance and makes the OpenGL
        // bindings available for use.
        GL.createCapabilities();

        glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);

        glOrtho(0,widthWindow,0, heightWindow, -1,1);




        // Run the rendering loop until the user has attempted to close
        while ( !glfwWindowShouldClose(window) )
        {
            // Set the clear color
            glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT); // clear the framebuffer

            glMatrixMode(GL_PROJECTION);

            if(gameState == GameState.GAME)
            {
                inGameKeys(text);
                Game.game();
                InGameBasic.inGameBasic();
                PlayerStatsEqInv.playerStatsEqInv();
                PlayerMovement.updatePosition();
            }else if(gameState == GameState.LOGIN_SCREEN)
            {
                glfwSetKeyCallback(window, keyCallback = new KeyInput());
                textInput(text);
                new LoginScreen();
                KeyCooldowns.lowerCooldownOnKeys();
            }else if(gameState == GameState.CONNECTING)
            {
                boolean connected = true;
                InetAddress address= null;
                try {
                    address = InetAddress.getLocalHost();
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }

                try {
                    connected = NetworkClient.connect();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if(connected == true)
                {
                    NetworkValues.os.println(textFromKeyboard.getLogin().getText()+";"+textFromKeyboard.getPassword().getText()+";");

                    try
                    {
                        //Check if login and password is ok from server
                        if(NetworkValues.is.readLine().equals("YES"))
                        {
                            NetworkValues.os.println("001");
                            new GetStats(NetworkValues.is.readLine());

                            gameState = GameState.GAME;
                            chatState = ChatState.MOVEMENT;
                            textFromKeyboard.textIsChat();
                            KeyCooldowns.pressed(GLFW_KEY_ENTER);
                        }else
                        {
                            for(int time = 10; time > 0; time--)
                            {
                                new WrongLoginPassword().wrongLoginPassword(time);
                                try
                                {
                                    TimeUnit.SECONDS.sleep(1);
                                } catch (InterruptedException ex)
                                {
                                    ex.printStackTrace();
                                }
                            }
                            gameState = GameState.LOGIN_SCREEN;
                        }
                    } catch (IOException e)
                    {
                        e.printStackTrace();
                    }
                }
                NetworkValues.os.println(address.toString());
                System.out.println("Client Address : "+address);

            }else if(gameState == GameState.LOADING)
            {
                KeyCooldowns.KeyCooldowns();
                gameState = GameState.LOGIN_SCREEN;
            }



            glfwSwapBuffers(window); // swap the color buffers

            // Poll for window events. The key callback above will only be
            // invoked during this call.
            glfwPollEvents();
            MaxFPS.sync(60);
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        new MainClass().run();
    }

}