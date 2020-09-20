package com.intellipaat.selenium.basics.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.intellipaat.selenium.utils.ActitimeUtils;

public class DragAndDropDemo {

	
	public static void main(String[] args) {
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		Actions act = new Actions(driver);
		WebElement source_element = driver.findElement(By.id("draggable"));
		WebElement target_element = driver.findElement(By.id("droppable"));
			
		System.out.println("Before drag and drop");
		System.out.println("source_element" + source_element.getText());
		System.out.println("target_element" + target_element.getText());
		
		act.dragAndDrop(source_element, target_element).perform();
		
		System.out.println("After drag and drop");
		System.out.println("source_element" + source_element.getText());
		System.out.println("target_element" + target_element.getText());
		
		
	}
}
