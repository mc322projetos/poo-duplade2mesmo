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

	EndScreen(View view, boolean ganhou) {
		super(view);
		JPanel panel = super.getPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		if (ganhou == false) {
			JLabel logoPerdeu = new JLabel("Você perdeu :(", new ImageIcon("catrinto/src/view/Game_Over.png"), 0);
			logoPerdeu.setSize(100, 100);
			logoPerdeu.setFont(new Font("Roboto", Font.ITALIC, 30));
			logoPerdeu.setVerticalTextPosition(JLabel.BOTTOM);
			logoPerdeu.setHorizontalTextPosition(JLabel.CENTER);
			logoPerdeu.setIconTextGap(10);
			int timeTaken = view.getControl().getTimer().getTempoRestante(); // pegar tempo MainScreen (ou do HUD)
        	JLabel tempo = new JLabel(String.format("Tempo levado: %02d", timeTaken));
			restart = new JButton("Play");
			// restart.setAlignmentX(JButton.CENTER);
			restart.addActionListener(this);
			
			panel.add(logoPerdeu);
			panel.add(tempo);
			panel.add(restart);
		} else {
			JLabel logoGanhou = new JLabel("Você ganhou :)", new ImageIcon("catrinto/src/view/Game_Over.png"), 0);
			logoGanhou.setSize(100, 100);
			logoGanhou.setFont(new Font("Roboto", Font.ITALIC, 30));
			logoGanhou.setVerticalTextPosition(JLabel.BOTTOM);
			logoGanhou.setHorizontalTextPosition(JLabel.CENTER);
			logoGanhou.setIconTextGap(10);
			int timeTaken = view.getControl().getTimer().getTempoRestante(); // pegar tempo MainScreen (ou do HUD)
        	JLabel tempo = new JLabel(String.format("Tempo levado: %02d", timeTaken));
			restart = new JButton("Play");
			// restart.setAlignmentX(JButton.CENTER);
			restart.addActionListener(this);
			
			panel.add(logoGanhou);
			panel.add(tempo);
			panel.add(restart);
		}
		super.getFrame().revalidate();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == restart)
            super.changeScreen(0);
            // controle.play();
		
	}
	
}
