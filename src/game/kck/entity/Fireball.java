package game.kck.entity;

import game.kck.main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.util.Random;

public class Fireball extends Entity{

    public Fireball(GamePanel gp) {
        super(gp);

        direction = "steady";
        speed = 5;
        solidArea = new Rectangle(0, 0, 160, 160);
        getImage();
    }

    public void getImage() {
        try {
            up1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/3.png"));
            down2 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/4.png"));
            right1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/1.png"));
            left2 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/2.png"));
            steady = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/2.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setAction() {
        actionLockCounter++;
        if(actionLockCounter ==120) {
            Random random = new Random();
            int i = random.nextInt(100) + 1;
            if (i <= 25) {
                direction = "up";
            }
            if (i > 25 && i <= 50) {
                direction = "down";
            }
            if (i > 50 && i <= 75) {
                direction = "left";
            }
            if (i > 75 && i <= 100) {
                direction = "right";
            }
            actionLockCounter =0;

        }

    }

}
