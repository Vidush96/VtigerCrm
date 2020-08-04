package com.tycrm.generic;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * @author hp
 *
 */
public class BasePage
{
	public WebDriver driver;
	public Filelib flb = new Filelib();
	/**
	 * Initialize page object
	 * @param driver
	 */
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/**
	 * generate random string value
	 * @return string value
	 */
	public String GenRandom()
	{
		return RandomStringUtils.random(30, true,true);
	}
	/**
	 * perform mouse hower action on element
	 * @param target
	 */
	public void mousehower(WebElement target)
	{
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
	}
	
	public Select dropdown(WebElement element)
	{
		Select ddwnobj = new Select(element);
		return ddwnobj;
	}
	
	public void childbrowser()
	{
	}
}
