package com.anil;

import java.util.Random;

public class QuickSortClass {

	public static void main(String[] args) {

		Random ran = new Random();
		
		int [] arr = new int[10];
		
		for (int i =0; i<arr.length;i++) {
			arr[i]= ran.nextInt(10);
		}
		System.out.println("Before sorting: ");
		
		printArray(arr);
		
		arr = quickSort(arr,0,arr.length-1);
		
		System.out.println("After Sorting: ");
		
		printArray(arr);

		
		
	}

	private static void printArray(int[] arr) {

		for (int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	private static int[] quickSort(int[] arr, int i, int j) {
		
		
		
		
		return arr;
		// TODO Auto-generated method stub
		
	}

}
