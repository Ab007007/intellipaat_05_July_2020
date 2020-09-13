package com.intellipaat.selenium.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {

	public static WebDriver driver = null;
	
	
	public static WebDriver getDriver()
	{
		System.out.println("Creating WebDriver object");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
}
