import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class MultipleSelectItems {

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
		
		WebElement multiSelect = driver.findElement(By.xpath("//fieldset//select[@id='multiple-select-example']"));
		Select sel = new Select(multiSelect);
		
		
		sel.selectByValue("orange");
		
		Thread.sleep(2000);
		
		sel.deselectByValue("orange");
		
		Thread.sleep(2000);
		
		sel.selectByIndex(2);
		
		Thread.sleep(2000);
		
		sel.selectByVisibleText("Apple");
		
		Thread.sleep(2000);

		
		List<WebElement> multipleOptions = sel.getAllSelectedOptions();
		
		for(WebElement i : multipleOptions) {
			System.out.println(i.getText());
		}
		
		Thread.sleep(2000);
		
		sel.deselectAll();
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		
		
	}

	
}
