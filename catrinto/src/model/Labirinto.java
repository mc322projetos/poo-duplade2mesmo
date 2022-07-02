package model;

public class Labirinto {
	private Celula maze[][];
	private Gato cat;
	private Cachorro dog;
	
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

	public boolean moverGato(char move) {
		int linhaGato = cat.getCoordLinha();
		int colunaGato = cat.getCoordColuna();
		boolean podeMover = false;
		if (move == 'w') {
			if (maze[linhaGato - 1][colunaGato].getType() != 'W') {
				podeMover = true;
				cat.setCoordLinha(linhaGato - 1);
			}
		} else if (move == 's') {
			if (maze[linhaGato + 1][colunaGato].getType() != 'W') {
				podeMover = true;
				cat.setCoordLinha(linhaGato + 1);
			}
		} else if (move == 'a') {
			if (maze[linhaGato][colunaGato - 1].getType() != 'W') {
				podeMover = true;
				cat.setCoordColuna(colunaGato - 1);
			}
		} else if (move == 'd') {
			if (maze[linhaGato][colunaGato + 1].getType() != 'W') {
				podeMover = true;
				cat.setCoordColuna(colunaGato + 1);
			}
		}
		return podeMover;
	}
	
	public boolean ganhouJogo() {
		int linhaGato = cat.getCoordLinha();
		int colunaGato = cat.getCoordColuna();
		if (linhaGato == 19 && colunaGato == 19) {
			return true;
		}
		return false;
	}
	
	public boolean moverCachorro() {
		int linha = dog.getCoordLinha();
		int coluna = dog.getCoordLinha();
		boolean podeMover = false;
		
	}
}
