package com.intellipaat.selenium.basics;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.intellipaat.selenium.utils.ActitimeUtils;

public class PrintSearchResultsFromGoogle 
{

	public static void main(String[] args) {
		
		WebDriver driver = ActitimeUtils.getDriver();
		
		ActitimeUtils.launch("https://www.google.com/");
		
		ActitimeUtils.type("name", "q", "Intellipaat");
		ActitimeUtils.click("name", "btnK");
		
		List<WebElement> search_results = null; //ActitimeUtils.getElements("xpath", "//h3");
		System.out.println("###############################################");
	
		for(int i=2; i<=5; i++ )
		{
			search_results = ActitimeUtils.getElements("xpath", "//h3");
			System.out.println("$$$$$$$$$$ Page Number " + (i-1));
			for (WebElement result : search_results) {
				System.out.println(result.getText());
				
			}
			
			ActitimeUtils.click("linktext", String.valueOf(i));
			//ActitimeUtils.sleep(3000);
		}
		
		System.out.println("###############################################");
	
	
	}
	
}
