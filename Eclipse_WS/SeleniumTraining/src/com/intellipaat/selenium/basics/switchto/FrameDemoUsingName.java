package com.intellipaat.selenium.basics.switchto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.intellipaat.selenium.utils.ActitimeUtils;

public class FrameDemoUsingName {

	
	
	public static void main(String[] args) {
		
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_headers");
		ActitimeUtils.click("xpath", "//button[contains(text(),'Run')]");
		
		driver.switchTo().frame("iframeResult");
		
		List<WebElement> results = driver.findElements(By.xpath("//*[starts-with(text(),'This is')]"));
	
		for (WebElement result : results) {
			System.out.println(result.getText());
		}
	
		driver.switchTo().defaultContent();
		ActitimeUtils.click("id", "tryhome");
	
	
	
	}
}
