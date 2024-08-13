package com.vtiger.pages;

import com.aventstack.extentreports.ExtentTest;
import com.vtiger.utilities.PageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends PageActions {
	

	
	public LoginPage(WebDriver driver, ExtentTest logger)
	{
		super(driver, logger);
		PageFactory.initElements(driver, this);

	}
	
    //	private String uid = "user_name"; // way1 - so less code writting directing using the code low maintaince
    //	By uid = By.name("user_name");   way2
	
	
	@FindBy(name="user_name")
	WebElement tb_uid;
	
	@FindBy(name="user_password")
	WebElement tb_password;
	
	@FindBy(name="login_theme")
	WebElement dp_theme;
	
	@FindBy(name="Login")
	WebElement bt_login;
	
	
	
	public void login(String userid, String pwd)  
	{
	setInput(tb_uid,userid,userid+" has been entered into username field");
	setInput(tb_password,pwd,pwd+" has been entered into password field");
	clickElement(bt_login,"Login button clicked");
	}
	
	public void login(String userid, String pwd, String Them)  
	{
		setInput(tb_uid,userid,userid+" has been entered into username field");
		setInput(tb_password,pwd,pwd+" has been entered into password field");
		setInput(dp_theme,Them,Them+"has been selected from the dropdown");
		clickElement(bt_login,"Login button clicked");
	}

}
