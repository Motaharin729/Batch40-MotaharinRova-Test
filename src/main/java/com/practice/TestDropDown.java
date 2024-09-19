package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.pagefactory.MasterPageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDropDown {

	MasterPageFactory mpf;
	public void doDropdown() {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://demoqa.com/select-menu");
	mpf = new MasterPageFactory(driver);
	Select dd = new Select(mpf.getDropdown2());
	//dd.selectByVisibleText("Group 2, option 1");
	dd.selectByVisibleText("Blue");
		
	}
	
	public static void main(String[] args) {
		TestDropDown obj= new TestDropDown();
		obj.doDropdown();
	}
}
