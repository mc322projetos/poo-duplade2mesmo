package com.mygdx.game.model;

public class Toca extends Atores{
	private char tipo;
	private Labirinto labirinto;
	
	public Toca(Labirinto labirinto, char tipo) {
		this.labirinto = labirinto;
		this.tipo = tipo;
	}
	
	public char getType() {
		return tipo;
	}
	
	public boolean acabouJogo(int linhaToca, int colunaToca) {
		boolean acabou = false;
		if (labirinto.getMaze()[linhaToca][colunaToca].getType() == 'G' && 
				labirinto.getMaze()[linhaToca][colunaToca].getType() == 'T') {
			acabou = true;
		}
		return acabou;
	}
}
