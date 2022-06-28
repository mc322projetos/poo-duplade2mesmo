package com.mygdx.game.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.mygdx.game.AppCatRinto;

public class MainScreen implements Screen{
	AppCatRinto parent;
	HUD hud;
	Maze maze;	
	public MainScreen(AppCatRinto parent) {
		this.parent = parent;
		hud = new HUD(parent.batch);
		maze = new Maze(parent.batch);
		Gdx.input.setInputProcessor(maze.stage);
	}
		
	public void notificar() {
		if (Gdx.input.isKeyPressed(Input.Keys.W))
//			if (parent.getController().moveAttempt('w'))
				maze.update(0, 1);
		else if (Gdx.input.isKeyPressed(Input.Keys.A))
//			if (parent.getController().moveAttempt('a'))
				maze.update(-1, 0);
		else if (Gdx.input.isKeyPressed(Input.Keys.S))
//			if (parent.getController().moveAttempt('s'))
				maze.update(0, -1);
		else if (Gdx.input.isKeyPressed(Input.Keys.D))
//			if (parent.getController().moveAttempt('d'))
				maze.update(1, 0);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		Gdx.gl.glClearColor(255, 255, 255, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		parent.batch.setProjectionMatrix(hud.stage.getCamera().combined);
		hud.stage.draw();
		
		parent.batch.setProjectionMatrix(maze.stage.getCamera().combined);
		maze.stage.draw();
		notificar();
	}
	
	public void gameOver() {
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
