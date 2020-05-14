package com.cosac.TestCases;

import java.io.IOException;

import org.apache.xmlbeans.impl.common.XPath;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;

public class COS13_NewNonStockCreation extends BaseClass{

    String SKU="40209"; 
	String VendorUPC="Regal";
	String ShortDescription="OPTIPLUS OP-225 SPORT COR";
	String LongDescription="PIXMA 3010 - CANON PIXMA 3010 AIO PRINTER\r\n" + 
			"Is Active(Default)";
	String TaxRate="17.5";
	String ExpectedNewNonstockCreation="Non-Stock Details";
	

	
	@Test

	public void NonStock() throws IOException, InterruptedException {
		try
		{

		Library.Interaction.userWait();
		Library.Interaction.click(Xpath.NewNonStockCreation.NonStocks);
		Library.Interaction.print("User Clicked on Non-Stocks Link");
		Library.Interaction.userWait();
		Library.Interaction.click(Xpath.NewNonStockCreation.NewNonStocks);
		Library.Interaction.print("User Clicked on New Non-Stocks Link");
		Library.Interaction.userWait();
		
		
		Thread.sleep(5000);
		String createNewNonStocks = driver.findElement(By.xpath(Xpath.NewNonStockCreation.VerifyNonStoctDetailspage)).getText();
		Assert.assertEquals(createNewNonStocks,ExpectedNewNonstockCreation);
        log.info("User are in Non Stock Details Page");
        
		}catch (Exception e) {
			
			captureScreen(driver, "NonStock");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
     }
		
	@Test(dependsOnMethods = {"NonStock"})
	public void NonStockCreation() throws IOException
	{
		try
		{
			
		Library.Interaction.setTextBoxByXpath(Xpath.NewNonStockCreation.SKU,SKU);
		Library.Interaction.userWait();
		Library.Interaction.print("User Entered SKU Code");
		Library.Interaction.selectAndSerachEle(Xpath.NewNonStockCreation.Type,Xpath.NewNonStockCreation.TypeSearch,Xpath.NewNonStockCreation.TypeData,"Installation");
		Library.Interaction.userWait();
		Library.Interaction.print("User Selected on Type");
		Library.Interaction.setTextBoxByXpath(Xpath.NewNonStockCreation.VendorUPC,VendorUPC);
		Library.Interaction.userWait();
		Library.Interaction.print("User Entered VendorUPC");
	
		Library.Interaction.setTextBoxByXpath(Xpath.NewNonStockCreation.ShorDescription,ShortDescription);
		Library.Interaction.userWait();
		Library.Interaction.print("User Entered Vendor ShortDescription");
		Library.Interaction.setTextBoxByXpath(Xpath.NewNonStockCreation.LongDescription, LongDescription);
		Library.Interaction.userWait();
		Library.Interaction.print("User Entered Vendor LongDescription");
		Library.Interaction.setTextBoxByXpath(Xpath.NewNonStockCreation.TaxRate, TaxRate);
		Library.Interaction.userWait();
		Library.Interaction.print("User Entered Vendor TaxRate");
		Library.Interaction.selectAndSerachEle(Xpath.NewNonStockCreation.Divison,Xpath.NewNonStockCreation.DivisonSearch,Xpath.NewNonStockCreation.DivisonData,"COMPUTER AND OFFICE");
		Library.Interaction.userWait();
		Library.Interaction.print("User Selected on Divison");
		Library.Interaction.selectAndSerachEle(Xpath.NewNonStockCreation.Department,Xpath.NewNonStockCreation.DepartmentSearch,Xpath.NewNonStockCreation.DepartmentData,"COMPUTER AND ACCESSORIES");
		Library.Interaction.userWait();
		Library.Interaction.print("User Selected on Department");
		Library.Interaction.selectAndSerachEle(Xpath.NewNonStockCreation.Class,Xpath.NewNonStockCreation.ClassSearch,Xpath.NewNonStockCreation.ClassData,"PRINTER");
		Library.Interaction.userWait();
		Library.Interaction.print("User Selected on Class");
		Library.Interaction.click(Xpath.NewNonStockCreation.SaveButton);
		Library.Interaction.userWait();
		Thread.sleep(3000);
		Library.Interaction.print("User Clicked on SaveButton");
		Thread.sleep(5000);
		
		
		Library.Interaction.click(Xpath.NonStockPromotions.Logoutbutton);
		Library.Interaction.userWait();
		Library.Interaction.print("User clicked on Logout Button ");

		
	}catch(Exception e)
		{
			captureScreen(driver, "NonStockCreation");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
		
		
		
		
		
		
		
	}

}



