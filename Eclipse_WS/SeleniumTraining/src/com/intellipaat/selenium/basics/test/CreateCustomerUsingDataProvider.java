package com.intellipaat.selenium.basics.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.intellipaat.selenium.basics.testng.data.TestData;
import com.intellipaat.selenium.utils.ActitimeUtils;

public class CreateCustomerUsingDataProvider {
	WebDriver driver = null;
	@Parameters("browser")
	@BeforeTest
	public void setup(String type) {
		driver = ActitimeUtils.getDriver(type);

	}
	
	@Parameters({"url","username","password"})
	@BeforeClass
	public void launchAndLogin(String url, String un, String pwd) {
		ActitimeUtils.launchActiTime(url);
		ActitimeUtils.login(un,pwd);
		ActitimeUtils.selectModule("TASKS");

	}
	
	@Test(dataProvider = "createcustomerdata", dataProviderClass = TestData.class)
	public void createCustomer(String cn, String cd) {
		Reporter.log("Creating a customer using " +cn + " and " + cd);
		ActitimeUtils.clickOnNewCustomerButton();
		ActitimeUtils.type("id", "customerLightBox_nameField", cn);
		ActitimeUtils.type("id", "customerLightBox_descriptionField", cd);
		ActitimeUtils.click("id", "customerLightBox_commitBtn");

		System.out.println("Waiting for the toast message to appear");

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement toastMessageElement = wait
				.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));

		System.out.println("Toast message is " + toastMessageElement.getText());
		System.out.println("Waiting for the toast message to be disappeared");

		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
		
	}
	
	@AfterClass
	public void logout() {
		ActitimeUtils.logout();
	}
	

	@AfterTest
	public void tearDown() {
		driver.close();
		driver = null;
	}
}
