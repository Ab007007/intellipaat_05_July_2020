package com.intellipaat.selenium.basics.testng.data;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class CreateProjectDummy {

	@Test(dataProvider = "createprojectdata", dataProviderClass = TestData.class)
	public void createProject(String cn,String pn, String cd) {

		System.out.println(cn + " - "  + pn + " - " + cd);
	}

	
}
