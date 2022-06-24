package com.anil;

import java.util.LinkedHashSet;

public class LinkedHastSetClass {
	
	
	public void linkedSet() {
	LinkedHashSet<String> lhs = new LinkedHashSet<String>();
	lhs.add("Anil");
	lhs.add("Ravi");
	lhs.add("Anil");
	lhs.add("Sunil");
	
	for (String str: lhs) {
		System.out.println(str);
	}
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHastSetClass ll = new LinkedHastSetClass();
		ll.linkedSet();
		
	}

}
