package model;

public class Gato extends Atores {
	private int qtdPeixes;
	
	Gato(int qtdPeixes, Labirinto maze) {
		super(maze);
		this.qtdPeixes = qtdPeixes;
	}
	
	public void setQtdPeixes(int qtdPeixes) {
		this.qtdPeixes = qtdPeixes;
	}
	
	public int getQtdPeixes() {
		return qtdPeixes;
	}
}