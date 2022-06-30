package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class JanelaJogo extends JFrame implements KeyListener{
    Options options;
    Maze maze;
    
    public JanelaJogo() {
        this.setTitle("CatRinto");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1000, 600);
        // this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        // this.setLayout(null);
        ImageIcon image = new ImageIcon("../../assets/cat.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(Color.WHITE); // new Color(0,0,0)
        
        JLabel cat = new JLabel();
        cat.setIcon(image);
        
        maze = new Maze();
        maze.add(cat);
        maze.getComponent(0).setBounds(750, 300, 50, 50);

        this.addKeyListener(this);
        options = new Options();

        this.add(options);
        this.add(maze);

        this.setVisible(true);
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
    public void keyTyped(KeyEvent e) {
        JLabel cat = (JLabel) maze.getComponent(0);
        switch(e.getKeyChar()) {
			case 'a': cat.setLocation(cat.getX() - 10, cat.getY());
			    break;
			case 'w':  cat.setLocation(cat.getX(), cat.getY() - 10);
				break;
			case 'd':  cat.setLocation(cat.getX() + 10, cat.getY());
				break;
			case 's': cat.setLocation(cat.getX(), cat.getY() + 10);
				break;
		}
        
    }

}
