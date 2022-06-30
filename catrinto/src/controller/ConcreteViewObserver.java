package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConcreteViewObserver implements ActionListener {
    private boolean play = false;
    private boolean win = false;

    ConcreteViewObserver() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // alterar para switch, nao sei se da por causa da String
        
        if (e.getActionCommand().equals("play")) {
            play = true;
        }
        else if (e.getActionCommand().equals("win")){
            win = true;
        }
    }

    public boolean getPlay() {
        return play;
    }

    public boolean getWin() {
        return win;
    }
}