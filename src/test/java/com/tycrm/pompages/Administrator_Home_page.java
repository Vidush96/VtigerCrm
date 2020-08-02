package com.tycrm.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tycrm.generic.BasePage;

/**
 * @author hp
 *
 */
public class Administrator_Home_page extends BasePage
{
	@FindBy(linkText="Organizations")
	private WebElement Organizations;
	
	@FindBy(linkText = "Contacts")
	private WebElement Contacts;
	
	@FindBy(xpath = "(//td[@class='small'])[2]")
	private WebElement accountsicon;
	
	@FindBy(linkText = "Sign Out")
	private WebElement Signout;
	
	public Administrator_Home_page(WebDriver driver)
	{
		super(driver);
	}
	
	public void clickOrganizations()
	{
		Organizations.click();
	}
	public void clickContacts()
	{
		Contacts.click();
	}
	public void mousehower_on_accountsicon()
	{
		mousehower(accountsicon);
	}
	public void clicksignout()
	{
		Signout.click();
	}
}
