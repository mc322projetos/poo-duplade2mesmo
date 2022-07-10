package view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class DogLabel extends JLabel{
    MainScreen mainScreen;

    DogLabel(MainScreen mainScreen) {
        super(new ImageIcon
        (new ImageIcon("src/view/dog.png").getImage().getScaledInstance(20, 20,  java.awt.Image.SCALE_SMOOTH)));
        this.mainScreen = mainScreen;
    }

    public void moverCachorro() {
        int[] move = mainScreen.getView().getControl().moveAttempt();
        this.setLocation(this.getX() + move[1] * 20, this.getY() + move[0] * 20);
        if (mainScreen.getView().getControl().gatoMorto())
            mainScreen.getView().changeScreen(2, false);
    }
} 
