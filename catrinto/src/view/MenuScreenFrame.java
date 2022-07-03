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

public class MenuScreenFrame implements ActionListener{
    ScreenAdapterFrame screenAdapterFrame;
    JButton play;
	JLabel logo;

    public MenuScreenFrame(ScreenAdapterFrame screenAdapterFrame) {
        this.screenAdapterFrame = screenAdapterFrame;
        
		JPanel panel = screenAdapterFrame.getPanel();
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
    }

    @Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == play) {
            screenAdapterFrame.getView().getControl().play();
            screenAdapterFrame.changeScreen(1);
			
		}
		
	}

}
