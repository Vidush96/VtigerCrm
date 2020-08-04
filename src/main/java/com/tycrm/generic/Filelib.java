package com.tycrm.generic;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author Vidush
 *
 */
public class Filelib 
{
	/**
	 * Used to get data from property file
	 * 
	 */
	Properties pojt;
	public Filelib()
	{
		
		try 
		{
			/*step 1: - create java representation object of the physical file*/
			FileInputStream fis = new FileInputStream("./resource/Commondata.properties");
			
			/*step 2: - Using Properties class load all keys to java object*/
			pojt = new Properties();
			pojt.load(fis);
		} 
		catch (Throwable e) 
		{
			System.out.println("File not found");
		}
	}
	/**
	 * Get url from property file
	 * @return url
	 */
	public String getApplicationurl()
	{
		/* Getting value based on key from Property file */
		String url = pojt.getProperty("url");
		if(url==null)
		{
			throw new RuntimeException("Invalid url");
		}
		return url;
	}
	/**
	 * Get crm Username
	 * @return Username
	 */
	public String getCrm_UserName()
	{
		/* Getting value based on key from Property file */
		String Crm_UserName = pojt.getProperty("crm_username");
		if(Crm_UserName==null)
		{
			throw new RuntimeException("Invalid Crm_UserName");
		}
		return Crm_UserName;
	}
	/**
	 * Get crm Password
	 * @return Password
	 */
	public String getCrm_Password()
	{
		/* Getting value based on key from Property file */
		String Crm_Password = pojt.getProperty("crm_password");
		if(Crm_Password==null)
		{
			throw new RuntimeException("Invalid Crm_Password");
		}
		return Crm_Password;
	}
	/**
	 * Wating period
	 * @return Waiting period
	 */
	public long getImplicitwait()
	{
		/* Getting value based on key from Property file */
		String implicitwait = pojt.getProperty("iw");
		if(implicitwait==null)
		{
			throw new RuntimeException("Invalid implicitwait");
		}
		return Long.parseLong(implicitwait);
	}
	public String getbrowser()
	{
		String browsername = pojt.getProperty("browser");
		return browsername;
	}
	
}
