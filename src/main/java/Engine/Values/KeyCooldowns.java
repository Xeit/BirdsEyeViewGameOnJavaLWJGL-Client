package Engine.Values;

import java.util.ArrayList;

/**
 * 
 *
 * Klasa majaca za zadanie sprawic aby po wcisnieciu klawisza obsluga klikniecia nie byla powtorzona
 */
public class KeyCooldowns extends KeyPressedCooldown
{
    private static ArrayList<Boolean> keyPressed = new ArrayList<Boolean>();

    private static ArrayList<KeyPressedCooldown> keyPressedCooldowns = new ArrayList<KeyPressedCooldown>();


    /**
     * Funkcja inicjujaca poczatkowe ustawienie (klawisze nie wcisniete, 0 cooldownu)
     */
    public static void KeyCooldowns()
    {
        for(int i = 1; i < 350; i++)
        {
            keyPressedCooldowns.add(new KeyPressedCooldown(i, 0));
            keyPressed.add(false);
        }
    }

    /**
     * Funkcja sprawdzajaca czy mozna obslugiwac klawisz po jego wcisnieciu
     * @param keyID - ID sprawdzanego klawisza
     * @return - Czy mozna wcisnac klawisz TRUE - mozna, FALSE - nie mozna
     */
    public static boolean checkKeyCooldown(int keyID)
    {
        KeyPressedCooldown keyChecked =  keyPressedCooldowns.get(keyID);
        if(keyChecked.checkCooldown() == true)
            return true;
        else
            return false;
    }

    /**
     * Funkcja zmniejszajaca cooldown co kazda klatke
     */
    public static void lowerCooldownOnKeys()
    {
        for(KeyPressedCooldown key : keyPressedCooldowns)
            key.lowerCooldown();
    }

    /**
     * Funkcja ustawiajaca cooldown dla odpowiedniego klawisza na odpowiednia ilosc czasu
     * @param keyID - ID klawisza
     * @param time - czas jaki chcemy ustawic (w klatkach)
     */
    public static void setCooldown(int keyID, int time)
    {
        KeyPressedCooldown keyChecked =  keyPressedCooldowns.get(keyID);
        keyChecked.setCooldown(time);
    }

    /**
     * Funkcja ustawiajaca, ze klawisz jest aktualnie wcisniety
     * @param keyID - ID klawisza
     */
    public static void pressed(int keyID)
    {
        keyPressed.set(keyID, true);
    }

    /**
     * Funkcja ustawiajaca, ze klawisz jest aktualnie nie wcisniety
     * @param keyID - ID klawisza
     */
    public static void released(int keyID)
    {
        keyPressed.set(keyID, false);
    }

    /**
     * Funkcja sprawdzajaca czy klawisz jest aktualnie wcisniety
     * @param keyID - ID klawisza
     * @return - Zwraca TRUE jezeli klawisz jest wcisniety, FALSE jezeli nie jest wcisniety
     */
    public static boolean isKeyPressed(int keyID)
    {
        Boolean check = keyPressed.get(keyID);
            if(check == true)
                return true;
            else
                return false;
    }
}
