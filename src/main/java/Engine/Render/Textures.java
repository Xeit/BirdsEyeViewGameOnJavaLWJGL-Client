package Engine.Render;

import java.awt.image.BufferedImage;
import java.util.HashMap;

/**
 * Here are saved textures in memory
 * Tutaj przechowywuje sie textury w pamieci
 */
public class Textures
{
    public static HashMap<String, Integer> textureIDs = new HashMap<String, Integer>();

    public static BufferedImage Grass1_file = TextureLoader.loadImage("src/main/resources/textures/Grass1.png");
    public static Integer Grass1 = TextureLoader.loadTexture(Grass1_file);

    public static BufferedImage Brick1_file = TextureLoader.loadImage("src/main/resources/textures/Brick1.png");
    public static Integer Brick1 = TextureLoader.loadTexture(Brick1_file);

    public static BufferedImage Player1_file = TextureLoader.loadImage("src/main/resources/textures/Player1.png");
    public static Integer Player1 = TextureLoader.loadTexture(Player1_file);
}
