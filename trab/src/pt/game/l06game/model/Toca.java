package model;

public class Toca extends Atores {
	private char tipo;
	
	Toca(Labirinto maze, char tipo) {
		super(maze);
		this.tipo = tipo;
	}
	
	public char getTipo() {
		return tipo;
	}
}
