package com.anil;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class HastSetClass {
	
	
	public void hashTest() {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Anil");
		hs.add("Test");
		hs.add("Anil");
		for (String str: hs) {
			System.out.println(str);
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HastSetClass hsc = new HastSetClass();
		//hsc.hashTest();
		
		
		
		

	}

}
