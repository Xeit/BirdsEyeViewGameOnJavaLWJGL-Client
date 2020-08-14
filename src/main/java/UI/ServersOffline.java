package UI;

import Engine.Render.RenderString;

import static Engine.Render.RenderQuad.renderQuad;
import static Engine.Values.Window.window;
import static org.lwjgl.glfw.GLFW.glfwPollEvents;
import static org.lwjgl.glfw.GLFW.glfwSwapBuffers;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL11.GL_PROJECTION;

/**
 * Klasa renderujaca informacje, ze serwer jest offline
 */
public class ServersOffline
{
    /**
     * Funkcja renderujaca informacje, ze serwer jest offline
     * @param time - czas jaki zostal do ponownej proby
     */
    public void serversOffline(Integer time)
    {
        glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
        glMatrixMode(GL_PROJECTION);

        renderQuad( 0f, 800f, 1200f, 0f, 0.7f, 0.7f, 0.7f);

        new RenderString( "SERVERS OFFLINE TRY AGAIN IN", 5f, 260f, 417f );

        new RenderString( time.toString(), 7f, 580f, 360f);


        glfwSwapBuffers(window);
        glfwPollEvents();
        Engine.MaxFPS.sync(60);

    }
}
