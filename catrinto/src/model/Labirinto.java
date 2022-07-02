package model;

public class Labirinto {
	private Celula maze[][];
	private Gato cat;
	
	public Labirinto() {
		this.maze = new Celula[20][20];
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				maze[i][j] = new Celula();
			}
		}
	}
	
	public Celula[][] getMaze() {
		return maze;
	}
	
	public void add(Atores ator, int i, int j) {
		maze[i][j].add(ator);
	}

	public boolean moveAttempt(char c) {
		int linha = cat.getCoordLinha();
		int coluna = cat.getCoordColuna();
		boolean podeMover = false;
		if (c == 'w') {
			if (maze[linha - 1][coluna].getType() != 'W') {
				podeMover = true;
				cat.setCoordLinha(linha - 1);
			}
		} else if (c == 's') {
			if (maze[linha + 1][coluna].getType() != 'W') {
				podeMover = true;
				cat.setCoordLinha(linha + 1);
			}
		} else if (c == 'a') {
			if (maze[linha][coluna - 1].getType() != 'W') {
				podeMover = true;
				cat.setCoordColuna(coluna - 1);
			}
		} else if (c == 'd') {
			if (maze[linha][coluna + 1].getType() != 'W') {
				podeMover = true;
				cat.setCoordColuna(coluna + 1);
			}
		}
		return podeMover;
	}
}
