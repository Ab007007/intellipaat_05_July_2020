package com.intellipaat.selenium.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActitimeUtils extends DriverUtils {

	
	public static void launch(String url) {
		
		driver.get(url);
		
	}
	
	public static void login(String un,String pwd) {
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
