package game.kck.main;

import game.kck.entity.Player;
import game.kck.main.GamePanel;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        GamePanel gamePanel = new GamePanel();
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Release The Princess");
        window.add(gamePanel);

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gamePanel.setUpGame();
        gamePanel.startGameThread();

    }
}
