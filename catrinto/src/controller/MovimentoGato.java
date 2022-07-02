package controller;

import model.Gato;

public class MovimentoGato {
	Gato cat;
	
	public MovimentoGato(Gato cat) {
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
