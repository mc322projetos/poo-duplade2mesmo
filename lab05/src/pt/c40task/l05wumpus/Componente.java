package pt.c40task.l05wumpus;

public class Componente {
    private Caverna caverna;
    private int coordLinhaSala;
    private int coordColunaSala;
    protected char tipo;
    protected char prior;

    Componente(Caverna caverna, int coordLinhaSala, int coordColunaSala) {
        this.caverna = caverna;
        this.coordLinhaSala = coordLinhaSala;
        this.coordColunaSala = coordColunaSala;
    }

    public Caverna getCaverna() {
        return caverna;
    }
    
    public char getTipo() {
        return tipo;
    }

    public int getPrior() {
        return prior;
    }

    public int getCoordLinha() {
        return coordLinhaSala;
    } 

    public int getCoordColuna() {
        return coordColunaSala;
    }
    
    public void setCoordLinha(int coordLinhaSala) {
    	this.coordLinhaSala = coordLinhaSala;
    }
    
    public void setCoordColuna(int coordColunaSala) {
    	this.coordColunaSala = coordColunaSala;
    }

}
