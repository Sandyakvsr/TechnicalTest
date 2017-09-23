package com.sociproj.pages;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TestPage {
	
	WebDriver driver;
	
	public TestPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void navigationMethod(String url) {
		System.out.println(url);
		driver.get(url);
	}
	//Below method does the calculation if sum equals 5, uses the result to select the option Live Octopus by value
	
	public void calculateFunc(int firstvalue, int secondvalue) throws InterruptedException {
		Select shirt=new Select(driver.findElement(By.xpath("//select[@id='shirt']")));
		int sum=firstvalue+secondvalue;	
	
		// if (sum<=totaloptions) // This is to print any matching  value for the sum of first and second value
		if (sum==5) // This is to print the 0000005 as the matching value
			{
			shirt.selectByValue("0000000"+sum);
			Thread.sleep(3000);
			
			String resultselection=shirt.getFirstSelectedOption().getText();
			String answer=driver.findElement(By.id("theText")).getAttribute("value");
			assertEquals(answer,"00000005");
			int resultvalue=Integer.parseInt(answer);
			
			System.out.println("\"———————————————————————————\"");
			System.out.println("\"Calculating using formula: ("+firstvalue+"+"+secondvalue+")="+sum+"\"");
			System.out.println("\"Returning result: "+sum+"\"");
			System.out.println("\"Selecting answer, from result, by value "+resultvalue+"\"");
			System.out.println("\"Selected '"+resultselection+"', using value '0000000"+resultvalue+"'\"");
			System.out.println("\"———————————————————————————\"\n\n");				
			}

}
	
	//Below method selects the items from the combo-box, logs the selection and the value to the console
	//It also passes the values to the method that calculates the sum
	
	public void selectComboboxItems() throws InterruptedException {

		Select shirt=new Select(driver.findElement(By.xpath("//select[@id='shirt']")));
		int totaloptions=shirt.getOptions().size();
		// System.out.println("Total options are "+totaloptions);
		shirt.selectByIndex(totaloptions-1);
		
		for(int i=0;i<totaloptions;i++) {
			shirt.selectByIndex(i);
			Thread.sleep(3000);
			
			String firstselection=shirt.getFirstSelectedOption().getText().replace(" T-Shirt", "");
			int firstvalue=Integer.parseInt(driver.findElement(By.id("theText")).getAttribute("value"));

			for(int j=i+1;j<totaloptions;j++) 
			{
				shirt.selectByIndex(j);
				Thread.sleep(3000);
				
				String secondselection=shirt.getFirstSelectedOption().getText().replace(" T-Shirt","");
				int secondvalue=Integer.parseInt(driver.findElement(By.id("theText")).getAttribute("value"));
				System.out.println("\"Selected "+firstselection+" with a value of 0000000"+firstvalue+"\"");
				System.out.println("\"Selected "+secondselection+" with a value of 0000000"+secondvalue+"\"");
				System.out.println("Calling The Function");
				calculateFunc(firstvalue, secondvalue);
								
		}
	}
		
}
}
