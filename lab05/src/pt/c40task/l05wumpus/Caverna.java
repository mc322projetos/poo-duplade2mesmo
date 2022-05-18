package pt.c40task.l05wumpus;

public class Caverna {
	private Sala[][] caverna;

	Caverna() {
		this.caverna = new Salas[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				caverna[i][j] = new Sala();
			}
		}
	}

	public Sala[][] getCaverna() {
		return caverna;
	}
}

