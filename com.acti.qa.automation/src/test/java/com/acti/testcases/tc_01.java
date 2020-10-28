package com.acti.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acti.base.DriverScript;
import com.acti.pages.loginpage;



public class tc_01  extends DriverScript {
	loginpage lp;
	public tc_01()
	{
		super();
	}

	
@BeforeMethod
public void pretest()
{
	
		initBrowser();
	lp = new loginpage();
}


@AfterMethod
public void posttest()
{
	driver.close();
}
@Test(priority=1)
public void verifytitle()
{
	String tit = lp.verifytitle();
	System.out.println(tit);
}
@Test(priority=2)
public void validatelogodisplayed()
{
	boolean res = lp.verifylogodisplayed();
	System.out.println(res);
}
@Test(priority=3)
public void validatelogin() throws Exception
{
	lp.validatelogin("trainee", "trainee");
	Thread.sleep(2000);
}
}

