package practiceDemo;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.classes.Searchpage;

public class PageObjectModel {

	WebDriver driver;
	String baseURl;

	@Before
	public void setUp() throws Exception {
		
		driver = new ChromeDriver();
		baseURl = "https://www.w3schools.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseURl);
		}
	
	@Test
	public void test() {
		Searchpage.clickTutorial(driver);
		Searchpage.clickJava(driver);
		Searchpage.clickIfElse(driver);
			
	}


	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
