package com.intellipaat.selenium.basics.testng;

import org.testng.annotations.Test;

public class PriorityDemo {

	@Test(priority = 1)
	public void validLoginTest() {
		System.out.println("valid login test");
	}

	@Test(priority = 2)
	public void invalidLoginTest() {
		System.out.println("invalid login test");
	}
	
	@Test(priority = 3)
	public void createCustomerTest() {
		System.out.println("create customer test");
	}

}
