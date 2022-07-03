package controller;

import model.Cachorro;
import model.Labirinto;

public class MovimentoCachorro {
	Cachorro dog;
	Labirinto maze;
	
	MovimentoCachorro(Cachorro dog) {
		this.dog = dog;
	}
	
	public int[] movimentar() {
		if (dog.verificarMovimento() == true) {
			return maze.getDogMove();
		} else {
			return null;
		}
	}
}
