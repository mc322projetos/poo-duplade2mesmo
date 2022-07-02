package model;

import java.awt.Component;

public class Montador {
	private Labirinto maze;
	private Gato cat;
	private BolaDeLa bola;
	private Cachorro dog;
	private Peixe fish;
	private Toca fimLabirinto;
	
	Montador() {
		this.cat = new Gato(maze, 0, 'C');
		this.bola = new BolaDeLa(maze, 'B');
		this.dog = new Cachorro(maze, 'D');
		this.fish = new Peixe(maze, 'F');
		this.fimLabirinto = new Toca(maze, 'T');
		this.maze = new Labirinto();
	}
	
	public Celula[][] criarJogo() {
		Celula[][] labirinto = maze.getMaze();
		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				if (labirinto[i][j] == labirinto[0][0]) {
					labirinto[i][j] = 
				}
			}
		}
		return labirinto;
	}
}
