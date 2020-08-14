package Engine.Textures;

/**
 * Class that keeps map in memory
 * Klasa przechowujaca mape
 */
public class MapTiles
{
    private static Integer[][] mapTile = new Integer[50][50];

    /**
     * Function that loads tiles IDs to memory
     * Funkcja ladujaca domyslne textury do pamieci
     */
    public static void initiateMapTiles()
    {
        for(int x = 0; x < 50; x++)
            for(int y = 0; y < 50; y++)
                mapTile[x][y] = 0;
    }
}
