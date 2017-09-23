package com.sociproj.test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sociproj.pages.TestPage;

public class MySociTest extends BaseTest {
	
	
  @Test
  //Driver Test
  public void sociTest() throws InterruptedException {
	  TestPage pc=new TestPage(driver);
	  pc.navigationMethod("https://onepager.neocities.org/testPage.html");
	  pc.selectComboboxItems();
  }
}
