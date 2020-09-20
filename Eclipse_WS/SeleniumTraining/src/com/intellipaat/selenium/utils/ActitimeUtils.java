package com.intellipaat.selenium.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActitimeUtils extends DriverUtils {

	public static void launch(String url) {

		driver.get(url);

	}

	public static void launchActiTime(String url) {

		driver.get(url);
		validateTitle("actiTIME - Login");
	}
	
	public static void launchActiTime() {

		driver.get("http://localhost/login.do");
		validateTitle("actiTIME - Login");
	}

	public static void login(String un, String pwd) {
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		validateTitle("actiTIME - Enter Time-Track");
		
		
	}

	public static void validateTitle(String expectedTitle) {
		String actualTitile = driver.getTitle();

		if (actualTitile.equals(expectedTitle)) {
			System.out.println("[PASS] - Title is matched, displayed titile is " + actualTitile);
		} else {
			System.out.println("[FAIL] - Title is not-matched");
		}
	}

	
	public static void logout()
	{
		driver.findElement(By.id("logoutLink")).click();
		validateTitle("actiTIME - Login");
	}
	
	public static void selectModule(String moduleName) 
	{
		System.out.println("selecting module " + moduleName);
		switch (moduleName.toUpperCase()) {
		case "TASKS":
			driver.findElement(By.xpath("//div[text()='TASKS']/parent::a")).click();
			validateTitle("actiTIME - Task List");
			break;
		case "USERS":
			driver.findElement(By.xpath("//div[text()='USERS']/parent::a")).click();
			validateTitle("actiTIME - User List ");
			break;

		default:
			System.out.println("Please contact Framework Developer for your selection " + moduleName);
			break;
		}
		
	}
	
	
	public static void clickOnNewCustomerButton()
	{
		driver.findElement(By.xpath("//div[@class='addNewContainer']")).click();
		driver.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
