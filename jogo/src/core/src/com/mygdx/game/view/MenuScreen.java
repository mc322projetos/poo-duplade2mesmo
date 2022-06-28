package com.mygdx.game.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.mygdx.game.AppCatRinto;

public class MenuScreen implements Screen {
	private AppCatRinto parent;
	private Stage stage;
	
	public MenuScreen(AppCatRinto parent) { // arg0: AppCatRinto parent
		this.parent = parent;
		stage = new Stage(new ScreenViewport());
		Gdx.input.setInputProcessor(stage);
		
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		Table table = new Table();
		table.setFillParent(true);
		stage.addActor(table);
		
		Skin skin = new Skin(Gdx.files.internal("skin/flat-earth-ui.json"));
		Image cat = new Image(new Texture("cat.png"));
		table.add(cat);
		
//		table.add(startGame).fillX().uniformX();
		table.row().pad(10, 0, 10, 0);
		
		Label title = new Label("CatRinto", skin);
		table.add(title);
		
		table.row().pad(10, 0, 10, 0);
		
		TextButton startGame = new TextButton("Play", skin);
		table.add(startGame);
		
		startGame.addListener(new ChangeListener() {
			@Override
			public void changed(ChangeEvent event, Actor actor) {
				parent.changeScreen(1);
				
			}
		});	
	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		Gdx.gl.glClearColor(255, 255, 255, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		parent.batch.setProjectionMatrix(this.stage.getCamera().combined);
		this.stage.draw();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
//		stage.getViewport().update(width, height, true);
		
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
		stage.dispose();
		
	}

}
