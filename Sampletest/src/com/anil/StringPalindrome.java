package com.anil;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter string");
		String str = sc.next();
		String result = paliCheck(str);
		if (result.equalsIgnoreCase(str)) {
			System.out.println("It a Palindrome!!");
		} else {
			System.out.println("It's not a Palindrome!!");
		}
		
		

	}

	private static String paliCheck(String str) {
		// TODO Auto-generated method stub
		
		char [] chArr = str.toCharArray();
		StringBuilder result = new StringBuilder();
		
		for (int i=chArr.length - 1 ;i >= 0; i-- ) {
			result.append(chArr[i]);
		}
		return result.toString();
		
		
	}

}
