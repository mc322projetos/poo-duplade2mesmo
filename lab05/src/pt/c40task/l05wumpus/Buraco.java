package pt.c40task.l05wumpus;

public class Buraco extends Componente{
	
	Buraco (Caverna caverna, int coordLinhaSala, int coordColunaSala) {
	    super(caverna, coordLinhaSala, coordColunaSala);
		super.tipo = 'B';
		super.prior = 1;
	}
	
	public void criarBrisas() {
		if (linhaHeroi - 1 >= 0 && linhaHeroi - 1 < 3) {}
		if (linhaHeroi + 1 > 0 && linhaHeroi + 1 <= 3) {

	}
}
