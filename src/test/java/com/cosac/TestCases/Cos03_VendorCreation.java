/**

* Project Name : COSAC

* Author : Chidanand

* Version : 10.5.2.2124

* Reviewed By : Vivek Bharti

* Date of Creation : Jan 10, 2020

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

//User should be able to Create Vendor under Merchandising and able  to validate Vendor Search with all mandatory data.
public class Cos03_VendorCreation extends BaseClass {

	String Title = "Cosacs";
	String Expectedcreate_VendorLabel = "Create Vendor";
	String vendorcode = "201944";
	String vendorName = "KGF GOLD TRADERS";
	String eleText = "CARICOM";
	String AddressLine1 = "#233 church steet BANGALORE";
	String City = "BANGALORE";
	String State = "KARNATAKA";
	String Postcode = "586828";
	String IsoCode = "86";
	String Currency = "USD";
	String Status = "Active";
	String PaymentTerms = "30 days";
	String Contact_Email = "Kingston13345@vhj.com";
	String Contact = "Co";
	String ContactEmail = "Contact Email";
	String Tag_Search = "S";
	String TagText = "Supply Spares Only";
	String VendorMessage = "Vendor saved successfully";
	String AddTagMessage = "Vendor tag saved successfully";
	String Vendorsearch_label = "Vendor Search";
	
	
	//User need to fill the CARICOM vendor form

	@Test
	public void create_VendorForm() throws IOException {
		try {
			
			Library.Interaction.userWait();
			boolean flag = driver.findElement(By.xpath(Xpath.LoginPage.Logo)).isDisplayed();
			Assert.assertTrue(flag);
			log.info("User verified Company Logo successfully");
			String title = driver.getTitle();
			Assert.assertEquals(title, Title);
			log.info("User verified Page Title successfully");
			Library.Interaction.click(Xpath.Vendor_Creation.merchandising);
			Library.Interaction.print("User Clicked on Merchandising");
			Library.Interaction.userWait();
			Library.Interaction.moveToElement(Xpath.Vendor_Creation.create);
			Library.Interaction.print("User Clicked on Create");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.Vendor_Creation.vendor);
			Library.Interaction.print("User Clicked on Vendor");
			String create_VendorLabel = driver.findElement(By.xpath(Xpath.Vendor_Creation.Verify_VendorPage)).getText();
			Assert.assertEquals(create_VendorLabel, Expectedcreate_VendorLabel);
			log.info("User verified Vendor Label successfully");
			log.info("User is in Create Vendor Page");
			
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.Vendor_Creation.vendorCode, vendorcode);
			Library.Interaction.print("User is able to enter text to 'vendorcode field'");
			Library.Interaction.setTextBoxByXpath(Xpath.Vendor_Creation.vendorName, vendorName);
			Library.Interaction.print("User is able to enter text to 'vendorName field'");
			Library.Interaction.selectEleByText(Xpath.Vendor_Creation.SelectVendor, eleText);
			Library.Interaction.print("User is able to select Local vendor");
			Library.Interaction.setTextBoxByXpath(Xpath.Vendor_Creation.AddressLine1, AddressLine1);
			Library.Interaction.print("User is able to Enter text in addressline1");
			Library.Interaction.setTextBoxByXpath(Xpath.Vendor_Creation.City, City);
			Library.Interaction.print("User is able to Enter text in City");
			Library.Interaction.setTextBoxByXpath(Xpath.Vendor_Creation.State, State);
			Library.Interaction.print("User is able to Enter text in State");
			Library.Interaction.setTextBoxByXpath(Xpath.Vendor_Creation.postcode, Postcode);
			Library.Interaction.print("User is able to Enter text in Pincode");
			Library.Interaction.setTextBoxByXpath(Xpath.Vendor_Creation.countryCode, IsoCode);
			Library.Interaction.print("User is able to Enter text in IsoCode");
			Library.Interaction.selectEleByText(Xpath.Vendor_Creation.Currency, Currency);
			Library.Interaction.print("User is able to select Currency");
			Library.Interaction.selectEleByText(Xpath.Vendor_Creation.Status, Status);
			Library.Interaction.print("User  selected the  Status successfully");
			Library.Interaction.setTextBoxByXpath(Xpath.Vendor_Creation.PaymentTerms, PaymentTerms);
			Library.Interaction.print("User entered the  Payment Terms successfully");
			Library.Interaction.setTextBoxByXpath(Xpath.Vendor_Creation.orderEmail, Contact_Email);
			Library.Interaction.print("User entered the order Email successfully");
			Library.Interaction.selectSuggestion(Xpath.Vendor_Creation.Contact_ArrowMark,
					Xpath.Vendor_Creation.Enter_ContactType, Xpath.Vendor_Creation.Select_Contact,
					Contact,ContactEmail);
			
			Library.Interaction.print("User  selected the  Contact Email successfully");
			Library.Interaction.setTextBoxByXpath(Xpath.Vendor_Creation.Email_Contact, Contact_Email);
			Library.Interaction.print("User Entered the Email in contact field successfully");
			Library.Interaction.click(Xpath.Vendor_Creation.PlusMark);
			Library.Interaction.print("User Clicked on PlusMark successfully");
			Library.Interaction.userWait();
			Library.Interaction.scrollDown(Xpath.Vendor_Creation.SaveBTN);
			Library.Interaction.click(Xpath.Vendor_Creation.SaveBTN);
			Library.Interaction.print("User Clicked on Save successfully");
			Library.Interaction.userWait();
			String SuccessMessage = Library.Interaction.verifyToastMessage(Xpath.Vendor_Creation.Message_catch);
			System.out.println("Toast Message is --->" + SuccessMessage);
			Assert.assertEquals(VendorMessage, SuccessMessage);
			Library.Interaction.print("Caught the Success Message successfully");
			Thread.sleep(2000);
			Library.Interaction.setTextBoxByXpath(Xpath.Vendor_Creation.AddTag_Text, Tag_Search);
			Library.Interaction.print("User entered text in addtag successfully");
			Library.Interaction.userWait();
			List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@class='typeahead dropdown-menu']/li"));
			for (int i = 0; i < suggestions.size(); i++) {
				System.out.println(suggestions.get(i).getText());
				if (suggestions.get(i).getText().equals(TagText)) {
					Thread.sleep(3000);
					suggestions.get(i).click();
					break;
				}
			}
			Library.Interaction.print("User selected suggestions tag successfully");
			Library.Interaction.click(Xpath.Vendor_Creation.AddBTN);
			Library.Interaction.print("User  Clicked on addBTN successfully");
			Thread.sleep(2000);
			String TagMessage = Library.Interaction.verifyToastMessage(Xpath.Vendor_Creation.Message_catch);
			System.out.println("Toast Message is --->" + TagMessage);
			Assert.assertEquals(AddTagMessage, TagMessage);
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
			Assert.assertEquals(text, vendorName);
			log.info("User is able to Create vendor");
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "createLocal_VendorForm");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}

	@Test(dependsOnMethods = "create_VendorForm")
	public void vendor_Search() throws Exception {
		try {
			Library.Interaction.click(Xpath.Vendor_Creation.merchandising);
			Library.Interaction.print("User has Clicked on merchandising successfully");
			Library.Interaction.moveToElement(Xpath.Vendor_Search.SearchMenu);
			Library.Interaction.print("User able to Mouse hover on SearchMenu successfully");
			Library.Interaction.click(Xpath.Vendor_Search.VendorSearch);
			Library.Interaction.print("User Clicked on VendorSearch successfully");
			Thread.sleep(3000);
			String VendorCoricom = Library.Interaction.getelementText(Xpath.Vendor_Search.VendorSearch_Pageheading);
			Assert.assertEquals(VendorCoricom, Vendorsearch_label);
			Library.Interaction.print("User is in Vendor searchPage ");
			Library.Interaction.setTextBoxByXpath(Xpath.Vendor_Search.VendorSearchField, vendorName);
			Library.Interaction.print("User is able to enter text in vendorSearch field successfully ");
			Thread.sleep(3000);
			String VendorCodesearch = driver.findElement(By.xpath(Xpath.Vendor_Search.VendorCode)).getText();
			System.out.println("VendorCode-->" + VendorCodesearch);
			Assert.assertEquals(VendorCodesearch, vendorcode);
			String VendorNamesearch = driver.findElement(By.xpath(Xpath.Vendor_Search.VendorName)).getText();
			System.out.println("VendorName-->" + VendorNamesearch);
			Assert.assertEquals(VendorNamesearch, vendorName);
			String Vendortype = Library.Interaction.getelementText(Xpath.Vendor_Search.VendorType);
			Assert.assertEquals(Vendortype, eleText);
			System.out.println("Vendortype-->" + Vendortype);
			String VendorStatus = Library.Interaction.getelementText(Xpath.Vendor_Search.VendorStatus);
			Assert.assertEquals(VendorStatus, Status);
			System.out.println("VendorStatus-->" + VendorStatus);
			String VendorTag = Library.Interaction.getelementText(Xpath.Vendor_Search.VendorTag);
			Assert.assertEquals(VendorTag, TagText);
			System.out.println("VendorTag-->" + VendorTag);
			log.info("User has successfully Validated CARICOM_Vendor Search");
		
		} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "vendor_Search");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}
}
