package view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class FinishLineLabel extends JLabel {
    MainScreen mainScreen;

    FinishLineLabel(MainScreen mainScreen) {
        super(new ImageIcon
        (new ImageIcon("src/view/linhaChegada.png").getImage().getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH)));
        this.mainScreen = mainScreen;
    }
}
