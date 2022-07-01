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
	
	Montador() {
		this.maze = new Labirinto();
		this.cat = new Gato(maze, 'G', 0, 0);
		this.wall = new Wall(maze, 'W');
		this.empty = new Empty(maze, 'E');
		this.toca = new Toca(maze, 'T');
		this.dog = new Cachorro(maze, 'C', 11, 8); // a ideia eh que vao ser 3 cachorros no minimo. ainda n sei se precisa criar 3 classes Cachorro
	}
	
	public void criarMapa() {
		for (int i = 0; i < 20; i++) {
			for (int j = 0; i < 20; j++) {
				if (mazeChar[i][j] == 'G') {
					maze.add(cat, i, j);
				} else if (mazeChar[i][j] == 'E') {
					maze.add(empty, i, j);
				} else if (mazeChar[i][j] == 'W') {
					maze.add(wall, i, j);
				} else if (mazeChar[i][j] == 'C'){
					maze.add(dog, i, j);
				} else {
					maze.add(toca, i, j);
				}
			}
		}
	}
}