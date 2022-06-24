package com.anil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arrList = new ArrayList<Integer>();
		
		
		arrList.add(5);
		
		arrList.add(3);
		
		arrList.add(7);
		
		arrList.add(3);
		
		arrList.add(8);
		
	System.out.print(arrList);
	
	System.out.print("\t\t");
	
	Set<Integer> noDup = new LinkedHashSet<Integer>(arrList);
	
	HashSet<Integer> secDup = new HashSet<Integer>(arrList);
	System.out.println(secDup);
	
	System.out.print("\t\t");
	
	arrList.clear();
	arrList.addAll(noDup);
	
	
	System.out.println(arrList);

		

	}

}
