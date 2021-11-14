package JunitTest;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElemebtState {
	WebDriver driver;
	String baseURl;

	@Before
	public void setUp() throws Exception {
		
		driver = new ChromeDriver();
		baseURl = "https://www.google.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseURl);
		
	}
	
	@Test
	public void test() {
		
		WebElement e1 = driver.findElement(By.name("q"));
		e1.sendKeys("love sign");
		
		WebElement press1 = driver.findElement(By.xpath("//input[@class='gNO89b']"));
		press1.click();		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}



}
