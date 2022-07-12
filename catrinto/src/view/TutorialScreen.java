package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class TutorialScreen extends ScreenAdapter implements ActionListener{
    JButton back;
    JLabel teclado;
    JLabel informacoes;

	TutorialScreen(View view) {
		super(view);
		
        JPanel panel = super.getPanel();
        
        teclado = new JLabel("Comandos:", new ImageIcon
        (new ImageIcon(getClass().getResource("/view/keyBoard.png")).getImage().getScaledInstance(400, 400,  java.awt.Image.SCALE_SMOOTH)), 0);
        teclado.setFont(new Font("Roboto", Font.BOLD, 30));
		teclado.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		teclado.setVerticalTextPosition(JLabel.TOP);
		teclado.setHorizontalTextPosition(JLabel.CENTER);

        informacoes = new JLabel("Evite o cachorro!!!");
        informacoes.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        informacoes.setFont(new Font("Roboto", Font.BOLD, 30));
		informacoes.setSize(50, 50);

        back = new JButton("Back");
        back.addActionListener(this);
        back.setAlignmentX(JButton.CENTER_ALIGNMENT);

        panel.add(teclado);
        panel.add(informacoes);
        panel.add(back);

        super.getFrame().repaint();
	}


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            super.changeScreen(0);
        } 
    }
    

}


