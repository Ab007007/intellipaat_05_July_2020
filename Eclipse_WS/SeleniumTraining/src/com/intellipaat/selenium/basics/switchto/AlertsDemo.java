package com.intellipaat.selenium.basics.switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.intellipaat.selenium.utils.ActitimeUtils;

public class AlertsDemo 
{
	
	
	public static void main(String[] args) {
		
		WebDriver driver  = ActitimeUtils.getDriver();
		ActitimeUtils.launchActiTime();
		ActitimeUtils.login("admin", "manager");
		ActitimeUtils.selectModule("tasks");
		ActitimeUtils.clickOnNewCustomerButton();
		ActitimeUtils.sleep(2000);
		ActitimeUtils.type("id", "customerLightBox_nameField", "JunkText");
		ActitimeUtils.click("id", "customerLightBox_cancelBtn");
		ActitimeUtils.sleep(2000);
		driver.switchTo().alert().dismiss();
		ActitimeUtils.sleep(2000);
		ActitimeUtils.click("id", "customerLightBox_cancelBtn");
		ActitimeUtils.sleep(2000);
		System.out.println("Text on alert ---->>" + driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		ActitimeUtils.logout();
	}

}
