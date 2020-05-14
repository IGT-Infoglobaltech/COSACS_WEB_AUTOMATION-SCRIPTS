/**
* Project Name : COSAC

* Author : Chidanand

* Version : 10.5.2.2124

* Reviewed By : Vivek Bharti

* Date of Creation : Jan 16, 2020

* Modification History :

* Date of change : 

* Version : V1.1

* changed function :

* change description :

* Modified By : 

*/


//User should be able to Create Location under Merchandising and able  to validate Location Search with all mandatory data.
package com.cosac.TestCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Name;
import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;
import com.cosac.Utilities.JsonParser;

public class COS01_LocationCreation extends BaseClass {
	
	
	//User Login with valid credentials
	@Test
	public  void location() throws IOException {
		try {
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.LocationCreation.merchandising);
			Library.Interaction.print("User Clicked on Merchandising");
			Library.Interaction.userWait();
			Library.Interaction.moveToElement(Xpath.LocationCreation.create);
			Library.Interaction.print("User Clicked on Create");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.LocationCreation.location);
			Library.Interaction.print("User Clicked on Location");
			String createLocationLabel = driver.findElement(By.xpath(Xpath.LocationCreation.verifyLocationPage)).getText();
			Assert.assertEquals(createLocationLabel,JsonParser.getLocation_Data("locationData.cos01.ExpectedLabel"));
			log.info("User verified Create Location PageLabel Successfully");
            log.info("User is in Create Location Page");
			} 
		catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "location");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
     }

	//User need to fill the Location CreationForm
	@Test(dependsOnMethods="location")
	public void createLocationForm() throws IOException {
		try {
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.LocationCreation.locationID,JsonParser.getLocation_Data("locationData.cos01.LocationId"));
			Library.Interaction.print("User has successfully entered text Location ID");
			Library.Interaction.setTextBoxByName(Name.LocationCreation.salesSystemID,JsonParser.getLocation_Data("locationData.cos01.SalesSystemId"));
			Library.Interaction.print("User is able to enter text to 'Sales System ID'");
			Library.Interaction.setTextBoxByName(Name.LocationCreation.Name,JsonParser.getLocation_Data("locationData.cos01.Name"));
			Library.Interaction.selectAndSerachEle(Xpath.LocationCreation.fascia,Xpath.LocationCreation.fasciaSerch,Xpath.LocationCreation.fasciaName,"Cou");
			Library.Interaction.print("User is able to select 'Facia'");
			Library.Interaction.selectAndSerachEle(Xpath.LocationCreation.StoreType,Xpath.LocationCreation.StoreTypeSearch,Xpath.LocationCreation.StoteName,"All Cou");
			Library.Interaction.print("User is able to select 'Store Type'");
			Library.Interaction.click(Xpath.LocationCreation.Warehouse_checkbox);
			Library.Interaction.print("User has selected 'Store Type' successfully");
			Library.Interaction.click(Xpath.LocationCreation.Virtual_checkbox);
			Library.Interaction.print("User has Clicked on 'Virtual checkBox' successfully");
			Library.Interaction.click(Xpath.LocationCreation.Active_checkbox);
			Library.Interaction.print("User has Clicked on 'Active checkBox' successfully");
			Library.Interaction.setTextBoxByXpath(Xpath.LocationCreation.addressLine1, JsonParser.getLocation_Data("locationData.cos01.AddressLine1"));
			Library.Interaction.print("User has Entered the Address in addressLine1 successfully");
			Library.Interaction.setTextBoxByXpath(Xpath.LocationCreation.addressLine2, JsonParser.getLocation_Data("locationData.cos01.AddressLine2"));
			Library.Interaction.print("User has Entered the Address in addressLine2 successfully");
			Library.Interaction.setTextBoxByXpath(Xpath.LocationCreation.City, JsonParser.getLocation_Data("locationData.cos01.City"));
			Library.Interaction.print("User has Entered the City successfully");
			Library.Interaction.setTextBoxByXpath(Xpath.LocationCreation.PostCode, JsonParser.getLocation_Data("locationData.cos01.PostalCode"));
			Library.Interaction.print("User has Entered the Postal code successfully");
			Library.Interaction.scrollDown(Xpath.LocationCreation.SaveBTN);
			Library.Interaction.selectSuggestions(Xpath.LocationCreation.Contact_arrowMark, Xpath.LocationCreation.Contact_Search, Xpath.LocationCreation.SelectSuggestion,  JsonParser.getLocation_Data("locationData.cos01.ContactSearch"),  JsonParser.getLocation_Data("locationData.cos01.ContactSelect"));
			Library.Interaction.print("User has Selected the Contact Type successfully");
			Library.Interaction.setTextBoxByXpath(Xpath.LocationCreation.Contact_Value,JsonParser.getLocation_Data("locationData.cos01.ContactDeatils"));
			Library.Interaction.print("User has Entered the Contact Type successfully");
			Library.Interaction.click(Xpath.LocationCreation.AddBTN);
			Library.Interaction.print("User has clicked on addBTN successfully");
			log.info("User Filled the Location Creation form successfully");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.LocationCreation.SaveBTN);
			Library.Interaction.print("User has clicked on SaveBTN successfully");
			Thread.sleep(3000);
			String SuccessMessage=Library.Interaction.verifyToastMessage(Xpath.LocationCreation.Message_catch);
			Library.Interaction.print("Toast Message is --->" + SuccessMessage);
			log.info("Location Creation Message-->"+ SuccessMessage);
			Assert.assertEquals(SuccessMessage, JsonParser.getLocation_Data("locationData.cos01.UserInfoMessage"));
			Library.Interaction.scrollUp(Xpath.LocationCreation.verifyLocationPage);
			Library.Interaction.click(Xpath.LocationCreation.MessageClick);
			String LocationValue = driver.findElement(By.xpath(Xpath.LocationCreation.LocatinValueID)).getText().replaceAll("[^0-9]", "");
			System.out.println("LocationValue--->"+LocationValue);
			Assert.assertEquals(LocationValue, JsonParser.getLocation_Data("locationData.cos01.LocationId"));
			log.info("User validated Locationvalue successfully-->"+LocationValue);
			
			log.info("User is able to Create Location successfully");
		} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "createLocationForm");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
    }
	
	//User need to Validate the Location 
	@Test(dependsOnMethods={"createLocationForm"})
	public void search_Location() throws IOException {
		try {
			Thread.sleep(2000);
			Library.Interaction.click(Xpath.LocationCreation.merchandising);
			Library.Interaction.print("User Clicked on Merchandising");
			Library.Interaction.userWait();	
			Library.Interaction.moveToElement(Xpath.LocationSearch.SearchMenu);;
			Library.Interaction.print("User Clicked on SearchMenu");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.LocationSearch.Locations);
			Library.Interaction.print("User Clicked on Locations");
			String Location_Pageheading = driver.findElement(By.xpath(Xpath.LocationSearch.Location_Pageheading)).getText().replaceAll("[^0-9]", "");
			System.out.println("Location_Pageheading-->"+Location_Pageheading);
			Assert.assertEquals(Location_Pageheading, JsonParser.getLocation_Data("locationData.cos01.LocationId"));
			log.info("User is in Location Search Page");
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.LocationSearch.SearchLocation, JsonParser.getLocation_Data("locationData.cos01.LocationId"));
			Library.Interaction.print("User has entered text in search field successfully");
			Thread.sleep(5000);
			String Location_ID = driver.findElement(By.xpath(Xpath.LocationSearch.LocationId)).getText();
			System.out.println("Location_ID-->"+Location_ID);
			Assert.assertEquals(Location_ID,JsonParser.getLocation_Data("locationData.cos01.LocationId"));
			Library.Interaction.print("User has Validated LocationID successfully");
			String Location_Name = driver.findElement(By.xpath(Xpath.LocationSearch.LocationName)).getText();
			log.info("User Validated LocationName successfully-->"+Location_Name);
			Assert.assertEquals(Location_Name,JsonParser.getLocation_Data("locationData.cos01.Name"));
			Library.Interaction.print("User has Validated LocationName successfully");
			String SystemId = driver.findElement(By.xpath(Xpath.LocationSearch.SystemId)).getText().trim();
			Assert.assertEquals(SystemId,JsonParser.getLocation_Data("locationData.cos01.SalesSystemId"));
			log.info("User  Validated Sales SystemId successfully-->"+SystemId);
			String warehouse=Library.Interaction.getelementText(Xpath.LocationSearch.Warehouse);
			Assert.assertEquals(warehouse,JsonParser.getLocation_Data("locationData.cos01.Warehouse"));
			log.info("User  Validated warehouse Status successfully-->"+warehouse);
			String Active=Library.Interaction.getelementText(Xpath.LocationSearch.Active);
			Assert.assertEquals(Active,JsonParser.getLocation_Data("locationData.cos01.Active"));
			log.info("User  Validated Active Status successfully-->"+Active);
			String Virtual=Library.Interaction.getelementText(Xpath.LocationSearch.Virtual);
			Assert.assertEquals(Virtual,JsonParser.getLocation_Data("locationData.cos01.Virtual"));
			log.info("User  Validated Virtual Status successfully-->"+Virtual);
			log.info("User successfully Validated Location Search ");
			
		} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "createLocationForm");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}
}
