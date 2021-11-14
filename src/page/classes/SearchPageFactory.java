package page.classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
	
	public static WebElement element = null;
	WebDriver driver;
	
	@FindBy(xpath="//ul[@id='uitk-tabs-button-container']/li[2]/a")
	WebElement flightTab;
	
	@FindBy(xpath="//a[@href='?flightType=oneway']")
	WebElement oneWayTab;
	
	@FindBy(xpath="//button[@aria-label='Leaving from']")
	WebElement clickingLeavebutton;
		
	@FindBy(id="location-field-leg1-origin")
	WebElement leavingForm;
	
	@FindBy(xpath="//button[@aria-label='Going to']")
	WebElement clickingGoingbutton;
	
	@FindBy(id="location-field-leg1-destination")
	WebElement goingTo;
	
	@FindBy(xpath="//button[@data-stid='apply-date-picker']")
	WebElement applyingDate; 
	
	@FindBy(id="d1-btn")
	WebElement clickingDepartingDateButton;
	
	
	//Departing Date
	
	public void departingDate(String date) {
		List<WebElement> element = driver.findElements(By.xpath(""
				+ "//div[@class='uitk-date-picker-menu-months-container']/div[1]//button"));
			
		for(WebElement eachDate : element) {
			
			if(eachDate.getAttribute("data-day").equals(date)) {
				eachDate.click();
				break;
			}		
		}
	}
	
	//Initiating Constructor
	public SearchPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Clicking Flight Tab
	public void ClickFlightTab() {
		flightTab.click();
	}
	
	
	//Clicking One Way Tab
	public void ClickOneWayTab() {
		oneWayTab.click();
	}
	
	
	//Clicking Leave Button
	public void ClickingOriginBox() {
		clickingLeavebutton.click();
	}
	
	//Selecting Origin City
	
	public void SelectOriginCity(String origin) {
		leavingForm.sendKeys(origin);
	}
	
	//Clicking Destination Button
	public void ClickingDestinationBox() {
		clickingGoingbutton.click();
	}
	
	//Selecting Destination
	public void SelectDetination(String landing) {
		goingTo.sendKeys(landing);
	}
	
	//Clicking Date Picker
	public void ClickingDateBox() {
		clickingDepartingDateButton.click();
	}
	
	//Selecting Date
	
	public void SelectingDate() {
		applyingDate.click();
	}

}
