package com.acti.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DriverScript {
	
	public static WebDriver driver;
	public static Properties prop;
		
	public DriverScript()
	{
		try
		{
			prop=new Properties();
			 File src = new File("./acti.configeration/config.properties");
			FileInputStream fis = new FileInputStream(src);
			prop.load(fis);
			
		}
	
			catch(Exception e)
			{
				System.out.println("file not found"  + e.getMessage());
			}
	}
		@Test
		public static void initBrowser()
		{
		String brow = prop.getProperty("browser");
		if(brow.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "./acti.browser/chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if((brow.equalsIgnoreCase("firefox")))
		{
			System.setProperty("webdriver.gecko.driver", "./acti.browser/geckodriver.exe");
			driver=new FirefoxDriver();	
		}
		else{
			System.out.println("no proper browser specified");
	}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String url = prop.getProperty("qaurl");
	driver.get(url);

	}
}

	
	
	
	
	



