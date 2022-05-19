package pt.c40task.l05wumpus;

public class Fedor extends Componente{
    private static char tipo = 'f';
    
    Fedor(Caverna caverna, int coordLinhaSala, int coordColunaSala) {
        super(caverna, coordLinhaSala, coordColunaSala);
    }

    public char getTipo() {
        return tipo;
    }
    
}
