package model;

public class Cachorro extends Atores {
	private char tipo;
	private Labirinto maze;
	private int linhaCachorro;
	private int colunaCachorro;
	private int[] lastMove = new int[2];
	
	public Cachorro(Labirinto maze, char tipo) {
		this.maze = maze;
		this.tipo = tipo;
		int[] initial = {0,0};
		this.setLastMove(initial);
	}
	
	
	public int getCoordLinha() {
		return linhaCachorro;
	}
	
	public int getCoordColuna() {
		return colunaCachorro;
	}
	
	public void setCoordLinha(int coordLinha) {
		this.linhaCachorro = coordLinha;
	}
	
	public void setCoordColuna(int coordColuna) {
		this.colunaCachorro = coordColuna;
	}

	@Override
	public char getType() {
		return tipo;
	}

	public int[] getLastMove() {
		return this.lastMove;
	}

	public void setLastMove(int[] move) {
		this.lastMove = move;
	}
}
