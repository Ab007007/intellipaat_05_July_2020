package com.intellipaat.selenium.basics.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.intellipaat.selenium.utils.ActitimeUtils;

public class ActionsDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("http://localhost/login.do");
		
		Actions act = new Actions(driver);
		act.sendKeys("admin").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		act.sendKeys("manager").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		act.sendKeys(Keys.CONTROL, Keys.ALT, Keys.DELETE);
		
		
	}

}
