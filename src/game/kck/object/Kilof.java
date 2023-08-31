package game.kck.object;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Kilof extends  SuperObject{

    public Kilof(){
        name = "Kilof";
        try{
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/kilof.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
        collision = true;

    }
}
