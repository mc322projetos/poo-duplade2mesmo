package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CatLabel extends JLabel implements KeyListener{
    MainScreen mainScreen;

    CatLabel(MainScreen mainScreen) {
        super(new ImageIcon
        (new ImageIcon("catrinto/src/view/cat.png").getImage().getScaledInstance(20, 20,  java.awt.Image.SCALE_SMOOTH)));
        this.mainScreen = mainScreen;

    }

    @Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
        char key = e.getKeyChar();
        if (mainScreen.getView().getControl().moveAttempt(key))
            switch(e.getKeyChar()) {
                case 'a':
                        this.setLocation(this.getX() - 20, this.getY());
                        break;
                case 'w':
                        this.setLocation(this.getX(), this.getY() - 20);
                        break;
                case 'd':
                        this.setLocation(this.getX() + 20, this.getY());
                        break;
                case 's':
                        this.setLocation(this.getX(), this.getY() + 20);
                        break;
            }
	}
}
