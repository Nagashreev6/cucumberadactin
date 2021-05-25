package pom.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	public static Properties ps;
	public ConfigurationReader() throws IOException {
	
	
	File file =new File("src\\main\\java\\com\\adactin\\properties\\configuration.properties");
	FileInputStream fis = new FileInputStream(file);
	ps = new Properties();
	ps.load(fis);

	}

	public static String getBrowser() {
     String browser = ps.getProperty("browser");
     return browser;
	}
	public static String getUrl() {
		String Url = ps.getProperty("Url");
		return Url;

	}
	
}
