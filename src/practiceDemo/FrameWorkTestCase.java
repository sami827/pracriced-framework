package practiceDemo;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.classes.SearchPageFactory;


public class FrameWorkTestCase {
	
	private WebDriver driver;
	private String baseURl;
	SearchPageFactory searchPage;

	@Before
	public void setUp() throws Exception {
		
		driver = new ChromeDriver();
		baseURl = "https://www.expedia.com/";
		
		searchPage = new SearchPageFactory(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseURl);
		}
	
	@Test
	public void test() throws Exception {
		searchPage.ClickFlightTab();
		Thread.sleep(3000);
		searchPage.ClickOneWayTab();
		Thread.sleep(3000);
		searchPage.ClickingOriginBox();
		Thread.sleep(3000);
		searchPage.SelectOriginCity("New york");
		Thread.sleep(3000);
		searchPage.ClickingDestinationBox();
		Thread.sleep(3000);
		searchPage.SelectDetination("Chicago");
		Thread.sleep(3000);
		searchPage.ClickingDateBox();
		Thread.sleep(3000);
		searchPage.departingDate("28");
		Thread.sleep(3000);
		searchPage.SelectingDate();
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
