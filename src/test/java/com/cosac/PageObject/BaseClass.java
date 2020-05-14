package com.cosac.PageObject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.Utilities.JsonParser;
import com.cosac.Utilities.ReadConfig;



public class BaseClass {
	ReadConfig readconfig = new ReadConfig();

	public static WebDriver driver;
	protected static Logger log;


	@BeforeClass
	@Parameters("browser")
	public void launchChrome(String browser) throws InterruptedException, IOException
	{
		log=Logger.getLogger("cosac");
		PropertyConfigurator.configure("log4j.properties");
		if(browser.equalsIgnoreCase("chrome"))
		{
		
		System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
		driver=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
		
		driver=new FirefoxDriver();

		}
		
		else if(browser.equalsIgnoreCase("ie"))
		{
        
		System.setProperty("webdriver.ie.driver",readconfig.getIePath());
		driver=new InternetExplorerDriver();
			
			
		}
		driver.get(readconfig.getURL());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.findElement(By.xpath(Xpath.LoginPage.userName)).sendKeys( readconfig.getUsername());
		Library.Interaction.print("User has Entered the UserName in UserName field successfully");
		driver.findElement(By.xpath(Xpath.LoginPage.passWord)).sendKeys(readconfig.getPassword());
		Library.Interaction.print("User has Entered the passWord in passWord field successfully");
		driver.findElement(By.xpath(Xpath.LoginPage.logIn)).click();
		Library.Interaction.print("User has Clicked LoginBTN successfully");
	
	}
	
	

	@AfterClass
	public void close() {
		driver.quit();
	}
	

	public static void  captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}

}
