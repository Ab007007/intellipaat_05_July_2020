package com.intellipaat.selenium.basics.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.intellipaat.selenium.utils.FileUtils;

public class BasicOperation {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {

//		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
//		WebDriver driver =  new ChromeDriver();
		WebDriver driver = null;

		String nodeUrl = FileUtils.getPropertyValue("node2");
		ChromeOptions options = new ChromeOptions();
		options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
		options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		options.addArguments("disable-infobars");
		driver = new RemoteWebDriver(new URL(nodeUrl), options);

		driver.get("http://formy-project.herokuapp.com/form");

		driver.findElement(By.id("first-name")).sendKeys("Aravinda");
		Thread.sleep(2000);
		driver.findElement(By.id("last-name")).sendKeys("H");
		Thread.sleep(2000);
		driver.findElement(By.id("job-title")).sendKeys("Tutor");
		Thread.sleep(2000);
		driver.findElement(By.id("radio-button-3")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkbox-1")).click();
		Thread.sleep(2000);
//		driver.findElement(By.id("datepicker")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//td[@class='today day']")).click();
//		Thread.sleep(2000);
		driver.findElement(By.id("datepicker")).sendKeys("08/23/2020");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Submit")).click();
		Thread.sleep(2000);

	}

}
