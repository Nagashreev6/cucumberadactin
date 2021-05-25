package com.adactin.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Report1/FailedScenario.txt",
     glue = "com\\adactin\\stepdefinition",
     monochrome = true,
     dryRun = false,
     strict = true)
     //plugin ={//"html:HTML Report",
     //"pretty" , 
    		 //"json:JsonReport//jsonReport.txt",
    	//	"com.cucumber.listener.ExtentCucumberFormatter:Report//CucumberExtentReport.html"} )
             

public class TestRunner {

}
