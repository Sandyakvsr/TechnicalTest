package com.sociproj.test;

import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	WebDriver driver;
  @BeforeMethod
  public void setUp() {
	  	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandya\\Desktop\\personal\\Work\\MyPrep\\BackUpWorkspace\\eclipse-workspace\\SelPrepWork\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*System.setProperty("webdriver.gecko.driver","C:\\Users\\sandya\\Desktop\\personal\\Work\\MyPrep\\geckodriver.exe");
		driver=new FirefoxDriver();*/
  }

}
