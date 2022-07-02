package view;

public class View {
	
	public View() {
		new MenuScreen();
	}
	
	public void changeScreen(int screen) {
		switch(screen) {
			case 0:
				new MenuScreen();
			case 1:
				new MainScreen();
			case 2:
				new EndScreen();
		}
	}
}
