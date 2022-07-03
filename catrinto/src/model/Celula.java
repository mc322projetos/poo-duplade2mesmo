package model;

public class Celula {
	private Atores ator;
	
	Celula(Atores ator) {
		this.ator = ator;
	}

	public char getType() {
		return ator.getType();
	}
}