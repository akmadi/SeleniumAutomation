package com.anil;

public class sampleMethod {
	
	int x= 10;
	int strollno;
	String stname;
	
	public sampleMethod() {
		
	}
	
	
	public sampleMethod(int rollno, String name) {
		strollno = rollno;
		stname = name;
	}
	
	public static void main (String[] args) {
		System.out.println(testRecurse(10));
		sampleMethod sm = new sampleMethod();
		sm.x = 25;
		System.out.println(sm.x);
		sampleMethod sm2 = new sampleMethod();
		System.out.println(sm2.x);
		
		sm2.printTest();
		sampleMethod sm3 = new sampleMethod(123, "Anil");
		
		System.out.println(sm3.stname + " - "+sm3.strollno);
		
		
	}

	private static int testRecurse(int i) {
		
		if (i>0) {
			return i + testRecurse(i-1);
			
		} else 
			return 0;
		
		// TODO Auto-generated method stub
		
	}
	
	public void printTest() {
		System.out.println("This is a non static method");
		
	}

}
