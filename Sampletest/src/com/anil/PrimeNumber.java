package com.anil;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		if (primeNumber(num)) {
			System.out.println("Given number is a prime!!");
		} else {
			System.out.println("Given number is not a prime!!");
		}

	}

	private static boolean primeNumber(int num) {
		// TODO Auto-generated method stub

		if (num == 2 || num == 3)
			return true;
		else if (num % 2 == 0 || num % 3 == 0)
			return false;
		else
			return true;

	}

}
