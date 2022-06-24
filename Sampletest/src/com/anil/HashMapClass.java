package com.anil;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapClass {

	
	public void hasmapTest() {
		Map<Integer, String> list = new TreeMap();
		
		list.put(1, "First");
		list.put(2, "Second");
		list.put(5, "First");
		list.put(4, "Fourth");
		list.put(3, "Fifth");
		
		for (Map.Entry<Integer, String> str : list.entrySet()) {
			System.out.println("Key "+str.getKey()+" Value: "+str.getValue());
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMapClass hsmp = new HashMapClass();
		hsmp.hasmapTest();
		
	}

}
