package model;

public class Empty extends Atores {
	private char tipo;
	
	public Empty(Labirinto maze, char tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public char getType() {
		return tipo;
	}
}
