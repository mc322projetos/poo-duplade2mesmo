package pt.c40task.l05wumpus;
import java.util.Random;

public class Componente {
    private Caverna caverna;
    protected int coordLinhaSala;
    protected int coordColunaSala;

    Componente(Caverna caverna, int coordLinhaSala, int coordColunaSala) { // criei o construtor, pq se n n da pra usar os atributos da classe
        this.caverna = caverna;
        this.coordLinhaSala = coordLinhaSala;
        this.coordColunaSala = coordColunaSala;
    }

    public Caverna getCaverna() {
        return caverna;
    }

    public int getCoordLinha() {
        return coordLinhaSala;
    } 
    public int getCoordColuna() {
        return coordColunaSala;
    }

    public boolean lutarContraWumpus() {
        int i = coordLinhaSala;
        int j = coordColunaSala;
        if (caverna.getSala(i, j).getMaiorPrior(1) == W) { // tem um problema aqui, a gente precisa dar um jeito de fazer essa verificacao
            // sem usar o objeto W
            Random random = new Random();
            return random.nextBoolean();
        }
        return false;
    }

}
