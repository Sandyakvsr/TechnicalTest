package com.soci.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProjectsPage {
	WebDriver driver;
	
	// Element Locators list can be managed locally in the page or externally in a resource file. Below are the local locators
	
	@FindBy(id="project_name")
	WebElement edit_projectname; // An alternate model is defining By objects like "By edit_projectname= By.id("project_name");" 
	@FindBy(xpath="//*[contains(@class=\"create_project\")]//TABLE//TR[5]/TD[2]/INPUT")
	WebElement name_field;
	@FindBy(xpath="//*[contains(@class=\"create_project\")]//TABLE//TR[6]/TD[2]/INPUT")
	WebElement email_field;
	@FindBy(xpath="//*[contains(@class=\"create_project\")]//TABLE//TR[7]/TD[2]/INPUT")
	WebElement phoneNo_field;
	@FindBy(xpath="//*[contains(@class=\"create_project\")]//TABLE//TR[8]/TD[2]/INPUT")
	WebElement website_field;
	@FindBy(xpath="//*[contains(@class=\"create_project\")]//TABLE//TR[9]/TD[2]/INPUT")
	WebElement city_field;
	@FindBy(xpath="//*[contains(@class=\"create_project\")]//TABLE//TR[10]/TD[2]/INPUT")
	WebElement pin_field;
	@FindBy(xpath="//*[contains(@class=\"project_name\")]//TABLE//TR")
	WebElement projname_xpath;
	@FindBy(className = "create")
	WebElement create;
	
	
	
	
	public ProjectsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	// TODO - Given code doesn't provide any navigation flow for opening the application and navigating to Project page
	// So adding a new navigation method openProjectsPage()
	
	public void openProjectsPage()
	{
		//TODO - Implement the navigation based on the application. 
	}
	
	
	public void create_a_new_project_without_errors() throws InterruptedException{

	     driver.wait(2000); // In Java, sleep is implemented using wait() method of WebDriver. Also providing a static wait like this is not preferred and we should use WebDriverWaits
	     

		edit_projectname.click();

		//driver.sleep(2000); // Commented the static wait and below is the dynamic wait implemented based on a field present
		
		WebDriverWait wait= new WebDriverWait(driver, 10000);
		wait.until(ExpectedConditions.visibilityOf(edit_projectname));
		

		edit_projectname.sendKeys("Project 123");
	 
	    name_field.sendKeys("Bob Jones");

	    email_field.sendKeys("bobjones@mail.com");

	    phoneNo_field.sendKeys("858-544-2342");

	    website_field.sendKeys("www.bobjones.com");
	    
	    city_field.sendKeys("San Jose");

	  //  Thread.sleep(250);  commented static wait and implemented dynamic wait
	    WebDriverWait element_wait= new WebDriverWait(driver, 250);
	    element_wait.until(ExpectedConditions.visibilityOf(city_field));

	    pin_field.sendKeys("95130");

	    	
		driver.findElement(By.className("create")).click();
		
	    //Thread.sleep(250);commented static wait and implemented dynamic wait
	    element_wait.until(ExpectedConditions.visibilityOf(create));
      
	    }

	public boolean verifyProjectName(String projectname)
	{
		String foundText = projname_xpath.getText();

		if(foundText != projectname){
			System.out.println("Project name didn't match, expected name is "+projectname+ " and actual name is "+foundText);
			return false;
		}
		return true;
		
	}
}
