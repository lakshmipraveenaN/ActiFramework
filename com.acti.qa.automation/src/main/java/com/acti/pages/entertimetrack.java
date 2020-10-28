package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class entertimetrack extends DriverScript {
	public entertimetrack()
	{
		PageFactory.initElements(driver, this);
	}
	
//**************************object repositary/page repositary**********************************//
@FindBy(id="logoutLink")WebElement logoutbtn;
@FindBy(linkText="Tasks")WebElement taskmenu;

//***************************actions/methods******************************************//
public void clicklogoutbtn()
{
	logoutbtn.click();
}
public void clicktaskmenu()
{
	taskmenu.click();
}
}
