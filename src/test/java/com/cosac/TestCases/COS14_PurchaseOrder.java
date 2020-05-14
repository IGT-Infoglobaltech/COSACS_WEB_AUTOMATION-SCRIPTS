package com.cosac.TestCases;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;

public class COS14_PurchaseOrder extends BaseClass{
String POSKU="LGT2AA";
String POSKUValue="LGT2AA";
String PORequsetingDeliverDate="05/06/2020";
String RequsetingDeliverDate="05/06/2020";
String Qty="2";
public static String ActualPONumber;
public static String ReceiptPONumber;
	
	@Test
	public void PurchaseOrder()throws Exception
	{
		try
		{
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.CreatePurchaseOrder.Merchandising);
			log.info("User able to click on Merchandising");
			
			Library.Interaction.userWait();
			Library.Interaction.moveToElement(Xpath.CreatePurchaseOrder.Create);
			log.info("User able to click on Create");
			
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.CreatePurchaseOrder.PurchaseOrder);
			log.info("User able to click on Purchase Order");
			
			Library.Interaction.userWait();
			String ActualText = Library.Interaction.getElmtText(Xpath.CreatePurchaseOrder.VerifyCreatePurchaseOrderPage);
			Thread.sleep(2000);
			Assert.assertEquals(ActualText,"Create Purchase Order");
			log.info("Page Title is Verified Successfully");
			
			Library.Interaction.userWait();
			Library.Interaction.selectEleVisibleText(Xpath.CreatePurchaseOrder.ReceivingLocation, Xpath.CreatePurchaseOrder.RecevingLocationSearch, Xpath.CreatePurchaseOrder.RecevingLocationList,"LUCKY DOLLAR", "LUCKY DOLLAR MAY PEN");
			Library.Interaction.print("User able to select Receiving Location");
			
			Library.Interaction.userWait();
			Library.Interaction.selectEleVisibleText(Xpath.CreatePurchaseOrder.Vendor, Xpath.CreatePurchaseOrder.VendorSearch, Xpath.CreatePurchaseOrder.VendorList, "REGAL","REGAL WORLDWIDE TRADE");
			Library.Interaction.print("User able to select Vendor");
			
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.CreatePurchaseOrder.RequestedDelivery);
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.CreatePurchaseOrder.RequestedDeliveryDate, PORequsetingDeliverDate);
			Library.Interaction.print("User able to select Requested Delivery Date");
			
			Thread.sleep(2000);
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.CreatePurchaseOrder.AddProduct);
			Library.Interaction.print("User able to click on Add");
			Thread.sleep(2000);
			
			
			Library.Interaction.userWait();
			Library.Interaction.selectEleVisibleTextByContains(Xpath.CreatePurchaseOrder.ProductCode, Xpath.CreatePurchaseOrder.SKUSearch, Xpath.CreatePurchaseOrder.SKUList,POSKU ,POSKUValue );
			Library.Interaction.print("User able to select Product");
			

			
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.CreatePurchaseOrder.ProductRecevingDate, RequsetingDeliverDate);
			Library.Interaction.print("User able to select Requested Delivery Date");
			
			Library.Interaction.userWait();
			driver.findElement(By.xpath(Xpath.CreatePurchaseOrder.Quantity)).clear();
			Library.Interaction.setTextBoxByXpath(Xpath.CreatePurchaseOrder.Quantity, Qty);
			Library.Interaction.print("User able to enter Quantity");
			
			Library.Interaction.userWait();
			Thread.sleep(2000);
			Library.Interaction.click(Xpath.CreatePurchaseOrder.RequireLabel);
			Library.Interaction.print("Requires Lable Checked");
			
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.CreatePurchaseOrder.ProductComments, "Purchase order");
			Library.Interaction.print("User able to comment");
			Thread.sleep(2000);
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.CreatePurchaseOrder.SavePO);
			Library.Interaction.print("User able to Save Product");
			
			Thread.sleep(3000);
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.CreatePurchaseOrder.CreatePO);
			Library.Interaction.print("User able to Create Purchase Order");
			

			
			Library.Interaction.userWait();
			String ActualPOMessage = Library.Interaction.verifyToastMessage(Xpath.CreatePurchaseOrder.POSuccessMsg);

			Assert.assertEquals(ActualPOMessage,"Purchase order saved successfully");
			
			Thread.sleep(3000);
			Library.Interaction.userWait();
			ActualPONumber = Library.Interaction.verifyPONumber(Xpath.CreatePurchaseOrder.VerifyPONumber);
			log.info("Purchase Order Created Successfully");			   
			Thread.sleep(2000);
			/*Get window handles method*/
			String parent = driver.getWindowHandle();
			Library.Interaction.click(Xpath.CreatePurchaseOrder.POPrint);
			Set<String> allwindows = driver.getWindowHandles();
			
			for(String child:allwindows)
			{
				if(!parent.equals(child))
				{
					driver.switchTo().window(child);
					
					String APON = Library.Interaction.verifyPrintPONumber(Xpath.CreatePurchaseOrder.VerifyPrintPON);
					String ReceiptPONumber = APON.trim();
					Assert.assertEquals(ReceiptPONumber, ActualPONumber);
					Thread.sleep(2000);
					driver.close();
					log.info("Purchase Order Receipt is Verified Successfully");
				}
			}
			Thread.sleep(3000);
			driver.switchTo().window(parent);
			
		}
		catch (Exception e) {
			captureScreen(driver, "location");
			Assert.assertFalse(false);
			log.info("Test Failed");
			throw(e);
		}
		
	}
	
		
		@Test(dependsOnMethods="PurchaseOrder")
		public void PurchaseOrderSearch() throws Exception
		{
			try
			{
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.SearchPurchaseOrder.merchandising);
				log.info("User able to click on Merchandising");
				
				Library.Interaction.userWait();
				Library.Interaction.moveToElement(Xpath.SearchPurchaseOrder.Search);
				log.info("User able to click on Search");
				
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.SearchPurchaseOrder.PurchaseOrderSearchBox);
				log.info("User able to click on Purchase Orders");
				
				Thread.sleep(2000);
				Library.Interaction.userWait();
			   	String ActualTitle = Library.Interaction.getElmtText(Xpath.SearchPurchaseOrder.VerifySearchPOPage);
			   	Assert.assertEquals(ActualTitle, "Purchase Order Search");
			   	log.info("Page Title is Verified Successfully");
			    
			   	Thread.sleep(2000);
			    Library.Interaction.userWait();
				Library.Interaction.click(Xpath.SearchPurchaseOrder.Searchbox);
				Library.Interaction.userWait();
				Library.Interaction.setTextBoxByXpath(Xpath.SearchPurchaseOrder.PONumber, ActualPONumber);
				Library.Interaction.print("User able to search purchase order");
				
				Library.Interaction.userWait();
				String ActualPOStatus = Library.Interaction.getElmtText(Xpath.SearchPurchaseOrder.POStatus);
				Assert.assertEquals(ActualPOStatus, "New");
				

				if(ActualPOStatus.equals("New"))
				{
					Library.Interaction.print("Purschase Order Status is: "+ActualPOStatus);
				}
				log.info("Purchase Order Status is Verified Successfully");
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