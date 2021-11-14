package QatarAirways;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	public static WebElement element = null;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		System.out.println("Qatar Airways homepage is loaded");

	}
	
	
	//Flights Tab
	
	@FindBy(xpath="//a[contains(text(),'Flights')]")
	private WebDriver flightTab;


	// Finding the from box
	@FindBy(id="bw-from")
	private WebElement fromBox;
	
	//Finding the to box
	@FindBy(id = "bw-to")
	private WebElement toBox;
	
	
	//Finding DatePicker
	
	@FindBy(xpath="//div[contains(@class,'retrunTrip ')]/div[4]/div[4]//span[text()='Depart']//following-sibling::input")
	private WebElement pickDate;
	
	
	//Sending keys to from box
	public void fromCity(String from) {
		fromBox.sendKeys(from);
	}
	
	//Sending keys to to box
	public void toCity(String to) {
		toBox.sendKeys(to);
	}
	
	//Clicking on date picker
	public void selectDate() {
		pickDate.click();
	}
	
	
	

	
//	WebDriverWait wait = new WebDriverWait(driver, 30);
//	WebElement popUp = wait.until(ExpectedConditions.alertIsPresent(By.xpath("")));
	


	
	
	
	
}
