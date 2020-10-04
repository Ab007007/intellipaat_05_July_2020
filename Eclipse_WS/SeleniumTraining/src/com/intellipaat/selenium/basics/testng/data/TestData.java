package com.intellipaat.selenium.basics.testng.data;

import org.testng.annotations.DataProvider;

public class TestData {

	
	
	@DataProvider
	public Object[][] createprojectdata() {
		return new Object[][] { new Object[] { "TestNG-Aug-Cust1", "project1", "TestNG-Aug-CustDesc1" },
				new Object[] { "TestNG-Aug-Cust2", "project1", "TestNG-Aug-CustDesc2" },
				new Object[] { "TestNG-Aug-Cust3", "project1", "TestNG-Aug-CustDesc3" },
				new Object[] { "TestNG-Aug-Cust4", "project1", "TestNG-Aug-CustDesc4" },
				new Object[] { "TestNG-Aug-Cust5", "project1", "TestNG-Aug-CustDesc5" },
				new Object[] { "TestNG-Aug-Cust6", "project1", "TestNG-Aug-CustDesc6" } };
	}
	
	
	 @DataProvider
	  public Object[][] createcustomerdata() {
	    return new Object[][] {
	      new Object[] { "TestNG-Aug-Cust1", "TestNG-Aug-CustDesc1" },
	      new Object[] { "TestNG-Aug-Cust2", "TestNG-Aug-CustDesc2" },
	      new Object[] { "TestNG-Aug-Cust3", "TestNG-Aug-CustDesc3" }
	    };
	  }
}
