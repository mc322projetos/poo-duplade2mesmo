package model;

import java.util.ArrayList;
import java.util.Random;

import controller.Control;

public class Labirinto {
	private Control control;
	private Celula maze[][];
	private Gato cat;
	private Cachorro dog;

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
			{'E', 'W', 'E', 'E', 'W', 'E', 'E', 'C', 'E', 'E', 'E', 'E', 'W', 'W', 'E', 'E', 'E', 'E', 'W', 'E'},
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
	
	public Labirinto(Control control, Gato cat, Wall wall, Cachorro dog, Empty empty, Toca toca) {
		this.control = control;
		this.cat = cat;
		this.dog = dog;
		this.maze = new Celula[20][20];
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				if (mazeChar[i][j] == 'G') {
					maze[i][j] = new Celula(cat);
				} else if (mazeChar[i][j] == 'W') {
					maze[i][j] = new Celula(wall);
				} else if (mazeChar[i][j] == 'C') {
					dog.setCoordLinha(i);
					dog.setCoordColuna(j);
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

		if (maze[novaLinhaGato][novaColunaGato].getType() != 'W') {
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

	private ArrayList<int[]> getEmptySpaces() {
		int i = dog.getCoordLinha();
		int j = dog.getCoordColuna();

		ArrayList<int[]> emptyCells = new ArrayList<int[]> ();

		if (maze[i - 1][j].getType() != 'W') {
			int[] moveUp = {-1, 0};
			emptyCells.add(moveUp);
		} if (maze[i + 1][j].getType() != 'W') {
			int[] moveDown = {1, 0};
			emptyCells.add(moveDown);
		} if (maze[i][j - 1].getType() != 'W') {
			int[] moveLeft = {0, -1};
			emptyCells.add(moveLeft);
		} if (maze[i][j + 1].getType() != 'W') {
			int[] moveRight = {0, 1};
			emptyCells.add(moveRight);
		}

		return emptyCells;
	}
			
	private int[] sortearMovimento() {
		ArrayList<int[]> emptyCells = getEmptySpaces();
		Random r = new Random();
		int[] celulaSorteada = emptyCells.get(r.nextInt(emptyCells.size()));
		return celulaSorteada;
	}
	
	public int[] moverCachorro() {
		if (control.isRunning()) {
			int[] newCoord = sortearMovimento();
			dog.setCoordLinha(dog.getCoordLinha() + newCoord[0]);
			dog.setCoordColuna(dog.getCoordColuna() + newCoord[1]);

			return newCoord;
		}
		return null;
	}

	public boolean gatoMorto() {
		return (cat.getCoordLinha() == dog.getCoordLinha() &&
		cat.getCoordColuna() == dog.getCoordColuna());
	}

}
