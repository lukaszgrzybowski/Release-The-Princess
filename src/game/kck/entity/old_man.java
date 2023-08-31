package game.kck.entity;

import game.kck.main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.util.Random;

public class old_man extends Entity {

    public old_man(GamePanel gp) {
        super(gp);

        name="OldMan";
        direction = "steady";
        speed = 4;
        solidArea = new Rectangle(0, 0, 160, 160);
        solidArea.x=20;
        solidArea.y=100;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        solidArea.width=60;
        solidArea.height=60;
        getImage();
        setDialogue();
    }


    public void getImage() {
        try {
            up1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("npc/2.png"));
            up2 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("npc/3.png"));
            down1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("npc/6.png"));
            down2 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("npc/7.png"));
            right1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("npc/10.png"));
            right2 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("npc/12.png"));
            left1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("npc/9.png"));
            left2 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("npc/13.png"));
            steady = ImageIO.read(getClass().getClassLoader().getResourceAsStream("npc/8.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setDialogue(){
        dialogues[0] = "Hej Ty! Napewno przysyła Cię Król Olaf,\nabyś uwolnił jego córkę.";
        dialogues[1] = "Podstępny czarodziej Vinmar porawał ją\ni więzi w zamku na północy za rzeką.";
        dialogues[2] = "Musisz ją uratować!\nAle do tego będą Ci potrzebne 2 klucze aby\notworzyć bramę.\nMusisz je znaleźć w tej przeklętej krainie.";
        dialogues[3] = "Lecz pamiętaj mości rycerzu, musisz uważać\nna druidów, popleczników czarodzieja\noraz inne niebezpieczeństwa.\nPowodzenia!";
        dialogues[4] = "Witaj ponownie!\nWidzę, że masz już pierwszy klucz.";
        dialogues[5] = "Oto kilof, który pozwoli Ci rozbijać skały\ni znaleźć kolejny klucz na północy.\nPowodzenia!";

    }


    public void setAction() {
        if(gp.numberOfInteractions>3){
            if(gp.steps>0 && gp.steps<=20)
            {
                direction="up";
            }
            if(gp.steps>20 && gp.steps<=3055)
            {
                direction="right";
            }
            if(gp.steps>3055 && gp.steps<=3615)
            {
                direction="up";
            }
            if(gp.steps>3615 && gp.steps<=5356)
            {
                direction="left";
            }
            if(gp.steps>5362 && gp.steps<=5960)
            {
                direction="up";
            }
            if(gp.steps>5960 && gp.steps<=6020)
            {
                direction="right";
            }
            if(gp.steps==6021){
                direction = "steady";
                gp.steps--;
            }
            gp.steps++;
            System.out.println(gp.steps);
        }



    }

    public void speak(){
        super.speak();
        gp.numberOfInteractions++;
    }
}

