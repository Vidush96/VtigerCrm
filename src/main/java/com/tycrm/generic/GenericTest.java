package com.tycrm.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;

/**
 * @author hp
 *
 */
public class GenericTest
{
	public WebDriver driver;
	private Filelib flb= new Filelib();
	String browser= flb.getbrowser();
	/**
	 * Launch App
	 * @param browser
	 */
	@BeforeMethod
	public void openApp()
	{
		switch (browser) 
		{
		case "chrome":
			driver= new ChromeDriver();
			driver.get(flb.getApplicationurl());
			break;
		case "firefox":
			driver=new FirefoxDriver();
			driver.get(flb.getApplicationurl());
			break;

		default:
			break;
		}
		driver.manage().timeouts().implicitlyWait(flb.getImplicitwait(), TimeUnit.SECONDS);
	}
	/**
	 * Close browser and app
	 */
	@AfterMethod
	public void closeApp()
	{
		//driver.quit();
	}
}
