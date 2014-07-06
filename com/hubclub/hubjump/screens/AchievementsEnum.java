package com.hubclub.hubjump.screens;


// Achievements enumeration is used to keep a track of the enumeration
// and if an achievement was completed or no

public enum AchievementsEnum {
	
	// The achievement will be added here
	// The boolean value shows if the achievement was completed or not
	// The boolean values will be loaded from a binary file
	// Declaration is "ACHIEVEMENT(BOOLEAN)"
	
	MTEVEREST(true), // Means that the MTEVEREST achievement is completed
	LONGRUN(false); // Means that the LONGRUN achievement isn't completed
	
	//Complete this enumeration with the achievements
	
	private boolean completed; 
	
	private AchievementsEnum(boolean achievementCompleted) {
		
		completed = achievementCompleted;
		
	}// END OF CONSTRUCTOR
	
	// Method to set the achievement completed or incompleted
	public void setCompleted(boolean achievementCompleted) {
		
		completed = achievementCompleted;
		
	}// END OF setCompleted METHOD
	
	// Method used to see if the achievement is completed or not
	public boolean isCompleted() {
		
		return completed;
		
	}// END OF isCompleted METHOD
	
}// END OF AchievementsEnum ENUMERATION
