package pt.c40task.l05wumpus;

public class Ouro extends Componente{
    private static char tipo;
	Ouro (Caverna caverna, int coordLinhaSala, int coordColunaSala) {
	    super(caverna, coordLinhaSala, coordColunaSala);
	    tipo = 'O';
	}
	
	public static char getTipo() {
        return tipo;
    }
}
