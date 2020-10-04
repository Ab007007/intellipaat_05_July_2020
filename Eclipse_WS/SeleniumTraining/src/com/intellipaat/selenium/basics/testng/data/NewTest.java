package com.intellipaat.selenium.basics.testng.data;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTest {
 
	
  @Test(dataProvider = "createcustomerdata", dataProviderClass = TestData.class)
  public void f(String cn, String cd) {
	  
	  System.out.println(cn + " - " + cd);
  }

 
  
 
}
