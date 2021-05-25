package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelcPgPom {
	public static WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement click;
	@FindBy(id="continue")
	private WebElement cont;
	
	public SelcPgPom(WebDriver sdriver) {
		this.driver = sdriver;
		PageFactory.initElements(sdriver, this);
	}
	
	public WebElement getClick() {
		return click;
	}

public WebElement getCont() {
		return cont;
	}

}
