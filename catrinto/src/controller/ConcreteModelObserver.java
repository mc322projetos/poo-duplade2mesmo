package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConcreteModelObserver implements ActionListener {
    private int fish = 0;
    private boolean win = false;

    ConcreteModelObserver() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // alterar para switch, nao sei se da por causa da String
        
        if (e.getActionCommand().equals("fish")) {
            fish += 1;
        }
        else if (e.getActionCommand().equals("win")){
            win = true;
        }
    }

    public int getFish() {
        return fish;
    }

    public boolean getWin() {
        return win;
    }
}