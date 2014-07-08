package com.hubclub.hubjump.characters;

import com.badlogic.gdx.graphics.Texture;
import com.hubclub.hubjump.animations.NinjaAnimation;

// Ninja class - used to define ninja movements and positions on the screen
public class Ninja {
	
	private float ninjaX;
	private float ninjaY;
	private Texture ninjaTexture;
	
	// The constructor initialize the initial x and y coords
	// I've done this for you
	public Ninja(float x, float y) {
		
		ninjaX = x;
		ninjaY = y;
		
		ninjaTexture = NinjaAnimation.newNinjaAnimation().getTexture();
		
	}// END OF CONSTRUCTOR
	
	// Method to set the x coord whenever is needed
	public void setX(float x) {
		
		ninjaX = x;
		
	}// END OF setX METHOD
	
	// Method to get the x coord whenever is needed
	public float getX() {
		
		return ninjaX;
		
	}// END OF getX METHOD
	
	// Method to set the y coord whenever is needed
	public void setY(float y) {
		
		ninjaY = y;
		
	}// END OF setY METHOD
	
	// Method to get the y coord whenever is needed
	public float getY() {
		
		return ninjaY;
		
	}// END OF getY METHOD
	
	public void ninjaJump() {
		
		// TODO ~ write code for the jump
		
	}// END OF ninjaJump METHOD
	
	public void ninjaCollision() {
		
		// TODO ~ write code for the collision with one of the walls 
		// You can use this to change direction and other stuff
		
	}// END OF ninjaCollision METHOD
	
}// END OF Ninja CLASS
