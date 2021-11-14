package JavaScriptExecution;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickingElement {

	private WebDriver driver;
	private JavascriptExecutor js;
	private String baseURL = "https://letskodeit.teachable.com/p/practice";

	@Before
	public void setUp() throws Exception {
		
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
	}
	
	@Test
	public void test() throws Exception {
		driver.get(baseURL);
		Thread.sleep(3000);
		
		WebElement checkBoxElement = driver.findElement(By.id("bmwcheck"));
		js.executeScript("arguments[0].click();", checkBoxElement);
	}

	@After
	public void tearDown() throws Exception {
	}

	

}
