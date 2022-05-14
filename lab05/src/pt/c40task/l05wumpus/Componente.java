package pt.c40task.l05wumpus;
import java.util.Random;

public class Componente {
    private Caverna caverna;
    protected int coordLinhaSala;
    protected int coordColunaSala;

    public Caverna getCaverna() {
        return caverna;
    }

    public int getCoordLinha() {
        return coordLinhaSala;
    } 
    public int getCoordColuna() {
        return coordColunaSala;
    }

}

public class Heroi extends Componente {
    private int qntFlecha;
    private boolean flechaPronta;

    public void equiparFlecha() {
        qntFlecha -= 1;
        flechapronta = true;
    }

    public int flechasDisp() {
        return qntFlecha;
    }

    public boolean podeAtirar() {
        if (flechasDisp() == 0)
            flechaPronta = false;
        return flechaPronta;
    }


    public void atirarFlecha() {
        flechaPronta = false;
    }

    public boolean matarWumpus() {
        Random random = new Random();
        return random.nextBoolean();
    }

    public void capturarOuro() {

    }

    public boolean capturarOuro() {
        return hero.caverna.getSala(i, j).getComp() == 'o';
    }
}
