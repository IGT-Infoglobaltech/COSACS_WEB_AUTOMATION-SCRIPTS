package com.cosac.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;

public class COS05_RegularStock extends BaseClass {
	/*Note:Change SKUnit number every time when creating RegularStockProduct*/
	/*Note:Change Current Effective Date index in Xpath line number 111*/
	String ExpectedPageTitle="Create Regular Stock";
	String SKUnit="CVD0043";
	String POSDesc="LG CD Reader";
	String CorporateUPC="LGDVD2";
	String VendorModelNumber="001";
	String VendorWarranty="12";
	String NoofBoxes="10";
	String LongDesc="LG LASER DVD READER";
	String VendorUPC="060";
	String CountryOfOrigin="JA";
	String PreviousModel="601";
	String Vendor="REGAL WORLDWIDE TRADE";
	String DuplicateProductMsg="  Product SKU must be unique  Another product already exists with the same SKU ";
	String VendorCost="280";
	String LastLandedCost="500";
	String Currency="USD";
	String Fasia="Lucky Dollar";
	String Division="COMPUTER AND OFFICE";
	String Department="COMPUTER AND ACCESSORIES ";
	String Class="DVD PLAYERS";
	String CashPrice="500";
	String RegularPrice="800";
	String DutyFreePrice="400";
	
	
	

	@Test
	public void RegularStock() throws Exception
	{
		try
		{
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.RegularStock.merchandising);
			log.info("User is clicked on Merchandising");
			Library.Interaction.userWait();
			Library.Interaction.moveToElement(Xpath.RegularStock.create);
			log.info("User is clicked on Create");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.RegularStock.regularstock);
			log.info("User clicked on Regularstock");
			String ActualPageTitle = Library.Interaction.verifyPageTitle();
			Assert.assertEquals(ActualPageTitle, ExpectedPageTitle);
			log.info("Page Title is Verified Successfully");
		}
		catch (Exception e) {
			captureScreen(driver, "location");
			Assert.assertFalse(false);
			log.info("Test Failed");
			throw(e);
		}
	}
	@Test(dependsOnMethods = "RegularStock")
	public void CreateRegularStock()throws Exception
	{
		try
		{
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.RegularStock.SKU, SKUnit);
			Library.Interaction.print("User is able to enter text to 'SKU'");
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.RegularStock.POSDescription, POSDesc);
			Library.Interaction.print("User is able to enter text to 'POSDescription'");
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.RegularStock.CorporateUPC, CorporateUPC);
			Library.Interaction.print("User is able to enter text to 'CorporateUPC'");
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.RegularStock.VendorModelNumber, VendorModelNumber);
			Library.Interaction.print("User is able to enter text to 'VendorModelNumber'");
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.RegularStock.VendorWarrenty, VendorWarranty);
			Library.Interaction.print("User is able to enter text to 'VendorWarrenty'");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.RegularStock.Brand);
			Library.Interaction.print("User is able to click on 'Brand'");
			Library.Interaction.userWait();
			Library.Interaction.selectEleByIndex(Xpath.RegularStock.Brand, 5);
			Library.Interaction.print("User is able to select an 'Brand'");
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.RegularStock.NumberOfBoxes,NoofBoxes);
			Library.Interaction.print("User is able to enter text to 'NumberOfBoxes'");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.RegularStock.CorporateStatusCode);
			Library.Interaction.print("User is able to click on 'CorporateStatusCode'");
			Library.Interaction.userWait();
			Library.Interaction.selectEleByValue(Xpath.RegularStock.CorporateStatusCode,"A");
			Library.Interaction.print("User is able to select an 'CorporateStatusCode'");
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.RegularStock.LongDescription, LongDesc);
			Library.Interaction.print("User is able to enter text to 'LongDescription'");
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.RegularStock.VendorUPC,VendorUPC);
			Library.Interaction.print("User is able to enter text to 'VendorUPC'");
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.RegularStock.CountryOfOrigin,CountryOfOrigin);
			Library.Interaction.print("User is able to enter text to 'CountryOfOrigin'");
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.RegularStock.PreviousModel,PreviousModel);
			Library.Interaction.print("User is able to enter text to 'PreviousModel'");
			
			Library.Interaction.userWait();
			Library.Interaction.selectEleVisibleText(Xpath.RegularStock.PrimaryVendor,Xpath.RegularStock.PrimaryVendorSearch , Xpath.RegularStock.PrimaryVendorClick, "REGAL", Vendor);

			Library.Interaction.scrollto_Element(Xpath.RegularStock.SaveBTN);
			Library.Interaction.print("User is able to scroll 'Down'");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.RegularStock.SaveBTN);
			Library.Interaction.print("User is able to click on 'Save Button'");
			Thread.sleep(2000);
			Library.Interaction.userWait();
			String Actual = Library.Interaction.verifyToastMe(Xpath.RegularStock.DuplicateProductMsg);
			if(Actual.equals("  Product SKU must be unique  Another product already exists with the same SKU "))
			{
				log.info("!!!Duplicate Product!!!");
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.RegularStock.DuplicateMsgClose);
			}
			else {
				
			}
			Thread.sleep(2000);
			String ActualSuccesMsg = Library.Interaction.verifyToastMessage(Xpath.RegularStock.SuccessMsg);
			System.out.println("ActualSuccesMsg--->"+ActualSuccesMsg);
			 Assert.assertEquals(ActualSuccesMsg , "Product saved successfully");
			log.info("Product Saved Successfully");
			
							
		}
		catch (Exception e) {
			captureScreen(driver, "location");
			Assert.assertFalse(false);
			log.info("Test Failed");
			throw(e);
		}
	}
	
	@Test(dependsOnMethods = "CreateRegularStock")
	public void ProductDetails() throws Exception
	{
		try
		{
		  Library.Interaction.userWait();
		  String  ActualSKU= Library.Interaction.verifySKU(Xpath.ProductDetails.VerifySKU);
		  Assert.assertEquals(ActualSKU, SKUnit);
		  log.info("SKU is Verified Successfully");
		 
		  
		  //new
		  Library.Interaction.userWait();
		 
		  Library.Interaction.click(Xpath.ProductDetails.PrintPriceTicket);
		  Thread.sleep(2000);
		  String ActualPriceTcktMsg = Library.Interaction.verifyToastMessage(Xpath.ProductDetails.PriceTcktSuccesMsg);
		  Assert.assertEquals(ActualPriceTcktMsg, "Product saved successfully");
		  Thread.sleep(2000);
		  Library.Interaction.click(Xpath.ProductDetails.DuplicateMsgClose);
		  Library.Interaction.print("User checked Print Price Ticket");
		 
		  Library.Interaction.userWait();
		  Library.Interaction.click(Xpath.ProductDetails.RequiresLabel);
		  Thread.sleep(2000);
		  String ActualRequireLabelMsg = Library.Interaction.verifyToastMessage(Xpath.ProductDetails.RequiresLabelSuccesMsg);
		  Assert.assertEquals(ActualRequireLabelMsg, "Product saved successfully");
		  Thread.sleep(2000);
		  Library.Interaction.click(Xpath.ProductDetails.DuplicateMsgClose);
		  Library.Interaction.print("User checked Required Labels");
		  
		  //end new
		  Library.Interaction.userWait();
		  Library.Interaction.selectEleVisibleText(Xpath.ProductDetails.Division, Xpath.ProductDetails.DivisionSearch, Xpath.ProductDetails.DivisionClick, "COMPUTER", Division);
		  Thread.sleep(2000);
		  String ActualDivMsg = Library.Interaction.verifyToastMessage(Xpath.ProductDetails.DivisionSuccessMsg);
		  Assert.assertEquals(ActualDivMsg,"Product hierarchy successfully updated" );
		  Library.Interaction.print("User is able to select 'Division'");
		  Thread.sleep(2000);
		  Library.Interaction.click(Xpath.ProductDetails.DuplicateMsgClose);
		  
		  Library.Interaction.userWait();
		  Library.Interaction.selectEleVisibleText(Xpath.ProductDetails.Department, Xpath.ProductDetails.DepartmentSearch, Xpath.ProductDetails.DepartmentClick, "COMPUTER AND", Department);
		  Thread.sleep(2000);
		  String ActualDeptMsg = Library.Interaction.verifyToastMessage(Xpath.ProductDetails.DepartmentSuccessMsg);
		  Assert.assertEquals(ActualDeptMsg,"Product hierarchy successfully updated" );
		  Library.Interaction.print("User is able to select 'Department'");
		  Thread.sleep(2000);
		  Library.Interaction.click(Xpath.ProductDetails.DuplicateMsgClose);
		  
		  Library.Interaction.userWait();
		  Library.Interaction.selectEleVisibleText(Xpath.ProductDetails.Class, Xpath.ProductDetails.ClassSearch, Xpath.ProductDetails.ClassClick, "DVD", Class);
		  Thread.sleep(2000);
		  String ActualClassMsg = Library.Interaction.verifyToastMessage(Xpath.ProductDetails.ClassSuccessMsg);
		  Assert.assertEquals(ActualClassMsg,"Product hierarchy successfully updated" );
		  Library.Interaction.print("User is able to select 'Class'");
		  Thread.sleep(2000);
		  Library.Interaction.click(Xpath.ProductDetails.DuplicateMsgClose);
		  
		  Library.Interaction.userWait();
		  Library.Interaction.click(Xpath.ProductDetails.SaveHirarchy);
		  Thread.sleep(2000);
		  String ActualHirarchyMsg = Library.Interaction.verifyToastMessage(Xpath.ProductDetails.ClassSuccessMsg);
		  Thread.sleep(2000);
		  Assert.assertEquals(ActualHirarchyMsg, "Product saved successfully");
		  log.info("Product hirarchy is Saved Successfully ");
		  
		  Thread.sleep(2000);
		  Library.Interaction.userWait();
		  Library.Interaction.ScrollAWC(Xpath.ProductDetails.ScrollAWC);
		  Library.Interaction.print("User scrolled successfully");

		  
		  Thread.sleep(3000);
		  Library.Interaction.userWait();
		  Library.Interaction.click(Xpath.ProductDetails.VendorCostClick);
		  Library.Interaction.setTextBoxByXpath(Xpath.ProductDetails.VendorCost, VendorCost);
		  Library.Interaction.print("User is able to enter 'VendorCost Price'");
		  
		  Library.Interaction.userWait();
		  Library.Interaction.click(Xpath.ProductDetails.CurrencyClick);
		  Library.Interaction.userWait();
		  Library.Interaction.selectEleByVisibleText(Xpath.ProductDetails.CurrencySelect, Currency);
		  Library.Interaction.print("User is able to select 'Currency'");
		  
		  Library.Interaction.userWait();
		  Library.Interaction.click(Xpath.ProductDetails.LastLandedCostClick);
		  Library.Interaction.setTextBoxByXpath(Xpath.ProductDetails.LastLandedCost, LastLandedCost);
		  Library.Interaction.print("User is able to enter 'LastLanded Price'");
		  
		  Thread.sleep(2000);
		  Library.Interaction.userWait();
		  Library.Interaction.click(Xpath.ProductDetails.CostPricingSave);
		  Thread.sleep(2000);
		  String costmsg = Library.Interaction.verifyToastMessage(Xpath.ProductDetails.CostPriceSuccessMsg);
		  Assert.assertEquals(costmsg, "Cost price saved successfully");
		  log.info("Cost Price Saved Successfully");

		  Thread.sleep(5000);
		  Library.Interaction.userWait();
		  Library.Interaction.click(Xpath.ProductDetails.RetailpricingAddIcon);
		  Library.Interaction.print("User is able to click on '+'");
		  
		  Library.Interaction.userWait();
		  Thread.sleep(2000);
		  
		  Library.Interaction.selectEleVisibleText(Xpath.ProductDetails.Fasia, Xpath.ProductDetails.FasiaSearch, Xpath.ProductDetails.FasiaList, "LUCKY DOLLAR", Fasia);
		  Thread.sleep(2000);
		  Library.Interaction.print("User is able to select 'Location'");
		 
		  Library.Interaction.userWait();
		  Library.Interaction.click(Xpath.ProductDetails.EffectivedateClick);
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.ProductDetails.EDP);
			Library.Interaction.print("User is able to select 'Effective Date'");
/*		  Library.Interaction.click(Xpath.ProductDetails.EffectivedateClick);
		  Library.Interaction.userWait();
		  Thread.sleep(2000);
			Library.Interaction.click(Xpath.ProductDetails.EffectivedateCalenderDatePicker);
			Library.Interaction.print("User is able to select 'Effective Date'");*/
			

			Library.Interaction.userWait();
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.ProductDetails.CashPriceClick);
			Library.Interaction.setTextBoxByXpath(Xpath.ProductDetails.CashPrice, CashPrice );
			Library.Interaction.print("User is able to enter 'Cash Price'");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.ProductDetails.RegularPriceClick);
			Library.Interaction.setTextBoxByXpath(Xpath.ProductDetails.RegularPrice, RegularPrice );
			Library.Interaction.print("User is able to enter 'Regular Price'");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.ProductDetails.DutyPriceClick);
			Library.Interaction.setTextBoxByXpath(Xpath.ProductDetails.DutyPrice, DutyFreePrice );
			Library.Interaction.print("User is able to enter 'DutyFree Price'");
			
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.ProductDetails.SaveRetailPricing);
			Thread.sleep(2000);
			String RetailSuccessMsg = Library.Interaction.verifyToastMessage(Xpath.ProductDetails.RetailPriceMsg);
			Assert.assertEquals(RetailSuccessMsg, "Retail price saved successfully");
			
			Thread.sleep(3000);
			Library.Interaction.print("User is able to click on 'Save'");
			log.info("Retail Price Added Successfully");
			log.info("Product Details Saved Successfully");
			log.info("**EOD JOB IS REQUIRED TO UPDATE STATUS**");
			
		}
		catch(Exception e)
		{
			captureScreen(driver, "location");
			Assert.assertFalse(false);
			log.info("Test Failed");
			throw(e);
		}
	}
	
	//Product Enquiry
	@Test(dependsOnMethods="ProductDetails")
	public void ProductEnquiry()throws Exception
	{
		try
		{
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.ProductEnquiry.merchandising);
			log.info("User clicked on Merchandising");
			
			Library.Interaction.userWait();
			Library.Interaction.moveToElement(Xpath.ProductEnquiry.Search);
			log.info("User clicked on Search");
			
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.ProductEnquiry.ProductEnquiry);
			log.info("User clicked on Product Enquiry");
			
			Library.Interaction.userWait();
			String actualtext = driver.findElement(By.xpath(Xpath.ProductEnquiry.VerifyProductEnquiryPage)).getText();
			Assert.assertEquals(actualtext, "Product Enquiry");
			log.info("Page Title is Verified Successfully");
			
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.ProductEnquiry.ProductSearch);
			Library.Interaction.print("User clicked on Search box");
			

			
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.ProductEnquiry.ProductSearch, SKUnit);
			Library.Interaction.print("User entered product code");
			
			Library.Interaction.userWait();
			Library.Interaction.scrollto_Element(Xpath.ProductEnquiry.SaveBTN);
			
			Library.Interaction.print("User is able to scroll");
			Thread.sleep(3000);
			
			Library.Interaction.userWait();
			String actualstatustext = Library.Interaction.getElmtText(Xpath.ProductEnquiry.ProductStatus);
			if(actualstatustext.equals("Active Current"))
			{
				Library.Interaction.print("Product Status is " + actualstatustext);
			}
			else
			{
				Library.Interaction.print("Product Status is " + actualstatustext);
			}
			
			Library.Interaction.print("User verified product status");
			log.info("User Verified Product Status Successfully");
			driver.close();
			
		}
		catch (Exception e) {
			captureScreen(driver, "location");
			Assert.assertFalse(false);
			log.info("Test Failed");
			throw(e);
		}
	}
	

	

}
