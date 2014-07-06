package com.hubclub.hubjump;

import com.badlogic.gdx.Game;

// We extend the Game class because we're going 
// to work with Screens; only a class who inherits 
// the Game class can use Screens in libGDX
// Game also implements ApplicationListener so it can be used
// to launch the application

public class GameClass extends Game {
	
	public void create() {
		
		// TODO ~ use this method to initialize the variables used
		// in the entire game and to set the initial screen of the game
		
	}// END OF create METHOD
	
	public void render() {
		
		// TODO ~ you must implement the render method from the superclass
		// THAT'S ALL!
		
	} // END OF render METHOD
	
	public void resize(int width, int height) {
		
		// TODO ~ you must implement the resize method from the superclass
		// That can be all
		
	}// END OF resize METHOD
	
	public void pause() {
		
		// TODO ~ you must implement the pause method from superclass
		// That can be all
		
	}// END OF pause METHOD
	
	public void resume() {
	
		// TODO ~ you must implement the resume method from superclass
		// That can be all
		
	}// END OF resume METHOD
	
	public void dispose() {
		
		// TODO ~ you must implement the dispose method from superclass
		// and dispose other variable initialized in the upper create method
		
	}// END OF dispose METHOD
	
}// END OF GameClass CLASS