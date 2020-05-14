package com.cosac.TestCases;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
//
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Name;
import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;

public class COS22_CustomerChangedProducts extends BaseClass {
	
	String locationId="123";
	String SalesSystemId="6789";
	String name="Agra";
	String ExpectedcreateLocaLabel="Create Location";

	@Test
	public void Customer() throws IOException {
		try {
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.CustomerChangedProducts.Logistics);
			Library.Interaction.click(Xpath.CustomerChangedProducts.SearchShipments);
			//verify the dot option
			
			Library.Interaction.click(Xpath.CustomerChangedProducts.SelectPicking);
		    	
		    Library.Interaction.selectEleByText(Xpath.CustomerChangedProducts.DeliveryZone, "ABaySout");
		    Library.Interaction.scrollto_Element_Regular(Xpath.CustomerChangedProducts.Dot);
		    Thread.sleep(3000);
			Library.Interaction.click(Xpath.CustomerChangedProducts.Dot);
		    
		
		
		} 
		catch (Exception e) {
			captureScreen(driver, "Customer");
			AssertJUnit.assertFalse(false);
			log.info("Test Failed");
		}
     }

	@Test(dependsOnMethods = "Customer")
	public void CustomerChanged() throws IOException {
		try {
			
			
			
		} 
		catch (Exception e) {
			captureScreen(driver, "CustomerChanged");
			AssertJUnit.assertFalse(false);
			log.info("Test Failed");
		}
    }
}
