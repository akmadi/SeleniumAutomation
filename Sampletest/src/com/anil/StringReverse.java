package com.anil;

import java.io.StringBufferInputStream;
import java.io.StringReader;
import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to be reversed");
		String str = sc.next();
		System.out.println("Reversed string of " + str + "is: " + strReverse(str).toString());
		sc.close();

	}

	public static StringBuilder strReverse(String str) {

		StringBuilder out = new StringBuilder();
		char[] chArr = str.toCharArray();

		for (int i = chArr.length - 1; i >= 0; i--) {
			out.append(chArr[i]);

		}
		return out;
	}

}
