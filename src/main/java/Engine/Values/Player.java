package Engine.Values;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import static Network.NetworkValues.*;

/**
 * Klasa przechowujaca wszystkie dane postaci oraz interakcje jakie postac moze zrobic
 */
public class Player
{
    private static String nickname;
    private static Integer level;
    private static Long xpToNextLvl;

    private static BigDecimal posX = BigDecimal.valueOf(0.0);
    private static BigDecimal posY = BigDecimal.valueOf(0.0);
    private static BigDecimal wantedX = BigDecimal.valueOf(0.0);
    private static BigDecimal wantedY = BigDecimal.valueOf(0.0);
    public static BigDecimal prevX = BigDecimal.valueOf(0.0);
    public static BigDecimal prevY = BigDecimal.valueOf(0.0);

    private static Integer maxHP;
    private static Integer maxMana;
    private static Integer currentHP;
    private static Integer currentMana;

    private static Integer[][] inventory = new Integer[6][5];

    /**
     * Funkcja inicjujaca testowe dane (sa nadpisywane przez dane pobrane z serwera)
     */
    public static void initiateTestPlayer()
    {
        nickname = "Test";
        level = 1;
        xpToNextLvl = 999999L;

        posX = BigDecimal.valueOf(20d);
        posY = BigDecimal.valueOf(20d);
        wantedX = BigDecimal.valueOf(20d);
        wantedY = BigDecimal.valueOf(20d);
        prevX = BigDecimal.valueOf(20d);
        prevY = BigDecimal.valueOf(20d);

        maxHP = 100;
        maxMana = 100;
        currentHP = 75;
        currentMana = 20;

        for(int x = 0; x < 6;x++)
        {
            for (int y = 0; y < 5; y++)
            {
                inventory[x][y] = 2000; // DEFAULT EMPTY INVENTORY
            }
        }
    }

    /**
     * Funkcja ladujaca dane postaci otrzymane z serwera
     * @param gnickname - nickname postaci
     * @param glevel - level
     * @param gxpToNextLvl - xp potrzebne do nastepnego poziomu
     * @param gposX - pozycja X
     * @param gposY - pozycja Y
     * @param gmaxHP - maxymalne HP jakie postac moze posiadac
     * @param gmaxMana - maxymalna Mana jaka postac moze posiadac
     * @param gcurrentHP - aktualne HP postaci
     * @param gcurrentMana - aktualna Mana postaci
     */
    public static void initiatePlayer(String gnickname, Integer glevel, Long gxpToNextLvl, Integer gposX, Integer gposY, Integer gmaxHP, Integer gmaxMana, Integer gcurrentHP, Integer gcurrentMana)
    {
        nickname = gnickname;
        level = glevel;
        xpToNextLvl = gxpToNextLvl;

        posX = BigDecimal.valueOf(gposX);
        posY = BigDecimal.valueOf(gposY);
        wantedX = posX;
        wantedY = posY;
        prevX = posX;
        prevY = posY;

        maxHP = gmaxHP;
        maxMana = gmaxMana;
        currentHP = gcurrentHP;
        currentMana = gcurrentMana;

        for(int x = 0; x < 6;x++)
        {
            for (int y = 0; y < 5; y++)
            {
                inventory[x][y] = 2000; // DEFAULT EMPTY INVENTORY
            }
        }
    }

    public static String getNickname()
    {
        return  nickname;
    }
    public static Integer getLevel()
    {
        return level;
    }
    public static Long getXpToNextLvl()
    {
        return xpToNextLvl;
    }
    public static BigDecimal getPosX()
    {
        return posX;
    }
    public static BigDecimal getPosY()
    {
        return posY;
    }
    public static BigDecimal getWantedX()
    {
        return wantedX;
    }
    public static BigDecimal getWantedY()
    {
        return wantedY;
    }
    public static Integer getMaxHP()
    {
        return maxHP;
    }
    public static Integer getMaxMana()
    {
        return maxMana;
    }
    public static Integer getCurrentHP()
    {
        return currentHP;
    }
    public static Integer getCurrentMana()
    {
        return currentMana;
    }

    /**
     * Funkcja aktualizujaca aktualna pozycje X postaci
     * @param value - wartosc na jaka pozycja X ma byc ustawiona
     */
    public static void moveX(BigDecimal value)
    {
        double fckFloats = posX.doubleValue() + value.doubleValue();
        posX =new BigDecimal(fckFloats).round(new MathContext(10,RoundingMode.HALF_UP));
    }

    /**
     * Funkcja aktualizujaca aktualna pozycje Y postaci
     * @param value - wartosc na jaka pozycja Y ma byc ustawiona
     */
    public static void moveY(Double value)
    {
        double fckFloats = posY.doubleValue() + value.doubleValue();
        posY = new BigDecimal(fckFloats).round(new MathContext(10,RoundingMode.HALF_UP));
    }

    /**
     * Funkcja informujaca serwer, ze postac chce isc do gory oraz aktualizujaca pozycje jesli serwer wyrazi zgode
     */
    public static void goUp()
    {
        os.println("100");
        os.flush();
        Double fckFloats = null;
        String message = null;
        try {
            message = is.readLine();
            if(message.compareTo("NO")!=0)
            {
                fckFloats = Double.valueOf(message);
                wantedY = new BigDecimal(fckFloats).round(new MathContext(10, RoundingMode.HALF_UP));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Funkcja informujaca serwer, ze postac chce isc w dol oraz aktualizujaca pozycje jesli serwer wyrazi zgode
     */
    public static void goDown()
    {
        os.println("101");
        os.flush();
        Double fckFloats = null;
        String message = null;
        try {
            message = is.readLine();
            if(message.compareTo("NO")!=0)
            {
                fckFloats = Double.valueOf(message);
                wantedY = new BigDecimal(fckFloats).round(new MathContext(10, RoundingMode.HALF_UP));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Funkcja informujaca serwer, ze postac chce isc w lewo oraz aktualizujaca pozycje jesli serwer wyrazi zgode
     */
    public static void goLeft()
    {
        os.println("102");
        os.flush();
        Double fckFloats = null;
        String message = null;
        try {
            message = is.readLine();
            if(message.compareTo("NO")!=0)
            {
                fckFloats = Double.valueOf(message);
                wantedX = new BigDecimal(fckFloats).round(new MathContext(10, RoundingMode.HALF_UP));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Funkcja informujaca serwer, ze postac chce isc w prawo oraz aktualizujaca pozycje jesli serwer wyrazi zgode
     */
    public static void goRight()
    {
        os.println("103");
        os.flush();
        Double fckFloats = null;
        String message = null;
        try {
            message = is.readLine();
            if(message.compareTo("NO")!=0)
            {
                fckFloats = Double.valueOf(message);
                wantedX = new BigDecimal(fckFloats).round(new MathContext(10, RoundingMode.HALF_UP));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
