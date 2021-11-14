package basicWeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findingXpath {

	public static void main(String[] args) {
		String baseURL = "https://letskodeit.teachable.com/"; 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		driver.findElement(By.xpath("//a[@href=('/sign_in')]")).click();
		
		
		driver.findElement(By.id("user_email")).sendKeys("saobiyajahan@gmail.com");
		
		

	}

}
