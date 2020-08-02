package com.tycrm.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tycrm.generic.BasePage;

/**
 * @author Vidush
 *
 */
public class VtigerLogin_page extends BasePage
{ 
	/**
	 * Locating element
	 */
	@FindBy(name="user_name")
	private WebElement username;
	
	@FindBy(name="user_password")
	private WebElement Password;
	
	@FindBy(id="submitButton")
	private WebElement submit;
	
	/**
	 * 
	 * @param driver
	 */
	public VtigerLogin_page(WebDriver driver) 
	{
		super(driver);
	}
	public void setUsername()
	{
		username.sendKeys(flb.getCrm_UserName());
	}
	public void setpassword()
	{
		Password.sendKeys(flb.getCrm_Password());
	}
	public void clicksubmit()
	{
		submit.click();
	}
}
