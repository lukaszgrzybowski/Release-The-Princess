package game.kck.object;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Siekiera extends  SuperObject{

    public Siekiera(){
        name = "Siekiera";
        try{
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/siekiera.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
        collision = true;

    }
}
