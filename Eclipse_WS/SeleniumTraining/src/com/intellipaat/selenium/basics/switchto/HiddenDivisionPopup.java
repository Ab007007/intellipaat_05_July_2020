package com.intellipaat.selenium.basics.switchto;

import org.openqa.selenium.WebDriver;

import com.intellipaat.selenium.utils.ActitimeUtils;

public class HiddenDivisionPopup {
	
	public static void main(String[] args) {
		
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("http://formy-project.herokuapp.com/modal");
		ActitimeUtils.click("id", "modal-button");
		ActitimeUtils.waitForVisible("xpath", "//div[@class='modal-content']");
		System.out.println(ActitimeUtils.getText("tagname", "h5"));
		System.out.println(ActitimeUtils.getText("xpath", "//div[@class='modal-body']"));
		ActitimeUtils.click("id", "close-button");
	}

}
