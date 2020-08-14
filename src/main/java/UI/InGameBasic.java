package UI;

import Engine.Render.RenderString;
import Engine.Render.TextureLoader;

import java.awt.image.BufferedImage;

import static Engine.Render.RenderQuad.renderQuad;
import static Engine.Render.RenderTexture.renderTexture;
import static org.lwjgl.opengl.GL11.*;

/**
 * Klasa renderujaca podstawowe menusy po zalogowaniu sie
 */
public class InGameBasic
{
    public static void inGameBasic()
    {

        //Inventory
        renderQuad(867, 386, 1190,  10, 0.2f, 0.2f, 0.2f);
        for(int j = 0, y = 381; j < 7; j++)
        {
            for(int i = 0, x = 872; i < 6; i++)
            {
                renderQuad(x, y, x + 48, y - 48, 1f, 1f, 1f);
                x += 48 + 5;
            }
            y -= (48 + 5);
        }

        //siatka ekwipunku
        renderQuad(867, 613, 1031, 396, 0.2f, 0.2f, 0.2f);
        for(int i = 0, y = 608; i < 4; i++)
        {
            renderQuad(925, y, 973, y - 48, 1f, 1f, 1f);
            y -= 48 + 5;
        }
        for(int j = 0, y = 584; j < 3; j++)
        {
            for(int i = 0, x = 872; i < 2; i++)
            {
                renderQuad(x, y, x + 48, y - 48, 1f, 1f, 1f);
                x += 106;
            }
            y -= (48 + 5);
        }

        //logout i options
        renderQuad(1060f, 431f, 1170f, 395f, 0.2f, 0.2f, 0.2f);
        renderQuad(1065f, 426f, 1165f, 400f, 0.9f, 0.9f, 0.9f);
        new RenderString("LOGOUT", 3f, 1073f, 402f);

        renderQuad(1060f, 471f, 1170f, 436f, 0.2f, 0.2f, 0.2f);
        renderQuad(1065f, 466f, 1165f, 441f, 0.9f, 0.9f, 0.9f);
        new RenderString( "OPTIONS", 3f, 1067f, 443f);

        //HP i MANA
        renderQuad(867f, 701f, 1190f, 667f, 0.2f, 0.2f, 0.2f);
        renderQuad( 872f, 696f, 1185f, 672f, 0.65f, 0.2f, 0.2f);

        renderQuad(867f, 657f, 1190f, 623f, 0.2f, 0.2f, 0.2f);
        renderQuad( 872f, 652f, 1185f, 628f, 0.2f, 0.2f, 0.65f);


        // Nickname, lvl i xp do nastepnego posiomu
        new RenderString("NICKNAME: ", 2f, 867f, 775f);
        new RenderString("LVL: ", 2f, 867f, 758f);
        new RenderString("XP NEEDED: ", 2f, 867f, 741f);

        //renderTexture("Amulet1.png", 1.5f, 1161f, 39f);
    }
}
