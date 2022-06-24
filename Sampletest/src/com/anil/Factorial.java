package com.anil;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int factValue = factorialCalc(num);
		System.out.println(factValue);
		System.out.println(simpleFact(num));
		
		

	}

	private static int factorialCalc(int num) {
		// TODO Auto-generated method stub
		int result = 1 ;
		while (num >1 ) {
			result = result * num;
			-- num ;
		}
		return result;
		
	}

	
	public static int simpleFact(int num) {
		
		if(num == 0) {
			return 1;
		}
		
		return num * simpleFact(num -1);
	}
}
