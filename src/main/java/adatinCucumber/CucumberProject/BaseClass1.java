package adatinCucumber.CucumberProject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass1 {
	public static WebDriver driver;
	
	public static WebDriver browserLaunch(String browsername) throws InterruptedException{
		if (browsername.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\JavaSample\\CucumberProject\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
			}else if (browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
				driver = new FirefoxDriver();
				}else if (browsername.equalsIgnoreCase("edge")) {
					System.setProperty("webdriver.edge.driver", System.getProperty(".")+"\\Driver\\msedgedriver.exe");
					driver = new EdgeDriver();
					
				}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		
		return driver;
			
	}
		public static void getUrl(String url) {
           driver.get(url);
		}
		
		public static void inputElement(WebElement element, String text) {
			element.sendKeys(text);

		}	
	public static  void clickOnElement(WebElement element) {
		element.click();
		
	}
	
	public static void dropDown(WebElement element, String option ) {
Select s = new Select(element);
if (option.equalsIgnoreCase("index")) {
	s.selectByIndex(Integer.parseInt(option));
	
}else if (option.equalsIgnoreCase("value")) {
	s.selectByValue(option);
		
}else if (option.equalsIgnoreCase("text")) {
	s.selectByVisibleText(option);
	
}	
}
public static void clear(WebElement element) {
	element.clear();

}
public static void isDisplayed(WebElement element) {
	element.isDisplayed();

}
public static void isEnabled(WebElement element) {
	element.isEnabled();

}
public static void getCurrentUrl(String CurrentUrl ) {
	driver.getCurrentUrl();
}
public static void screenShot(String string) throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File SourceFile = ts.getScreenshotAs(OutputType.FILE);
	File DesFile =new File("C:\\Users\\user\\eclipse-workspace\\JavaSample\\CucumberProject\\screenshot\\img.png");
	FileUtils.copyFileToDirectory(SourceFile, DesFile);

}	
}

	

			
		
	


