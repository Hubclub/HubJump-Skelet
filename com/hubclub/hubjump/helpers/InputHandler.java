package com.hubclub.hubjump.helpers;

import com.badlogic.gdx.InputAdapter;

// This class sees if the input is a swipe or a tap
public abstract class InputHandler extends InputAdapter {
	
	// Use these 2 variables to find out the input type
	private float deltaX;
	private float deltaY;
	
	// The coords of the object passed by the method getInput;
	private float xCoord;
	private float yCoord;
	
	// Use this variable to return the input type
	private static int inputType; // 0 if you have a tap, 1 if you have a swipe
	private static int type; // -1 if the swipe/tap is left, 1 if the swipe/tap is right
	
	// Occurs when you touch the screen 
	public boolean touchDown (int screenX, int screenY, int pointer, int button) {

		
		return super.touchDown(screenX, screenY, pointer, button);
	}// END OF touchDown METHOD
	
	// Occurs when you stop touching the screen (when you lift the finger)
	public boolean touchUp (int screenX, int screenY, int pointer, int button) {
		
		
		return super.touchUp(screenX, screenY, pointer, button);
	}// END OF touchUp METHOD
	
	// Occurs when you drag over the screen
	public boolean touchDragged (int screenX, int screenY, int pointer) {
		
		
		
		return super.touchDragged(screenX, screenY, pointer);
	}// END OF touchDragged METHOD
	
	private static void swipeType() {
		
		// Write here the code to update the type (-1 if the swipe is left, 1 if the swipe
		// is right)
				
	}// END OF swipeType METHOD
	
	private static void tapType() {
		
		// Same as the swipeType method
		
	}// END OF tapType METHOD
	
	// Use this method to get the InputType when needed
	public static int getInput(float xCoord, float yCoord) {
		
		if(inputType == 0) tapType();
		else if(inputType == 1) swipeType();
		
		return type;
	}// END OF getInput METHOD
	
}// END OF InputHandler CLASS
