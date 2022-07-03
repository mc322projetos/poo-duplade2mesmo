package view;

import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ScreenAdapterFrame extends JFrame {
	protected View view;
	
	private JPanel panel;
	
	ScreenAdapterFrame(View view) {
		this.view = view;

		this.getContentPane().removeAll();
		// gostaria que esses metodos do this nao fossem chamados varias vezes
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		this.setSize(1000, 600);
		this.setTitle("CatRinto");
		// this.setIconImage(new Image("catrinto/src/view/cat.png")); // nao lembro como coloca o icone da frame
		this.setVisible(true);
		
		panel = new JPanel();
		this.add(panel);
		panel.setVisible(true);
		
		this.revalidate();
		this.repaint();

		new MenuScreenFrame(this);
	}
	
	protected void changeScreen(int screen) {
		this.getContentPane().removeAll();
        switch(screen) {
            case 0:
                new MenuScreenFrame(this);
                break;
            case 1:
                new MainScreenFrame(this);
                break;
            case 2:
                new EndScreenFrame(this);
                break;
            }
		this.revalidate();
		this.repaint();
	}

	protected void addToFrame(Component component) {
		this.add(component);
	}
	
	protected JPanel getPanel() {
		return panel;
	}

	public JFrame getFrame() {
		return this;
	}

	public View getView() {
		return view;
	}
	
	
}
