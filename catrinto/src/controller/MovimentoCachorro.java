package controller;

import model.Cachorro;

public class MovimentoCachorro {
	Cachorro dog;
	
	MovimentoCachorro(Cachorro dog) {
		this.dog = dog;
	}
	
	public boolean movimentar() {
		if (dog.verificarMovimento() == true) {
			return true;
		} else {
			return false;
		}
	}

}
