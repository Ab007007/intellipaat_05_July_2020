package com.intellipaat.selenium.basics.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.intellipaat.selenium.utils.ActitimeUtils;

public class AutomationSiteBooking {

	
	public static void main(String[] args) {
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("http://automationpractice.com/");
		
		driver.findElement(By.linkText("Women")).click();
		
		
	}
}
