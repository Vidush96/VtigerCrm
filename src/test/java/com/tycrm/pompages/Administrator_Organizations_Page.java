package com.tycrm.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tycrm.generic.BasePage;

/**
 * @author hp
 *
 */
public class Administrator_Organizations_Page extends BasePage
{
	public Administrator_Organizations_Page(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createorg;
	
	public void clickCreateOrg()
	{
		createorg.click();
	}
}
