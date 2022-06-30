package model;

public class Peixe {
	private char tipo;
	private Labirinto maze;
	
	Peixe(Labirinto maze, char tipo) {
		this.maze = maze;
		this.tipo = tipo;
	}
	
	public char getTipo() {
		return tipo;
	}
}
