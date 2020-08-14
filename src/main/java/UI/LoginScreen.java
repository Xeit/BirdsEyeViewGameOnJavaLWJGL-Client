package UI;

import Engine.Render.RenderString;
import org.lwjgl.glfw.GLFWCharCallback;

import static Engine.Values.textFromKeyboard.*;
import static Engine.Values.Window.window;
import static Engine.Keys.loginScreenKeys;

import static Engine.Render.RenderQuad.renderQuad;


/**
 * Klasa renderujaca login screen
 */
public class LoginScreen
{
    /**
     * Klasa renderujaca login screen
     */
    public LoginScreen()
    {
        renderQuad( 0f, 800f, 1200f, 0f, 0.7f, 0.7f, 0.7f);

        renderQuad( 398f,  417f, 802f, 378f, 0.2f , 0.2f, 0.2f);
        renderQuad( 400f, 415f, 800f, 380f, 0.8f, 0.8f, 1f);

        renderQuad( 398f, 317f, 802f, 278f, 0.2f, 0.2f, 0.2f);
        renderQuad( 400f, 315f, 800f, 280f, 0.8f, 0.8f, 1f);

        new RenderString( "LOGIN", 5f, 530f, 417f );
        new RenderString( "PASSWORD", 5f, 500f, 317f);


        new RenderString( getLogin().getText() , 4f, 402f, 382f);
        new RenderString( getPassword().getText(), 4f,  402f, 282f);

        renderQuad(498f, 222f, 702f, 178f, 0.2f, 0.2f, 0.2f);
        renderQuad(500f, 220f, 700f, 180f, 1f, 1f, 0.8f);
        new RenderString( "ENTER", 5f, 540f, 182f);
    }
}
