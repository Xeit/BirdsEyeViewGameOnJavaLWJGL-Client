package Engine.Values;

/**
 * Klasa przechowujaca czasy cooldownu dla klawiszy
 */
public class KeyPressedCooldown
{

    private int keyID;
    private int time;

    /**
     * Domyslne ustawienie klawiszy oraz cooldowny
     */
    public KeyPressedCooldown()
    {
        keyID = 0;
        time = 0;
    }

    /**
     * Funkcja uzywana do tworzenia poczatkowych ustawien klawiszy oraz cooldownow
     * @param keyID - ID klawisza
     * @param time - czas cooldownu dla klawisza
     */
    public KeyPressedCooldown( int keyID, int time)
    {
        this.keyID = keyID;
        this.time = time;
    }

    /**
     * Funkcja sprawdzajaca czy cooldown jest rowny 0
     * @return zwraca true jezeli cooldown jest rowny 0, zwraca false jezeli cooldown jest wiekszy od 0
     */
    public boolean checkCooldown()
    {
        if(this.time <= 0)
            return true;
        else
            return false;
    }

    /**
     * Funkcja zmniejszajaca cooldown o 1 jezeli cooldown jest wiekszy od 0
     */
    public void lowerCooldown()
    {
        if(this.time > 0)
            this.time--;
    }

    /**
     * Funkcja ustawiajaca cooldown dla okreslonego klawisza
     * @param time - czas cooldownu jaki chcemy ustawic
     */
    public void setCooldown(int time)
    {
        this.time = time;
    }

}
