package model;

public class Cachorro extends Atores {
	private char tipo;
	private Labirinto maze;
	private int linhaCachorro;
	private int colunaCachorro;
	
	public Cachorro(Labirinto maze, char tipo, int linhaCachorro, int colunaCachorro) {
		this.linhaCachorro = linhaCachorro;
		this.colunaCachorro = colunaCachorro;
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
	
	public boolean verificarMovimento() {
		if (maze.moverCachorro() == true) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public boolean matarGato() {
		if (maze.getMaze()[linhaCachorro][colunaCachorro].getType() == 'C' && maze.getMaze()[linhaCachorro][colunaCachorro].getType() == 'G') {
			return true;
		} else {
			return false;
		}
	}
	
	public char getType() {
		return tipo;
	}
}
