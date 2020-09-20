package com.intellipaat.selenium.basics.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.intellipaat.selenium.utils.ActitimeUtils;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("https://www.flipkart.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement close_alert = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"))));
		close_alert.click();
	
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']"))).perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Women']"))).perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Men']"))).perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Home & Furniture']"))).perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Baby & Kids']"))).perform();
		Thread.sleep(2000);
		
	}
}
