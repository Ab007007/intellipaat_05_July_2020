package com.intellipaat.selenium.basics.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.intellipaat.selenium.utils.ActitimeUtils;

public class MulitSelectDropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("file:///D:/Intellipaat/Intellipaat_08_Aug/html/multiSelect.html");
		
		WebElement mulitSelectDropDown = driver.findElement(By.tagName("select"));
		
		Select sel = new Select(mulitSelectDropDown);
		
		sel.selectByIndex(1);
		Thread.sleep(3000);
		sel.selectByValue("audi");
		Thread.sleep(3000);
		sel.selectByVisibleText("Volvo");
		Thread.sleep(3000);
		
		
		sel.deselectByVisibleText("Saab");
		Thread.sleep(3000);
		sel.deselectByValue("volvo");
		Thread.sleep(3000);
		sel.deselectByVisibleText("Audi");	
		Thread.sleep(3000);
		
		
		sel.selectByIndex(1);
		Thread.sleep(3000);
		sel.selectByValue("audi");
		Thread.sleep(3000);
		sel.selectByVisibleText("Volvo");
		Thread.sleep(3000);
		sel.deselectAll();
		
		
	}
}
