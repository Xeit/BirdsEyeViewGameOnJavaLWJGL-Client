package UI;

import Engine.Render.RenderString;
import Engine.Values.Map;
import Engine.Values.Player;

import static Engine.Render.RenderQuad.renderQuad;
import static Engine.Render.RenderTexture.renderTexture;
import static Engine.Render.Textures.*;
import static Engine.Values.textFromKeyboard.getChat;

/**
 * Klasa w ktorej nastepuje renderowanie okna gry po zalogowaniu sie
 */
public class Game
{
    /**
     * Funkcja w ktorej nastepuje renderowanie okna gry po zalogowaniu sie
     */
    public static void game()
    {
        /*
        for(Integer i = 0, y = 809; i < 15; i++)
        {
            for (Integer j = 0, x = 98; j < 15; j++)
            {
                renderTexture("Grass1.png", 1f, x.floatValue(), y.floatValue());
                x += 48;
            }
            y -= 48;
        }

        */

        Integer i = 0, j = 0;
        Integer x = 0, y = 0;

        Integer xTitle = Player.getPosX().intValue();
        Integer yTitle = Player.getPosY().intValue();

        Double pixels = (48 *  (Player.getWantedY().subtract(Player.getPosY()).doubleValue()) );
        y = 857 - pixels.intValue();
        pixels = (48 * (Player.getWantedX().subtract(Player.getPosX()).doubleValue()));
        x = 98 + pixels.intValue();

        // renderowanie mapy
        for(i = yTitle - 9; i < yTitle + 7; i++)
        {
            for(j = xTitle - 8; j < xTitle + 8; j++)
            {
                switch(Map.map[j][i])
                {
                    case 1:
                        renderTexture(Grass1, 1f, x.floatValue(), y.floatValue());
                        break;
                    case 2:
                        renderTexture(Brick1, 1f, x.floatValue(), y.floatValue());
                        break;
                    default:
                        System.out.println("Texture ID missing.");
                        break;
                }
                x += 48;
            }
            x = 82 + pixels.intValue();
            y -= 48;
        }
        renderTexture(Player1, 1f, 434f, 473f);

        //Croping render into game  window
        renderQuad(117f, 790f, 122f, 156f, 0.2f, 0.2f, 0.2f); //left
        renderQuad(117f, 790f, 751f, 785f, 0.2f, 0.2f, 0.2f); //top
        renderQuad(746f, 790f, 751f, 156f, 0.2f, 0.2f, 0.2f); //right
        renderQuad(117f, 161f, 751f, 156f, 0.2f, 0.2f, 0.2f); //down


        renderQuad(0f, 800f, 117f, 140f, 0.7f, 0.7f, 0.7f);//left
        renderQuad(0f, 156f, 1600f, 0f, 0.7f, 0.7f, 0.7f);//down
        renderQuad(751f, 800f, 1600f, 0f, 0.7f, 0.7f, 0.7f);//right
        renderQuad(0f, 800f, 1600f, 790f, 0.7f, 0.7f, 0.7f);//top

        //Chat
        renderQuad(10f, 141f, 857f, 10f, 0.2f, 0.2f, 0.2f);
        renderQuad( 15f, 32f, 852f, 15f, 0.8f, 0.8f, 0.8f);
        renderQuad(15f, 136f, 852f, 38f, 0.8f, 0.8f,0.8f);
        //Player chat
        new RenderString( Player.getNickname() + ": " + getChat().getText(), 2f, 15f, 15f);




//        for(i = 0, y = 761; i < 13; i++)
//        {
//            for (j = 0, x = 146; j < 13; j++)
//            {
//                Engine.Values.Player.getPosX().intValue();
//                Engine.Values.Player.getPosY().intValue();
//
//                renderTexture("Grass1.png", 1f, x.floatValue(), y.floatValue());
//                x += 48;
//            }
//            y -= 48;
//        }
//        renderTexture("Player1.png", 1f, 434f, 473f);
    }
}
