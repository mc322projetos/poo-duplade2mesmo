package com.mygdx.game.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
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

public class EndScreen implements Screen{
	private Integer timeTaken;
	private Label tempoLevado;
	private Label timeTakenLabel;
	private AppCatRinto game;
	public Stage stage;
	private Image gameOverBanner;
	private BitmapFont timeFont;

	public EndScreen(AppCatRinto jogo) {
		timeTaken = 0;
		this.game = jogo;
		stage = new Stage(new ScreenViewport());
		Gdx.input.setInputProcessor(stage);
		Table table = new Table();
		table.setFillParent(true);
		stage.addActor(table);
		
		Skin skin = new Skin(Gdx.files.internal("skin/flat-earth-ui.json"));
		Image gameOverBanner = new Image(new Texture("Game_Over.png"));
		table.add(gameOverBanner).size(300, 200);
		table.row().pad(10, 0, 10, 0);
		tempoLevado = new Label(String.format("Tempo Levado: %03d", timeTaken), new Label.LabelStyle(new BitmapFont(), Color.BLACK));
		table.add(tempoLevado);
		table.add(timeTakenLabel);
		table.row().padRight(0);
		
		TextButton restart = new TextButton("Restart", skin);
		table.add(restart);
		
		restart.addListener(new ChangeListener() {
			
			@Override
			public void changed(ChangeEvent event, Actor actor) {
				game.changeScreen(0);
				
			}
			
		});
	}

	public void show () {
		
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(255, 255, 255, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		game.batch.setProjectionMatrix(this.stage.getCamera().combined);
		this.stage.draw();
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
