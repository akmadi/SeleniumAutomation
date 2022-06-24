package com.anil.automation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations {
	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test executed");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is before class");
	}
	
	@AfterTest
	public void afterMethod() {
		System.out.println("This is after test");
	}
	
	@Test
	public void firstTest() {
		System.out.println("This is first test");
	}
	
	@Test
	public void secondTest() {
		System.out.println("This is second test");
	}
	
	@Test
	public void thirdTest() {
		System.out.println("This is second test");
	}

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * TestAnnotations ta = new TestAnnotations();
	 * 
	 * 
	 * }
	 */

}
