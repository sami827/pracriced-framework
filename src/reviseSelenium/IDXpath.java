package reviseSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDXpath {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		String baseURL = "https://letskodeit.teachable.com/";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		
		driver.findElement(By.xpath(" //a[@href='/sign_in']")).click();
		
		WebElement idLocator = driver.findElement(By.id("user_email"));
		idLocator.sendKeys("SaubiyaJahan@gmail.com");
		
		WebElement passField = driver.findElement(By.xpath("//input[@name = 'user[password]']"));
		passField.sendKeys("loveyou");
		
		driver.findElement(By.xpath("//input[@name='commit']")).click();

	}

}
