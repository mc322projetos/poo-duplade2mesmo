package pt.c40task.l05wumpus;

public class Brisa extends Componente{
    private static char tipo = 'b';
    
    Brisa(Caverna caverna, int coordLinhaSala, int coordColunaSala) {
        super(caverna, coordLinhaSala, coordColunaSala);
    }

    public  char getTipo() {
        return tipo;
}
}
