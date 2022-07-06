package controller;

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
	
	public Montador(Control control) {
		this.cat = new Gato(maze, 'G', 0, 0);
		this.wall = new Wall(maze, 'W');
		this.empty = new Empty(maze, 'E');
		this.toca = new Toca(maze, 'T');
		this.maze = new Labirinto(control, cat, wall, empty, toca); 
	}

	public Labirinto getLabirinto() {
		return maze;
	}
}