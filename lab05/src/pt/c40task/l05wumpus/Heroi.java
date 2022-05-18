package pt.c40task.l05wumpus;

import java.util.Random;

public class Heroi extends Componente{
    private static char tipo;
    private int pontuacao;
    private int qntFlecha;
    private boolean flechaPronta;

    Heroi (Caverna caverna, int coordLinhaSala, int coordColunaSala) {
        super(caverna, coordLinhaSala, coordColunaSala);
        tipo = 'h';
    }
    
    public int getPontuacao() {
        return pontuacao;
    }
    
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    
    
    public void mover(int coordLinhaSala, int coordColunaSala) {
    	super.setCoordLinha(coordLinhaSala);
    	super.setCoordColuna(coordColunaSala);
    }
    
    public int flechasDisp() {
        return qntFlecha;
    }

    public void equiparFlecha() {
        if (flechasDisp() == 0)
            flechaPronta = false;
        else {
            qntFlecha -= 1;
            flechaPronta = true;
        }
    }

    public boolean podeAtirar() {
        return flechaPronta;
    }

    public void atirarFlecha() {
        flechaPronta = false;
    }
    
    public boolean acharOuro() {
    	int i = super.getCoordLinha();
    	int j = super.getCoordColuna();
    	return super.getCaverna().getSala(i, j).getMaiorPrior(0).getType() == 'O';
    }
    
    public void capturarOuro() {
    }
    
    public boolean cairBuraco() {
    	return super.getCaverna().getSala(i, j).getMaiorPrior(0).getType() == 'B';
    }
    
    public boolean acharWumpus() {
    	int i = super.getCoordLinha();
    	int j = super.getCoordColuna();
    	return super.getCaverna().getSala(i, j).getMaiorPrior(1).getType() == 'W';
    }
    
    public boolean matarWumpus() {
    	Random random = new Random();
    	return random.nextBoolean();
    }
}
 
