package com.intellipaat.selenium.basics.testng.group;

import org.testng.annotations.Test;

public class Cars {
	
	@Test(groups = {"mahendra", "laxury"})
	public void testXuv500() {
		System.out.println("testXuv500");
	}
	@Test(groups = "mahendra")
	public void testXuv300() {
		System.out.println("testXuv300");
	}
	@Test(groups = {"maruthi"})
	public void testswift() {
		System.out.println("testswift");
	}
	@Test(groups = {"maruthi", "laxury"})
	public void testertiga() {
		System.out.println("testertiga");
	}
	@Test(groups = {"nexa", "laxury"})
	public void testxl6() {
		System.out.println("testxl6");
	}
	
	@Test(groups = {"toyota", "laxury"})
	public void testinnova() {
		System.out.println("testinnova");
	}
	@Test(groups = {"toyota", "laxury"})
	public void testyaris() {
		System.out.println("testyaris");
	}
	@Test(groups = {"nexa"})
	public void testxl1() {
		System.out.println("testxl1");
	}


}
