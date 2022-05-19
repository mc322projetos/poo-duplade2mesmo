package pt.c40task.l05wumpus;

public class Ouro extends Componente{
    private static char tipo = 'O';
	
	Ouro (Caverna caverna, int coordLinhaSala, int coordColunaSala) {
	    super(caverna, coordLinhaSala, coordColunaSala);
	}
	
	public char getTipo() {
        return tipo;
    }
}
