package Engine.Render;

import static org.lwjgl.opengl.GL11.*;

/**
 * Class used to render single color Quads (useful in background)
 * Klasa sluzaca do renderowania jednokolorowych kwadratow jako np tlo
 */
public class RenderQuad
{
    /**
     * Funkcja sluzaca do wyswietlania jednokolorowego kwadratu
     * @param TLX - Top Left X
     * @param TLY - Top Left Y
     * @param DRX - Down Right X
     * @param DRY - Down Right Y
     * @param red - How much red / Ile czerwonego
     * @param green - How much green / Ile zielonego
     * @param blue - How much blue / Ile niebieskiego
     */
    public static void renderQuad(float TLX, float TLY, float DRX, float DRY, float red, float green, float blue)
    {
        glMatrixMode(GL_COLOR);
        glColor4f( red, green, blue, 1f);
        glBegin(GL_QUADS);
            glVertex2f( TLX, TLY);
            glVertex2f( DRX, TLY);
            glVertex2f( DRX, DRY);
            glVertex2f( TLX, DRY);
        glEnd();
    }
}
