package view;

import java.awt.Component;
import java.awt.Image;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class ScreenAdapter {
	private JFrame frame;
	private View view;
	
	private JPanel panel;
	
	ScreenAdapter(View view) {
		this.view = view;

		frame = view.getFrame();
		// frame.removeAll();
		// gostaria que esses metodos do frame nao fossem chamados varias vezes
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 600);
		frame.setTitle("CatRinto");
		// frame.setIconImage(new Image("catrinto/src/view/cat.png")); // nao lembro como coloca o icone da frame
		frame.setAlwaysOnTop(true);
		frame.setVisible(true);

		panel = new JPanel();
	}
	
	protected void changeScreen(int screen) {
		view.changeScreen(screen);
	}

	protected void addToFrame(Component component) {
		frame.add(component);
	}
	
	protected JPanel getPanel() {
		return panel;
	}
	
	protected void show() {
		frame.add(panel);
		panel.setVisible(true);
	}
	
}
