package com.adactin.stepdefinition;



import java.io.IOException;


import adatinCucumber.CucumberProject.BaseClass1;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass1 {
	
	@Before
	public static void beforeHooks(Scenario scenario) {
		System.out.println(scenario.getName());

	}

	@After
	 public static void afterHooks(Scenario scenario) throws IOException {
		System.out.println(scenario.getStatus());
		if (scenario.isFailed()) {
			screenShot("Failed screenshot");
			
		}

	}

	
}
