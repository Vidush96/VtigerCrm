package com.tycrm.generic;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

/**
 * @author hp
 *
 */
public class BasePage
{
	public WebDriver driver;
	public Filelib flb = new Filelib();
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void mousehower(WebElement target)
	{
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
	}
	public String GenRandom()
	{
		return RandomStringUtils.random(30, true,true);
	}
}
