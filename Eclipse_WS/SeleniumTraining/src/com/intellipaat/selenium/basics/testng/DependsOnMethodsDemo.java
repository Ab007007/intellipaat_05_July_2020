package com.intellipaat.selenium.basics.testng;

import org.testng.annotations.Test;

public class DependsOnMethodsDemo {

	@Test
	public void launch() {
		System.out.println("valid launch test");
	}

	@Test(dependsOnMethods = "launch")
	public void login() {
		System.out.println("invalid login test");
	}
	
	@Test(dependsOnMethods = {"launch", "login"})
	public void createCustomerTest() {
		System.out.println("create customer test");
	}

	@Test(dependsOnMethods = "createCustomerTest")
	public void logout() {
		System.out.println("logout");
	}
}
