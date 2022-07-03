package view;

import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class ScreenAdapter {
	private JFrame frame;
	protected View view;
	
	private JPanel panel;
	
	ScreenAdapter(View view) {
		this.view = view;

		frame = view.getFrame();
		frame.getContentPane().removeAll();
		// gostaria que esses metodos do frame nao fossem chamados varias vezes
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		frame.setSize(1000, 600);
		frame.setTitle("CatRinto");
		// frame.setIconImage(new Image("catrinto/src/view/cat.png")); // nao lembro como coloca o icone da frame
		frame.setVisible(true);
		
		panel = new JPanel();
		frame.add(panel);
		panel.setVisible(true);
		
		frame.revalidate();
		// frame.repaint();
	}
	
	protected void changeScreen(int screen) {
		frame.getContentPane().removeAll();
		view.changeScreen(screen);
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
