package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Montador;
import model.Labirinto;

public class MainScreen extends ScreenAdapter {
	Labirinto maze;
	JPanel panel;
	Montador builder;
	HUD hud;
	CatLabel catLabel;
	DogLabel dogLabel;

	MainScreen(View view) {
		super(view);
		
		
		setMontador(super.getView().getControl().getMontador());
		super.getFrame().getContentPane().setBackground(Color.CYAN);

		panel = super.getPanel();
		panel.setLayout(new GridLayout(20, 20, 0, 0));
		panel.setMaximumSize(new Dimension(400, 400));
		generate();

		hud = new HUD();
		catLabel = new CatLabel(this);
		dogLabel  = new DogLabel(this);
		
		super.getFrame().remove(panel);
		super.addToFrame(catLabel);
		super.addToFrame(hud);
		super.addToFrame(panel);
		
		panel.setBounds(300, 60, 410, 410);
		panel.setBackground(Color.GRAY);
		hud.setBounds(425, 10, 150, 25);
		catLabel.setBounds(305, 65, 20, 20);
		
		super.getFrame().setLayout(null);

		catLabel.requestFocus();
		catLabel.addKeyListener(catLabel);;

	}
	
	public void setCountdown(int time) {
		hud.setCountdown(time);
	}

	public void setMontador(Montador builder) {
		this.builder = builder;
	}

	private void generate() {
	    int n = 20;
		char charMap[][] = builder.getLabirinto().getMapaInicial();

	    for (int i = 0; i < n; i++)
	    	for (int j = 0; j < n; j++)
	    		switch(charMap[i][j]) {
                	case 'E': 
                		panel.add(new JLabel(new ImageIcon("src/view/empty.png")));
                		break;
                	case 'W':
                		panel.add(new JLabel(new ImageIcon("src/view/wall.png")));
                		break;
                	case 'T':
                		panel.add(new JLabel(new ImageIcon("src/view/linhaChegada.png")));
						break;					
					default:
						panel.add(new JLabel(new ImageIcon("src/view/empty.png")));
                		break;
              }
	}



	public void moverCachorro(int old_i, int old_j, int i, int j) {
		dogLabel.moverCachorro(old_i, old_j, i, j);
	}
}
