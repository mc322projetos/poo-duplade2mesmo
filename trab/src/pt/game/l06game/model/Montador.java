package model;

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
}
