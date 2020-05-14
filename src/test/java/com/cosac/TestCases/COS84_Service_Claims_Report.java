package com.cosac.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;

public class COS84_Service_Claims_Report extends BaseClass{
	public static String ExpectedPageTitle="Service Claims Report";
	public static String DateLoggedFrom="Wed, 1 January, 2020";
	public static String DateLoggedTo="Thu, 2 January, 2020";
	public static String DateResolvedFrom="Wed, 1 January, 2020";
	public static String DateResolvedTo="Sat, 4 January, 2020";
	public static String PrimaryCharge="Supplier";
	
	
	@Test
	public void ServiceClaims()throws Exception
	{
		try
		{
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.ServiceClaim.Services);
			log.info("User clicked on Services");
			
			Library.Interaction.userWait();
			Library.Interaction.moveToElement(Xpath.ServiceClaim.Reports);
			log.info("User clicked on Reports");
			
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.ServiceClaim.ServiceClaims);
			log.info("User clicked on ServiceClaims");
			
			Library.Interaction.userWait();
			String ActualPageTitle = Library.Interaction.verifyPageTitle();
			Assert.assertEquals(ActualPageTitle,ExpectedPageTitle);
			log.info("Page Title is Verified");
			
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.ServiceClaim.DateLoggedFrom);
			Library.Interaction.setTextBoxByXpath(Xpath.ServiceClaim.DateLoggedFrom, DateLoggedFrom);
			log.info("User able to enter DateLoggedFrom Date");
		
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.ServiceClaim.DateLoggedTo);
			Library.Interaction.setTextBoxByXpath(Xpath.ServiceClaim.DateLoggedTo, DateLoggedTo);
			log.info("User able to enter DateLoggedTo");

			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.ServiceClaim.DateResolvedFrom);
			Library.Interaction.setTextBoxByXpath(Xpath.ServiceClaim.DateResolvedFrom, DateResolvedFrom);
			log.info("User able to enter DateReceivedFrom");

			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.ServiceClaim.DateResolvedTo);
			Library.Interaction.setTextBoxByXpath(Xpath.ServiceClaim.DateResolvedTo, DateResolvedTo);
			log.info("User able to enter DateReceivedTo");

			Library.Interaction.userWait();
			Library.Interaction.selectEleVisibleTextByContains(Xpath.ServiceClaim.PrimaryCharge, Xpath.ServiceClaim.PrimaryChargeSearch, Xpath.ServiceClaim.PrimaryChargeList, PrimaryCharge, PrimaryCharge);
			log.info("User able to select PrimaryCharge");
			
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.ServiceClaim.FYWCharged);
			log.info("FYWCharged is Checked");
			
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.ServiceClaim.SupplierCharged);
			log.info("SupplierCharged is Checked");
			
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.ServiceClaim.EWCharged);
			log.info("EWCharged is Checked");
			
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.ServiceClaim.IncludeTechnicianReport);
			log.info("IncludeTechnicianReport is Checked");
			
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.ServiceClaim.Run);
			log.info("Service Claims Report is Displayed");
			
			Library.Interaction.userWait();
			Library.Interaction.ExplicitWait(Xpath.ServiceClaim.ReportEW);
			
			
			Thread.sleep(5000);
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.ServiceClaim.Export);
			log.info("Service Claims Report is Downloaded");
			
		}
		catch (Exception e) {
			captureScreen(driver, "location");
			Assert.assertFalse(false);
			log.info("Test Failed");
			throw(e);
		}
	}

}
