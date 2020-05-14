package com.cosac.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;

public class COS13_SearchNonStocks extends BaseClass{
	
	 String SearchBox="40209";
	 String CostPrice="9318";
	 String RetailPrice="10000";
	
	@Test
	
	
	public void SearchNonStocks() throws InterruptedException, IOException
	{
		try {
			
		
		Library.Interaction.userWait();
		Library.Interaction.click(Xpath.SearchNonStocks.NonStocks);
		Library.Interaction.print("User Clicked on NonStocks Link");
		Library.Interaction.userWait();
		Library.Interaction.click(Xpath.SearchNonStocks.SearchNonStocks);
		Library.Interaction.print("User Clicked on SearchNonStocks Link");
		Library.Interaction.userWait();
		Library.Interaction.setTextBoxByXpath(Xpath.SearchNonStocks.SearchBox,SearchBox);
		Library.Interaction.print("User Entered Value to Search TextBox");
		Thread.sleep(5000);
		Library.Interaction.click(Xpath.SearchNonStocks.ThreeDots);
		Library.Interaction.print("User Clicked on Three Dots");
		Library.Interaction.userWait();
		Library.Interaction.ScrollDown();
		Library.Interaction.userWait();
		Library.Interaction.print("User is able to scroll down");
		Library.Interaction.click(Xpath.SearchNonStocks.Plusbutton);
		Library.Interaction.print("User Clicked on Plus Button");
		Library.Interaction.userWait();
		Library.Interaction.selectAndSerachEle(Xpath.SearchNonStocks.Fascia,Xpath.SearchNonStocks.FasciaSearch,Xpath.SearchNonStocks.FasciaData,"Courts Store");
		Library.Interaction.print("User Selected Fascia Drop down ");
		Library.Interaction.userWait();
		Library.Interaction.selectAndSerachEle(Xpath.SearchNonStocks.Barnch,Xpath.SearchNonStocks.BranchSearch,Xpath.SearchNonStocks.BranchData,"910 COURTS CROSS ROADS");
		Library.Interaction.print("User Selected Barnch Drop down ");
		Library.Interaction.userWait();
		Library.Interaction.setTextBoxByXpath(Xpath.SearchNonStocks.CostPrice, CostPrice);
		Library.Interaction.print("User Entered Cost Price");
		Thread.sleep(5000);
		Library.Interaction.setTextBoxByXpath(Xpath.SearchNonStocks.RetailPrice, RetailPrice);
		Library.Interaction.print("User Entered Retail Price");
		Thread.sleep(5000);
		Library.Interaction.click(Xpath.SearchNonStocks.SaveButton);
		Library.Interaction.print("User Clicked on Save Button");
		
		
		
	}catch(Exception e)
	{
		captureScreen(driver, "SearchNonStocks");
		Assert.assertFalse(false);
		log.info("Test Failed");
	}
	
	}

	
}
