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

	MenuScreen() {
		super.dispose();
		
		JPanel pane = super.getPane();
		pane.setBackground(Color.WHITE);
		pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
		
		logo = new JLabel("CatRinto", new ImageIcon("cat.png"), 0);
		logo.setFont(new Font("Roboto", Font.ITALIC, 30));
		logo.setVerticalTextPosition(JLabel.BOTTOM);
        logo.setHorizontalTextPosition(JLabel.CENTER);
        logo.setIconTextGap(10);
        
		play = new JButton("Play");
		play.setAlignmentX(JButton.CENTER);
		play.addActionListener(this);
		
		super.addComponent(logo);
		super.addComponent(play);
		
		super.show();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == play)
            System.out.println("COMECOU");
            // controle.play();
		
	}
	
}
