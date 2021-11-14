package reviseSelenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {

		driver = new ChromeDriver();
		baseURL = "https://courses.letskodeit.com/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		String webTitle = driver.getTitle();
		System.out.println(webTitle);
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000);

		String designatedSite = "https://www.google.com/";
		driver.navigate().to(designatedSite);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		
		Thread.sleep(2000);

		driver.navigate().back();
		
		Thread.sleep(2000);

		driver.navigate().forward();

	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
