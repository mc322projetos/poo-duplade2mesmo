package view;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

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
	
	public JanelaJogo() {
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.addKeyListener(this);
	}
	
	public void subscribe(ActionListener l) {
		control = l;
	}
	
	public void visual() {
		setSize(); // colocar tamanho

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

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
