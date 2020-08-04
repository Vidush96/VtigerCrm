package com.tycrm.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tycrm.generic.BasePage;

/**
 * @author hp
 *used to find elements in contatcs page
 */
public class Adminstrator_Contacts_Page extends BasePage
{
	@FindBy(xpath = "//img[@title='Create Contact...']")
	private WebElement createcontact;
	
	public Adminstrator_Contacts_Page(WebDriver driver) 
	{
		super(driver);
	}
	
	public void click_Create()
	{
		createcontact.click();
	}
}
