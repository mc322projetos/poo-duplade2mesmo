package model;

import java.util.ArrayList;
import java.util.Random;

public class Labirinto {
	private Celula maze[][];
	private Gato cat;
	private Cachorro dog;
	private ArrayList<Integer[]> arrayCelulasVazias;
	
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
		} else {
			return false;
		}
	}
	
	private ArrayList<Integer> getEmptySpaces() {
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				if (maze[i][j].getType() == 'C') {
					if (maze[i - 1][j].getType() == 'E') {
						arrayCelulasVazias.add(0, [i - 1]);
					} if (maze[i + 1][j].getType() == 'E') {
						arrayCelulasVazias.add(1, i - 1);
					} if (maze[i][j - 1].getType() == 'E') {
						arrayCelulasVazias.add(2, j + 1);
					} if (maze[i][j + 1].getType() == 'E') {
						arrayCelulasVazias.add(3, j - 1);
					}
				}
			}
		}
		return arrayCelulasVazias;
	}
	
	private int sortearMovimento() {
		ArrayList<Integer> lugaresVazios = getEmptySpaces();
		Random r = new Random();
		int celulaSorteada = arrayCelulasVazias.get(r.nextInt(lugaresVazios.size()));
		return celulaSorteada;
	}
	
	public boolean moverCachorro() {
		int linhaCachorro = dog.getCoordLinha();
		int colunaCachorro = dog.getCoordColuna();
		int celulaSorteada = sortearMovimento();
		
	}
}
