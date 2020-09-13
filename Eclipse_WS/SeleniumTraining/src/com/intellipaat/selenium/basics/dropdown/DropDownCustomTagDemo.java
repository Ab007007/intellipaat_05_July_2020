package com.intellipaat.selenium.basics.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.intellipaat.selenium.utils.ActitimeUtils;

public class DropDownCustomTagDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("http://formy-project.herokuapp.com/dropdown");
		
		driver.findElement(By.id("dropdownMenuButton")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='dropdown-menu show']"))));
	
		driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a[text()='Modal']")).click();
	}

}
