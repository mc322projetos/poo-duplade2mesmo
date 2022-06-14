package model;

public class Gato extends Atores {
	private int qtdPeixes;
	private char tipo;
	
	Gato(Labirinto maze, int qtdPeixes, char tipo) {
		super(maze);
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
}
}
