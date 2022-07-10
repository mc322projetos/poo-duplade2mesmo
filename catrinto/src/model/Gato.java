package model;

public class Gato extends Atores{
	private char tipo;
	private Labirinto labirinto;
	private int coordLinha;
	private int coordColuna;
	
	public Gato(Labirinto labirinto, char tipo) {
		this.tipo = tipo;
		this.labirinto = labirinto;
		this.coordLinha = 0;
		this.coordColuna = 0;
	}
	
	@Override
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
		if (labirinto.moverGato(move) == true) {
			return true;
		} else {
			return false;
		}
	}
}