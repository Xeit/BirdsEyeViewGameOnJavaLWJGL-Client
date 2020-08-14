package Engine.Values;

/**
 * Class that translates text from server to stats
 *
 * Klasa tlumaczaca text otrzymany z serwera na statystyki
 */
public class GetStats
{
    /**
     * Function that loads player stats that got from server
     *
     * Funkcja majaca za zadanie zaladowanie statystyk gracza, ktore otrzyma od serwera
     * @param line - text from server / text otrzymany od serwera
     */
    public GetStats(String line)
    {
        Integer level = null;
        Long xpToNextLvl = null;
        Integer posX = null;
        Integer posY = null;
        Integer maxHP = null;
        Integer maxMana = null;
        Integer currentHP = null;
        Integer currentMana = null;
        String nickname = null;
        String numberString = "";
        char[] number = line.toCharArray();
        int letter = 0;
        //Nickname
        while(number[letter] != ';')
        {
            numberString = numberString + number[letter];
            nickname = numberString;
            letter++;
        }
        numberString = "";
        letter++;
        //lvl
        while(number[letter] != ';')
        {
            numberString = numberString + number[letter];
            level = Integer.valueOf(numberString);
            letter++;
        }
        numberString = "";
        letter++;
        //xpToNextLvl
        while(number[letter] != ';')
        {
            numberString = numberString + number[letter];
            xpToNextLvl = Long.valueOf(numberString);
            letter++;
        }
        numberString = "";
        letter++;
        //posX
        while(number[letter] != ';')
        {
            numberString = numberString + number[letter];
            posX = Integer.valueOf(numberString);
            letter++;
        }
        numberString = "";
        letter++;
        //posY
        while(number[letter] != ';')
        {
            numberString = numberString + number[letter];
            posY = Integer.valueOf(numberString);
            letter++;
        }
        numberString = "";
        letter++;
        //maxHP
        while(number[letter] != ';')
        {
            numberString = numberString + number[letter];
            maxHP = Integer.valueOf(numberString);
            letter++;
        }
        numberString = "";
        letter++;
        //maxMana
        while(number[letter] != ';')
        {
            numberString = numberString + number[letter];
            maxMana = Integer.valueOf(numberString);
            letter++;
        }
        numberString = "";
        letter++;
        //currentHP
        while(number[letter] != ';')
        {
            numberString = numberString + number[letter];
            currentHP = Integer.valueOf(numberString);
            letter++;
        }
        numberString = "";
        letter++;
        //currentMana
        while(number[letter] != ';')
        {
            numberString = numberString + number[letter];
            currentMana = Integer.valueOf(numberString);
            letter++;
        }
        Player.initiatePlayer(nickname,level,xpToNextLvl,posX,posY,maxHP,maxMana,currentHP,currentMana);
    }
}
