package com.vstl.javatraining;

public class MethodOverloading {
	
	public void getStudentsDetails() {
		
		String strName = "Rohini";
		System.out.println("Student name is:" +strName );
		
	}
	
	public void getStudentsDetails(int intRollNumber) {
		int StudentRollNumber = 23;
		System.out.println("Student Roll number :" +StudentRollNumber);
	}
	
	public void getStudentsDetails(int intTotallMarks,Double doublePercentage) {
		int intStudentTotallMarks = 500;
		double doubleStudentPercentage = 80.0;
			
		System.out.println("Student total Marks :" +intStudentTotallMarks);
		System.out.println("Student Percentage is :" +doubleStudentPercentage);
	
	}

}
