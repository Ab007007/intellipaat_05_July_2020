package com.intellipaat.selenium.basics.testng.asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertsDemo {

	@Test(priority = 1)
	public void validLoginTest() {
		System.out.println("valid login test");
		Assert.assertTrue(true);
		System.out.println("TEST END");
	}

	@Test(priority = 2)
	public void invalidLoginTest() {
		System.out.println("invalid login test");
		Assert.assertFalse(true);
		System.out.println("TEST END");
	}
	
	@Test(priority = 3)
	public void createCustomerTest() {
		System.out.println("create customer test");
		Assert.assertTrue(true);
		System.out.println("TEST END");
	}

}
