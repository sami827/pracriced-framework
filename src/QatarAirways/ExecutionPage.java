package QatarAirways;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import QatarAirways.*;

public class ExecutionPage {

	private WebDriver driver;
	private String baseURL;
	HomePage hp;

	@Before
	public void setUp() throws Exception {
		
		driver = new ChromeDriver();
		baseURL = "https://www.qatarairways.com/";
		hp = new HomePage(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseURL);		
	}

	@Test
	public void test() throws InterruptedException {
		
		hp.fromCity("Bangladesh");
		hp.toCity("Canada");
		hp.selectDate();
	

	}
 
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();

	}


}
