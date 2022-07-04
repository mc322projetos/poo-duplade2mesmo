package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuScreen extends ScreenAdapter implements ActionListener{
	JButton play;
	JLabel logo;

	public MenuScreen(View view) {
		super(view);
		
		JPanel panel = super.getPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		logo = new JLabel("CatRinto", new ImageIcon("catrinto/src/view/cat.png"), 0);
		logo.setFont(new Font("Roboto", Font.ITALIC, 30));
		logo.setVerticalTextPosition(JLabel.BOTTOM);
        logo.setHorizontalTextPosition(JLabel.CENTER);
        logo.setIconTextGap(10);
        
		play = new JButton("Play");
		play.setAlignmentX(JButton.CENTER);
		play.addActionListener(this);
		
		panel.add(logo);
		panel.add(play);
		// panel.getParent().setLayout(null);
		// panel.setBounds(new Rectangle(0, 0, 20, 20));
		// panel.repaint();

		super.getFrame().repaint();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == play) {
            super.getView().getControl().play();
            super.changeScreen(1);
			
		}
		
	}
	
}
