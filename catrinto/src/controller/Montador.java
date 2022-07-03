package controller;

import model.Cachorro;
import model.Empty;
import model.Gato;
import model.Labirinto;
import model.Toca;
import model.Wall;

public class Montador {
	private Labirinto maze;
	private Gato cat;
	private Wall wall;
	private Empty empty;
	private Toca toca;
	private Cachorro dog;
	
	public Montador(Control control) {
		this.cat = new Gato(maze, 'G', 0, 0);
		this.wall = new Wall(maze, 'W');
		this.empty = new Empty(maze, 'E');
		this.toca = new Toca(maze, 'T');
		this.dog = new Cachorro(maze, 'C', 11, 8);  // a ideia eh que vao ser 3 cachorros no minimo. ainda n sei se precisa criar 3 classes Cachorro
		this.maze = new Labirinto(control, cat, wall, dog, empty, toca); 
	}

	public Labirinto getLabirinto() {
		return maze;
	}
}