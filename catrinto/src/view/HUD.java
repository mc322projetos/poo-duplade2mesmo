package view;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class HUD extends JPanel {
	JLabel countdownLabel;

	HUD() {
		this.setLayout(new FlowLayout());
		countdownLabel = new JLabel();
		this.add(countdownLabel);
		setCountdown(100);
		
	}
	
	public void setCountdown(int time) {
		countdownLabel.setText(String.format("Tempo restante: %03d", time));
		
	}
	
}
