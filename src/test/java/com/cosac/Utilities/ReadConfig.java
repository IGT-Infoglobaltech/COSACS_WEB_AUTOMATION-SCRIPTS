package com.cosac.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{
	Properties pro;
	
	public ReadConfig()
	{
		File src=new File("./Configuration/config.properties");
		
		try 
		{
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
			
		} catch (Exception e) 
		{
			System.out.println("Exeption is: "+e.getMessage());
		}
	}
	
	public String getURL()
	{
		String baseurl=pro.getProperty("url");
		return baseurl;
		
	}
	
	public String getUsername()
	{
		String uname=pro.getProperty("userName");
		return uname;
		
	}
	
	public String getPassword()
	{
		String pass=pro.getProperty("passWord");
		return pass;
		
	}
	
	public String getChromePath()
	{
		String chromepath=pro.getProperty("chromePath");
		return chromepath;
		
	}
	
	public String getIePath()
	{
		String iepath=pro.getProperty("iePath");
		return iepath;
		
	}

}
