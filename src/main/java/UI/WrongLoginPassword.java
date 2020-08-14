package UI;

import Engine.Render.RenderString;

import static Engine.Render.RenderQuad.renderQuad;
import static Engine.Values.Window.window;
import static org.lwjgl.glfw.GLFW.glfwPollEvents;
import static org.lwjgl.glfw.GLFW.glfwSwapBuffers;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL11.GL_PROJECTION;

/**
 * Klasa renderujaca informacje, ze login i / lub haslo sa niepoprawne
 */
public class WrongLoginPassword
{
    /**
     * Funkcja renderujaca informacje, ze login i/lub haslo sa bledne
     * @param time czas jaki pozostal do kolejnej proby
     */
    public void wrongLoginPassword(Integer time)
    {
        glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
        glMatrixMode(GL_PROJECTION);

        renderQuad( 0f, 800f, 1200f, 0f, 0.7f, 0.7f, 0.7f);

        new RenderString( "WRONG LOGIN / PASSWORD TRY AGAIN IN", 5f, 220f, 417f );


        new RenderString( time.toString(), 7f, 580f, 360f);


        glfwSwapBuffers(window);
        glfwPollEvents();
        Engine.MaxFPS.sync(60);

    }
}
