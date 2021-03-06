package view;

import javax.swing.JFrame;

import controller.Control;

public class View {
	private JFrame frame;
	public Control control;
	private MainScreen mainScreen;

	public View(Control control) {
		this.control = control;
		frame = MyJFrame.getMyFrame();
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
			case 3:
				new TutorialScreen(this);
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
