package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseLogin {

		public void getLogin() {
		
			WebDriverManager.chromedriver().setup();  // setup the webdriver whice will help to drive(open)  the Chrome browser
			
			// ctrl+shift +o for importing any package
			
			WebDriver driver = new ChromeDriver(); // upcasting polymorphism, driver is object of ChromeDriver
			driver.manage().window().maximize(); // telling driver to manage the window as  maximized
			//go to URL
		//	driver.get("https://www.automationexercise.com/");
			driver.navigate().to("https://www.automationexercise.com/");
		//	driver.navigate().refresh();
			
			driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
			//sendKeys() for putting/writing in any field (e.g. email/password field) 
			driver.findElement(By.xpath("(//*[@name='email'])[1]")).sendKeys("rezwanislam857@gmail.com");
			driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Boston2023");
			driver.findElement(By.xpath("(//button[@class='btn btn-default'])[1]")).click();
			
			
			
		}
}
