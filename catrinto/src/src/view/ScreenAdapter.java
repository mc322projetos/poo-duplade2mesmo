package view;

import java.awt.Component;
import java.awt.Color;

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
		frame.getContentPane().removeAll();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(1000, 600);
		frame.setTitle("CatRinto");
		frame.setVisible(true);
		
		panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		frame.add(panel);

		frame.revalidate();
		frame.repaint();
	}
	
	protected void changeScreen(int screen) {
		frame.getContentPane().removeAll();
		view.changeScreen(screen, false);
		frame.revalidate();
		frame.repaint();
	}

	protected void addToFrame(Component component) {
		frame.add(component);
	}
	
	protected JPanel getPanel() {
		return panel;
	}

	public JFrame getFrame() {
		return frame;
	}

	public View getView() {
		return view;
	}
	
	
}
