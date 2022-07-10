package model;

public class Cachorro extends Atores {
	private char tipo;
	private Labirinto maze;
	private int linhaCachorro;
	private int colunaCachorro;
	
	public Cachorro(Labirinto maze, char tipo) {
		this.maze = maze;
		this.tipo = tipo;
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
}
