package com.hubclub.hubjump.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.hubclub.hubjump.GameClass;

// Use this PauseScreen class to display a screen whenever 
// the pause method is called (remember that pause method is 
// called only on android)

public class PauseScreen implements Screen {
	
	private final GameClass game;	// game variable of type GameClass; use this variable when you 
									// find necessary to change the screen of the game
	
	private Button resumeBut; // use this Button to set the screen back to
							  // the game screen
	// Declare the variables

	// Pass the GameClass reference by constructor
	public PauseScreen(final GameClass game) {

		this.game = game; // Initialize the game variable
						  // TODO ~ initialize others variables

	}// END OF CONSTRUCTOR

	public void render(float delta) {

		// TODO ~ display and other frame independent operations

	}// END OF render METHOD

	public void resize(int width, int height) {

		// TODO ~ operations that are done when resize occurs

	}// END OF resize METHOD

	public void pause() {

		// Because this is the PauseScreen you won't do anything here

	}// END OF pause METHOD

	public void resume() {

		// Because this is the PauseScreen you won't do anything here

	}// END OF resume METHOD

	public void dispose() {
		
		// TODO ~ dispose variables initialized in the upper create method

	}// END OF dispose METHOD

	public void show() {

		// Called when this screen becomes the current screen of the game

	}// END OF show METHOD

	public void hide() {

		// Called when this screen is no longer the current screen of the game

	}// END OF hide METHOD

}// END OF ResumeScreen CLASS
