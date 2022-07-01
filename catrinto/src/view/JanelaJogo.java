package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class JanelaJogo extends JFrame implements KeyListener{
	private static final long serialVersionUID = 6687866489103271154L;
	Options options;
    Maze maze;
    JLabel cat, timer;
    Timer tm;
    private int contador = 0; // onde será feita a contagem do tempo em segundos
    private boolean rodando = false;
    
    public JanelaJogo() {
    	JFrame.setDefaultLookAndFeelDecorated(true);
        this.setTitle("CatRinto");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.setResizable(false);
        this.setSize(1000, 600);
        this.setAlwaysOnTop(true);
        this.setLayout(new BorderLayout());
        // this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        // this.setLayout(null);
        
        
        timer = new JLabel("00:00:00");
        timer.setFont(new Font(timer.getName(), Font.PLAIN, 80));
        this.add(timer, BorderLayout.CENTER);
        
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(2, 1));
        
        JButton btIniciar = new JButton("Iniciar");
        btIniciar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if (!rodando) {
	    			Timer tm = new Timer();
	    			rodando = true;
	        		tm.scheduleAtFixedRate(new TimerTask() {
	        			@Override
	        			public void run() {
	        				contador += 1;
	        				int seg = contador % 60;
	        				int min = contador / 60;
	        				int hora = min / 60;
	        				min %= 60; // para ficar somente os minutos no contador
	        				timer.setText(String.format("%02d:%02d:%02d", hora, min, seg)); // alterar o label com a contagem do tempo
	        			}
	        		}, 1000, 1000); // 1000 ms = 1 s
        		}
        	}
        }
        );
        JButton btParar = new JButton("Parar");
        btParar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if (rodando) {
        			tm.cancel(); // para o timer;
        			rodando = false;
        			contador = 0;
        		}
        	}
        }
        );
        
        painel.add(btIniciar);
        painel.add(btParar);
        
        this.add(painel, BorderLayout.EAST);
        this.pack();
        this.setVisible(true);
        
        /*ImageIcon image = new ImageIcon("../../assets/cat.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(Color.WHITE); // new Color(0,0,0)
        
        cat = new JLabel();
        cat.setIcon(image);
        
        maze = new Maze();
        maze.add(cat);
        maze.getComponent(0).setBounds(750, 300, 50, 50);

        this.addKeyListener(this);
        options = new Options();

        this.add(options);
        this.add(maze);

        this.setVisible(true);*/
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
