package controller;

import model.Labirinto;
import view.View;

public class Control{
    Labirinto model; // classe principal do modelo
    View view;
    Cronometro timer;
    Montador montador;

    public Control() {
        view = new View(this);
        timer = new Cronometro(this);
    }

    // @Override
    public void play() {
        montador = new Montador();
        view.changeScreen(1);
        timer.start();

    }

    public void setView(View view) {
        this.view = view;
    }

    public void setLabirinto(Labirinto model) {
        this.model = model;
    }


    public void tempoAcabou() {
        view.changeScreen(2);
    }

    public void setCountdown(int contador) {
        view.setCountdown(contador);
    }

	public Montador getMontador() {
		return montador;
	}
    
}
