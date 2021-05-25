package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmPgPom {
	public static WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement fname;
	@FindBy(id="last_name")
	private WebElement lname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement ccnum;
	@FindBy(id="cc_type")
	private WebElement cctype;
	@FindBy(id="cc_exp_month")
	private WebElement cc_expmonth;
	@FindBy(id="cc_exp_year")
	private WebElement cc_expyear;
	@FindBy(id="cc_cvv")
	private WebElement cc_cvv;
	@FindBy(id="book_now")
	private WebElement book_now;
	@FindBy(id="logout")
	private WebElement logout;

	public ConfirmPgPom(WebDriver cpdriver) {
		this.driver = cpdriver;
		PageFactory.initElements(cpdriver, this);
	}
		public WebElement getFname() {
			return fname;
		}

	public WebElement getLname() {
			return lname;
		}
		public WebElement getAddress() {
			return address;
		}

	public WebElement getCcnum() {
			return ccnum;
		}

	public WebElement getCctype() {
			return cctype;
		}

	public WebElement getCc_expmonth() {
			return cc_expmonth;
		}

	public WebElement getCc_expyear() {
			return cc_expyear;
		}

	public WebElement getCc_cvv() {
			return cc_cvv;
		}

		public WebElement getBook_now() {
			return book_now;
		}

	public WebElement getLogout() {
			return logout;
		}



}
