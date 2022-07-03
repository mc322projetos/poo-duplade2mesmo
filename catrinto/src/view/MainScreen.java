package view;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import controller.Montador;

public class MainScreen extends ScreenAdapter implements KeyListener {
	JPanel panel;
	Montador builder;
	HUD hud;
	MainScreen(View view) {
		super(view);
		setMontador(super.getView().getControl().getMontador());

		panel = super.getPanel();
		panel.setLayout(new GridLayout(20, 20, 0, 0));
		panel.setMaximumSize(new Dimension(400, 400));
		generate();

		hud = new HUD();
		super.getFrame().remove(panel);
		super.addToFrame(hud);
		super.addToFrame(panel);
		
	}
	
	public void setCountdown(int time) {
		hud.setCountdown(time);
	}

	public void setMontador(Montador builder) {
		this.builder = builder;
	}

	private void generate() {
	    int n = 20;
		char charMap[][] = builder.getLabirinto().getMapaInicial(); // alterar posteriormente para
		// pegar apenas uma celula, usando um metodo do tipo .getCelulaInicial(i, j)
		// e fazer as mudancas necessarias no switch

	    for (int i = 0; i < n; i++)
	    	for (int j = 0; j < n; j++)
	    		switch(charMap[i][j]) {
                	case 'E': 
                		panel.add(new JLabel(new ImageIcon("catrinto/src/view/empty.png")));
                		break;
                	case 'W':
                		panel.add(new JLabel(new ImageIcon("catrinto/src/view/wall.png")));
                		break;
					case 'G' :
						panel.add(new JLabel(new ImageIcon
						(new ImageIcon("catrinto/src/view/cat.png").getImage().getScaledInstance(20, 20,  java.awt.Image.SCALE_SMOOTH))));
						break;
					default:
						panel.add(new JLabel(new ImageIcon("catrinto/src/view/empty.png")));
                		break;
                  // case 2:
                  //     maze.add(dog);
                  //     break;
                  // case 3:
                  //     maze.add(fish);
                  //     break;
              }
      
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
