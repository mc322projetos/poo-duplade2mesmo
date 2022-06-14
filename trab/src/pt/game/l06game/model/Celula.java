package model;

public class Celula {
	private Atores[] arrayActors;
	
	
	Celula() {
		arrayActors = new Atores[4];
	}
	
	public Atores[] getAtores() {
		return arrayActors;
	}
	
	public boolean podeMesmaCelulaIni() {
		return false;
	}
	
	public boolean podeMesmaCelula() {
		
	}
}
