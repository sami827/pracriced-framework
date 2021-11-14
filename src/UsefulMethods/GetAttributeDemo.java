package UsefulMethods;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeDemo {

	WebDriver driver;
	String baseUrl;	

	@Before
	public void setUp() throws Exception {
		
		driver = new ChromeDriver();
		baseUrl = "https://letskodeit.teachable.com/p/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	
	@Test
	public void test() {
		
	
		WebElement element1 = driver.findElement(By.id("name"));
		
		String attributeIs = element1.getAttribute("type");
		
		System.out.println("Value of the attribute is : " + attributeIs);
		
	
	
	}

	@After
	public void tearDown() throws Exception {
		
		Thread.sleep(2000);
		driver.quit();
	}

}
