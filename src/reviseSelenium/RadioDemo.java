package reviseSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo {

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
		boolean isChecked = false;

//		WebElement bmwRadio = driver.findElement(By.xpath("//input[@id='bmwradio']"));
//		bmwRadio.click();
//		System.out.println("Bmw is selected: " + bmwRadio.isSelected());

//		List Example

/*		List<WebElement> carsAvailable = driver.findElements(By.xpath("//input[@type='radio']"));

		for (WebElement car : carsAvailable) {

			isChecked = car.isSelected();

			if (!isChecked) {
				car.click();
				Thread.sleep(2000);
			}

		}*/
		
		
//		Check Box
		
	List<WebElement> checkBox = driver.findElements(By.xpath("//input[contains(@type, 'checkbox') and contains(@name,'cars')]"));
		checkBox.size();
		
		for(WebElement chck: checkBox) {
			isChecked = chck.isSelected();

			if (!isChecked) {
				chck.click();
				Thread.sleep(2000);
				
		} 
			
		} 
		
//	
	}

	@After
	public void tearDown() throws Exception {

//		Thread.sleep(3000);
		driver.quit();
	}

}
