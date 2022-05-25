package com.vstl.assignment;

import java.util.Random;

public class FaceBookSignupPage {
	
	public FaceBookSignupPage() {
		System.out.println("Open browser :");
	}
	
	public void getFirstName() {
		String strArray[] = {"Rohini","Sanjay","Rohan","Rina","Seema","Anand","Priya","Chaitali"};
		System.out.println("First Name is :" +strArray[new Random().nextInt(strArray.length)]);		
	}
	
	public void getLastName() {
		String strArray[] = {"Donawade","Patil","Done","Tandulkar","Hajare","Khot","Mutnale","Bhuvi"};
		System.out.println("Last Name is :" +strArray[new Random().nextInt(strArray.length)]);		
	}
	
	public void getMobileNumber() {
		Random rd=new Random();
		
		int intMobileNo;
		String str[]=new String [10];
		
		for(int intNum=0;intNum<10;intNum++) {
			intMobileNo= rd.nextInt(10);
			
			 str[intNum]=Integer.toString(intMobileNo);
			}
		System.out.println("Mobile Number:"+str[0]+str[1]+str[2]+str[3]+str[4]+str[5]+str[6]+str[7]+str[8]+str[9]);
		}
	
	public static void setPassword() {
		String strPassword = "xyz123";
		System.out.println("Password is :" +strPassword);
	}
	
/*	public void getDate() {
		Random ranNumber =new Random();
		
		int intRandom = ranNumber.nextInt(30);
		System.out.println("The date is :" +intRandom);
	}
		public void getMonth() {
			String strArrayMonth[] = {"Jan","Feb","March","Apr","May","Jun","July","Agu","Sep","Oct","Nov","Dec"};
			System.out.println("First Name is :" +strArrayMonth[new Random().nextInt(strArrayMonth.length)]);		

		}
		
		public void getYear() {
			int intNum = 2004;
			if(intNum<2004) {
				System.out.println("The person is eligible for signup");
			}
			else {
				System.out.println("The person is eligible for signup");
			}
							
	}
		public void getDateOfBirth() {
			
			int intRandom;
			String strArrayMonth[] = strArrayMonth[new Random().nextInt(strArrayMonth.length)]
			int intc = Integer.parseInt(strArrayMonth);
			int i = intRandom+intc; */
	
	
	public void getDateOfBirth() {
		String strDateOfBirth = "5/may/2000";
		System.out.println("Date of birth is :" +strDateOfBirth);		
	}
	
	public void getgender() {
		String strGender = "Male";
		if(strGender.equals("Male")) {
		System.out.println("Boy Name so click on male:" +strGender);
		}
		else {
			System.out.println("If girl click on :" +strGender);
		}
	} 
}

		
		
			
		
	
	
	
	


