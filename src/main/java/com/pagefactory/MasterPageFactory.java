package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements( driver, this);
	}
	
	@FindBy(xpath ="//i[@class='fa fa-lock']")
	private WebElement signinbtn_homepage;
	
	@FindBy(xpath ="(//*[@name='email'])[1]")
	private WebElement email_signin;

	@FindBy(xpath ="//*[@name='password']" )
	private WebElement password_signin;
	
	@FindBy(xpath = "(//button[@class='btn btn-default'])[1]")
	private WebElement login_btn;
	
	@FindBy(xpath = "//*[contains(text(),'Logout')]")
	private WebElement logout;
	
	@FindBy(xpath = "(//*[text()='Services'])[3]")
	private WebElement services;
	
	@FindBy(xpath ="(//*[text()='Bottled Water Delivery'])[2]" ) // have to work on it
	private WebElement bottledWater;
	
	//@FindBy(xpath = "//*[@class=' css-1uccc91-singleValue']")
	@FindBy(xpath = "//*[@id='oldSelectMenu']")
	private WebElement dropdown2;
	
	public WebElement getDropdown2() {
		return dropdown2;
	}

	public WebElement getServices() {
		return services;
	}

	public WebElement getBottledWater() {
		return bottledWater;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getSigninbtn_homepage() {
			return signinbtn_homepage;
	}

	public WebElement getEmail_signin() {
		return email_signin;
	}

	public WebElement getPassword_signin() {
		return password_signin;
	}

	public WebElement getLogin_btn() {
		return login_btn;
	}

	
}
