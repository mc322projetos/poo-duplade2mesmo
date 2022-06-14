package model;

public class BolaDeLa extends Atores {
	private char tipo;
	
	BolaDeLa(Labirinto maze, char tipo) {
		super(maze);
		this.tipo = tipo;
	}
	
	public char getTipo() {
		return tipo;
	}
}
