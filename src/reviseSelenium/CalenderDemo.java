package reviseSelenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.GenericMethod;

public class CalenderDemo {

	WebDriver driver;
	String baseURL;
	GenericMethod gm;

	@Before
	public void setUp() throws Exception {

		driver = new ChromeDriver();
		baseURL = "https://www.expedia.com/";
		gm = new GenericMethod(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);

	}
	
	//each Date: //div[contains(@class,'uitk-date-picker date-picker-menu')]//div[contains(@data-stid,'date-picker-month')][2]//tr[4]//td[2]
	
	@Test
	public void test() {
		
		driver.findElement(By.id("d2-btn")).click();
		WebElement SelOCtober = gm.getElement
				("//div[contains(@class,'uitk-date-picker date-picker-menu')]//div[contains(@data-stid,'date-picker-month')][2]//tr[4]//td[2]", "xpath");
		
		SelOCtober.click();
		
	}
	
	@After
	public void tearDown() throws Exception {
	}

	

}
