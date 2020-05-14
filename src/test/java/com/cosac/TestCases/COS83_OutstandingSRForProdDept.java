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

public class COS83_OutstandingSRForProdDept extends BaseClass{
	
	String ExpectedSRLabel="Outstanding SRs Per Product Department Report";
	String FromDate="1 May, 2019";
	String ToDate="1 January, 2020";
	String searchSelect="All Outstanding";
	String SelectName="All Outstanding";
	

	//Clicking and Verifying Buyer Sales History report
	@Test
	public void OutstandingSRPerProdDept() throws IOException {
		try {
			//Thread.sleep(5000);
			System.out.println("Entered");
			
			Library.Interaction.userWait();
			//driver.findElement(By.xpath(Xpath.ServRqustFinancialReport.merchandising)).click();
			//Library.Interaction.userWait();
			Library.Interaction.click(Xpath.OutstandingSRPerProdDept.Service);
			Library.Interaction.print("User Clicked on Service");
			Library.Interaction.userWait();
			Library.Interaction.moveToElement(Xpath.OutstandingSRPerProdDept.reports);
			Library.Interaction.print("User Clicked on Reports");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.OutstandingSRPerProdDept.OutstandingSR);
			Library.Interaction.print("User Clicked on Outstanding SR Per Product Department");
			String SRReport = driver.findElement(By.xpath(Xpath.OutstandingSRPerProdDept.SRLabel)).getText();
			Assert.assertEquals(SRReport,ExpectedSRLabel);
            log.info("User are in Outstanding SR Per Product Department");
			} 
		catch (Exception e) {
			captureScreen(driver, "OutstandingSRPerProdDept");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
     }
    //Searching and Verifying Buyer Sales History report
	@Test(dependsOnMethods = "OutstandingSRPerProdDept")
	public void OutstandingSRProdDept() throws IOException {
		try 
		{
			Library.Interaction.userWait();
			Library.Interaction.selectEle(Xpath.OutstandingSRPerProdDept.select, Xpath.OutstandingSRPerProdDept.searchSelect,Xpath.OutstandingSRPerProdDept.selectSelect,searchSelect,SelectName);
			Library.Interaction.print("User Selected Product Department");
			log.info("User is able to Select Procuct Department");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.OutstandingSRPerProdDept.fromDate);
			//Library.Interaction.setTextBoxByXpath(Xpath.ServRqustFinancialReport.fromDate, FromDate);
			Library.Interaction.userWait();
			Library.Interaction.selectEleByText(Xpath.OutstandingSRPerProdDept.fromMonth, "May");
			Library.Interaction.userWait();
			Library.Interaction.selectEleByText(Xpath.OutstandingSRPerProdDept.fromYear, "2019");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.OutstandingSRPerProdDept.fromDay);
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.OutstandingSRPerProdDept.ToDate);
			Library.Interaction.userWait();
			Library.Interaction.selectEleByText(Xpath.OutstandingSRPerProdDept.ToMonth, "Mar");
			Library.Interaction.userWait();
			Library.Interaction.selectEleByText(Xpath.OutstandingSRPerProdDept.ToYear, "2020");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.OutstandingSRPerProdDept.ToDay);
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.ServRqustFinancialReport.run);
			Library.Interaction.ExplicitWait(Xpath.OutstandingSRPerProdDept.noOfRecords);
			int noOfRecord=driver.findElements(By.xpath(Xpath.OutstandingSRPerProdDept.noOfRecords)).size()-1;
			Library.Interaction.print("Number of total matching records: "+noOfRecord);
			log.info("Number of total matching records: "+noOfRecord);
	        
	        
			
	        
				

		} 
		catch (Exception e) {
			e.getStackTrace();
			captureScreen(driver, "verifyBuyerSalesReport");
			Assert.assertFalse(false);
			log.info("Test Failed");
			//driver.quit();
		}
    }

}
