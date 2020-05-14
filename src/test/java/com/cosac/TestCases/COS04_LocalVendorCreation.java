/**

* Project Name : COSAC

* Author : Chidanand

* Version : 10.5.2.2124

* Reviewed By : Vivek Bharti

* Date of Creation : Jan 12, 2020

* Modification History :

* Date of change : 

* Version : V1.1

* changed function :

* change description :

* Modified By : 

*/


package com.cosac.TestCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;
import com.cosac.Utilities.JsonParser;

public class COS04_LocalVendorCreation extends BaseClass{
	

/*	@Test
	public void Local_Vendor() throws IOException {

		try {
			Library.Interaction.userWait();
			boolean flag = driver.findElement(By.xpath(Xpath.LoginPage.Logo)).isDisplayed();
			Assert.assertTrue(flag);
			log.info("User verified Company Logo successfully");
			String title = driver.getTitle();
			Assert.assertEquals(title,JsonParser.getVendorData("vendordata.cos04.Title"));
			log.info("User verified HomePage Title successfully");
			Library.Interaction.click(Xpath.Vendor_Creation.merchandising);
			Library.Interaction.print("User Clicked on Merchandising");
			Library.Interaction.userWait();
			Library.Interaction.moveToElement(Xpath.Vendor_Creation.create);
			Library.Interaction.print("User Clicked on Create");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.Vendor_Creation.vendor);
			Library.Interaction.print("User Clicked on Vendor");
			String create_VendorLabel = driver.findElement(By.xpath(Xpath.Vendor_Creation.Verify_VendorPage)).getText();
			Assert.assertEquals(create_VendorLabel, JsonParser.getVendorData("vendordata.cos04.Expectedcreate_VendorLabel"));
			log.info("User verified Create Location PageLabel Successfully");
			
			log.info("User is in Create Vendor Page");
		} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "vendor");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}*/

	@Test
	public void createLocal_VendorForm() throws IOException {
		try {

			Library.Interaction.userWait();
			boolean flag = driver.findElement(By.xpath(Xpath.LoginPage.Logo)).isDisplayed();
			Assert.assertTrue(flag);
			log.info("User verified Company Logo successfully");
			String title = driver.getTitle();
			Assert.assertEquals(title,JsonParser.getVendorData("vendordata.cos04.Title"));
			log.info("User verified HomePage Title successfully");
			Library.Interaction.click(Xpath.Vendor_Creation.merchandising);
			Library.Interaction.print("User Clicked on Merchandising");
			Library.Interaction.userWait();
			Library.Interaction.moveToElement(Xpath.Vendor_Creation.create);
			Library.Interaction.print("User Clicked on Create");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.Vendor_Creation.vendor);
			Library.Interaction.print("User Clicked on Vendor");
			String create_VendorLabel = driver.findElement(By.xpath(Xpath.Vendor_Creation.Verify_VendorPage)).getText();
			Assert.assertEquals(create_VendorLabel, JsonParser.getVendorData("vendordata.cos04.Expectedcreate_VendorLabel"));
			log.info("User verified Create Location PageLabel Successfully");
			
			Library.Interaction.setTextBoxByXpath(Xpath.Vendor_Creation.vendorCode, JsonParser.getVendorData("vendordata.cos04.vendorcode"));
			Library.Interaction.print("User is able to enter text to 'vendorcode field'");
			Library.Interaction.setTextBoxByXpath(Xpath.Vendor_Creation.vendorName, JsonParser.getVendorData("vendordata.cos04.vendorName"));
			Library.Interaction.print("User is able to enter text to 'vendorName field'");
			Library.Interaction.selectEleByText(Xpath.Vendor_Creation.SelectVendor,JsonParser.getVendorData("vendordata.cos04.eleText"));
			Library.Interaction.print("User is able to select Local vendor");
			Library.Interaction.setTextBoxByXpath(Xpath.Vendor_Creation.AddressLine1, JsonParser.getVendorData("vendordata.cos04.AddressLine1"));
			Library.Interaction.print("User is able to Enter text in addressline1");
			Library.Interaction.setTextBoxByXpath(Xpath.Vendor_Creation.City, JsonParser.getVendorData("vendordata.cos04.City"));
			Library.Interaction.print("User is able to Enter text in City");
			Library.Interaction.setTextBoxByXpath(Xpath.Vendor_Creation.State, JsonParser.getVendorData("vendordata.cos04.State"));
			Library.Interaction.print("User is able to Enter text in State");
			Library.Interaction.setTextBoxByXpath(Xpath.Vendor_Creation.postcode, JsonParser.getVendorData("vendordata.cos04.Postcode"));
			Library.Interaction.print("User is able to Enter text in Pincode");
			Library.Interaction.setTextBoxByXpath(Xpath.Vendor_Creation.countryCode,JsonParser.getVendorData("vendordata.cos04.IsoCode"));
			Library.Interaction.print("User is able to Enter text in IsoCode");
			Library.Interaction.selectEleByText(Xpath.Vendor_Creation.Currency, JsonParser.getVendorData("vendordata.cos04.Currency"));
			Library.Interaction.print("User is able to select Currency");
			Library.Interaction.selectEleByText(Xpath.Vendor_Creation.Status, JsonParser.getVendorData("vendordata.cos04.Status"));
			Library.Interaction.print("User  selected the  Status successfully");
			Library.Interaction.setTextBoxByXpath(Xpath.Vendor_Creation.PaymentTerms,JsonParser.getVendorData("vendordata.cos04.PaymentTerms"));
			Library.Interaction.print("User entered the  Payment Terms successfully");
			Library.Interaction.setTextBoxByXpath(Xpath.Vendor_Creation.orderEmail, JsonParser.getVendorData("vendordata.cos04.Contact_Email"));
			Library.Interaction.print("User entered the order Email successfully");
			Thread.sleep(2000);
			Library.Interaction.selectSuggestions(Xpath.Vendor_Creation.Contact_ArrowMark,
					Xpath.Vendor_Creation.Enter_ContactType, Xpath.Vendor_Creation.Select_Contact,
					JsonParser.getVendorData("vendordata.cos04.Contact"),JsonParser.getVendorData("vendordata.cos04.ContactEmail"));
			Library.Interaction.print("User  selected the  Contact Email successfully");
			Library.Interaction.setTextBoxByXpath(Xpath.Vendor_Creation.Email_Contact, JsonParser.getVendorData("vendordata.cos04.Contact_Email"));
			Library.Interaction.print("User Entered the Email in contact field successfully");
			Library.Interaction.click(Xpath.Vendor_Creation.PlusMark);
			log.info("User Filled the Local vendor creation form successfully ");
			Library.Interaction.userWait();
			Library.Interaction.scrollDown(Xpath.Vendor_Creation.SaveBTN);
			Library.Interaction.click(Xpath.Vendor_Creation.SaveBTN);
			Library.Interaction.print("User Clicked on Save successfully");
			Thread.sleep(2000);
			String SuccessMessage = Library.Interaction.verifyToastMessage(Xpath.Vendor_Creation.Message_catch);
			Assert.assertEquals(SuccessMessage, JsonParser.getVendorData("vendordata.cos04.VendorMessage"));
			log.info("Caught the Success Message successfully--->"+ SuccessMessage);
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.Vendor_Creation.MessageClick);
			Thread.sleep(2000);
			Library.Interaction.scrollUp(Xpath.Vendor_Creation.AddBTN);
			Thread.sleep(2000);
			Library.Interaction.selectSuggestions(Xpath.Vendor_Creation.AddTag_Text, Xpath.Vendor_Creation.AddTag_Text, Xpath.Vendor_Creation.selectTag, JsonParser.getVendorData("vendordata.cos04.Tag_Search"), JsonParser.getVendorData("vendordata.cos04.TagText"));
			Library.Interaction.print("User selected suggestions tag successfully");
			Library.Interaction.click(Xpath.Vendor_Creation.AddBTN);
			Library.Interaction.print("User  Clicked on addBTN successfully");
			Thread.sleep(2000);
			String TagMessage = Library.Interaction.verifyToastMessage(Xpath.Vendor_Creation.Message_catch);
			log.info("Toast TagMessage is --->" + TagMessage);
			Assert.assertEquals(TagMessage, JsonParser.getVendorData("vendordata.cos04.AddTagMessage"));
			Library.Interaction.click(Xpath.Vendor_Creation.MessageClick);
			String vendor = Library.Interaction.getelementText(Xpath.Vendor_Creation.Verify_VendorPage);
			String text = "";
			String[] str1 = vendor.split(" ");
			for (int i = 0; i < str1.length; i++) {
				if (str1[i].equals("-")) {
					text = str1[i + 1]+" "+str1[i + 2]+" "+str1[i + 3];
					break;
				}
			}
			System.out.println("Assrtion text-->"+text);
			Assert.assertEquals(text, JsonParser.getVendorData("vendordata.cos04.vendorName"));
			log.info("User successfully validated vendorName");
			
			log.info("User is able to Create Local vendor");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "createLocal_VendorForm");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}
	
	@Test(dependsOnMethods = "createLocal_VendorForm")
	public void vendor_Search() throws Exception{
		try {

			Library.Interaction.click(Xpath.Vendor_Creation.merchandising);
			Library.Interaction.print("User has Clicked on merchandising successfully");
			Library.Interaction.moveToElement(Xpath.Vendor_Search.SearchMenu);
			Library.Interaction.print("User able to Mouse hover on SearchMenu successfully");
			Library.Interaction.click(Xpath.Vendor_Search.VendorSearch);
			Library.Interaction.print("User Clicked on VendorSearch successfully");
			Thread.sleep(3000);
			String VendorCoricom = Library.Interaction.getelementText(Xpath.Vendor_Search.VendorSearch_Pageheading);
			Assert.assertEquals(VendorCoricom, JsonParser.getVendorData("vendordata.cos04.Vendorsearch_label"));
			log.info("User is in Vendor searchPage ");
			Library.Interaction.setTextBoxByXpath(Xpath.Vendor_Search.VendorSearchField, JsonParser.getVendorData("vendordata.cos04.vendorName"));
			Thread.sleep(3000);
			String VendorCodesearch = driver.findElement(By.xpath(Xpath.Vendor_Search.VendorCode)).getText();
			log.info("VendorCode-->" + VendorCodesearch);
			Assert.assertEquals(VendorCodesearch, JsonParser.getVendorData("vendordata.cos04.vendorcode"));
			String VendorNamesearch = driver.findElement(By.xpath(Xpath.Vendor_Search.VendorName)).getText();
			log.info("VendorName-->" + VendorNamesearch);
			Assert.assertEquals(VendorNamesearch, JsonParser.getVendorData("vendordata.cos04.vendorName"));
			String Vendortype = Library.Interaction.getelementText(Xpath.Vendor_Search.VendorType);
			Assert.assertEquals(Vendortype, JsonParser.getVendorData("vendordata.cos04.eleText"));
			log.info("Vendortype-->" + Vendortype);
			String VendorStatus = Library.Interaction.getelementText(Xpath.Vendor_Search.VendorStatus);
			Assert.assertEquals(VendorStatus, JsonParser.getVendorData("vendordata.cos04.Status"));
			log.info("VendorStatus-->" + VendorStatus);
			String VendorTag = Library.Interaction.getelementText(Xpath.Vendor_Search.VendorTag);
			Assert.assertEquals(VendorTag, JsonParser.getVendorData("vendordata.cos04.TagText"));
			System.out.println("VendorTag-->" + VendorTag);
			log.info("User successfully Validated Local_Vendor Search");
		
		} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "vendor_Search");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}
}
