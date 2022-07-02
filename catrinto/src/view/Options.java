package view;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Options extends JPanel implements ActionListener { // mudar para JPanel
	private static final long serialVersionUID = -4962687257542826320L;
	private JButton play, quit;
    
    public Options () {
        
        ImageIcon cat = new ImageIcon("../../assets/cat.png");

        JLabel label = new JLabel();
        label.setVerticalAlignment(JLabel.TOP); // muda a pos de icon+text

        label.setIcon(cat);

        label.setText("CatRinto"); // text fica na direita da img por padrao
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setIconTextGap(10);
        // label.setForeground(new Color()); muda a cor
        label.setFont(new Font("Roboto", Font.ITALIC, 30));
        label.setOpaque(true);

        // this.setLayout(null);
        // this.setBounds(r);
        // this.pack(); // add componentes antes de usar esse metodo
        // this.add(label);

        this.setBackground(Color.GREEN);
        this.setSize(400, 600);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        // this.setBounds(250,0,250,250);
        play = new JButton("Play");
        quit = new JButton("Quit");
        play.addActionListener(this);
        quit.addActionListener(this);

        this.add(label);
        this.add(play);
        this.add(quit);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == play)
            System.out.println("COMECOU");
            // controle.play();
        else if (e.getSource() == quit)
            System.out.println("ACABOU");
            // controle.quit();
    }
}
