package com.intellipaat.selenium.basics.waits;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import com.intellipaat.selenium.utils.ActitimeUtils;
import com.intellipaat.selenium.utils.DriverUtils;

public class TextToBeDisplayedUsingFW {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = DriverUtils.getDriver();
		ActitimeUtils.launch("file:///D:/Intellipaat/Intellipaat_08_Aug/html/abc.html");

		// Step1 - Create a fluent wait object by passing 
		// input - webelement, polling time, maxtime, exception to ignore
		
		FluentWait<WebElement> wait = new FluentWait<WebElement>(
				driver.findElement(By.id("counter"))).pollingEvery(Duration.ofMillis(1000))
				.withTimeout(Duration.ofSeconds(30)).ignoring(NoSuchElementException.class)
				.ignoring(Exception.class);
		
		// Step2 - Write your own wait logic inside Function
		
		
		Function<WebElement, Boolean> fun = new Function<WebElement, Boolean>() {

			@Override
			public Boolean apply(WebElement ele) {
				if(ele.getText().equals("0")) {
					System.out.println("Found element ");
					return true;
				}
				else {
					System.out.println("Waiting for element to become 0");
					return false;
				}
	
			}
		};
	
		// use wait object and pass fun object
	
		wait.until(fun);
		
	
	}

}
