package com.intellipaat.selenium.basics.test;

import org.openqa.selenium.WebDriver;

import com.intellipaat.selenium.utils.ActitimeUtils;

public class LoginTest {

	public static void main(String[] args)
	{
		
		WebDriver driver = ActitimeUtils.getDriver("edge");
		ActitimeUtils.sleep(5000);
		ActitimeUtils.launchActiTime("http://localhost/login.do");
		ActitimeUtils.login("admin", "manager");
		ActitimeUtils.logout();
		
		
	}
}
