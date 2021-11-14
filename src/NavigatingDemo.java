import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatingDemo {

	WebDriver driver;
	String baseUrl;
	String title;
	

	@Before
	public void setUp() throws Exception {
		
		driver = new ChromeDriver();
		baseUrl = "https://letskodeit.teachable.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}


	@Test
	public void test() throws InterruptedException {
		
		driver.get(baseUrl);
		title = driver.getTitle();
		System.out.println("The title of the page is :" + title);
		
		String crntUrl = driver.getCurrentUrl();
		System.out.println("Rigt now you are on " + crntUrl);
		
		String navigatingURL = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
		driver.navigate().to(navigatingURL);
		crntUrl = driver.getCurrentUrl();
		System.out.println("Rigt now you are on " + crntUrl);
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		System.out.println("Navigated Back");
		crntUrl = driver.getCurrentUrl();
		System.out.println("Rigt now you are on " + crntUrl);
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		System.out.println("Navigated forward");
		crntUrl = driver.getCurrentUrl();
		System.out.println("Rigt now you are on " + crntUrl);
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		System.out.println("Navigated Back");
		crntUrl = driver.getCurrentUrl();
		System.out.println("Rigt now you are on " + crntUrl);
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		System.out.println("Rereshed");
		driver.get(crntUrl);
		System.out.println("Rereshed");

				
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
