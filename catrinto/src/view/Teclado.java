package view;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.Controle;
import model.Gato;

public class Teclado extends JFrame implements KeyListener {
	private static final long serialVersionUID = 994885871166873944L;
	JLabel label = new JLabel();
	Controle control;
	
	public Teclado() {
		this.setTitle("CatRinto");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1000, 600);
		this.addKeyListener(this); // teclado
		label.setBounds(0,0,100,100); // mouse e teclado
		label.setBackground(Color.RED); // mouse e teclado
		label.setOpaque(true); // teclado
		this.setVisible(true); // mouse e teclado
		this.setLayout(null);
		JLabel label2 = new JLabel();
		label2.setBounds(); // mouse e teclado
		label2.setIcon(new ImageIcon("../../assets/cat.png"));
		this.add(label);
		this.add(label2);
	}

	public void keyPressed(KeyEvent e) {
		
	}

	public void keyReleased(KeyEvent e) {
		
	}
	
	public void keyTyped(KeyEvent e) {
		switch(e.getKeyChar()) {
			case 'a':
				if (control.movimentar('a'))

					// public void movimentar(char move) {
						// model.getCat().mover(move)
					// }


					// label.setLocation(label.getX() - 10, label.getY());
				label.setLocation(label.getX() - 10, label.getY());
			break;
			case 'w': label.setLocation(label.getX(), label.getY() - 10);
				if (control.movimentar('w')) {
					
				}
				break;
			case 'd': label.setLocation(label.getX() + 10, label.getY());
				if (control.movimentar('d')) {
					
				}
				break;
			case 's': label.setLocation(label.getX(), label.getY() + 10);
				if (control.movimentar('s')) {
					
				}
				break;
		}
	}

}
