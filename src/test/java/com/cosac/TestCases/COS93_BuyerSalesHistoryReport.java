
/**

* Project Name : COSAC

* Author : Vivek Bharti

* Version : 10.5.2.2124

* Reviewed By : SARAVANA KUMAR

* Date of Creation : Jan 16, 2020

* Modification History :

* Date of change : 

* Version : V1.1

* changed function :

* change description :

* Modified By : 

*/
package com.cosac.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;

public class COS93_BuyerSalesHistoryReport extends BaseClass{
	
	String ExpectedSparePartLabel="Buyer Sales History Report";
	String KpiSearch="Sales Value";
	String KpiName="Sales Value";
	String LocationSearch="LUCKY DOLLAR";
	String LocationName="LUCKY DOLLAR MAY PEN";
	String DivisionSearch="AUTOMOTIVE";
	String DivisionName="AUTOMOTIVE";

	//Clicking and Verifying Buyer Sales History report
	@Test
	public void BuyerSalesHistoryReport() throws IOException {
		try {
			
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.LocationCreation.merchandising);
			Library.Interaction.print("User Clicked on Merchandising");
			Library.Interaction.userWait();
			Library.Interaction.moveToElement(Xpath.BuyerSalesHistoryReport.Reports);
			Library.Interaction.print("User Clicked on Reports");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.BuyerSalesHistoryReport.BuyerSalesHistory);
			Library.Interaction.print("User Clicked on Buyer Sales History");
			String createSparePartLabel = driver.findElement(By.xpath(Xpath.BuyerSalesHistoryReport.verifyBuyerSalesPage)).getText();
			Assert.assertEquals(createSparePartLabel,ExpectedSparePartLabel);
            log.info("User are in Buyer Sales History Report Page");
			} 
		catch (Exception e) {
			captureScreen(driver, "BuyerSalesHistoryReport");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
     }
    //Searching and Verifying Buyer Sales History report
	@Test(dependsOnMethods = "BuyerSalesHistoryReport")
	public void verifyBuyerSalesReport() throws IOException {
		try 
		{
			Library.Interaction.userWait();
			Library.Interaction.selectEle(Xpath.BuyerSalesHistoryReport.KPI, Xpath.BuyerSalesHistoryReport.searchKPI,Xpath.BuyerSalesHistoryReport.selectKPI,KpiSearch,KpiName);
			Library.Interaction.print("User Selected KPI");
			log.info("User is able to Select KPI");
			Library.Interaction.userWait();
			Library.Interaction.selectEle(Xpath.BuyerSalesHistoryReport.Location, Xpath.BuyerSalesHistoryReport.searchLocation,Xpath.BuyerSalesHistoryReport.selectLocation,LocationSearch,LocationName);
			Library.Interaction.print("User Selected Location");
			log.info("User is able to Select Location");
			Library.Interaction.userWait();
			Library.Interaction.selectEle(Xpath.BuyerSalesHistoryReport.Division, Xpath.BuyerSalesHistoryReport.searchDivision,Xpath.BuyerSalesHistoryReport.selectDivision,DivisionSearch,DivisionName);
			Library.Interaction.print("User Selected Division");
			log.info("User is able to Select Division");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.BuyerSalesHistoryReport.search);
			Library.Interaction.print("User Clicked to Search");
			log.info("User is able to Click to Serch Report");
            Library.Interaction.ExplicitWait(Xpath.BuyerSalesHistoryReport.hideShowButton);
            String ResultCount=driver.findElement(By.xpath(Xpath.BuyerSalesHistoryReport.resultCount)).getText();
            Library.Interaction.print("User use able to se the Report with result Count: "+ResultCount);
            log.info("User use able to se the Report with result Count: "+ResultCount);
            Library.Interaction.userWait();
            Library.Interaction.click(Xpath.BuyerSalesHistoryReport.hideShowButton);
			Library.Interaction.print("User is able to Click on Hide Show Button");
	        Library.Interaction.ExplicitWait(Xpath.BuyerSalesHistoryReport.cashPrice);
			Library.Interaction.userWait();
			Library.Interaction.minWait();
			Library.Interaction.click(Xpath.BuyerSalesHistoryReport.cashPrice);
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.BuyerSalesHistoryReport.popUpOk);
			Library.Interaction.print("User is able to Hide a detail");
            Library.Interaction.minWait();
			Library.Interaction.click(Xpath.BuyerSalesHistoryReport.hideShowButton);
			Library.Interaction.minWait();
			Library.Interaction.click(Xpath.BuyerSalesHistoryReport.cashPrice);
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.BuyerSalesHistoryReport.popUpOk);
			Library.Interaction.print("User is able to see hidden detail");
			log.info("Hide show button verified");
            Library.Interaction.minWait();
		    Library.Interaction.click(Xpath.BuyerSalesHistoryReport.print);
	        Library.Interaction.print("User is Able to click to Print");
	        log.info("User is able to click to Print Button, Print Verified");
            Library.Interaction.userWait();
	        driver.quit();
				

		} 
		catch (Exception e) {
			e.getStackTrace();
			captureScreen(driver, "verifyBuyerSalesReport");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
    }

}
