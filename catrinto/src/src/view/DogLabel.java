package view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class DogLabel extends JLabel{
  	private static final long serialVersionUID = -5963824921145628309L;
	MainScreen mainScreen;

    DogLabel(MainScreen mainScreen) {
    	super.setIcon(new ImageIcon
    			(new ImageIcon(getClass().getResource("/view/dog.png")).getImage().getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH)));
        this.mainScreen = mainScreen;
    }

    public void moverCachorro() {
        int[] move = mainScreen.getView().getControl().moveAttempt();
        this.setLocation(this.getX() + move[1] * 20, this.getY() + move[0] * 20);
        if (mainScreen.getView().getControl().gatoMorto()) 
            mainScreen.getView().changeScreen(2, false);
    }
} 
