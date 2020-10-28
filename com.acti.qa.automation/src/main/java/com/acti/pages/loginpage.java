package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class loginpage extends DriverScript
{
	@FindBy(id="username") WebElement usernametb;
	@FindBy(name="pwd")WebElement pwdtab;
	@FindBy(id="loginButton")WebElement loginbtn;
	@FindBy(xpath="//div[@class='atLogoImg']")WebElement actilogo;

//*********************************************************************//
public loginpage()
{
	PageFactory.initElements(driver, this);
}


//***************************************************************//
public String verifytitle()
{
	return driver.getTitle();
}
public boolean verifylogodisplayed()
{
	return actilogo.isDisplayed();
}
	public void validatelogin(String un, String pwd)
	{
		usernametb.sendKeys(un);
		pwdtab.sendKeys(pwd);
		loginbtn.click();
				
		
	}
}
