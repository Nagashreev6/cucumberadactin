package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPgPom {
	public static WebDriver driver;
	
	@FindBy(id="username")
	private WebElement username;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="login")
	private WebElement login_btn;
	
public LoginPgPom(WebDriver lpdriver) {
		this.driver = lpdriver;
		PageFactory.initElements(lpdriver, this);
		
		}
public WebElement getUsername() {
		return username;
	}
public WebElement getPassword() {
		return password;
	}

public WebElement getLogin() {
		return login_btn;
	}



	}
