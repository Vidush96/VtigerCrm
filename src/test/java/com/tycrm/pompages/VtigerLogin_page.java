package com.tycrm.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.tycrm.generic.BasePage;
import com.tycrm.generic.Filelib;

/**
 * @author Vidush
 *
 */
public class VtigerLogin_page extends BasePage
{ 
	/**
	 * Locating element
	 */
	Filelib flb=new Filelib();
	@FindBy(xpath = "//input[@name='user_name']")
	private WebElement uname;
	
	@FindBy(name="user_password")
	private WebElement Pwd;
	
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
		uname.sendKeys(flb.getCrm_UserName());
	}
	public void setpassword()
	{
		Pwd.sendKeys(flb.getCrm_Password());
	}
	public void clicksubmit()
	{
		submit.click();
	}
}
