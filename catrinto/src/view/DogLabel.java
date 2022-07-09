package view;

import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class DogLabel extends JLabel implements ActionListener{
    MainScreen mainScreen;
    Timer tm;

    DogLabel(MainScreen mainScreen) {
        super(new ImageIcon
        (new ImageIcon("src/view/dog.png").getImage().getScaledInstance(20, 20,  java.awt.Image.SCALE_SMOOTH)));
        this.mainScreen = mainScreen;
    }

    public void start() {
			tm = new Timer();
			tm.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run() {
					moverCachorro(old_i, old_j, i, j);
				}		
			}, 1000, 1000);
	}

    public void moverCachorro(int old_i, int old_j, int i, int j) {
        JLabel empty = (JLabel) mainScreen.getPanel().getComponent(old_i * 20 + old_j);
        empty.setIcon(new ImageIcon
        (new ImageIcon("src/view/empty.png").getImage().getScaledInstance(20, 20,  java.awt.Image.SCALE_SMOOTH)));

        JLabel dog = (JLabel) mainScreen.getPanel().getComponent(i * 20 + j);
        dog.setIcon(new ImageIcon
        (new ImageIcon("src/view/dog.png").getImage().getScaledInstance(20, 20,  java.awt.Image.SCALE_SMOOTH)));
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
} 
