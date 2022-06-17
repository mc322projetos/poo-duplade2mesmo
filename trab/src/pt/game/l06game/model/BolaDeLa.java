package model;

public class BolaDeLa {
	private char tipo;
	private Labirinto maze;
	
	BolaDeLa(Labirinto maze, char tipo) {
		this.maze = maze;
		this.tipo = tipo;
	}
	
	public char getTipo() {
		return tipo;
	}
}
