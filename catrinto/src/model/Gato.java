package model;

public class Gato extends Atores{
	private char tipo;
	private Labirinto labirinto;
	private int coordLinha;
	private int coordColuna;
	
	public Gato(Labirinto labirinto, char tipo, int coordLinha, int coordColuna) {
		this.tipo = tipo;
		this.labirinto = labirinto;
		this.coordLinha = coordLinha;
		this.coordColuna = coordColuna;
	}
	
	public char getType() {
		return tipo;
	}
	
	public void setCoordLinha(int coordLinha) {
		this.coordLinha = coordLinha;
	}
	
	public void setCoordColuna(int coordColuna) {
		this.coordColuna = coordColuna;
	}
	
	public int getCoordLinha() {
		return coordLinha;
	}
	
	public int getCoordColuna() {
		return coordColuna;
	}
	
	public boolean verificarMovimento(char move) {
		if (labirinto.moveAttempt(move) == true) {
			return true;
		} else {
			return false;
		}
	}
}