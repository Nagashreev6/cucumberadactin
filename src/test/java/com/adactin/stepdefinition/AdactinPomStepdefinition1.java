package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.adactin.runner.Runner;

import adatinCucumber.CucumberProject.BaseClass1;
import cucumber.api.java.en.*;

import pom.adactin.helper.FileReaderManager;
import pom.adactin.helper.PageObjectManager;

public class AdactinPomStepdefinition1 extends BaseClass1 {
	
	public static WebDriver driver = Runner.driver;
	 
	PageObjectManager pom = new PageObjectManager(driver);
	
	
	@Given("^User launch url for adactin application$")
	public void user_launch_url_for_adactin_application() throws Throwable {
	    
		String Url = FileReaderManager.getInstance().getCrInstance().getUrl();
		getUrl(Url);
	    
	}

	@When("^User enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable {
	    inputElement(pom.getLp().getUsername(),arg1);
	    
	}

	@When("^User enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable {
		inputElement(pom.getLp().getPassword(),arg1);
	    
	}
	

	@When("^User click login button$")
	public void user_click_login_button() throws Throwable {
	    clickOnElement(pom.getLp().getLogin());
	    
	}

	@Then("^User validate valid username and valid password$")
	public void user_validate_valid_username_and_valid_password() throws Throwable {
	  
	    
	}
	@Given("^User click and select location for \"([^\"]*)\"$")
	public void user_click_and_select_location_for(String arg1) throws Throwable {
	   
	   dropDown(pom.getSp().getLocation(),arg1);
	}

	@When("^User click and select hotels for \"([^\"]*)\"$")
	public void user_click_and_select_hotels_for(String arg1) throws Throwable {
		dropDown(pom.getSp().getHotels(),arg1);
	   
	   
	}

	@When("^User click and select roomtype for \"([^\"]*)\"$")
	public void user_click_and_select_roomtype_for(String arg1) throws Throwable {
	   dropDown(pom.getSp().getRoomtype(),arg1);
	   
	}

	@When("^User click and select number of rooms for \"([^\"]*)\"$")
	public void user_click_and_select_number_of_rooms_for(String arg1) throws Throwable {
		dropDown(pom.getSp().getRoomnos(),arg1);
	   
	   
	}

	@When("^User enter valid check-in date as \"([^\"]*)\"$")
	public void user_enter_valid_check_in_date_as(String arg1) throws Throwable {
		 inputElement(pom.getSp().getDatepickin(),arg1);
	   
	   
	}

	@When("^User enter valid check-out date as \"([^\"]*)\"$")
	public void user_enter_valid_check_out_date_as(String arg1) throws Throwable {
		inputElement(pom.getSp().getDatepickout(),arg1);
	   
	   
	}

	@When("^User click and select adult per room as \"([^\"]*)\"$")
	public void user_click_and_select_adult_per_room_as(String arg1) throws Throwable {
		dropDown(pom.getSp().getAdultroom(),arg1);
	   
	}

	@When("^User click and select child per room as \"([^\"]*)\"$")
	public void user_click_and_select_child_per_room_as(String arg1) throws Throwable {
		dropDown(pom.getSp().getChildroom(),arg1);
	   
	}

	@When("^User click search button$")
	public void user_click_search_button() throws Throwable {
		 clickOnElement(pom.getSp().getSubmit());
	   
	}

	@Then("^User validate given details$")
	public void user_validate_given_details() throws Throwable {
		Assert.assertEquals("ABC", "abc");
	   
	   
	}

	@Given("^User click and select hotel details$")
	public void user_click_and_select_hotel_details() throws Throwable {
		clickOnElement(pom.getS().getClick());
		
	    	}

	@When("^User click continue button$")
	public void user_click_continue_button() throws Throwable {
		clickOnElement(pom.getS().getCont());
	}


	@Given("^User enter first name as \"([^\"]*)\"$")
	public void user_enter_first_name_as(String arg1) throws Throwable {
		 inputElement(pom.getCp().getFname(),arg1);
	   
	}

	@When("^User enter last name as \"([^\"]*)\"$")
	public void user_enter_last_name_as(String arg1) throws Throwable {
		 inputElement(pom.getCp().getLname(),arg1);
	   
	}

	@When("^User enter address at \"([^\"]*)\"$")
	public void user_enter_address_at(String arg1) throws Throwable {
		inputElement(pom.getCp().getAddress(),arg1);
	   
	}

	@When("^User enter valid credit card number as \"([^\"]*)\"$")
	public void user_enter_valid_credit_card_number_as(String arg1) throws Throwable {
		inputElement(pom.getCp().getCcnum(),arg1);
	   
	}

	@When("^User click and select  credit card type as \"([^\"]*)\"$")
	public void user_click_and_select_credit_card_type_as(String arg1) throws Throwable {
	    dropDown(pom.getCp().getCctype(),arg1);
	   
	}
	@When("^User click  and select card expiry date select month at \"([^\"]*)\"$")
	public void user_click_and_select_card_expiry_date_select_month_at(String arg1) throws Throwable {
      dropDown(pom.getCp().getCc_expmonth(),arg1);
	   
	}

	@When("^User click and select card expiry date select year at  \"([^\"]*)\"$")
	public void user_click_and_select_card_expiry_date_select_year_at(String arg1) throws Throwable {


		dropDown(pom.getCp().getCc_expyear(),arg1);
	   
	}

	@When("^User enter cvv number as \"([^\"]*)\"$")
	public void user_enter_cvv_number_as(String arg1) throws Throwable {
		inputElement(pom.getCp().getCc_cvv(),arg1);
	   
	   
	}

	@When("^User click book now button$")
	public void user_click_book_now_button() throws Throwable {
		clickOnElement(pom.getCp().getBook_now());
	   
	   
	}

	@When("^User click logout button$")
	public void user_click_logout_button() throws Throwable {
		clickOnElement(pom.getCp().getLogout());
	   
	}



}
