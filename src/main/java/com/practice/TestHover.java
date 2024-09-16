package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.pagefactory.MasterPageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestHover {

	MasterPageFactory mpf;
	public void doHover() {
		
		//set the Browser
				WebDriverManager.chromedriver().setup();
				//Open the browser
				WebDriver driver= new ChromeDriver();
				//maximize the window view of browser
				driver.manage().window().maximize();
				//go to the url
				driver.navigate().to("https://www.costco.com/");
				//hover-over the service button
				mpf = new MasterPageFactory(driver);
				
				//Create an object of Action class
				Actions action = new Actions(driver);
				//hover over on "Services" option
				action.moveToElement(mpf.getServices()).perform();
				
				
	}
	public static void main(String[] args) {
		TestHover obj = new TestHover();
		obj.doHover();
	}
}
