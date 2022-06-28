package com.mygdx.game.view;

import java.util.Random;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.mygdx.game.model.Labirinto;

public class Maze {

	Labirinto labirinto;
	
	Stage stage;
	Table table;
	int coordsPlayer[] = {0, 0};
	Image [][] imageCells;
	
	int [][] typeCells = new int[20][20]; // para fins de teste
	Random type = new Random();
	
	public Maze(SpriteBatch sb) {
		
		for (int i = 0; i < 20; i++)
			for (int j = 0; j < 20; j++)
				typeCells[i][j] = type.nextInt(2);
		
		stage = new Stage(new ScreenViewport(), sb);
		

		table = new Table();
		table.setPosition(325, 225);
		stage.addActor(table);
		generate();

	}
	
	public void update(int add_i, int add_j) {
		int old_i, old_j, old_n, n;
		old_i = coordsPlayer[0];
		old_j = coordsPlayer[1];
		
		old_n = old_i * 20 + old_j;
		n = (old_i + add_i) * 20 + (old_j + add_j);
		
		coordsPlayer[0] = n / 20;
		coordsPlayer[1] = n % 20;
		
		table.swapActor(old_n, n);
	}
	
	public void generate() {
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++)
				switch (typeCells[i][j]) { // switch(labirinto.getMaze()[i][j].getType())
					case 0:
						table.add(new Image(new Texture("empty.png"))).size(20, 20).pad(0, 0 , 0, 0);
						break;
					case 1:
						table.add(new Image(new Texture("wall.png"))).size(20, 20).pad(0, 0 , 0, 0);
						break;
//					case 2:
//						table.add(cat);
//					case 3:
//						table.add(fish);
				}
			table.row();
		}
		table.add(new Image(new Texture("cat.png"))).size(20, 20).pad(0, 0 , 0, 0);
		table.swapActor(0, 20);
		table.removeActorAt(20, true);
	}
	
}
