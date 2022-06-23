package view;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JanelaJogo extends JFrame implements KeyListener, MouseListener{
	/*
	* murillo, pensei em um BoxLayout para o ContentPane,
	* aí a gente divide ele em duas partes, 
	* na primeira
	* colocamos um Container de BoxLayout, com caixa de texto,
	* botoes, etc em uma coluna
	* na segunda,
	* colocamos um Container de FLowLayout, e vamos adicionando as
	* celulas, e da pra configurar o espacamento vertical e horizontal
	*/ 

	private static final long serialVersionUID = -4127484169536275339L;
	private Container pane;
	private Container options;
	private Container maze;
	private ActionListener control;
	private JLabel label;
	private ImageIcon icon;
	private ImageIcon smile;
	private ImageIcon nervous;
	private ImageIcon pain;
	private ImageIcon dizzy;
	
	public JanelaJogo() {
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(new FlowLayout()); // mouse
		label = new JLabel(); // mouse
		label.addMouseListener(this);// mouse
		smile = new ImageIcon(arquivo); // mouse
		nervous = new ImageIcon(arquivo); // mouse
		pain = new ImageIcon(arquivo); // mouse
		dizzy = new ImageIcon(arquivo); // mouse
		label.setIcon(smile); // mouse
		this.add(label); // mouse
		pack(); // mouse
		setLocationRelativeTo(null); // mouse
		this.addKeyListener(this); // teclado
		label.setBounds(0, 0, 100, 100); // mouse e teclado
		label.setBackground(Color.red); // mouse e teclado
		label.setOpaque(true); // teclado
		this.setVisible(true); // mouse e teclado
	}
	
	public void subscribe(ActionListener l) {
		control = l;
	}
	
	public void visual() {
		setSize(500, 200); // colocar tamanho

		pane = getContentPane();
		pane.setLayout(new BoxLayout(pane, ));
		pane.add(options);
		pane.add(maze);
		visualOptions();
		visualMaze();

		setVisible(true);
	}

	public void visualOptions() {
		setSize();

		addImage(catRinto);
		addButton(options, new Button("Play", control));
		// addButton(options, quit);

		setVisible(true);
	}

	public void visualMaze() {
		setSize(300, 200); // mudar tamanho

		maze.setLayout(new FlowLayout());
		addCells(maze, cells); // precisamos gerar esse vetor Image[][]
		pane.add(maze);

		setVisible(true);
	}

	public void addImage(Container container, Image image) {
		container.add(image);
	}

	public void addButton(Container container, Button button) {
		container.add(button);
	}

	public void addCells(Container maze, Image[][] cells) { // exclusivo do maze
		for (Image[] imgArr: cells)
			for (Image img: imgArr)
				addImage(maze, img);
	}

	public void changeCell(Container maze, Image oldCell, Image newCell) { // so do maze
		int i = oldCell.getIndex(); // nao existe esse metodo
		maze.remove(i);
		maze.add(newCell, i); // algo assim, nao sei se ele add depois de i
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
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

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		label.setBackground(Color.yellow);
		label.setIcon(pain);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		label.setBackground(Color.green);
		label.setIcon(dizzy);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		label.setBackground(Color.blue);
		label.setIcon(nervous);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		label.setBackground(Color.red);
		label.setIcon(smile);
	}
}
