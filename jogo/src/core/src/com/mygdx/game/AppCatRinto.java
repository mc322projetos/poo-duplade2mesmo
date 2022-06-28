package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.control.Control;
import com.mygdx.game.view.EndScreen;
import com.mygdx.game.view.MainScreen;
import com.mygdx.game.view.MenuScreen;

public class AppCatRinto extends Game {
	public SpriteBatch batch;
	
	public AppCatRinto() {
		
	}
	
	public void changeScreen(int currentScreen) {
		final int MENU = 0;
		final int MAIN = 1;
		final int END = 2;
		
		switch (currentScreen) {
			case MENU:
				this.setScreen(new MenuScreen(this));
				break;
			case MAIN:
				this.setScreen(new MainScreen(this));
				break;
			case END:
				this.setScreen(new EndScreen(this));
				break;
		}
	}
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		setScreen(new MenuScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		getScreen().dispose();
	}

	public Control getController() {
		// TODO Auto-generated method stub
		return null;
	}
}
