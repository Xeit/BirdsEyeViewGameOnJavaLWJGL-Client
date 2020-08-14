package Engine.Values;

/**
 * Klasa przechowujaca stan gry oraz stan zaladowania gry
 */
public class Window
{
    public static long window;

    public static GameState gameState = GameState.LOADING;
    public static ChatState chatState = ChatState.MOVEMENT;
}
