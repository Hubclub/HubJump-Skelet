package com.hubclub.hubjump.animations;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

// This class will implement the animation for the ninja character
public abstract class NinjaAnimation {
	
	// Declare variables here
	// Take the texture or the texture atlas from assets/images/ninja (if ninja folder 
	// isn't there create it)
	// No constructor is needed because the methods are static
	// The class is abstract because we don't need any instances of it
	
	public static TextureRegion newNinjaAnimation() {
		
		// TODO ~ write the code to create the texture animation
		// You will have 4 different arrays, each array for an animation
		
		return null; // It must return the first texture of the initial state
					 // (it is TextureRegion because you
		  			 // will split the sprite sheet which is a texture
					 // into texture regions) from the sprite sheet
		
	}// END OF newNinjaAnimation METHOD
	
	// Occurs when the characters jumps to the left
	public static TextureRegion jumpUpLeft(float delta) {
		
		// TODO ~ write the code, using the deltaTime, to animate the 
		// ninja jumping to the left. It returns the current frame
		
		return null; // It must return the current frame
		
	}// END OF jumpUpLeft METHOD 
	
	public static TextureRegion jumpUpRight(float delta) {
		
		// TODO ~ write the code, using the deltaTime, to animate the
		// ninja jumping to the right. It returns the current frame
		
		return null; // It must return the current frame
		
	}// END OF jumpUpRight METHOD
	
	public static TextureRegion stayLeft(float delta) {
		
		// TODO ~ write the code, using the deltaTime, to animate the
		// ninja when it stays on the left wall. It returns the current frame
		
		return null; // It must return the current frame
		
	}// END OF stayLeft METHOD
	
	public static TextureRegion stayRight(float delta) {
		
		// TODO ~ write the code, using the deltaTime, to animate the
		// ninja when it stays on the right wall. It returns the current frame
		
		return null; // It must return the current frame
		
	}// END OF stayLeft METHOD
	
}// END OF NinjaAnimation CLASS
