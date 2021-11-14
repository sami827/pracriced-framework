package basicWeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingLinktext {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://letskodeit.teachable.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseURL);
		
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Pract")).click();

	}

}
