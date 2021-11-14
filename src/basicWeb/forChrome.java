package basicWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class forChrome {

	public static void main(String[] args) {
	
	//	System.setProperty("webdriver.chrome.driver", "M:\\\\QA Automation\\\\Selenium Files\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "http://www.letskodeit.com";
		driver.get(baseURL);
	}

}
