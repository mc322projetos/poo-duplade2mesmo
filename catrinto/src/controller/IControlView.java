package controller;

import view.View;

public interface IControlView {
    public void setView(View view);
    public Cronometro getTimer();
    public Montador getMontador();
    public void tempoAcabou(boolean ganhou);
    public boolean gatoMorto();
    public boolean moveAttempt(char key);
    public int[] moveAttempt();
}
