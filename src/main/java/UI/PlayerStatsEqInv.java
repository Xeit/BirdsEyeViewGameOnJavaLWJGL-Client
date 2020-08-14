package UI;

import static Engine.Render.RenderQuad.*;
import Engine.Render.RenderString;
import Engine.Values.Player;
import static Engine.Values.textFromKeyboard.*;

/**
 * Klasa renderujaca statystyki postaci
 */
public class PlayerStatsEqInv
{
    public static void playerStatsEqInv()
    {
        new RenderString(" " +Player.getNickname(), 2f, 949f, 775f);
        new RenderString(" " +Player.getLevel().toString(), 2f, 901f, 758f);
        new RenderString(" " +Player.getXpToNextLvl().toString(), 2f, 959f, 741f);

        //Aktualne HP i MANA
        float hpPercent = Player.getCurrentHP().floatValue() / Player.getMaxHP().floatValue();
        float manaPercent = Player.getCurrentMana().floatValue() / Player.getMaxMana().floatValue();

        float hpPosition = 872 + (313 * hpPercent);
        float manaPosition = 872 + (313 * manaPercent);

        renderQuad(872f, 696f, hpPosition, 672f, 0.95f, 0.3f, 0.3f);
        renderQuad(872f, 652f, manaPosition, 628f, 0.3f, 0.3f, 0.95f);

        new RenderString( Player.getCurrentHP().toString(), 3f, 1010f, 672f);
        new RenderString( Player.getCurrentMana().toString(), 3f, 1010f, 628f);

    }
}
