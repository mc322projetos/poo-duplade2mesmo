package com.mygdx.game.control;

import com.mygdx.game.model.Labirinto;

public class Control {
	Labirinto model;
	
	public boolean moveAttempt(char c) {
		// TODO Auto-generated method stub
		if (model.moveAttempt(c))
			return true;
		return false;
		
	}

}
