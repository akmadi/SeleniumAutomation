package com.anil;

public class CallAbstract extends AbstractSample  {
	

	@Override
	public void testAbsMethod() {
		// TODO Auto-generated method stub
		
		int a = 0;
		
		System.out.println("This method is being implemented");
		
	}
	
public static void main(String[] args) {
	
	CallAbstract cabs = new CallAbstract();
	cabs.testAbsMethod();
	cabs.a = 2;
	cabs.b = 3;
	
	System.out.println(cabs.a);
	
	System.out.println(cabs.b);
	
	
}
	
}
