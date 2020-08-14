package Engine.Render;

import java.awt.image.BufferedImage;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL11.GL_TEXTURE_2D;

/**
 * Class used to render textures
 * Klasa do wyswietlania textur
 */
public class RenderTexture
{
    /**
     * Function to render single letter.
     * Funkcja renderujaca litere na ekranie.
     * @param letterInt - ID of letter / ID litery
     * @param posX - position X (down left) / pozycja X litery (dolna lewa)
     * @param posY - position Y (down left) / pozycja Y litery (dolna lewa)
     * @param width - width of the letter / szerokosc litery
     * @param height - height of the letter / wysokosc litery
     */
    public static void renderLetter(Integer letterInt, Float posX, Float posY, Float width, Float height)
    {
        glBindTexture(GL_TEXTURE_2D, letterInt);
        glEnable(GL_TEXTURE_2D);
        glEnable(GL_BLEND);
        glColor4f(1f,1f,1f,1f);
        glBegin(GL_QUADS);
        {
            glTexCoord2f(0, 0);
            glVertex2f(posX, posY + height);

            glTexCoord2f(1, 0);
            glVertex2f(posX + width, posY + height);

            glTexCoord2f(1, 1);
            glVertex2f(posX + width, posY);

            glTexCoord2f(0, 1);
            glVertex2f(posX, posY);
        }
        glEnd();
        glDisable(GL_BLEND);
        glDisable(GL_TEXTURE_2D);
        glBindTexture(GL_TEXTURE_2D, 0);
    }

    /**
     * Funkcja renderujaca texture na ekranie.
     * @param textureID - Numer ID textury in folder src/main/resources/textures/
     * @param scale - skala textury (polecam tylko liczby calkowite)
     * @param posX - X center of texture
     * @param posY - Y center of texture
     */
    public static void renderTexture(Integer textureID/*String location*/, Float scale, Float posX, Float posY)
    {
//        BufferedImage file = TextureLoader.loadImage("src/main/resources/textures/" + location);
//        Integer textureID = TextureLoader.loadTexture(file);

        //Integer textureID = LoadTextures.textureIDs.get(name);

        float halfWidth = (48 * scale) / 2;
        float halfHeight = (48 * scale) / 2;



        glBindTexture(GL_TEXTURE_2D, textureID);
        glEnable(GL_TEXTURE_2D);
        glEnable(GL_BLEND);
        glColor4f(1f,1f,1f,1f);
        glBegin(GL_QUADS);
        {
            glTexCoord2f(0, 0);
            glVertex2f(posX - halfWidth, posY + halfHeight);

            glTexCoord2f(1, 0);
            glVertex2f(posX + halfWidth, posY + halfHeight);

            glTexCoord2f(1, 1);
            glVertex2f(posX + halfWidth, posY - halfHeight);

            glTexCoord2f(0, 1);
            glVertex2f(posX - halfWidth, posY - halfHeight);
        }
        glEnd();
        glDisable(GL_BLEND);
        glDisable(GL_TEXTURE_2D);
        glBindTexture(GL_TEXTURE_2D, 0);

    }


}
