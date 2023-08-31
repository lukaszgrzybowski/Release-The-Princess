package game.kck.main;

import game.kck.entity.Fireball;
import game.kck.entity.NPC_Wizzard;
import game.kck.entity.old_man;
import game.kck.object.*;
import interactive_tiles.IT_tree;

public class AssetSetter {

    GamePanel gp;

    public AssetSetter(GamePanel gp){
        this.gp = gp;
    }

    public void setObject(){
        gp.obj[0] = new Key_1();
        gp.obj[0].worldX = 7 * gp.tileSize;
        gp.obj[0].worldY = 32 * gp.tileSize;

        gp.obj[1] = new Key_2();
        gp.obj[1].worldX = 9 * gp.tileSize;
        gp.obj[1].worldY = 9 * gp.tileSize;

        gp.obj[2] = new Toxic_mushroom();
        gp.obj[2].worldX = 12 * gp.tileSize;
        gp.obj[2].worldY = 45* gp.tileSize;

        gp.obj[3] = new Toxic_mushroom();
        gp.obj[3].worldX = 35 * gp.tileSize;
        gp.obj[3].worldY = 44* gp.tileSize;

        gp.obj[4] = new Toxic_mushroom();
        gp.obj[4].worldX = 17 * gp.tileSize;
        gp.obj[4].worldY = 11 * gp.tileSize;

        gp.obj[5] = new Zamek();
        gp.obj[5].worldX = 50 * gp.tileSize;
        gp.obj[5].worldY = 10 * gp.tileSize;
        gp.obj[5].solidArea.width=640;
        gp.obj[5].solidArea.height=640;

        gp.obj[6] = new Stone();
        gp.obj[6].worldX = 9 * gp.tileSize;
        gp.obj[6].worldY = 28 * gp.tileSize;

        gp.obj[7] = new Kilof();
        gp.obj[7].worldX = 35 * gp.tileSize;
        gp.obj[7].worldY = 25 * gp.tileSize;

        gp.obj[8] = new Siekiera();
        gp.obj[8].worldX = 8 * gp.tileSize;
        gp.obj[8].worldY = 42 * gp.tileSize;

        gp.obj[9] = new Tree();
        gp.obj[9].worldX = 19 * gp.tileSize;
        gp.obj[9].worldY = 32 * gp.tileSize;

        gp.obj[10] = new Stone();
        gp.obj[10].worldX = 10 * gp.tileSize;
        gp.obj[10].worldY = 9 * gp.tileSize;

        gp.obj[11] = new Stone();
        gp.obj[11].worldX = 8 * gp.tileSize;
        gp.obj[11].worldY = 9 * gp.tileSize;

        gp.obj[12] = new Stone();
        gp.obj[12].worldX = 10 * gp.tileSize;
        gp.obj[12].worldY = 10 * gp.tileSize;

        gp.obj[13] = new Stone();
        gp.obj[13].worldX = 8 * gp.tileSize;
        gp.obj[13].worldY = 10 * gp.tileSize;

        gp.obj[14] = new Stone();
        gp.obj[14].worldX = 9 * gp.tileSize;
        gp.obj[14].worldY = 11 * gp.tileSize;

        gp.obj[15] = new Tree();
        gp.obj[15].worldX = 13 * gp.tileSize;
        gp.obj[15].worldY = 39 * gp.tileSize;

        gp.obj[16] = new Tree();
        gp.obj[16].worldX = 12 * gp.tileSize;
        gp.obj[16].worldY = 39 * gp.tileSize;




    }

    public void setNPC(){

        gp.Npc[0]=new NPC_Wizzard(gp);
        gp.Npc[0].worldX = gp.tileSize*16;
        gp.Npc[0].worldY = gp.tileSize*32;

        gp.Npc[1]=new NPC_Wizzard(gp);
        gp.Npc[1].worldX = gp.tileSize*8;
        gp.Npc[1].worldY = gp.tileSize*12;

        gp.Npc[2]=new NPC_Wizzard(gp);
        gp.Npc[2].worldX = gp.tileSize*23;
        gp.Npc[2].worldY = gp.tileSize*13;

        gp.Npc[3]=new NPC_Wizzard(gp);
        gp.Npc[3].worldX = gp.tileSize*30;
        gp.Npc[3].worldY = gp.tileSize*14;

        gp.Npc[4]=new NPC_Wizzard(gp);
        gp.Npc[4].worldX = gp.tileSize*20;
        gp.Npc[4].worldY = gp.tileSize*14;

        gp.Npc[5]=new old_man(gp);
        gp.Npc[5].worldX = gp.tileSize*12;
        gp.Npc[5].worldY = gp.tileSize*40;


    }

    public void setFireballs(){

        gp.Fireballs[0]=new Fireball(gp);
        gp.Fireballs[0].worldX = gp.tileSize*14;
        gp.Fireballs[0].worldY = gp.tileSize*33;

        gp.Fireballs[1]=new Fireball(gp);
        gp.Fireballs[1].worldX = gp.tileSize*15;
        gp.Fireballs[1].worldY = gp.tileSize*33;

        gp.Fireballs[2]=new Fireball(gp);
        gp.Fireballs[2].worldX = gp.tileSize*16;
        gp.Fireballs[2].worldY = gp.tileSize*14;

        gp.Fireballs[3]=new Fireball(gp);
        gp.Fireballs[3].worldX = gp.tileSize*16;
        gp.Fireballs[3].worldY = gp.tileSize*15;

        gp.Fireballs[3]=new Fireball(gp);
        gp.Fireballs[3].worldX = gp.tileSize*20;
        gp.Fireballs[3].worldY = gp.tileSize*15;

        gp.Fireballs[3]=new Fireball(gp);
        gp.Fireballs[3].worldX = gp.tileSize*20;
        gp.Fireballs[3].worldY = gp.tileSize*16;

        gp.Fireballs[3]=new Fireball(gp);
        gp.Fireballs[3].worldX = gp.tileSize*30;
        gp.Fireballs[3].worldY = gp.tileSize*15;

        gp.Fireballs[3]=new Fireball(gp);
        gp.Fireballs[3].worldX = gp.tileSize*30;
        gp.Fireballs[3].worldY = gp.tileSize*15;


    }

}
