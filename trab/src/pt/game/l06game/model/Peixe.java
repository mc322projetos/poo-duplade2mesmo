package model;

public class Peixe extends Atores {
	private char tipo;
	
	Peixe(Labirinto maze, char tipo) {
		super(maze);
		this.tipo = tipo;
	}
	
	public char getTipo() {
		return tipo;
	}
}
