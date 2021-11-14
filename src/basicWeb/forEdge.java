package basicWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class forEdge {
	public static void main(String[] args) {
		
		String baseURL = "http://www.google.com";
		WebDriver driver;
		
//		System.setProperty("webdriver.ie.driver", "M:\\QA Automation\\Selenium Files\\IEDriverServer.exe");
		
		driver = new InternetExplorerDriver();
		
		driver.get(baseURL);
	}

}
