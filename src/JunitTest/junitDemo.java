package JunitTest;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitDemo {
	
	WebDriver driver;
	String baseUrl;
	

	@Before
	public void setUp() throws Exception {
		
		driver = new ChromeDriver();
		baseUrl = "https://letskodeit.teachable.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() throws InterruptedException {
		
		driver.get(baseUrl);
		driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
		System.out.println("Clicked the Login button");
		driver.findElement(By.id("user_email")).sendKeys("saubiyajahan@gmail.com");
		System.out.println("Sending username");
		driver.findElement(By.id("user_password")).sendKeys("12345");
		System.out.println("Sending Password");
		Thread.sleep(3000);
		driver.findElement(By.id("user_email")).clear();
		System.out.println("Clearing Field");
		
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		
	}

	

}
