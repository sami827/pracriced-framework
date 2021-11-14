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
import org.openqa.selenium.support.ui.Select;

public class DropBoxDemo {

	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {

		driver = new ChromeDriver();
		baseURL = "https://courses.letskodeit.com/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);

	}

	@Test
	public void test() throws InterruptedException {

		/*
		 * WebElement carSelect = driver.findElement(By.id("carselect"));
		 * 
		 * Select sel = new Select(carSelect);
		 * 
		 * sel.selectByIndex(0); Thread.sleep(2000);
		 * 
		 * sel.selectByIndex(1); Thread.sleep(2000);
		 * 
		 * sel.selectByIndex(2); Thread.sleep(2000);
		 * 
		 * List<WebElement> drpDown = sel.getOptions(); int size = drpDown.size();
		 * System.out.println(size);
		 * 
		 * for (WebElement oneCar : drpDown) { System.out.println(oneCar.getText()); }
		 */
		
		WebElement multiSelect = driver.findElement(By.id("multiple-select-example"));
		
		Select multiOptions = new Select(multiSelect);
		
		List<WebElement> cars = multiOptions.getOptions();
		WebElement orangeSel = driver.findElement(By.xpath("//option[@value='peach']"));
		
		System.out.println(cars.size());
		
		for (WebElement car : cars) {
			car.click();
			Thread.sleep(2000);
			
			if(orangeSel.isSelected()) {
				multiOptions.deselectAll();
			}
		}

	}

	@After
	public void tearDown() throws Exception {

	Thread.sleep(3000);
		driver.quit();
	}

}
