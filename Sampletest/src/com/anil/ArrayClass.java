package com.anil;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayClass {
	
public static ArrayList<String> arrayListEx() {
	
	ArrayList<String> str = new ArrayList<String>();
	
	str.add("Name");
	str.add("Designation");
	
	str.add("Organization");
	
	return str;
	
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> str1 = ArrayClass.arrayListEx();
		
		/*
		 * str1.remove(0);
		 * 
		 * System.out.println(str1.get(1));
		 * 
		 * System.out.println(str1);
		 */
		
		Collections.sort(str1);
		
		Iterator<String> it = str1.iterator();
		
		System.out.println(it.next());
		
		for (String st:str1) { 
			System.out.println(st); 
			if (st.equalsIgnoreCase("Name")) {
				System.out.println("Success");
			}
		}
		
		Collections.reverse(str1);
		
		
		
		System.out.println(str1);
		 
		/*
		 * for (String st:str1) { System.out.println(st); }
		 */
	}

}
