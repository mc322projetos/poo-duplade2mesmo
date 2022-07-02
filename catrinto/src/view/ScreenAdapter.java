package view;

import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class ScreenAdapter {
	private static JFrame frame = new JFrame(); 
	// murillo, coloquei static mas nao sei se ta certo
	// queria que cada herdeira tivesse um ponteiro para um JFrame, 
	// só que para um mesmo JFrame e que opera na classe mae
	
	private JPanel pane;
	protected ArrayList<JComponent> components;
	
	ScreenAdapter() {
		frame.setVisible(true);
	}
	
	protected void addComponent(JComponent component) {
		components.add(component);
		pane.add(component);
	}
	
	protected JPanel getPane() {
		return pane;
	}
	
	protected void show() {
		frame.add(pane);
		pane.setVisible(true);
		for (JComponent component: components) {
			pane.add(component);
			component.setOpaque(true);
		}
	}
	
	public void dispose() {
		pane.setVisible(false);
		pane.removeAll();
		frame.remove(pane);
	}
	
}
