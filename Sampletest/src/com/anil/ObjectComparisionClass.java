package com.anil;

public class ObjectComparisionClass {
	
	String str;
	

	public static void main(String[] args) {
		

		ObjectComparisionClass obj1 = new ObjectComparisionClass();
		
		ObjectComparisionClass obj2 = new ObjectComparisionClass();
		
		obj1.str = "Test";
		
		obj2.str = "Test2";
		
		if (obj1.str.equals(obj2.str)) {
			System.out.println("They are equal!");
		} else {
			System.out.println("Not equal!!");
			System.out.println(obj1.hashCode());
			
			System.out.println(obj2.hashCode());
		}
		
		
	}

}
