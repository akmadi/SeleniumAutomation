package com.anil;

public class InheritTestClass extends InheritClass {
	@Override
	public int add(int a, int b) {
		super.var1 = 256;
		System.out.println();
		return super.add(a, b);
	}
	/*
	 * public void add2(int a, int b) { System.out.println(a + b); }
	 */

	@Override
	protected int multi(int a, int b) {
		// TODO Auto-generated method stub
		return super.multi(a, b);
	}

	@Override
	int divide(int a, int b) {
		// TODO Auto-generated method stub
		return super.divide(a, b);
	}

	int remainder(int a, int b) {
		return (a % b);
	}
}
