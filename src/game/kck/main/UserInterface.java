package game.kck.main;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class UserInterface {

    BufferedImage k1,k2,d1,d2,castle,grass;

    int show_counter =0;
    int show_counter2 =0;
    GamePanel gp;
    Graphics2D g2;
    Font arial_40;
    Font arial_20;
    Font arial_100;
    public boolean messageOn = false;
    public String message = "";
    public boolean gameFinished=false;
    public String currentDialogue = "";

    public int commandNumber = 0;

    public UserInterface(GamePanel gp){
        this.gp=gp;
        arial_40 = new Font("Arial",Font.ROMAN_BASELINE,40);
        arial_20 = new Font("Arial",Font.ROMAN_BASELINE,20);
        arial_100 = new Font("Arial",Font.ROMAN_BASELINE,100);
    }

    public void showMessage(String text){
        message=text;
        messageOn = true;
    }

    public void draw(Graphics2D g2){

        this.g2=g2;

        if(gp.gameState == gp.titleState){
            drawTitleScreen();
        }
        if (gp.gameState == gp.dialogueState) {
                drawDialogueScreen();
            }

        if(gp.gameState == gp.pauseState){
                drawPauseScreen();
            }
        if(gp.gameState == gp.deadState){
            drawEndScreen();
        }

        if(gp.gameState==gp.WinState){
            drawEndWinScreen();

        }

        if(gp.gameState == gp.playState) {
            if (gameFinished == true) {

            } else {
                    g2.setFont(arial_40);
                    g2.setColor(Color.white);
                    g2.drawString("Znalezione Klucze:  " + gp.howManyKeys, 50, 50);


            if (gp.howManyKeys == 1) {
                        g2.drawImage(gp.toShowKey1(), 50, 50, 80, 80, null);
                    }
            if (gp.howManyKeys == 2) {
                        g2.drawImage(gp.toShowKey1(), 50, 50, 80, 80, null);
                        g2.drawImage(gp.toShowKey2(), 150, 50, 80, 80, null);
                        if(show_counter2<300) {
                            g2.drawString("Maszeruj do zamku!  ", 650, 200);
                            show_counter2++;
                        }
                    }

            if (gp.howManyKeys < 2) {
                if (gp.player.touchingCastle == 1) {
                        if(show_counter<300) {
                            g2.drawString("Znajdź resztę kluczy!  ", 650, 200);
                            show_counter++;
                        }

                        }
                    }
                }
            }

    }

    private void drawEndWinScreen() {
        g2.setFont(g2.getFont().deriveFont(Font.BOLD,96F));
        String text = "Release The Princess";
        int x = getXforCenterText(text);
        int y = gp.tileSize*1;

        try {
            k1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("player/1.png"));
            k2 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("npc/113.png"));
            d1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("npc/cz2.png"));
            d2 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("npc/9.png"));
            castle = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/zamek.png"));
            grass = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));

        }catch(IOException e){
            e.printStackTrace();
        }

        for(int i=0;i< gp.maxScreenCol;i++){
            for(int j=0;j<gp.maxScreenRow;j++){
                g2.drawImage(grass, 160*i, 160*j, gp.tileSize, gp.tileSize,null);
            }
        }

        g2.drawImage(k1, 250, y+50, gp.tileSize, gp.tileSize,null);
        g2.drawImage(k2, gp.screenWidth-x-250+100, y+50, gp.tileSize, gp.tileSize,null);
        g2.drawImage(d1, 410, y+50, gp.tileSize, gp.tileSize,null);
        g2.drawImage(d2, gp.screenWidth-x-410+100, y+50, gp.tileSize, gp.tileSize,null);
        g2.drawImage(castle, x+330, y-100, 320, 320,null);


        g2.setColor(Color.black);
        g2.drawString(text,x+5,y*3+5);
        g2.setColor(Color.white);
        g2.drawString(text,x,y*3);


        text = "Gratulacje Wygrałeś!";
        x = getXforCenterText(text);
        g2.setColor(Color.black);
        g2.drawString(text,x+5,y*4+5);
        g2.setColor(Color.white);
        g2.drawString(text,x,y*4);

    }

    private void drawEndScreen() {
        g2.setFont(g2.getFont().deriveFont(Font.BOLD,96F));
        String text = "Release The Princess";
        int x = getXforCenterText(text);
        int y = gp.tileSize*1;

        try {
            k1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("player/1.png"));
            k2 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("npc/113.png"));
            d1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("npc/cz2.png"));
            d2 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("npc/9.png"));
            castle = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/zamek.png"));
            grass = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));

        }catch(IOException e){
            e.printStackTrace();
        }

        for(int i=0;i< gp.maxScreenCol;i++){
            for(int j=0;j<gp.maxScreenRow;j++){
                g2.drawImage(grass, 160*i, 160*j, gp.tileSize, gp.tileSize,null);
            }
        }

        g2.drawImage(k1, 250, y+50, gp.tileSize, gp.tileSize,null);
        g2.drawImage(k2, gp.screenWidth-x-250+100, y+50, gp.tileSize, gp.tileSize,null);
        g2.drawImage(d1, 410, y+50, gp.tileSize, gp.tileSize,null);
        g2.drawImage(d2, gp.screenWidth-x-410+100, y+50, gp.tileSize, gp.tileSize,null);
        g2.drawImage(castle, x+330, y-100, 320, 320,null);


        g2.setColor(Color.black);
        g2.drawString(text,x+5,y*3+5);
        g2.setColor(Color.white);
        g2.drawString(text,x,y*3);


        text = "Przegrałeś";
        x = getXforCenterText(text);
        g2.setColor(Color.black);
        g2.drawString(text,x+5,y*4+5);
        g2.setColor(Color.white);
        g2.drawString(text,x,y*4);



    }

    public void drawTitleScreen(){
        g2.setFont(g2.getFont().deriveFont(Font.BOLD,96F));
        String text = "Release The Princess";
        int x = getXforCenterText(text);
        int y = gp.tileSize*1;

        try {
            k1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("player/1.png"));
            k2 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("npc/113.png"));
            d1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("npc/cz2.png"));
            d2 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("npc/9.png"));
            castle = ImageIO.read(getClass().getClassLoader().getResourceAsStream("objects/zamek.png"));
            grass = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass.png"));

        }catch(IOException e){
            e.printStackTrace();
        }

        for(int i=0;i< gp.maxScreenCol;i++){
            for(int j=0;j<gp.maxScreenRow;j++){
                g2.drawImage(grass, 160*i, 160*j, gp.tileSize, gp.tileSize,null);
            }
        }

        g2.drawImage(k1, 20, y+50, gp.tileSize, gp.tileSize,null);
        g2.drawImage(k2, gp.screenWidth-x-250+100, y+50, gp.tileSize, gp.tileSize,null);
        g2.drawImage(d1, 170, y+50, gp.tileSize, gp.tileSize,null);
        g2.drawImage(d2, gp.screenWidth-x-410+100, y+50, gp.tileSize, gp.tileSize,null);
        g2.drawImage(castle, x+330, y-100, 320, 320,null);


        g2.setColor(Color.black);
        g2.drawString(text,x+5,y*3+5);
        g2.setColor(Color.white);
        g2.drawString(text,x,y*3);

        //menu
        g2.setFont(g2.getFont().deriveFont(Font.BOLD,48F));

        y=y*3;

        text = "NEW GAME";
        x= getXforCenterText(text);
        y+=gp.tileSize;
        g2.setColor(Color.black);
        g2.drawString(text,x+5,y+5);
        g2.setColor(Color.white);
        g2.drawString(text,x,y);
        if(commandNumber == 0){
            g2.setColor(Color.black);
            g2.drawString(">",x-gp.tileSize+5,y+5);
            g2.setColor(Color.white);
            g2.drawString(">",x-gp.tileSize,y);
        }

        text = "Quit";
        x= getXforCenterText(text);
        y+=gp.tileSize;
        g2.setColor(Color.black);
        g2.drawString(text,x+5,y+5);
        g2.setColor(Color.white);
        g2.drawString(text,x,y);
        if(commandNumber == 1){
            g2.setColor(Color.black);
            g2.drawString(">",x-gp.tileSize+5,y+5);
            g2.setColor(Color.white);
            g2.drawString(">",x-gp.tileSize,y);
        }

    }

    public void drawPauseScreen(){
        String text = "Pause";
        String text2 = "Press P to continue";
        int x_1 = getXforCenterText(text);
        int y_1 = gp.screenHeight/2;
        int width = gp.screenWidth;
        int height = gp.screenHeight;
        Color c=new Color(0,0,0,180);
        g2.setColor(c);
        g2.fillRect(0,0,width,height);
        g2.setFont(arial_100);
        g2.setColor(Color.white);
        g2.drawString(text,x_1-110,y_1);
        int x_2 = getXforCenterText(text2);
        int y_2 = (gp.screenHeight/2)+200;
        g2.setFont(arial_40);
        g2.setColor(Color.white);
        g2.drawString(text2,x_2+270,y_2);

    }

    public int getXforCenterText(String text){
        int x;
        int length = (int)g2.getFontMetrics().getStringBounds(text,g2).getWidth();
        x = gp.screenWidth/2 - length/2;
        return x;
    }

    public void drawDialogueScreen (){
        //window
        int x = gp.tileSize*3;
        int y = gp.tileSize/3;
        int width = gp.screenWidth - (gp.tileSize*4);
        int height = gp.tileSize*2;

        drawSubWindow(x,y,width,height);

        x +=30;
        y +=60;
        g2.setFont(arial_40);
        g2.setColor(Color.white);
        for(String line : currentDialogue.split("\n")) {
            g2.drawString(line, x, y);
            y+=60;
        }
    }

    public void drawSubWindow(int x, int y, int width, int height){
        Color c=new Color(84,51,18,200);
        g2.setColor(c);
        g2.fillRoundRect(x,y,width,height,35,35);

        c=new Color(0,0,0,180);
        g2.setColor(c);
        g2.setStroke(new BasicStroke(5));
        g2.fillRoundRect(x+5,y+5,width-10,height-10,25,25);

    }

}
