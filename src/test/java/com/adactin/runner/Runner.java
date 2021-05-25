package com.adactin.runner;


import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import adatinCucumber.CucumberProject.BaseClass1;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import pom.adactin.helper.ConfigurationReader;
import pom.adactin.helper.FileReaderManager;


@RunWith(Cucumber.class)
@ExtendedCucumberOptions(retryCount =4)
@CucumberOptions(features="src\\test\\java\\com\\adactin\\feature\\adactin.feature",
     glue = "com\\adactin\\stepdefinition",
     monochrome = true,
     dryRun = false,
    strict = true,
     plugin ={//"html:HTML Report",
     //"pretty" , 
    		 //"json:JsonReport//jsonReport.txt",
    	//	"com.cucumber.listener.ExtentCucumberFormatter:Report//CucumberExtentReport.html"} )
             "rerun:Report1/FailedScenario.txt"})
public class Runner {
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws Exception {
		
		String browser = FileReaderManager.getInstance().getCrInstance().getBrowser();
	driver = BaseClass1.browserLaunch(browser);
	}
	
	@AfterClass
	public static void tearDown()
	{
		driver.quit();

	}

}
