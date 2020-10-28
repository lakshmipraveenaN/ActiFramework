package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class tasklist extends DriverScript {
	public tasklist()
	{
		PageFactory.initElements(driver, this);
	}
	
	//*********************************************************************//
	@FindBy(xpath="//div[@class='title ellipsis']")WebElement addnewtb;
	@FindBy(xpath="//div[@class='item createNewCustomer']")WebElement addcusttab;
	@FindBy(xpath="//div[@class='nameDuplicateError inlineErrorMessage leftInlineErrorMessage']")WebElement custnametab;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")WebElement custdestab;
	@FindBy(xpath="//div[contains(text(),'Create Customer')]")WebElement createcustbtn; 
}
