package model;

public class Cachorro implements Atores {
	private char tipo;
	private Labirinto maze;
	
	Cachorro(Labirinto maze, char tipo) {
		this.maze = maze;
		this.tipo = tipo;
	}
	
	public char getTipo() {
		return tipo;
	}
	
	public int[] mover() {
		
	}
}
