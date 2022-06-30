package model;

public class Toca {
	private char tipo;
	private Labirinto maze;
	
	Toca(Labirinto maze, char tipo) {
		this.maze = maze;
		this.tipo = tipo;
	}
	
	public char getTipo() {
		return tipo;
	}
}
