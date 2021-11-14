
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ListElements {

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
	
	@Test
	public void test() throws Exception {
		
		boolean isChecked = false;
		List<WebElement> allButtons = driver.findElements(By.xpath("//div[@id=\"radio-btn-example\"]//input"));
		
		int size = allButtons.size();
		
		for(int i = 0; i < size; i++) {
			isChecked = allButtons.get(i).isSelected();
			
			if(!isChecked) {
				allButtons.get(i).click();
				Thread.sleep(3000);
			}
		}		
	}

	@After
	public void tearDown() {
		driver.quit();
		
	}



}
