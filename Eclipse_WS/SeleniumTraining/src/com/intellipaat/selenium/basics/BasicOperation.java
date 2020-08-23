package com.intellipaat.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOperation {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		driver.get("http://formy-project.herokuapp.com/form");
		
		driver.findElement(By.id("first-name")).sendKeys("Aravinda");
		Thread.sleep(2000);
		driver.findElement(By.id("last-name")).sendKeys("H");
		Thread.sleep(2000);
		driver.findElement(By.id("job-title")).sendKeys("Tutor");
		Thread.sleep(2000);
		driver.findElement(By.id("radio-button-3")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkbox-1")).click();
		Thread.sleep(2000);
//		driver.findElement(By.id("datepicker")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//td[@class='today day']")).click();
//		Thread.sleep(2000);
		driver.findElement(By.id("datepicker")).sendKeys("08/23/2020");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Submit")).click();
		Thread.sleep(2000);
	
	}

}
