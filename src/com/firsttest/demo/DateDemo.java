package com.firsttest.demo;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DateDemo {

	private WebDriver driver;
	private String baseURL;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "https://www.expedia.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseURL);
	}

	@Test
	public void test1() throws Exception {
		// Flight Tab
		driver.findElement(By.xpath("//span[text()='Flights']")).click();
		System.out.println("Clicked flight tab");

		// Departing Tab
		driver.findElement(By.id("d1-btn")).click();
		System.out.println("Clicked departing tab");

		Thread.sleep(3000);

		// This XPath was not correct
		List<WebElement> departDates = driver
				.findElements(By.xpath(""
						+ "//div[contains(@class,'uitk-date-picker date-picker-menu')]//div[contains(@data-stid,'date-picker-month')][2]//tr//td//button"));

		for (WebElement date : departDates) {
			if (date.getAttribute("data-day").equals("25")) {
				date.click();
				break;
			}
		}
		System.out.println("First Loop Complete");
		
		List<WebElement> returnDates = driver
				.findElements(By.xpath(""
						+ "//div[contains(@class,'uitk-date-picker date-picker-menu')]//div[contains(@data-stid,'date-picker-month')][2]//tr//td//button"));

		for (WebElement date : returnDates) {
			if (date.getAttribute("data-day").equals("27")) {
				date.click();
				break;
			}
		}
		System.out.println("Second Loop Complete");
		System.out.println("Found-date");
		driver.findElement(By.xpath("//button[@data-stid='apply-date-picker']")).click();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
}
