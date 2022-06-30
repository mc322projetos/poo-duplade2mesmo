package model;

public class Gato implements Atores {
	private int qtdPeixes;
	private char tipo;
	private Labirinto maze;
	
	Gato(Labirinto maze, int qtdPeixes, char tipo) {
		this.maze = maze;
		this.qtdPeixes = qtdPeixes;
		this.tipo = tipo;
	}
	
	public void setQtdPeixes(int qtdPeixes) {
		this.qtdPeixes = qtdPeixes;
	}
	
	public int getQtdPeixes() {
		return qtdPeixes;
	}
	
	public char getTipo() {
		return tipo;
	}
	
	public void mover() {
		maze.verificarMovimento();
	}
	
	public void capturar() {
		
	}
}
