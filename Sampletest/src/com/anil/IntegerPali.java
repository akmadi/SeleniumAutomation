package com.anil;

import java.util.Scanner;

public class IntegerPali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");

		int num = sc.nextInt();

		if (intPali(num)) {
			System.out.println("Given number is Palindrome!!");
		} else {
			System.out.println("Given number is not a Palindrome!!");
		}

	}

	private static boolean intPali(int num) {

		int num2 = num;
		int reverse = 0;
		// TODO Auto-generated method stub
		while (num2 != 0) {
			int rem = num2 % 10;
			reverse = reverse * 10 + rem;
			num2 = num2 / 10;
		}
		if (reverse == num) {
			return true;
		} else {
			return false;
		}
	}

}
