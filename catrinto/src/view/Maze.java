package view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Montador;

public class Maze{
    JPanel maze, player;

    Maze() {
        maze = new JPanel(new GridLayout());
        maze.setBounds(600, 600);
        maze.setOpaque(true);

        player = new JPanel(null);
        maze.setBounds(600, 600);
        ImageIcon cat = new ImageIcon("cat.png");
        player.add(cat);
    }

    public JPanel getMaze() {
        return maze;
    }

    public JPanel getPlayer() {
        return player;
    }
    
    public void generate(Montador builder) {
//        ImageIcon empty = new ImageIcon("empty.png");
//        ImageIcon wall = new ImageIcon("wall.png");
//        ImageIcon cat = new ImageIcon("cat.png");
        // ImageIcon dog = new ImageIcon("dog.png");
        // ImageIcon fish = new ImageIcon("fish.png");

        int n = builder.getMaze().getSize();
        int mazeInt[][] = builder.getMaze();
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                switch(mazeInt[i][j]) {
                    case 0: 
                        maze.add(new JLabel(new ImageIcon("empty.png")));
                        break;
                    case 1:
                    	maze.add(new JLabel(new ImageIcon("wall.png")));
                        break;
                    // case 2:
                    //     maze.add(dog);
                    //     break;
                    // case 3:
                    //     maze.add(fish);
                    //     break;
                }
        
    }
}
