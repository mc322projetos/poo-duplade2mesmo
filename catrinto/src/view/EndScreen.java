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

public class EndScreen extends ScreenAdapter implements ActionListener{
	JButton restart;

	EndScreen(View view) {
		super(view);

		JPanel pane = super.getPanel();
		pane.setBackground(Color.WHITE);
		pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
		
		JLabel logo = new JLabel("Você perdeu :(", new ImageIcon("Game_Over.png"), 0);
		logo.setFont(new Font("Roboto", Font.ITALIC, 30));
		logo.setVerticalTextPosition(JLabel.BOTTOM);
        logo.setHorizontalTextPosition(JLabel.CENTER);
        logo.setIconTextGap(10);
        
        int timeTaken; // pegar tempo MainScreen (ou do HUD)
        JLabel tempo = new JLabel(String.format("Tempo levado: %02d", timeTaken));
        
		restart = new JButton("Play");
		restart.setAlignmentX(JButton.CENTER);
		restart.addActionListener(this);
		
		super.addToPanel(logo);
		super.addToPanel(restart);
		
		super.show();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == restart)
            super.changeScreen(0);
            // controle.play();
		
	}
	
}
