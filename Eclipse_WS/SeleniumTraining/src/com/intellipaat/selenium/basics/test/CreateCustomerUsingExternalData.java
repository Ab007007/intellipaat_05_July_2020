package com.intellipaat.selenium.basics.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.intellipaat.selenium.utils.ActitimeUtils;
import com.intellipaat.selenium.utils.FileUtils;

public class CreateCustomerUsingExternalData {

	//aru03.info@gmail.com
	public static void main(String[] args) {
		String sheet_name = "createcustomer";
		WebDriver driver = ActitimeUtils.getDriver();
		
		ActitimeUtils.launchActiTime(FileUtils.getPropertyValue("url"));
		ActitimeUtils.login(FileUtils.getPropertyValue("username"), FileUtils.getPropertyValue("password"));

		ActitimeUtils.selectModule("TASKS");
		
		int rowCount = FileUtils.getRowCount(sheet_name);
		
		for(int i=1; i<rowCount ; i++) {
			String customerName = FileUtils.getCellData(sheet_name, i, 0);
			String customerDesc = FileUtils.getCellData(sheet_name, i, 1);
			
			ActitimeUtils.clickOnNewCustomerButton();
			
			
			ActitimeUtils.type("id", "customerLightBox_nameField", customerName);
			ActitimeUtils.type("id", "customerLightBox_descriptionField", customerDesc);
			ActitimeUtils.click("id", "customerLightBox_commitBtn");
						
			System.out.println("Waiting for the toast message to appear");
			
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement toastMessageElement = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
			
			System.out.println("Toast message is "  + toastMessageElement.getText());
			System.out.println("Waiting for the toast message to be disappeared");
					
			wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
			
			
		}
		
		ActitimeUtils.logout();
				
	}
}
