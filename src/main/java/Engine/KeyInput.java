package Engine;

import org.lwjgl.glfw.GLFWKeyCallback;

import static org.lwjgl.glfw.GLFW.GLFW_PRESS;
import static org.lwjgl.glfw.GLFW.GLFW_RELEASE;

/**
 * Klasa przechowujaca ID dla klawiszy
 */
public class KeyInput extends GLFWKeyCallback
{
    public static boolean[] hold = new boolean[600];
    public static boolean[] press = new boolean[600];
    public static boolean[] release = new boolean[600];
    @Override
    public void invoke(long window, int key, int scancode, int action, int mods)
    {
        hold[key] = action != GLFW_RELEASE;
        press[key] = action == GLFW_PRESS;
        release[key] = action == GLFW_RELEASE;
    }
}