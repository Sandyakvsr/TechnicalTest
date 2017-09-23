# TechnicalTest
Contains solution to the given two scenarios

First Part:Refactoring using Selenium Best Practices

1.I designed the refactored code to use Page Object Model to create the Automation framework where we write Page classes and Test classes.
2. Page classes contain the navigation and business logic, in the test classes, we write test cases where we reuse the page classes developed and by calling the various methods of page classes based on the test case steps.
3.Used the TestNG frame work for test case structure
4.Used Maven and configured maven build file with dependencies like webdriver, testng etc.
5.Used @FindBy Annotation of Selenium to organize the element locators in to variables locally
6.Used dynamic waits on page elements instead of static waits
7.Added comments in the code where ever refactoring is made
If time permits, we can also data drive the tests to use data from external sources like csv or xml. Also we can implement log mechanism using libraries like log4j. 

To Execute:Run the test class ProjectTest.java in the package com.soci.test or run maven pom.xml file. 


Second Part:
1. To access the webpage from webdriver, we need to host the file and I have used neocities.org for hosting. 
2. I have created a separate project and implemented the solution using Page Object Model. 

To Execute:Run the test class MySociTest.java  in package com.sociproj.test.
