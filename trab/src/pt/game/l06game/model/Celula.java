package com.mygdx.game.model;

import java.util.ArrayList;

public class Celula {
	private Atores ator;
	private ArrayList<Atores> arrayAtores;
	
	Celula() {
		arrayAtores = new ArrayList<Atores> ();
	}
	
	public void add(Atores ator) {
		arrayAtores.add(ator);
	}
	
	public char getType() {
		return ator.getType();
	}
}
