package view;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class DogLabel extends JLabel{
    MainScreen mainScreen;

    DogLabel(MainScreen mainScreen) {
        this.mainScreen = mainScreen;
    }

    public void moverCachorro(int old_i, int old_j, int i, int j) {
        JLabel empty = (JLabel) mainScreen.getPanel().getComponent(old_i * 20 + old_j);
        empty.setIcon(new ImageIcon
        (new ImageIcon("catrinto/src/view/empty.png").getImage().getScaledInstance(20, 20,  java.awt.Image.SCALE_SMOOTH)));

        JLabel dog = (JLabel) mainScreen.getPanel().getComponent(i * 20 + j);
        dog.setIcon(new ImageIcon
        (new ImageIcon("catrinto/src/view/dog.png").getImage().getScaledInstance(20, 20,  java.awt.Image.SCALE_SMOOTH)));
        
    }
}
