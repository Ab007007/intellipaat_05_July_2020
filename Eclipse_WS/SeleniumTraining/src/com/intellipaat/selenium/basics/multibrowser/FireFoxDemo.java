package com.intellipaat.selenium.basics.multibrowser;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;

import com.intellipaat.selenium.utils.ActitimeUtils;

public class FireFoxDemo {

	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Intellipaat");
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@aria-label='Google Search']")).click();
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		act.click(driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@aria-label='Google Search']"))).perform();

		List<WebElement> search_results = null; // ActitimeUtils.getElements("xpath", "//h3");
		System.out.println("###############################################");

		search_results = driver.findElements(By.xpath("//h3")); // ActitimeUtils.getElements("xpath", "//h3");
		for (WebElement result : search_results) {
			System.out.println(result.getText());

		}

		Thread.sleep(3000);

		System.out.println("###############################################");

	}
}
