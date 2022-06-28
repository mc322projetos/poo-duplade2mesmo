package com.mygdx.game.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.Window;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class HUD {
	private Integer countdown, score, level;
	private Label tempoRestante, peixes, nivel;
	private Label countdownLabel, scoreLabel, levelLabel;
	public Stage stage;
	
	HUD (SpriteBatch sb) {
		countdown = 100;
		score = 0;
		level = 1;
		
		stage = new Stage(new ScreenViewport(), sb);
		
		Table table = new Table();
		table.setPosition(320, 450);
		stage.addActor(table);
		
		Skin skin = new Skin(Gdx.files.internal("skin/flat-earth-ui.json"));
		
		
		tempoRestante = new Label("Tempo Restante ", skin);
		peixes = new Label("Peixes ", skin);
		nivel = new Label("Nivel ", skin);
		countdownLabel = new Label(String.format("%03d  ", countdown), new Label.LabelStyle(new BitmapFont(), Color.BLACK));
		scoreLabel = new Label(String.format("%03d  ", score), new Label.LabelStyle(new BitmapFont(), Color.BLACK));
		levelLabel = new Label(String.format("%02d  ", level), new Label.LabelStyle(new BitmapFont(), Color.BLACK));
		

		table.add(tempoRestante).expandX();
		table.add(countdownLabel).expandX();
		table.add(peixes).expandX();
		table.add(scoreLabel).expandX();
		table.add(nivel).expandX();
		table.add(levelLabel).expandX();
	}
}
