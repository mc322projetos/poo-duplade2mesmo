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

    public boolean executarAcao() {}

}
