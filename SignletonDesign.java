package com.vstl.singletonDesign;

public class SignletonDesign {

	//singleton class that can have only one object(instance) of the class at a time.
	//2 things, *make constructor private.
	//* write public static method(getInstance) that return type of object of this singleton class.
	
	private static SignletonDesign SignletonDesign_instance = null;
	public String strName;
	
	private SignletonDesign() {        //constructor
		strName = "Singleton";
	}
	
	public static SignletonDesign getInstance() {
		if(SignletonDesign_instance == null)    
			SignletonDesign_instance = new SignletonDesign();   //null so we have to initialize
		return SignletonDesign_instance;
				
	}
		
}
	
	

