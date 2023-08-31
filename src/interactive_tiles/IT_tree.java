package interactive_tiles;

import game.kck.main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class IT_tree extends InteractiveTile{
    GamePanel gp;


    public  IT_tree(GamePanel gp){
        super(gp);
        this.gp = gp;
        direction = "steady";
        speed = 0;
        solidArea = new Rectangle(0, 0, 160, 160);

        //down1 = set

        try {
            BufferedImage  steady= ImageIO.read(getClass().getClassLoader().getResourceAsStream("player/2.png"));
        }
        catch(IOException e){
            e.printStackTrace();
        }

        destructible = true;
    }

}
