package model;

public class Cachorro extends Atores {
	private char tipo;
	
	Cachorro(Labirinto maze, char tipo) {
		super(maze);
		this.tipo = tipo;
	}
	
	public char getTipo() {
		return tipo;
	}
}
