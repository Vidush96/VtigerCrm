package com.tycrm.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tycrm.generic.BasePage;

public class Create_newCon_page extends BasePage
{
	@FindBy(name = "firstname")
	private WebElement fname;
	
	@FindBy(name = "salutationtype")
	private WebElement honorific;
	
	@FindBy(name = "lastname")
	private WebElement lname;
	
	@FindBy(xpath = "(//img[@title='Select'])[1]")
	private WebElement orgname;
	
	public Create_newCon_page(WebDriver driver) 
	{
		super(driver);
	}
	
	public void setfirstname()
	{
		fname.sendKeys(GenRandom());
	}
	public void sethonorific()
	{
		dropdown(honorific).selectByValue("Mr.");
	}
	public void setlastname()
	{
		lname.sendKeys(GenRandom());
	}
	public void clickorgname()
	{
		orgname.click();
	}
}
