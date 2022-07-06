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
	JLabel resultado;

	EndScreen(View view, boolean ganhou) {
		super(view);

		JPanel panel = super.getPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		if (ganhou)
		resultado = new JLabel("Você ganhou :)", new ImageIcon("catrinto/src/view/youWin.png"), 0);
		else
		resultado = new JLabel("Você perdeu :(", new ImageIcon("catrinto/src/view/Game_Over.png"), 0);
		
		resultado.setSize(100, 100);
		resultado.setFont(new Font("Roboto", Font.ITALIC, 30));
		resultado.setVerticalTextPosition(JLabel.BOTTOM);
		resultado.setHorizontalTextPosition(JLabel.CENTER);
		resultado.setIconTextGap(10);

		int timeTaken = view.getControl().getTimer().getTempoLevado();
		JLabel tempo = new JLabel(String.format("Tempo levado: %02d", timeTaken));

		restart = new JButton("Play");
		restart.addActionListener(this);

		panel.add(resultado);
		panel.add(tempo);
		panel.add(restart);
		super.getFrame().revalidate();
		super.getFrame().repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == restart)
            super.changeScreen(0);
            // controle.play();
		
	}
	
}
