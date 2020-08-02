package com.tycrm.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tycrm.generic.BasePage;

/**
 * @author hp
 *
 */
public class Create_neworg_Page extends BasePage
{
	public Create_neworg_Page(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath = "//img[@title='Select']")
	private WebElement selectorg;
	
	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement Orgname;
	
	@FindBy(xpath = "(//input[@class='crmbutton small save'])[1]")
	private WebElement save;
	
	public void clickselectorg()
	{
		selectorg.click();
	}
	public void set_Org_name()
	{
		Orgname.sendKeys(GenRandom());
	}
	public void clickSave()
	{
		save.click();
	}
}
