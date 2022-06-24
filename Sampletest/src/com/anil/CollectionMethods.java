package com.anil;

import java.util.ArrayList;
import java.util.Iterator;


public class CollectionMethods {
	
	public void arrayListTest() {
	
	ArrayList<String> alist = new ArrayList<String>();
	
	alist.add("Anil");
	
	alist.add("Sunil");
	
	alist.add("null");
	
	alist.add("User");
	
	System.out.println(alist.size());
	
	System.out.println(alist.get(2));
	
	Iterator it2 = alist.iterator();
	
	Iterator<String> it = alist.iterator();
	
	
	String[] arr = (String[]) alist.toArray(new String[0]);	
	
	System.out.println(arr[0]);
	
	while(it.hasNext()) {
		
		System.out.println(it.next());
	}
	
	
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CollectionMethods cmet = new CollectionMethods();
		cmet.arrayListTest();
		

	}

}
