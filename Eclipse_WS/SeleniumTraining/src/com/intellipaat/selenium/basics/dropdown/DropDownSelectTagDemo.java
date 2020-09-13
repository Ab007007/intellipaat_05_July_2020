package com.intellipaat.selenium.basics.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.intellipaat.selenium.utils.ActitimeUtils;

public class DropDownSelectTagDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("http://formy-project.herokuapp.com/form");
		
		WebElement dropDownEle = driver.findElement(By.id("select-menu"));
		Select dropDown = new Select(dropDownEle);
		
		dropDown.selectByIndex(2); //2-4
		Thread.sleep(2000);
		dropDown.selectByValue("4"); //10+
		Thread.sleep(2000); 
		dropDown.selectByVisibleText("0-1"); //0-1
		
		
		
		
	}

}
