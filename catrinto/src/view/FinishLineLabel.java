package view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class FinishLineLabel extends JLabel {
	private static final long serialVersionUID = 9125195214876418483L;
	MainScreen mainScreen;

    FinishLineLabel(MainScreen mainScreen) {
    	super.setIcon(new ImageIcon
    			(new ImageIcon(getClass().getResource("/view/linhaChegada.png")).getImage().getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH)));
        this.mainScreen = mainScreen;
    }
}
