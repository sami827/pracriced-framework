package page.classes;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Searchpage {
	public static WebElement element = null;
	
	/**
	 * Returns the flight origin text box element
	 * @param driver
	 * @return
	 */
	public static WebElement originTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-origin"));
		return element;
	}
	
	public static void fillOriginTextBox(WebDriver driver, String origin) {
		element = originTextBox(driver);
		element.sendKeys(origin);
	}

	/**
	 * Returns the flight destination text box element
	 * @param driver
	 * @return
	 */
	public static WebElement destinationTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-destination"));
		return element;
	}
	
	public static void fillDestinationTextBox(WebDriver driver, String destination) {
		element = destinationTextBox(driver);
		element.sendKeys(destination);
		
		
	}

	/**
	 * Returns the departure date text box element
	 * @param driver
	 * @return
	 */
	public static WebElement departureDateTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-departing"));
		return element;
	}
	
	public static void fillDepartureDateTextBox(WebDriver driver, String departureDate) {
		element = departureDateTextBox(driver);
		element.sendKeys(departureDate);
		
	}

	/**
	 * Returns the return date text box element
	 * @param driver
	 * @return
	 */
	public static WebElement returnDateTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-returning"));
		return element;
	}
	
	public static void fillReturnDateTextBox(WebDriver driver, String returnDate) {
		element = returnDateTextBox(driver);
		element.sendKeys(returnDate);
	}

	/**
	 * Returns the search button box element
	 * @param driver
	 * @return
	 */
	public static WebElement searchButton(WebDriver driver) {
		element = driver.findElement(By.id("search-button"));
		return element;
	}

	/**
	 * Click on search button
	 * @param driver
	 */
	public static void clickOnSearchButton(WebDriver driver) {
		element = searchButton(driver);
		element.click();
	}
	
	/**
	 * Navigate to flights tab
	 * @param driver
	 */
	public static void navigateToFlightsTab(WebDriver driver) {
		driver.findElement(By.id("header-history")).click();
		element = driver.findElement(By.id("tab-flight-tab"));
		element.click();
	}
	
	//My Practice Purpose
	
	public static void clickTutorial(WebDriver driver) {
		element = driver.findElement(By.id("navbtn_tutorials"));
		element.click();
	}
	
	public static void clickJava(WebDriver driver) {
		element = driver.findElement(By.xpath(""
				+ "//div[contains(@class,'w3-col l3 m6')]/a[contains(@href, '/java/default.asp')]"));
		element.click();
	}
	
	public static void clickIfElse(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'Java If')]"));
		element.click();
	}
		
}
