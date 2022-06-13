package model;

public class Montador {
	private Labirinto maze;
	private Gato cat;
	private BolaDeLa bola;
	private Cachorro dog;
	private Peixe fish;
	private Toca fimLabirinto;
	
	Montador() {
		this.cat = new Gato(0, maze);
		this.bola = new BolaDeLa(maze);
		this.dog = new Cachorro(maze);
		this.fish = new Peixe(maze);
		this.fimLabirinto = new Toca(maze);
		this.maze = new Labirinto();
	}
}
