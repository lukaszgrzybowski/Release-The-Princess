package game.kck.object;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Tree extends  SuperObject{

    public Tree(){
        name = "Tree";
        try{
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/tree.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
        collision = true;

    }
}
