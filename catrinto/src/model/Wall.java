package model;

public class Wall extends Atores{
	private char tipo;
	private Labirinto maze;
	
	public Wall(Labirinto maze, char tipo) {
		this.maze = maze;
		this.tipo = tipo;
	}
	
	public char getType() {
		return tipo;
	}
}
