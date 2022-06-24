package com.anil.automation;

import static org.testng.Assert.assertEquals;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalculatorTest {
	
	ClaculatorClass calc = new ClaculatorClass();
	
	@BeforeTest
	
	void sample() {
		System.out.println("This is before test");
	}
	
	@BeforeMethod
	
	void beforeMeth() {
		System.out.println("This is before method");
	}
	
	@BeforeClass
	void beforeCla() {
		System.out.println("This is before class");
	}
	
	@AfterTest
	void afterTes() {
		System.out.println("This is after test");
	}
	
	@AfterMethod
	void afterMet() {
		System.out.println("This is after method");
	}
	
	@AfterClass
	void afterCla() {
		System.out.println("This is after class");
	}
	
	@Test
	
	public void additionTest() {
		int exp = 20;
		int act = 0; 
		act = calc.add(15,5);
		Assert.assertEquals(exp, act);
		
	}
	
	@Test
	public void secondAddTest() {
		int exp = -30;
		int act = 0; 
		act = calc.add(-20,-10);
		Assert.assertEquals(exp, act);
	}
	
	

}
