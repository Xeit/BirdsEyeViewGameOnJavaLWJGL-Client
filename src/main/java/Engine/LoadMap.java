package Engine;

import Engine.Values.Map;

import java.io.*;

/**
 * Klasa ladujaca mape z pliku
 */
public class LoadMap
{
    /**
     * Funkcja ladujaca mape z pliku
     */
    public static void LoadMap()
    {
        File plik = new File("map.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(plik)))
        {
            String line = null;
            Integer X = 0, Y = 0;
            while( ( line = br.readLine() )!= null )
            {
                for(Character znak : line.toCharArray())
                {
                    if(znak == 'X')// grass
                    {
                        Map.map[X][Y] = 1;
                    }else if(znak == 'R')// road
                    {
                        Map.map[X][Y] = 2;
                    }else
                    {
                        System.out.println("Error - loading map, wrong symbol");
                    }
                    Y++;
                }
                X++;
                Y=0;
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        } ;
    }
}
