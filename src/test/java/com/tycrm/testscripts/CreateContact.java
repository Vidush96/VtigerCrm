package com.tycrm.testscripts;

import java.util.Set;

import org.testng.annotations.Test;

import com.tycrm.generic.GenericTest;
import com.tycrm.pompages.Administrator_Home_page;
import com.tycrm.pompages.Adminstrator_Contacts_Page;
import com.tycrm.pompages.Create_newCon_page;
import com.tycrm.pompages.VtigerLogin_page;

/**
 * @author hp
 *
 */
public class CreateContact extends GenericTest
{
	@Test
	public void Createcontact()
	{
		VtigerLogin_page login = new VtigerLogin_page(driver);
		Administrator_Home_page home = new Administrator_Home_page(driver);
		Adminstrator_Contacts_Page conobj = new Adminstrator_Contacts_Page(driver);
		Create_newCon_page newcon = new Create_newCon_page(driver);
		
		login.setUsername();
		login.setpassword();
		login.clicksubmit();
		
		home.clickContacts();
		
		conobj.click_Create();
		
		newcon.setfirstname();
		newcon.sethonorific();
		newcon.setlastname();
		newcon.clickorgname();
		System.out.println(driver.getWindowHandle());
		Set<String> win = driver.getWindowHandles();
		System.out.println(win);
	}
}
