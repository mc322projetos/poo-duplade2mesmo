package pt.c40task.l05wumpus;

public class Ouro extends Componente{
	
	Ouro (Caverna caverna, int coordLinhaSala, int coordColunaSala) {
	    	super(caverna, coordLinhaSala, coordColunaSala);
		super.tipo = 'O';
        	super.prior = 1;
    	}
	
}
