package pom.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.ConfirmPgPom;
import com.adactin.pom.LoginPgPom;
import com.adactin.pom.SearchPgPom;
import com.adactin.pom.SelcPgPom;

public class PageObjectManager{
	

	public static WebDriver driver ;
	
	private LoginPgPom lp;
	private SearchPgPom sp;
	private SelcPgPom s;
	private ConfirmPgPom cp;
	
	
	
	public PageObjectManager(WebDriver pdriver) {
		this.driver = pdriver;
	}

	
	public LoginPgPom getLp() {
		lp = new LoginPgPom(driver);
		return lp;
	}
	
	public SearchPgPom getSp() {
		sp = new SearchPgPom(driver);
		return sp;
	}
	
	public SelcPgPom getS() {
		s = new SelcPgPom(driver);
		return s;
	}
	
	public ConfirmPgPom getCp() {
		cp = new ConfirmPgPom(driver);
		return cp;
	}
}
