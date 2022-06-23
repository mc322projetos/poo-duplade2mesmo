package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Teclado extends JFrame implements KeyListener {
	private static final long serialVersionUID = 994885871166873944L;
	JLabel label;
	
	public Teclado() {
		this.addKeyListener(this); // teclado
		label.setBounds(); // mouse e teclado
		label.setBackground(); // mouse e teclado
		label.setOpaque(true); // teclado
		this.setVisible(true); // mouse e teclado
	}

	public void keyPressed(KeyEvent e) {
		
	}

	public void keyReleased(KeyEvent e) {
		
	}
	
	public void keyTyped(KeyEvent e) {
		switch(e.getKeyChar()) {
			case 'a': label.setLocation(label.getX() - 10, label.getY());
				break;
			case 'w': label.setLocation(label.getX(), label.getY() - 10);
				break;
			case 'd': label.setLocation(label.getX() + 10, label.getY());
				break;
			case 's': label.setLocation(label.getX(), label.getY() + 10);
				break;
		}
	}

}
