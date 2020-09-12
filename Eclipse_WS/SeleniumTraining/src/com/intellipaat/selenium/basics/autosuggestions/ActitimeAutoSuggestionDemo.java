package com.intellipaat.selenium.basics.autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.intellipaat.selenium.utils.ActitimeUtils;
import com.intellipaat.selenium.utils.DriverUtils;

public class ActitimeAutoSuggestionDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = DriverUtils.getDriver();
		
		ActitimeUtils.launch("http://localhost/login.do");
	
		ActitimeUtils.login("admin", "manager");
				
		driver.findElement(By.id("taskSearchControl_field")).sendKeys("B");
		Thread.sleep(4000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//table[@id='taskSearchControl']//div[@class='taskList']//span[@class='taskName']"));
		
		System.out.println(suggestions.size());
		
		for(WebElement s:suggestions) {
			System.out.println(s.getText());
		}
		
		
		
	}

}
