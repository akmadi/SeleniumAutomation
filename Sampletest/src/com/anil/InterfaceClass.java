package com.anil;

public class InterfaceClass implements TestInter {

	public enum Direction {
		EAST,
		WEST,
		SOUTH,
		NORTH
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfaceClass ic = new InterfaceClass();
		System.out.println(ic.sum(2, 3));

		ic.printline();

		System.out.println(Direction.EAST);
		
		for (Direction test: Direction.values()) {
			System.out.println(test);
		}
		
		
	}

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public void printline() {
		// TODO Auto-generated method stub
		System.out.println("Method defined in interface and implemented in class");
	}

}
