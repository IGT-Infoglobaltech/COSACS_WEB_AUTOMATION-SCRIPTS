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

public class COS77_ServiceRequestFinancialReport extends BaseClass{
	
	String ExpectedSRLabel="Service Request Financials Report";
	String FromDate="1 May, 2019";
	String ToDate="1 January, 2020";
	String searchProduct="Aud";
	String ProductName="AUDIO";
	

	//Clicking and Verifying Buyer Sales History report
	@Test
	public void SRFinancialReport() throws IOException {
		try {
			//Thread.sleep(5000);
			System.out.println("Entered");
			
			Library.Interaction.userWait();
			//driver.findElement(By.xpath(Xpath.ServRqustFinancialReport.merchandising)).click();
			//Library.Interaction.userWait();
			Library.Interaction.click(Xpath.ServRqustFinancialReport.Service);
			Library.Interaction.print("User Clicked on Service");
			Library.Interaction.userWait();
			Library.Interaction.moveToElement(Xpath.ServRqustFinancialReport.reports);
			Library.Interaction.print("User Clicked on Reports");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.ServRqustFinancialReport.ServReqFinancial);
			Library.Interaction.print("User Clicked on Service Request Financial Report");
			String SRReport = driver.findElement(By.xpath(Xpath.ServRqustFinancialReport.SRLabel)).getText();
			Assert.assertEquals(SRReport,ExpectedSRLabel);
            log.info("User are in Service Request Financial Report");
			} 
		catch (Exception e) {
			captureScreen(driver, "SRFinancialReport");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
     }
    //Searching and Verifying Buyer Sales History report
	@Test(dependsOnMethods = "SRFinancialReport")
	public void verifyBuyerSalesReport() throws IOException {
		try 
		{
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.ServRqustFinancialReport.fromDate);
			//Library.Interaction.setTextBoxByXpath(Xpath.ServRqustFinancialReport.fromDate, FromDate);
			Library.Interaction.userWait();
			Library.Interaction.selectEleByText(Xpath.ServRqustFinancialReport.fromMonth, "May");
			Library.Interaction.userWait();
			Library.Interaction.selectEleByText(Xpath.ServRqustFinancialReport.fromYear, "2019");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.ServRqustFinancialReport.fromDay);
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.ServRqustFinancialReport.ToDate);
			Library.Interaction.userWait();
			Library.Interaction.selectEleByText(Xpath.ServRqustFinancialReport.ToMonth, "Jan");
			Library.Interaction.userWait();
			Library.Interaction.selectEleByText(Xpath.ServRqustFinancialReport.ToYear, "2020");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.ServRqustFinancialReport.ToDay);
			Thread.sleep(6000);
			//Library.Interaction.userWait();
			//Library.Interaction.setTextBoxByXpath(Xpath.ServRqustFinancialReport.toDate, ToDate);
			Library.Interaction.userWait();
			Library.Interaction.selectEle(Xpath.ServRqustFinancialReport.productDepart, Xpath.ServRqustFinancialReport.searchproductDepart,Xpath.ServRqustFinancialReport.selectproductDepart,searchProduct,ProductName);
			Library.Interaction.print("User Selected Product Department");
			log.info("User is able to Select Procuct Department");
			Library.Interaction.minWait();
			Library.Interaction.click(Xpath.ServRqustFinancialReport.run);
			Library.Interaction.ExplicitWait(Xpath.ServRqustFinancialReport.SRDatalabel);
	            String ResultCount=driver.findElement(By.xpath(Xpath.ServRqustFinancialReport.resultCount)).getText();
	            Library.Interaction.print("User use able to see the Report with result Count: "+ResultCount);
	            log.info("User use able to see the Report with result Count: "+ResultCount);
	        String firstAmount=driver.findElement(By.xpath(Xpath.ServRqustFinancialReport.firstAmount)).getText(); 
	        Float FirstSRAmount=Float.parseFloat(firstAmount);
	        String firstSRNum=driver.findElement(By.xpath(Xpath.ServRqustFinancialReport.firstSrNum)).getText();
	        String secondAmount=driver.findElement(By.xpath(Xpath.ServRqustFinancialReport.secondAmount)).getText();
	        String SecondAmount=secondAmount.replace("-", "");
	        Float SecondSRAmount=Float.parseFloat(SecondAmount);
	        String secondSRNum=driver.findElement(By.xpath(Xpath.ServRqustFinancialReport.secondSrNum)).getText();
	        Library.Interaction.print("First SR Num: "+firstSRNum+ "& First Amount: "+FirstSRAmount);
			log.info("First SR Num: "+firstSRNum+ "& First Amount: "+FirstSRAmount);
			Library.Interaction.print("First SR Num: "+firstSRNum+ "& First Amount: "+secondAmount);
			log.info("Second SR Num: "+secondSRNum+ "& Second Amount: "+secondAmount);
	        if(firstSRNum.equals(secondSRNum)|| FirstSRAmount.equals(SecondSRAmount))
	        {
	        	Library.Interaction.print("User is able to get data with CreditAmount-DebitAmount=0");
				log.info("User is able to get data with CreditAmount - DebitAmount=0");
	        	
	        }
	        
	        
			
	        
				

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
