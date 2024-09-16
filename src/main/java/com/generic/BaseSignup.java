package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseSignup {

	public void usersignup() {
	
		// user signup 
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.automationexercise.com/");
		driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();
		driver.findElement(By.xpath("//*[@name='name']")).sendKeys("MR");
		driver.findElement(By.xpath("(//*[@name='email'])[2]")).sendKeys("mr123@gmail.com");
		driver.findElement(By.xpath("(//*[@class='btn btn-default'])[2]")).click();
		
		
	}
}
