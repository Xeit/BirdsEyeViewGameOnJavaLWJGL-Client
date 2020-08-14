package Engine.Values;

import java.math.BigDecimal;

/**
 * Klasa odpowiadajaca za aktualizacje pozycji postaci wyswietlanej na ekranie
 */
public class PlayerMovement
{
    /**
     * Funkcja aktualizujaca pozycje gracza (poruszajaca postac) jezeli porzadana pozycja X lub / i Y
     * jest inna od aktualnej
     */
    public static void updatePosition()
    {
        Player.prevX = Player.getPosX();
        Player.prevY = Player.getPosY();
        if(Player.getWantedX().compareTo(Player.getPosX()) != 0)
        {
            if(Player.getWantedX().doubleValue() < Player.getPosX().doubleValue())
            {
                Player.moveX(new BigDecimal(-0.05));
            }else if(Player.getWantedX().doubleValue() > Player.getPosX().doubleValue())
            {
                Player.moveX( new BigDecimal(0.05));
            }
        }

        if(Player.getWantedY().compareTo(Player.getPosY()) != 0)
        {
            if(Player.getWantedY().doubleValue() < Player.getPosY().doubleValue())
            {
                Player.moveY(-0.05);
            }else if(Player.getWantedY().doubleValue() > Player.getPosY().doubleValue())
            {
                Player.moveY(0.05);
            }
        }
    }


    /**
     * Funkcja zezwalajaca na poruszenie sie w gore jesli postac aktualnie sie nie porusza w osi Y
     */
    public static void up()
    {
        if(Player.getWantedY().compareTo(Player.getPosY()) == 0)
        {
            Player.goUp();
        }
    }

    /**
     * Funkcja zezwalajaca na poruszenie sie w dol jesli postac aktualnie sie nie porusza w osi Y
     */
    public static void down()
    {
        if(Player.getWantedY().compareTo(Player.getPosY()) == 0)
        {
            Player.goDown();
        }
    }

    /**
     * Funkcja zezwalajaca na poruszenie sie w lewo jesli postac aktualnie sie nie porusza w osi X
     */
    public static void left()
    {
        if(Player.getWantedX().compareTo(Player.getPosX()) == 0)
        {
            Player.goLeft();
        }
    }

    /**
     * Funkcja zezwalajaca na poruszenie sie w prawo jesli postac aktualnie sie nie porusza w osi X
     */
    public static void right()
    {
        if(Player.getWantedX().compareTo(Player.getPosX()) == 0)
        {
            Player.goRight();
        }
    }
}
