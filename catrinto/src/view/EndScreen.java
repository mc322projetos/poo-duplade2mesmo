package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
		if (ganhou)
			resultado = new JLabel("Você ganhou :)", new ImageIcon("src/view/youWin.png"), 0);
		else
			resultado = new JLabel("Você perdeu :(", new ImageIcon("src/view/Game_Over.png"), 0);

		resultado.setFont(new Font("Roboto", Font.ITALIC, 30));
		resultado.setSize(100, 100);
		resultado.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		resultado.setVerticalTextPosition(JLabel.BOTTOM);
		resultado.setHorizontalTextPosition(JLabel.CENTER);

		int timeTaken = view.getControl().getTimer().getTempoLevado();
		JLabel tempo = new JLabel(String.format("Tempo levado: %02d", timeTaken));
		tempo.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		
		restart = new JButton("Play Again");
		restart.addActionListener(this);
		restart.setAlignmentX(JButton.CENTER_ALIGNMENT);
			
		panel.add(resultado);
		panel.add(tempo);
		panel.add(restart);

		super.getFrame().setContentPane(panel);
		super.getFrame().revalidate();
		super.getFrame().repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == restart)
            super.changeScreen(0);
		
	}
	
}
