package com.hubclub.hubjump.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.hubclub.hubjump.GameClass;

// This is the MainMenuScreen class. This class implements the Screen interface
// Set this screen on the game variable of type GameClass whenever you want
// to display the main menu.

public class MainMenuScreen implements Screen {
	
	private final GameClass game;	// game variable of type GameClass; use this variable when you 
									// find necessary to change the screen of the game
	private Button highscoresBut;
	private Button achievementsBut;
	private Button shopBut;
	private Button startBut;
	
	// Declare the variables
	
	// Screen interface doesn't have a "create" method
	// That's why we use a constructor to initialize the variables declared earlier
	
	// Pass the GameClass reference by constructor
	public MainMenuScreen(final GameClass game) { 
		
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
		
		// TODO ~ operations when the game is paused (this method is
		// applied only on android, when you press the home button
		// or you receive a call)
		
	}// END OF pause METHOD
	
	public void resume() {
		
		// TODO ~ operations when the game exits from pause (method applied only
		// on android)
		
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
	
}// END OF MainMenuScreen CLASS
