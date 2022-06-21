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
	
	public void verificarMovimento(String command) {
		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				if (command.equals("w")) {
					if (maze[i - 1][j] != null) {
						
					}
				} else if (command.equals("s")) {
					if (maze[i + 1][j] != null) {
						
					}
				} else if (command.equals("a")) {
					if (maze[i][j - 1] != null) {
						
					}
				} else if (command.equals("d")) {
					if (maze[i][j + 1] != null) {
						
					}
				}
			}
		}
	}
	
	public Celula[][] getMaze() {
		return maze;
	}
}
