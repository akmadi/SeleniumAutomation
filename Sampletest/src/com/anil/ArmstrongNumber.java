package com.anil;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");

		int num = sc.nextInt();
		
		if(armnumCheck(num)){
			System.out.println("The given number is an armstrong number!!");
		} else 
		{
			System.out.println("The given number is not an armstrong number!!");
		}
	}

	private static boolean armnumCheck(int num) {
		// TODO Auto-generated method stub
		
		int num2 = num;
		
		int result = 0;
		
		int rem = 0 ;
		
		while(num2!=0) {
			
			 rem = num2 % 10;
			 result = result + rem *rem *rem ;
			 num2 = num2/10;
			
		}
		
		if (result == num)
			return true ;
		else return false;
		
	}

}
