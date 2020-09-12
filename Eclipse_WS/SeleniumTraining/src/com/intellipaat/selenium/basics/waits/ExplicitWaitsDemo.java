package com.intellipaat.selenium.basics.waits;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitsDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Intellipaat");
		
		WebDriverWait wait  = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ul[@class='erkvQe']"))));
		
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//li[contains(@class,'sbct')]//div[contains(@class,'sbl1')]/span"));
		
		System.out.println("Total Suggestions displayed is " + autoSuggestions.size());
		
		/*
		 * 1. Iterator
		 * 2. Enhanced for loop
		 * 3. basic for loop
		 */
	
		/*
		 * Iterator<WebElement> it = autoSuggestions.iterator(); WebElement suggestion =
		 * null;
		 * 
		 * while(it.hasNext()) { suggestion = it.next();
		 * System.out.println(suggestion.getText()); }
		 */
		
/*		
		for (WebElement suggestion : autoSuggestions) {
			System.out.println(suggestion.getText());
		}*/
		
		WebElement ele ;
		
		for(int i =0; i <autoSuggestions.size(); i++) {
			
			ele = autoSuggestions.get(i);
			System.out.println(ele.getText());
		}
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}

}
