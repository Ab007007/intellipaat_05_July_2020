package com.intellipaat.selenium.basics.switchto;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.intellipaat.selenium.utils.ActitimeUtils;

public class MultiBrowserWindo extends ActitimeUtils
{
//	https://www.irctc.co.in/eticketing/errors.html#
	public static void main(String[] args) {
		
		WebDriver driver  = getDriver();
		launchActiTime();
		login("admin", "manager");
		click("xpath", "//div[@class='popup_menu_button popup_menu_button_support']");
		waitForVisible("xpath", "//a[text()='User Guide']");
		click("xpath", "//a[text()='User Guide']");
		
		Set<String> window_ids = driver.getWindowHandles();
		
		Iterator<String> it = window_ids.iterator();
		
		String parent_window_id = it.next();
		String child_window_id = it.next();
		System.out.println("parent whindow id " + parent_window_id);
		System.out.println("child whindow id " + child_window_id);
		driver.switchTo().window(child_window_id);
		
		List<WebElement> links = ActitimeUtils.getElements("xpath", "//h3/a");
		
		for (WebElement link : links) {
			System.out.println(link.getText());
		}
		
		driver.close();
		
		driver.switchTo().window(parent_window_id);
		ActitimeUtils.selectModule("users");
		ActitimeUtils.logout();
		
	}
	

}
