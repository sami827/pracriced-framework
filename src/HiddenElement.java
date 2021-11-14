

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElement {

	WebDriver driver;
	String baseUrl;
	String baseUrl2;

	@Before
	public void setUp() throws Exception {
		
		driver = new ChromeDriver();
		baseUrl = "https://letskodeit.teachable.com/p/practice";
		baseUrl2 = "https://www.expedia.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@Test
	public void testLetskode() throws InterruptedException {
		driver.get(baseUrl);
		WebElement shownElement = driver.findElement(By.name("show-hide"));
		System.out.println("Text box is displayed :" + shownElement.isDisplayed());
		Thread.sleep(2000);
		
		WebElement hideBtn = driver.findElement(By.id("hide-textbox"));
		hideBtn.click();
		
		System.out.println("Text box is displayed" + shownElement.isDisplayed());
		Thread.sleep(2000);
		

		
	}
	
	@Test
	public void expediaTest() {
		driver.get(baseUrl2);
		
	}


	@After
	public void tearDown() throws Exception {
	}

	
}
