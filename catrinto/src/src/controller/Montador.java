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
	private Cachorro dog;
	private Wall wall;
	private Empty empty;
	private Toca toca;
	
	public Montador(Control control) {
		this.cat = new Gato(maze, 'G');
		this.dog = new Cachorro(maze, 'C');
		this.wall = new Wall(maze, 'W');
		this.empty = new Empty(maze, 'E');
		this.toca = new Toca(maze, 'T');
		this.maze = new Labirinto(control, cat, wall, dog, empty, toca); 
	}

	public Labirinto getLabirinto() {
		return maze;
	}
}