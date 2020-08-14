package Engine.Values;

import Engine.Text;

/**
 * Klasa przechowujaca wpisany text (login oraz haslo)
 */
public class textFromKeyboard
{
    private static Text login = new Text("Login");
    private static Text password = new Text("Password");
    private static Text chat = new Text(" ");

    public static Text text = login;

    /**
     * Funkcja ustawiajaca login jako wpisywany text
     */
    public static void textIsLogin()
    {
        text = login;
    }

    /**
     * Funkcja ustawiajaca haslo jako wpisywany text
     */
    public static void textIsPassword()
    {
        text = password;
    }

    /**
     * Funkcja ustawiajaca chat jako wpisywany text (aktualnie nie dziala)
     */
    public static void textIsChat()
    {
        text = chat;
    }

    /**
     * @return zwraca wpisany login
     */
    public static Text getLogin()
    {
        return login;
    }

    /**
     * @return zwraca wpisane haslo
     */
    public static Text getPassword()
    {
        return password;
    }

    /**
     * @return zwraca tresc chatu
     */
    public static Text getChat()
    {
        return chat;
    }


}
