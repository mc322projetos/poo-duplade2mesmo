package view;

import javax.swing.JFrame;

import controller.Control;
import model.Labirinto;

public class View {
	JFrame frame;
	public Control control;
	private MainScreen mainScreen;

	public View(Control control) {
		this.control = control;
		frame = new JFrame();
		new MenuScreen(this);
	}

	public JFrame getFrame() {
		return frame;
	}
	
	public void changeScreen(int screen, boolean ganhou) {
		switch(screen) {
			case 0:
				new MenuScreen(this);
				break;
			case 1:
				mainScreen = new MainScreen(this);
				break;
			case 2:
				new EndScreen(this, ganhou);
				break;
		}
	}

	public void setCountdown(int time) {
		mainScreen.setCountdown(time);
	}

    public Control getControl() {
        return control;
    }

	public MainScreen getMainScreen() {
		return mainScreen;
	}

}
