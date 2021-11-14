
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	WebDriver driver;
	String baseUrl;	

	@Before
	public void setUp() throws Exception {
		
		driver = new ChromeDriver();
		baseUrl = "https://letskodeit.teachable.com/p/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	
	
	@After
	public void tearDown() throws Exception {
		
		WebElement bmwRadioBtn = driver.findElement(By.xpath("//input[@value='bmw' and contains(@type,'radio')]"));		
		bmwRadioBtn.click();
		
		Thread.sleep(2000);
		WebElement hondaRadioBtn = driver.findElement(By.id("hondaradio"));
		hondaRadioBtn.click();
		
		Thread.sleep(2000);
		WebElement benzRadioBtn = driver.findElement(By.xpath("//input[@value='benz' and contains(@type,'radio')]"));
		benzRadioBtn.click();
		

		
		Thread.sleep(2000);
		WebElement hondaCheckbox = driver.findElement(By.id("hondacheck"));
		hondaCheckbox.click();
	}

	@Test
	public void test() {
		
		//driver.quit();
		
	}
	
	//input[@value='benz' and contains(@type,'radio')];

}
