package com.anil;



class ThirdClass{	
	
public static void main(String[] args) {
	SecondClass myObj = new SecondClass();
	myObj.a = 20;
	System.out.println(myObj.a);
	myObj.testAbsMethod();
	
	SecondClass myObj2 = new SecondClass();
	System.out.println(myObj2.a);
	
	EncapsulationTest testObj = new EncapsulationTest();
	
	testObj.name = "Set Outside";
	
	testObj.setName("Encapsule");
	
	System.out.println(testObj.getName());
}
	


}

