package model;

public class Empty extends Atores {
	private char tipo;
	private Labirinto maze;
	
	public Empty(Labirinto maze, char tipo) {
		this.maze = maze;
		this.tipo = tipo;
	}
	
	@Override
	public char getType() {
		return tipo;
	}
}
