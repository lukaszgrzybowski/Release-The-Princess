package game.kck.entity;

import game.kck.main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class NPC_Wizzard extends Entity {

    public NPC_Wizzard(GamePanel gp) {
        super(gp);

        name = "Wizzard";
        direction = "steady";
        speed = 2;
        solidArea = new Rectangle(0, 0, 160, 160);
        getImage();
    }


    public void getImage() {
        try {
            up1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("npc/cz6.png"));
            up2 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("npc/cz9.png"));
            down1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("npc/cz1.png"));
            down2 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("npc/cz7.png"));
            right1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("npc/cz2.png"));
            right2 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("npc/cz5.png"));
            left1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("npc/cz4.png"));
            left2 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("npc/cz8.png"));
            steady = ImageIO.read(getClass().getClassLoader().getResourceAsStream("npc/cz3.png"));

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

    public void speak(){
        gp.gameState = gp.playState;
    }

}

