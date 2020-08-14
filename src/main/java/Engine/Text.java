package Engine;

/**
 * Klasa obslugujaca text jako stringa
 */
public class Text
{
    private volatile String text;

    /**
     * @param text - text przypisywany
     */
    public Text(String text)
    {
        this.text = text;
    }

    /**
     * Dzialajacy backspace
     */
    public void backspace()
    {
        if(this.text.length() > 0)
            this.text = this.text.substring(0, this.text.length()-1);
    }

    /**
     * Funkcja dodajaca odpowiednia litere do stringa
     * @param letter - jaka litera ma byc dodana
     */
    public void add(Character letter)
    {
        this.text += letter;
    }

    /**
     * @return zwracanie textu jako string
     */
    public String getText()
    {
        return this.text;
    }
}

