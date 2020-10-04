package com.intellipaat.selenium.basics.testng;

import org.testng.annotations.Test;

public class MultipleTests {

	@Test
	public void validLoginTest() {
		System.out.println("valid login test");
	}

	@Test
	public void invalidLoginTest() {
		System.out.println("invalid login test");
	}
	
	@Test
	public void createCustomerTest() {
		System.out.println("create customer test");
	}

}
