package com.vstl.singletonDesign;

public class TestSignletonDesign {

	public static void main(String[] args) {

		SignletonDesign strFirstName = SignletonDesign.getInstance();
		SignletonDesign strMiddaleName = SignletonDesign.getInstance();
		SignletonDesign strLastName = SignletonDesign.getInstance();
		
		(strFirstName.strName)=(strFirstName.strName).toLowerCase();
		(strMiddaleName.strName)=(strMiddaleName.strName).concat(" Design ");
		(strLastName.strName)=(strLastName.strName).toLowerCase();


		System.out.println(strFirstName.strName);
		System.out.println(strMiddaleName.strName);
		System.out.println(strLastName.strName);
		
	}

}
