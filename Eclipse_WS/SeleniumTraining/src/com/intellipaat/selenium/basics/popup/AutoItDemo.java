package com.intellipaat.selenium.basics.popup;

import java.io.IOException;

import com.intellipaat.selenium.utils.ActitimeUtils;

public class AutoItDemo {
	
	public static void main(String[] args) throws IOException {
		Runtime.getRuntime().exec("D:\\Intellipaat\\Intellipaat_08_Aug\\autoit\\fileupload_popup.exe");
		ActitimeUtils.getDriver();
		ActitimeUtils.launch("http://formy-project.herokuapp.com/fileupload");
		ActitimeUtils.click("xpath", "//button[text()='Choose']");
		
		ActitimeUtils.sleep(9000);
		ActitimeUtils.click("xpath", "//button[text()='Reset']");
		
		
	}
}
