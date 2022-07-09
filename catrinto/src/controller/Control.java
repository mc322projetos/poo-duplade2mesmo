package controller;

import model.Labirinto;
import view.View;

public class Control{
    private Labirinto model; // classe principal do modelo
    private View view;
    private Cronometro timer;
    private boolean ganhou = false;
    private Montador montador;

    public Control() {
        view = new View(this);
        timer = new Cronometro(this);
    }

    // @Override
    public void play() {
        montador = new Montador(this);
        model = montador.getLabirinto();
        view.changeScreen(1, ganhou);
        timer.start();

    }

    public void setView(View view) {
        this.view = view;
    }

    public void setLabirinto(Labirinto model) {
        this.model = model;
    }


    public void tempoAcabou(boolean ganhou) {
        view.changeScreen(2, ganhou);
    }

    public void setCountdown(int contador) {
        view.setCountdown(contador);
    }

	public Montador getMontador() {
		return montador;
	}

    public boolean moveAttempt(char key) {
        if (model.moverGato(key)) {
            if (model.ganhouJogo()) {
                this.win();
            }
            return true;
        }
        else
            return false;
            
    }

    public boolean win() {
        return model.ganhouJogo();
    }

	public Cronometro getTimer() {
		return timer;
	}

    public Labirinto getMaze() {
        return model;
    }

    public boolean isRunning() {
       return timer.getRodando();
   }

   public void moverCachorro(int old_i, int old_j, int i, int j) {
    view.getMainScreen().moverCachorro(old_i, old_j, i, j);
}

    
}
