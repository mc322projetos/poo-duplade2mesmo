package com.mygdx.game.model;

public class Empty extends Atores {
	private char tipo;
	private Labirinto maze;
	
	public Empty(Labirinto maze, char tipo) {
		this.maze = maze;
		this.tipo = tipo;
	}
	
	public char getType() {
		return tipo;
	}
}

