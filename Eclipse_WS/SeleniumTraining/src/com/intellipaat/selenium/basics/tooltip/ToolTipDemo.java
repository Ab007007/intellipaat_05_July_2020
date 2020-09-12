package com.intellipaat.selenium.basics.tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		WebElement toolTip1 = driver.findElement(By.xpath("//a[@class='gb_D gb_Ac']"));
		
		System.out.println(toolTip1.getAttribute("title"));
		
		
		
		
		
	}
}
