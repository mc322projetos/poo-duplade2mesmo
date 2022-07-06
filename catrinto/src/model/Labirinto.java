package model;

import controller.Control;

public class Labirinto {
	private Control control;
	private Celula maze[][];
	private Gato cat;
	char[][] mazeChar = {
			{'G', 'W', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'W', 'E', 'E', 'E', 'E', 'W', 'E', 'E', 'E', 'E', 'E'},
			{'E', 'W', 'E', 'E', 'E', 'E', 'W', 'W', 'W', 'W', 'E', 'E', 'W', 'E', 'W', 'E', 'W', 'W', 'W', 'E'},
			{'E', 'E', 'E', 'W', 'W', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'W', 'E', 'W', 'E', 'E', 'W', 'E', 'E'},
			{'E', 'E', 'E', 'W', 'E', 'E', 'W', 'W', 'E', 'E', 'E', 'E', 'E', 'E', 'W', 'E', 'E', 'W', 'E', 'W'},
			{'E', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'E', 'W', 'W', 'W', 'W', 'W', 'W', 'E', 'E', 'E', 'E', 'W'},
			{'E', 'E', 'W', 'W', 'W', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'W', 'E', 'E', 'E', 'W', 'E', 'W'},
			{'E', 'E', 'W', 'E', 'W', 'W', 'E', 'E', 'W', 'W', 'W', 'W', 'W', 'W', 'E', 'W', 'E', 'E', 'W', 'W'},
			{'W', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'W', 'E', 'E', 'E', 'W', 'W', 'E', 'E', 'E'},
			{'W', 'W', 'E', 'W', 'E', 'W', 'W', 'W', 'W', 'W', 'W', 'E', 'E', 'E', 'W', 'E', 'E', 'W', 'W', 'E'},
			{'E', 'W', 'E', 'E', 'W', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'W', 'W', 'E', 'E', 'E', 'E', 'W', 'E'},
			{'E', 'E', 'E', 'W', 'W', 'W', 'W', 'W', 'E', 'W', 'W', 'W', 'W', 'W', 'E', 'E', 'W', 'E', 'W', 'E'},
			{'W', 'W', 'E', 'E', 'W', 'E', 'W', 'E', 'E', 'E', 'E', 'E', 'E', 'W', 'E', 'W', 'E', 'W', 'E', 'E'},
			{'W', 'W', 'E', 'E', 'E', 'E', 'W', 'W', 'W', 'W', 'W', 'W', 'E', 'E', 'E', 'W', 'E', 'E', 'E', 'W'},
			{'W', 'E', 'E', 'W', 'W', 'W', 'W', 'E', 'E', 'E', 'E', 'E', 'E', 'W', 'E', 'W', 'W', 'E', 'W', 'W'},
			{'W', 'E', 'W', 'W', 'W', 'E', 'W', 'E', 'W', 'E', 'E', 'E', 'W', 'W', 'W', 'E', 'E', 'E', 'E', 'E'},
			{'E', 'E', 'E', 'E', 'W', 'E', 'W', 'W', 'E', 'W', 'E', 'E', 'W', 'E', 'E', 'W', 'E', 'W', 'W', 'E'},
			{'E', 'W', 'W', 'W', 'W', 'E', 'E', 'E', 'E', 'W', 'E', 'W', 'W', 'E', 'E', 'W', 'W', 'W', 'W', 'E'},
			{'E', 'W', 'E', 'E', 'W', 'E', 'E', 'W', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'W', 'E', 'E', 'W', 'E'},
			{'E', 'E', 'E', 'E', 'W', 'E', 'E', 'W', 'W', 'W', 'E', 'W', 'W', 'W', 'E', 'E', 'E', 'E', 'W', 'E'},
			{'W', 'E', 'W', 'E', 'E', 'E', 'E', 'E', 'E', 'W', 'E', 'E', 'E', 'E', 'E', 'W', 'W', 'W', 'W', 'T'}		
	};
	
	public Labirinto(Control control, Gato cat, Wall wall, Empty empty, Toca toca) {
		this.control = control;
		this.cat = cat;
		this.maze = new Celula[20][20];
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				if (mazeChar[i][j] == 'G') {
					maze[i][j] = new Celula(cat);
				} else if (mazeChar[i][j] == 'W') {
					maze[i][j] = new Celula(wall);
				} else if (mazeChar[i][j] == 'E') {
					maze[i][j] = new Celula(empty);
				} else if (mazeChar[i][j] == 'T') {
					maze[i][j] = new Celula(toca);
				}
			}
		}
	}
	
	public Celula[][] getMaze() {
		return maze;
	}

	public char[][] getMapaInicial() {
		return mazeChar;
	}

	public boolean moverGato(char move) {
		int linhaGato = cat.getCoordLinha();
		int colunaGato = cat.getCoordColuna();
		int novaLinhaGato = 0, novaColunaGato = 0;

		boolean podeMover = false;
		if (move == 'w') {
			novaLinhaGato = linhaGato - 1;
			novaColunaGato = colunaGato;
		} else if (move == 's') {
			novaLinhaGato = linhaGato + 1;
			novaColunaGato = colunaGato;
		} else if (move == 'a') {
			novaLinhaGato = linhaGato;
			novaColunaGato = colunaGato - 1;
		} else if (move == 'd') {
			novaLinhaGato = linhaGato;
			novaColunaGato = colunaGato + 1;
		} else {
			return false;
		}

		if (maze[novaLinhaGato][novaColunaGato].getType() != 'W' && maze[novaLinhaGato][novaColunaGato] != null) {
			podeMover = true;
			cat.setCoordLinha(novaLinhaGato);
			cat.setCoordColuna(novaColunaGato);
		}

		return podeMover;
	}
	
	public boolean ganhouJogo() {
		int linhaGato = cat.getCoordLinha();
		int colunaGato = cat.getCoordColuna();
		if (linhaGato == 19 && colunaGato == 19) {
			return true;
		} else {
			return false;
		}
	}
}
