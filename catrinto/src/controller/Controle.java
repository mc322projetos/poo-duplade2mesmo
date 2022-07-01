package controller;

import model.Gato;

public class Controle {
	Gato cat;
	
	public Controle(Gato cat) {
		this.cat = cat;
	}
	
	public boolean movimentar(char move) {
		if (cat.verificarMovimento(move) == true) {
			return true;
		} else {
			return false;
		}
	}
}
