package com.intellipaat.selenium.basics.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.intellipaat.selenium.utils.ActitimeUtils;

public class CreateCustomer {

	//aru03.info@gmail.com
	public static void main(String[] args) {
		
		WebDriver driver = ActitimeUtils.getDriver();
		
		ActitimeUtils.launchActiTime();
		ActitimeUtils.login("admin", "manager");
		
		ActitimeUtils.selectModule("TASKS");
		ActitimeUtils.clickOnNewCustomerButton();
		
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys("FC-JulyBatch-1");
		driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys("FC-JulyBatch1-Desc");
		driver.findElement(By.id("customerLightBox_commitBtn")).click();
		
		System.out.println("Waiting for the toast message to appear");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement toastMessageElement = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
		
		System.out.println("Toast message is "  + toastMessageElement.getText());
		System.out.println("Waiting for the toast message to be disappeared");
				
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
		ActitimeUtils.logout();
				
	}
}
