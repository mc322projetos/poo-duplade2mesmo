package model;

public class Labirinto {
	private Celula maze[][];
	
	Labirinto() {
		this.maze = new Celula[19][19];
		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				maze[i][j] = new Celula();
			}
		}
	}
	
	public Celula[][] getMaze() {
		return maze;
	}
}
