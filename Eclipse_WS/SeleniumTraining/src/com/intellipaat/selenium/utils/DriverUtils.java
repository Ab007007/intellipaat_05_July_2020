package com.intellipaat.selenium.utils;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverUtils {

	public static WebDriver driver = null;

	public static WebDriver getDriver() {
		System.out.println("Creating WebDriver object");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	/***
	 * 
	 * @author Aravind
	 * @param type  - id, name, classname, tagname, linktext, partiallinktext, css,
	 *              xpath
	 * @param value - based on type, its corresponding value
	 * @return - returns WebElement
	 */
	public static WebElement getElement(String type, String value) {
		WebElement ele = null;
		System.out.println("finding the element using " + type + " and " + value);
		switch (type.toLowerCase()) {
		case "id":
			ele = driver.findElement(By.id(value));
			break;
		case "name":
			ele = driver.findElement(By.name(value));
			break;
		case "classname":
			ele = driver.findElement(By.className(value));
			break;
		case "tagname":
			ele = driver.findElement(By.tagName(value));
			break;
		case "linktext":
			ele = driver.findElement(By.linkText(value));
			break;
		case "partiallinktext":
			ele = driver.findElement(By.partialLinkText(value));
			break;
		case "css":
			ele = driver.findElement(By.cssSelector(value));
			break;
		case "xpath":
			ele = driver.findElement(By.xpath(value));
			break;

		default:
			ele = null;
			System.out.println("invalid type passed in getElement. Please check your input");
			break;
		}
		
		return ele;

	}

	public static List<WebElement> getElements(String type, String value) {
		List<WebElement> ele = null;
		System.out.println("finding the element using " + type + " and " + value);
		switch (type.toLowerCase()) {
		case "id":
			ele = driver.findElements(By.id(value));
			break;
		case "name":
			ele = driver.findElements(By.name(value));
			break;
		case "classname":
			ele = driver.findElements(By.className(value));
			break;
		case "tagname":
			ele = driver.findElements(By.tagName(value));
			break;
		case "linktext":
			ele = driver.findElements(By.linkText(value));
			break;
		case "partiallinktext":
			ele = driver.findElements(By.partialLinkText(value));
			break;
		case "css":
			ele = driver.findElements(By.cssSelector(value));
			break;
		case "xpath":
			ele = driver.findElements(By.xpath(value));
			break;

		default:
			ele = null;
			System.out.println("invalid type passed in getElement. Please check your input");
			break;
		}
		
		return ele;

	}


	/**
	 * Reusable function to perform click
	 * @param type  - id, name, classname, tagname, linktext, partiallinktext, css,
	 *              xpath
	 * @param value - based on type, its corresponding value
	 * @param value
	 */
	public static void click(String type, String value) {
		
		System.out.println("Performing click operation using " +type + " and " + value);
		getElement(type, value).click();
	
	}
	/**
	 * Reusable function to perform type operation on the webElement
	 * @param type  - id, name, classname, tagname, linktext, partiallinktext, css,
	 *              xpath
	 * @param value - based on type, its corresponding value
	 * @param value
	 */
	public static void type(String type,String value, String text) {
		
		System.out.println("Performing type operation using " +type + " and " + value + " - " + text);
		getElement(type, value).sendKeys(text);
	
	}
	
	public static String getText(String type, String value) {
		System.out.println("Trying to get the text from " + type + " and " + value);
		String text = getElement(type, value).getText();
		System.out.println(" Found text on element  - "  + text);
		return text;
	}
	
	public static void sleep(long ms) {
		System.out.println("Sleep!!!!!!!!!!!!!!!!!!"  +ms);
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void waitForVisible(String type, String value) {
		System.out.println("Waiting for the visibility of Element !!!!");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(getElement(type, value)));
		
		System.out.println("Element is visible");
		
	}
	public static void waitForInVisible(String type, String value) {
		System.out.println("Waiting for the invisibility of Element !!!!");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOf(getElement(type, value)));
		
		System.out.println("Element is invisible");
		
	}
	
	
	
	
}
