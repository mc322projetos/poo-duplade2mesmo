package pt.c40task.l05wumpus;

public class Caverna {
	private Sala[][] caverna;

	Caverna() {
		this.caverna = new Sala[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				caverna[i][j] = new Sala();
			}
		}
	}

	public Sala[][] getCaverna() {
		return caverna;
	}
	public Sala getSala(int i, int j) {
		return caverna[i][j];
	}

	public boolean conectarComponente(Componente comp) {
		// retorna true se deu erro;
		int i = comp.getCoordLinha();
    	int j = comp.getCoordColuna();
		if (caverna[i][j].conectarComponente(comp)) {
			return false; 
		}
		else {
			return true;
		}
	}
}

