package view;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Montador;

public class MainScreen extends ScreenAdapter {
	Montador builder; 
	HUD hud;
	
	MainScreen(View view) {
		super(view);
		
		super.addToFrame(hud);

		JPanel panel = super.getPanel();
		panel.setLayout(new GridLayout(20, 20));
		generate(panel);
		
		super.show();
		
	}
	
	private void generate(JPanel pane) {
	    int n = 20;
	    char charMap[][] = builder.getMapaInicial();
      
	    for (int i = 0; i < n; i++)
	    	for (int j = 0; j < n; j++)
	    		switch(charMap[i][j]) {
                	case 'E': 
                		pane.add(new JLabel(new ImageIcon("empty.png")));
                		break;
                	case 'W':
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
