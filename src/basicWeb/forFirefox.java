package basicWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class forFirefox {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "M:\\QA Automation\\Selenium Files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseURL = "http://learn.letskodeit.com";
		driver.get(baseURL);
 
	}

}
