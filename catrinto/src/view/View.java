package view;

import javax.swing.JFrame;

public class View {
	JFrame frame;

	public View() {

		frame = new JFrame();
		new MenuScreen(this);
	}
	
	public void changeScreen(int screen) {
		switch(screen) {
			case 0:
				new MenuScreen(this);
			case 1:
				new MainScreen(this);
			case 2:
				new EndScreen(this);
		}
	}

    public JFrame getFrame() {
        return frame;
    }
}
