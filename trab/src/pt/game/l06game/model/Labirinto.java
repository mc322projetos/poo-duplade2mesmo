package model;

public class Labirinto implements InformaView {
	private Celula maze[][];
	
	Labirinto() {
		this.maze = new Celula[19][19];
		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				maze[i][j] = new Celula();
			}
		}
	}
	
	public boolean play() {
		if () {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean mudou() {
		if () {
			return true;
		} else {
			return false;
		}
	}
	
	public int[] oQueMudou() {
		int i, j, k;
		int[] move = new int[3];
		move[0] = i;
		move[1] = j;
		move[2] = k;
		return move;
	}
}
