package com.anil;

import java.util.HashMap;

public class HashClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> register = new HashMap<String, String>();

		register.put("Name", "Anil");
		register.put("Salary", "Avg");
		register.put("Rank", "Major");

		// System.out.println(register);
		System.out.println("Key:Value- ");
		for (String i : register.keySet()) {
			if (register.get(i).equalsIgnoreCase("Anil"))
			System.out.println(i + ":" + register.get(i));
			
		}

	}

}
