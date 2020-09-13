package com.intellipaat.selenium.basics.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.intellipaat.selenium.utils.ActitimeUtils;

public class CreateCustomer {

	
	public static void main(String[] args) {
		
		WebDriver driver = ActitimeUtils.getDriver();
		
		ActitimeUtils.launchActiTime();
		ActitimeUtils.login("admin", "manager");
		
		ActitimeUtils.selectModule("TASKS");
		ActitimeUtils.clickOnNewCustomerButton();
		
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys("FC-JulyBatch");
		driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys("FC-JulyBatch-Desc");
		driver.findElement(By.id("customerLightBox_commitBtn")).click();
		
		ActitimeUtils.logout();
				
	}
}
