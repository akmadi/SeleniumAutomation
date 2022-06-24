package com.anil;

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int f1 = 0;
		int f2 = 0;
		int f3 = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the end number to print the fibonacci series");
		int end = sc.nextInt();
		System.out.println("Below are the " + end + " fibonacci number series ");
		for (int i = 0; i <= end; i++) {
			f1 = f2;
			f2 = f3;
			f3 = f1 + f2;
			System.out.print(f1);
			System.out.print("\t");

		}
		sc.close();
	}
}
