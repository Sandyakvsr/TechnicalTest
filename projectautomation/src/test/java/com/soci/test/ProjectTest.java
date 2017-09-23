package com.soci.test;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.*;
import org.testng.annotations.*;
import static org.testng.Assert.*;

import com.soci.pages.*;

public class ProjectTest extends BaseTest {
	
	ProjectsPage projectpage = new ProjectsPage(driver) ;
	// You can create more page objects here or if you have a PageFactory, you can create factory object here that provides access to all methods of all pages
	
	
	@Test
	//DriverTest
	public void testCreateProject() throws InterruptedException
	{
		projectpage.openProjectsPage();
		projectpage.create_a_new_project_without_errors();
		assertTrue(projectpage.verifyProjectName("Project 123"));
	}

}
