package com.intellipaat.selenium.basics.browser;

import org.openqa.selenium.WebDriver;

import com.intellipaat.selenium.utils.ActitimeUtils;

public class BrowserOperationsDemo {

	
	
	public static void main(String[] args) {
		
		WebDriver driver = ActitimeUtils.getDriver();
		driver.manage().window().maximize();
		ActitimeUtils.launch("http://formy-project.herokuapp.com/form");
		
		System.out.println("after launch " + driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println("after clicking on back button " + driver.getCurrentUrl());
				
		driver.navigate().forward();
		System.out.println("after clicking on forward button " + driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
		driver.manage().window().fullscreen();
		
	}
}
