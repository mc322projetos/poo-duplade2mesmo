package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public abstract class ActionSubject {  
    private ArrayList<ActionListener> listeners;
    private ActionEvent e;

    public void addActionListener(ActionListener l) {
        listeners.add(l);
    }

    public void removeActionListener(ActionListener l) {
        listeners.remove(l);
    }
    
    public void notify(ActionEvent e) {
        for (ActionListener l: listeners) {
            l.actionPerformed(e);
        }
    }
} 