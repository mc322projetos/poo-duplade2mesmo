package pt.c40task.l05wumpus;

public class Componente {
    private Caverna caverna; // e se caverna for static,
    // ai eu inicializava no construtor
    // ao inves de receber como parametro
    // e criasse um metodo static getCaverna()
    // talvez nao possa, o montador que conecta o comp a caverna
    private int coordLinhaSala;
    private int coordColunaSala;

    Componente(Caverna caverna, int coordLinhaSala, int coordColunaSala) {
        this.caverna = caverna;
        this.coordLinhaSala = coordLinhaSala;
        this.coordColunaSala = coordColunaSala;
    }

    public Caverna getCaverna() { // esse metodo getCaverna() tem que fazer parte da Caverna, n faz sentido colocar ele aqui, criei la na Caverna
        return caverna;
    }
    
    public static char getTipo() {}

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
