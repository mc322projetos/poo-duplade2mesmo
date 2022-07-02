package view;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Montador;

public class MainScreen extends ScreenAdapter{
	Montador builder;
	
	MainScreen() {
		JPanel pane = super.getPane();
		pane.setLayout(new GridLayout(20, 20));
		generate()
		
	}
	
	public void generate(Montador builder) {
		ImageIcon empty = new ImageIcon("empty.png");
	    ImageIcon wall = new ImageIcon("wall.png");
	    ImageIcon cat = new ImageIcon("cat.png");
	    ImageIcon dog = new ImageIcon("dog.png");
	    ImageIcon fish = new ImageIcon("fish.png");

	    int n = 20;
	    char mazeChar[][] = builder.getMaze();
      
	    for (int i = 0; i < n; i++)
	    	for (int j = 0; j < n; j++)
	    		switch(mazeInt[i][j]) {
                	case 0: 
                		pane.add(new JLabel(new ImageIcon("empty.png")));
                		break;
                	case 1:
                		pane.add(new JLabel(new ImageIcon("wall.png")));
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
