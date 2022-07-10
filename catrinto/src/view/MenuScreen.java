package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

		logo = new JLabel("CatRinto", new ImageIcon("src/view/cat.png"), 0);
		logo.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		logo.setAlignmentY(JLabel.CENTER_ALIGNMENT);
		logo.setFont(new Font("Roboto", Font.ITALIC, 30));
		logo.setVerticalTextPosition(JLabel.BOTTOM);
        logo.setHorizontalTextPosition(JLabel.CENTER);
        logo.setIconTextGap(10);
        
		play = new JButton("Play");
		play.setAlignmentX(JButton.CENTER_ALIGNMENT);
		play.addActionListener(this);
		
		panel.add(logo);
		panel.add(play);

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
