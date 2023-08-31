package game.kck.entity;

import game.kck.main.GamePanel;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Entity {

    GamePanel gp;
    public int worldX,worldY;
    public int speed;

    public String name = "";

    public BufferedImage up1, up2, down1, down2, left1, left2, right1, right2, steady;
    public String direction;

    public int spriteCounter=0;
    public int waterCounter=0;
    public int spriteNum= 1;

    //coliision
    public Rectangle solidArea;
    public int solidAreaDefaultX,solidAreaDefaultY;
    public boolean collisionOn = false;
    public int actionLockCounter =0;
    String dialogues[] = new String[20];
    int dialogueIndex=0;
    String previousDirection;


    public Entity(GamePanel gp){
        this.gp=gp;
    }

    public void setAction(){

    }
    public void speak(){
        if(dialogueIndex==4 && gp.steps<6021 && gp.howManyKeys<1){
            dialogueIndex=0;
        }
        if(dialogueIndex==4 && gp.steps>=6021 && gp.howManyKeys<1){
            dialogueIndex=0;
        }
        if(dialogues[dialogueIndex]==null && gp.steps>=6021 && gp.howManyKeys==1){
            dialogueIndex=4;
        }
        if(dialogueIndex==4 && gp.steps<6021 && gp.howManyKeys==1){
            dialogueIndex=4;
        }
        gp.ui.currentDialogue = dialogues[dialogueIndex];
        dialogueIndex++;
        gp.previousDirection = gp.player.direction;

        switch(gp.player.direction){
            case "up":
                direction = "down";
                break;
            case "down":
                direction = "up";
                break;
            case "left":
                direction = "right";
                break;
            case "right":
                direction = "left";
                break;

        }
    }

    public void update(){
        setAction();

        collisionOn = false;
        gp.collisionCheck.checkTile(this);
        gp.collisionCheck.checkObject(this,false);
        gp.collisionCheck.checkPlayercollision(this);

        if(collisionOn == false)
        {
            switch (direction){
                case "up":
                    worldY-=speed;
                    break;
                case "down":
                    worldY+=speed;
                    break;
                case "left":
                    worldX-=speed;
                    break;
                case "right":
                    worldX+=speed;
                    break;
                case "steady":
                    break;

            }
        }

        spriteCounter++;
        if(spriteCounter>16){
            if(spriteNum==1)
            {
                spriteNum=2;
            }
            else if(spriteNum==2)
            {
                spriteNum=1;
            }
            spriteCounter=0;
        }
    }

    public void draw (Graphics2D g2){

        BufferedImage image = null;
        int screenX = worldX - gp.player.worldX + gp.player.screenX;
        int screenY = worldY - gp.player.worldY + gp.player.screenY;

            if (worldX + gp.tileSize > gp.player.worldX - gp.player.screenX && worldX - gp.tileSize < gp.player.worldX + screenX && worldY + gp.tileSize > gp.player.worldY - gp.player.screenY && worldY - gp.tileSize < gp.player.worldY + gp.player.screenY) {
                switch(direction){
                    case "up":
                        if(spriteNum==1) {
                            image = up1;
                        }
                        if(spriteNum==2){
                            image = up2;
                        }
                        break;
                    case "down":
                        if(spriteNum==1) {
                            image = down1;
                        }
                        if(spriteNum==2){
                            image = down2;
                        }
                        break;
                    case "right":
                        if(spriteNum==1) {
                            image = right1;
                        }
                        if(spriteNum==2){
                            image = right2;
                        }
                        break;
                    case "left":
                        if(spriteNum==1) {
                            image = left1;
                        }
                        if(spriteNum==2){
                            image = left2;
                        }
                        break;
                    case "steady":
                        image = steady;
                        break;
                }

                g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);}

    }


}
