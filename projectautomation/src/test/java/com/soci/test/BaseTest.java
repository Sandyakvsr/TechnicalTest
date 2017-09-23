package com.soci.test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.*;
import org.testng.annotations.*;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {
	
	WebDriver driver; 
	
	@BeforeMethod
	public void setUp()
	{
	  	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandya\\Desktop\\personal\\Work\\MyPrep\\BackUpWorkspace\\eclipse-workspace\\SelPrepWork\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	

}