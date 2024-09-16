package com.practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pagefactory.MasterPageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSeleniumException {
	 //MasterPageFactory mpf;
	public void testExceptions() {
		
		//set the Browser
		WebDriverManager.chromedriver().setup();
		//Open the browser
		WebDriver driver= new ChromeDriver();
		//maximize the window view of browser
		driver.manage().window().maximize();
		//go to the url
		driver.navigate().to("https://www.costco.com/");
		
		//hover-over the service button
		MasterPageFactory  mpf = new MasterPageFactory(driver);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(mpf.getServices()));
		
		//Create an object of Action class
		Actions action = new Actions(driver);
		//hover over on "Services" option
		action.moveToElement(mpf.getServices()).perform();
		
		//wait for bottle water option is clickable
		wait.until(ExpectedConditions.elementToBeClickable(mpf.getBottledWater()));
		// click on "Bottled Water Delivery" option 
		mpf.getBottledWater().click();
		
	}
	public static void main(String[] args) {
		
		TestSeleniumException testObj = new TestSeleniumException();
		testObj.testExceptions();
	}
}
