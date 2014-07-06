package com.hubclub.hubjump;

// GameConstants is an enumeration used to save the 
// game constants
public enum GameConstants {
	
	// You can change the values into the paranthesys
	// These values are constant
	// You can add more constants if you need
	// These are the basic constants
	// GAME(TITLE, VERSION, WIDTH, HEIGHT)
	GAME("HubJump", "0.0.0.01", 800, 480);
	
	private final String myTitle;
	private final String myVersion;
	private final int myWidth;
	private final int myHeight;
	
	private GameConstants(String title, String version, int width, int height) {
		
		myTitle = title;
		myVersion = version;
		myWidth = width;
		myHeight = height;
		
	}// END OF CONSTRUCTOR
	
	public String getTitle() {
		
		return myTitle;
		
	}// END OF getTitle METHOD
	
	public String getVersion() {
		
		return myVersion;
		
	}// END OF getVersion METHOD
	
	public int getWidth() {
		
		return myWidth;
		
	}// END OF getWidth METHOD
	
	public int getHeight() {
		
		return myHeight;
		
	}// END OF getHeight METHOD
}
