package model;

import java.util.ArrayList;
import java.util.Random;

public class Labirinto {
	private Celula maze[][];
	private Gato cat;
	private ArrayList<int[]> emptyCells = new ArrayList<int[]> ();
	char[][] mazeChar = {
			{'G', 'W', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'W', 'E', 'E', 'E', 'E', 'W', 'E', 'E', 'E', 'E', 'E'},
			{'E', 'W', 'E', 'E', 'E', 'E', 'W', 'W', 'W', 'W', 'E', 'E', 'W', 'E', 'W', 'E', 'W', 'W', 'W', 'E'},
			{'E', 'E', 'E', 'W', 'W', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'W', 'E', 'W', 'E', 'E', 'W', 'C', 'E'},
			{'E', 'E', 'E', 'W', 'E', 'E', 'W', 'W', 'E', 'E', 'E', 'E', 'E', 'E', 'W', 'E', 'E', 'W', 'E', 'W'},
			{'E', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'E', 'W', 'W', 'W', 'W', 'W', 'W', 'E', 'E', 'E', 'E', 'W'},
			{'E', 'E', 'W', 'W', 'W', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'W', 'E', 'E', 'E', 'W', 'E', 'W'},
			{'E', 'E', 'W', 'C', 'W', 'W', 'E', 'E', 'W', 'W', 'W', 'W', 'W', 'W', 'E', 'W', 'E', 'E', 'W', 'W'},
			{'W', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'W', 'E', 'E', 'E', 'W', 'W', 'E', 'E', 'E'},
			{'W', 'W', 'E', 'W', 'E', 'W', 'W', 'W', 'W', 'W', 'W', 'E', 'E', 'E', 'W', 'E', 'E', 'W', 'W', 'E'},
			{'E', 'W', 'E', 'E', 'W', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'W', 'W', 'E', 'E', 'E', 'E', 'W', 'E'},
			{'E', 'E', 'E', 'W', 'W', 'W', 'W', 'W', 'E', 'W', 'W', 'W', 'W', 'W', 'E', 'E', 'W', 'E', 'W', 'E'},
			{'W', 'W', 'E', 'E', 'W', 'E', 'W', 'E', 'C', 'E', 'E', 'E', 'E', 'W', 'E', 'W', 'E', 'W', 'E', 'E'},
			{'W', 'W', 'E', 'E', 'E', 'E', 'W', 'W', 'W', 'W', 'W', 'W', 'E', 'E', 'E', 'W', 'E', 'E', 'E', 'W'},
			{'W', 'E', 'E', 'W', 'W', 'W', 'W', 'E', 'E', 'E', 'E', 'E', 'E', 'W', 'E', 'W', 'W', 'E', 'W', 'W'},
			{'W', 'E', 'W', 'W', 'W', 'E', 'W', 'E', 'W', 'E', 'E', 'E', 'W', 'W', 'W', 'E', 'E', 'E', 'E', 'E'},
			{'E', 'E', 'E', 'E', 'W', 'E', 'W', 'W', 'E', 'W', 'E', 'E', 'W', 'E', 'E', 'W', 'E', 'W', 'W', 'E'},
			{'E', 'W', 'W', 'W', 'W', 'E', 'E', 'E', 'E', 'W', 'E', 'W', 'W', 'E', 'E', 'W', 'W', 'W', 'W', 'E'},
			{'E', 'W', 'E', 'E', 'W', 'E', 'E', 'W', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'W', 'E', 'E', 'W', 'E'},
			{'E', 'E', 'E', 'E', 'W', 'E', 'E', 'W', 'W', 'W', 'E', 'W', 'W', 'W', 'E', 'E', 'E', 'E', 'W', 'E'},
			{'W', 'E', 'W', 'E', 'E', 'E', 'E', 'E', 'E', 'W', 'E', 'E', 'E', 'E', 'E', 'W', 'W', 'W', 'W', 'T'}		
	};
	
	public Labirinto(Gato cat, Wall wall, Cachorro dog, Empty empty, Toca toca) {
		this.cat = cat;
		this.maze = new Celula[20][20];
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				if (mazeChar[i][j] == 'G') {
					maze[i][j] = new Celula(cat);
				} else if (mazeChar[i][j] == 'W') {
					maze[i][j] = new Celula(wall);
				} else if (mazeChar[i][j] == 'C') {
					maze[i][j] = new Celula(dog);
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
		} else {
			return false;
		}
	}
	
	private ArrayList<int[]> getEmptySpaces() {
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				if (maze[i][j].getType() == 'C') {
					if (maze[i - 1][j].getType() == 'E') {
						int[] moveUp = {i - 1, j};
						emptyCells.add(moveUp);
					} if (maze[i + 1][j].getType() == 'E') {
						int[] moveDown = {i + 1, j};
						emptyCells.add(moveDown);
					} if (maze[i][j - 1].getType() == 'E') {
						int[] moveLeft = {i, j - 1};
						emptyCells.add(moveLeft);
					} if (maze[i][j + 1].getType() == 'E') {
						int[] moveRight = {i, j + 1};
						emptyCells.add(moveRight);
					}
				}
			}
		}
		return emptyCells;
	}
	
	private int[] sortearMovimento() {
		ArrayList<int[]> emptyCells = getEmptySpaces();
		Random r = new Random();
		int[] celulaSorteada = emptyCells.get(r.nextInt(emptyCells.size()));
		return celulaSorteada;
	}
	
	public boolean moverCachorro() {
		int[] newCoord = sortearMovimento();
		if (newCoord != null) {
			return true;
		}
		return false;
	}

	public int[] getDogMove() {
		int newCoord[] = sortearMovimento();
		return newCoord;	
	}
}
