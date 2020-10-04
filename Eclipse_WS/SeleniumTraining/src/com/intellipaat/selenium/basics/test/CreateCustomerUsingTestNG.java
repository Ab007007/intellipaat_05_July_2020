package com.intellipaat.selenium.basics.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.intellipaat.selenium.utils.ActitimeUtils;

public class CreateCustomerUsingTestNG {
	WebDriver driver = null;
	@Parameters("browser")
	@BeforeClass
	public void setup(String type) {
		driver = ActitimeUtils.getDriver(type);

	}
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void launchAndLogin(String url, String un, String pwd) {
		ActitimeUtils.launchActiTime(url);
		ActitimeUtils.login(un,pwd);

	}
	
	@Test
	public void createCustomer() {
		
		ActitimeUtils.selectModule("TASKS");
		ActitimeUtils.clickOnNewCustomerButton();

		ActitimeUtils.type("id", "customerLightBox_nameField", "Dummy2");
		ActitimeUtils.type("id", "customerLightBox_descriptionField", "Dummy2");
		ActitimeUtils.click("id", "customerLightBox_commitBtn");

		System.out.println("Waiting for the toast message to appear");

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement toastMessageElement = wait
				.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));

		System.out.println("Toast message is " + toastMessageElement.getText());
		System.out.println("Waiting for the toast message to be disappeared");

		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
		
	}
	
	@AfterMethod
	public void logout() {
		ActitimeUtils.logout();
	}
	

	@AfterClass
	public void tearDown() {
		driver.close();
		driver = null;
	}
}
