package com.vstl.javatraining;

public class TestMethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading objMethodOverloading = new MethodOverloading();
		objMethodOverloading.getStudentsDetails();
		
		objMethodOverloading.getStudentsDetails(23);
		
		objMethodOverloading.getStudentsDetails(500,80.0);

	}

}
