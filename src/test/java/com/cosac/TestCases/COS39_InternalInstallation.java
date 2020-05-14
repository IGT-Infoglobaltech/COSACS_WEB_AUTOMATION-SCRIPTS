package com.cosac.TestCases;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;

public class COS39_InternalInstallation extends BaseClass {
	
	String ParameterValue = "[[W300479";
	String AddressLine2 = "SPRINGFILED DISTRICT";
	String ItemSearchVal = "J3245SP";
	
	@Test
	public void InternalInstallation() throws Throwable {
	
		try {
			
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.InternalInstallation.Service);
			Library.Interaction.print("User Clicked on Service");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.InternalInstallation.NewServReq);
			Library.Interaction.print("User Clicked on New Service Request");
			Library.Interaction.userWait();
			String ServReqTitle = driver.findElement(By.xpath(Xpath.InternalInstallation.ServReqTitle)).getText();
			log.info("The Title is "+ServReqTitle);
			log.info("User is in Service Request Page");

		} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "InternalInstallation");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}

	@Test(dependsOnMethods = "InternalInstallation")
	
	public void InternalInstallationServices() throws IOException {
		try {
			
			//Clicking on the Radio Button
			Library.Interaction.click(Xpath.InternalInstallation.InternalInstallRB);
			Thread.sleep(2000);
			
			//clicking on drop down
			Library.Interaction.click(Xpath.InternalInstallation.SrchParameter);
			
			//Clicking on values from drop down
			Library.Interaction.click(Xpath.InternalInstallation.ParameterVal);
			
			//Entering the value in the text box
			Library.Interaction.setTextBoxByXpath(Xpath.InternalInstallation.ParamaterValTxtBox, ParameterValue);
			
			//Clicking on Create Button 
			Library.Interaction.click(Xpath.InternalInstallation.ServReqCreateBtn);
			Thread.sleep(2000);
			
			//Clicking on Select Button
			Library.Interaction.click(Xpath.InternalInstallation.SelectBtn);
			Thread.sleep(2000);
			
			//Entering the Address in the field
			Library.Interaction.setTextBoxByXpath(Xpath.InternalInstallation.AddressLine2, AddressLine2);
			
			//Selecting the Manufacturer Value 
			Library.Interaction.click(Xpath.InternalInstallation.Manufacturer);
			Library.Interaction.click(Xpath.InternalInstallation.ManufactureVal);
			
			//Clicking on the save Button 
			Library.Interaction.click(Xpath.InternalInstallation.SaveBtn);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "ServiceRepairs");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}
}
