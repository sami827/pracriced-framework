package basicWeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findingClass {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "https://www.youtube.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		
		
		driver.findElement(By.id("search")).sendKeys("Jujutsu Kaisen Ep 20");
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//button[@id = 'search-icon-legacy']")).click();

	}

}
