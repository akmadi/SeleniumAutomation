package com.anil;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sampleMethod sm = new sampleMethod();
		
		System.out.println("Hello World!");
		
		int a = 10;
		
		double db = a;
		System.out.println(db);
		
		int c = (int) db;
		
		System.out.println(c);
		
		String test = "This is a sample string variable to test string methods";
		
		test += c;
		
		System.out.println(test.concat(" string"));
		
		System.out.println(addition(3,2));
		
		//System.out.println(sampleMethod.subtract(3,2));

	}
	
	private static int addition(int a, int b) {
		int total = 0;
		
		total = a + b;
		return total;
	}

}
