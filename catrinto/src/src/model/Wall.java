package model;

public class Wall extends Atores{
	private char tipo;
	public Wall(Labirinto maze, char tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public char getType() {
		return tipo;
	}
}
