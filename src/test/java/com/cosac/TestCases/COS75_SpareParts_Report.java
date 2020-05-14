package com.cosac.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;

public class COS75_SpareParts_Report extends BaseClass{
	
	public static String ExpectedPageTitle="Spare Parts Report";
	public static String DeliveredDatefrom="Sun, 1 March, 2020";
	public static String DeliveredDateto="Mon, 16 March, 2020";
	public static String Branch="992 TECHN";
	public static String SparePartUsage="Service Request";
	public static String PartSource="Internal";
	
	@Test
	public void SparePartsReport() throws Exception
	{
		try
		{
		Library.Interaction.userWait();
		Library.Interaction.click(Xpath.SpareParts.Services);
		Library.Interaction.print("User Clicked on Merchandising");
		
		Library.Interaction.userWait();
		Library.Interaction.moveToElement(Xpath.SpareParts.Reports);
		log.info("User Clicked On Reports");
		//Library.Interaction.print("User Clicked on Reports");
		
		Library.Interaction.userWait();
		Library.Interaction.click(Xpath.SpareParts.Spareparts);
		log.info("User Clicked On Spare Parts");
		//Library.Interaction.print("User Clicked On Spare Parts");
		
		String ActualTitle = Library.Interaction.verifyPageTitle();
		Assert.assertEquals(ActualTitle, ExpectedPageTitle);
		log.info("Page Title Is Verified Successfully");
		
	
		Library.Interaction.userWait();
		Library.Interaction.click(Xpath.SpareParts.DeliverdDateFrom);
		Library.Interaction.setTextBoxByXpath(Xpath.SpareParts.DeliverdDateFrom, DeliveredDatefrom);
		log.info("User is able to enter Delivered From Date");
		//Library.Interaction.print("User able to enter Deliverd From");
		
		Library.Interaction.userWait();
		Library.Interaction.click(Xpath.SpareParts.DeliverdDateTo);
		Library.Interaction.setTextBoxByXpath(Xpath.SpareParts.DeliverdDateTo, DeliveredDateto);
		log.info("User is able to enter Delivered To Date");
		
		Library.Interaction.userWait();
		Library.Interaction.selectEleVisibleTextByContains(Xpath.SpareParts.Branch, Xpath.SpareParts.BranchSearch,Xpath.SpareParts.BranchList, Branch, Branch);
		log.info("User Selected Branch");
		
		Library.Interaction.userWait();
		Library.Interaction.selectEleVisibleTextByContains(Xpath.SpareParts.SparePartUsage, Xpath.SpareParts.SparePartUsageSearch,Xpath.SpareParts.SparePartUsageList, SparePartUsage, SparePartUsage);
		log.info("User Selected Spare Parts Usage");
		
		Library.Interaction.userWait();
		Library.Interaction.selectEleVisibleTextByContains(Xpath.SpareParts.PartSource, Xpath.SpareParts.PartSourceSearch,Xpath.SpareParts.PartSourceList, PartSource, PartSource);
		log.info("User Selected PartSource");
		
		Library.Interaction.userWait();
		Library.Interaction.click(Xpath.SpareParts.Run);
		log.info("Spare Part Report is Displayed Successfully");
		
		Thread.sleep(5000);
		Library.Interaction.userWait();
		Library.Interaction.click(Xpath.SpareParts.Export);
		log.info("Spare Part Report is Exported Successfully");
		
/*		Thread.sleep(5000);
		Library.Interaction.userWait();
		Library.Interaction.click(Xpath.SpareParts.Clear);
		log.info("User Input Cleared Successfull");*/
		
		
		
		
		
		}
		catch (Exception e) {
			captureScreen(driver, "location");
			Assert.assertFalse(false);
			log.info("Test Failed");
			throw(e);
		}
	}

}
