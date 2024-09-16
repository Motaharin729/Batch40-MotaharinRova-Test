package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.pagefactory.MasterPageFactory;
import com.util.BaseConfig;
import com.util.Highlighter;
import com.util.Screenshot;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	MasterPageFactory mpf;
	public void getLogin() {
		
		WebDriverManager.chromedriver().setup();  
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.navigate().to(BaseConfig.getConfigValue("Prod-URL"));

		mpf = new MasterPageFactory(driver);
		// highlight the login button
		Highlighter.addColor(driver, mpf.getSigninbtn_homepage());
		// signin button clicking
		mpf.getSigninbtn_homepage().click();
		
		//Highlight the email
		Highlighter.addColor(driver, mpf.getEmail_signin());
		//sendKeys() for putting/writing in any field (e.g. email/password field) 
		mpf.getEmail_signin().sendKeys(BaseConfig.getConfigValue("Email"));
		
		//highlight password field
		Highlighter.addColor(driver, mpf.getPassword_signin());
		mpf.getPassword_signin().sendKeys(BaseConfig.getConfigValue("Password"));
		
		//highlight the login button
		Highlighter.addColor(driver, mpf.getLogin_btn());
		// clicking login
		mpf.getLogin_btn().click();
		if(mpf.getLogout().isDisplayed())
		{
			System.out.println("login successful");
		}else {
			System.out.println("login failed");
		}
		Screenshot.getScreenShot(driver, "Homepage-login-successful");
		driver.quit();    // close the driver and whole browser
		
	}
}
