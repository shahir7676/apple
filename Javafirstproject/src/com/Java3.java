package com;

public class Java3 {

	public static void main(String[] args) {
		// -128 to 127
		byte myByte = 12;
		
		//-32,768 to 32,7676 - Never use this really
		short myShort = 1234;
		
		// -2,147,483,648 to 2,147,483,67
		int myInt = 2837;
		
		// -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		long myLong = 12323;
		
		//about 6 decimal digits
		float myFloat = 6.3f;
		
		// about 15 decimal digits
		double myDouble = 45.213434;
		
		// true or false
		boolean myBoolean = false;
		boolean moreThan1000= (myInt > 1000);
		
		// one character
		char myChar = 'W';
		
		// not a primitive data type
		String myString = "Hello";
		System.out.println(myString);

	}

}
