package com.tycrm.testscripts;

import org.testng.annotations.Test;

import com.tycrm.generic.GenericTest;
import com.tycrm.pompages.Administrator_Home_page;
import com.tycrm.pompages.Administrator_Organizations_Page;
import com.tycrm.pompages.Create_neworg_Page;
import com.tycrm.pompages.VtigerLogin_page;

/**
 * @author hp
 *
 */
public class CreateOrg extends GenericTest
{
	@Test
	public void createorg()
	{
		VtigerLogin_page login = new VtigerLogin_page(driver);
		Administrator_Home_page home = new Administrator_Home_page(driver);
		Administrator_Organizations_Page org = new Administrator_Organizations_Page(driver);
		Create_neworg_Page neworg = new Create_neworg_Page(driver);
		
		login.setUsername();
		login.setpassword();
		login.clicksubmit();
		
		home.clickOrganizations();
		
		org.clickCreateOrg();
		
		neworg.set_Org_name();
		neworg.clickSave();
	}
}
