
/*Project Name : IGT Framework
  Author : Vincy Virgenia James*/

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

public class COS23_CreateVendorReturns extends BaseClass {
	
	String ExpecVendorReturnsTitle = "Goods Receipt Search";
	String SearchText = "2586";
	String ExpecGoodsTitle = "Goods Receipt #2586";
	String DocRefNumbVal = "124";
	String QtyReturnVal = "2";
	String CommentsVal = "Items Damaged";
	
	//The below Method helps the user to land the Goods Receipt Page
	@Test
	public void VendorReturns() throws Throwable {
	
		try {
			
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.LocationCreation.merchandising);
			log.info("User Clicked on Merchandising");
			Library.Interaction.userWait();
			Library.Interaction.moveToElement(Xpath.VendorReturns.SrchBtn);
			log.info("User Clicked on Search");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.VendorReturns.CreateGoodsReceipt);
			Library.Interaction.userWait();
			log.info("User Clicked on Goods Receipts");
			String VendorReturnsTitle = driver.findElement(By.xpath(Xpath.VendorReturns.VerifyGoodsReceipt)).getText();
			Assert.assertEquals(VendorReturnsTitle, ExpecVendorReturnsTitle);
			log.info("User is in Goods Receipts Search Page");

		} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "VendorReturns");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}

	//The below method helps the user to create Vendor Returns
	@Test(dependsOnMethods = "VendorReturns")
	
	public void SearchVendorReturns() throws IOException {
		try {
			
			/* Entering text in the search text box */
			Library.Interaction.setTextBoxByXpath(Xpath.VendorReturns.SrchTextBox, SearchText);
			Thread.sleep(2000);
			
			/*Clicking on Goods Receipt link*/
			WebElement GoodsLink = driver.findElement(By.xpath(Xpath.VendorReturns.GoodsLink));
			GoodsLink.click();
			Thread.sleep(2000);
			
			/*Verifying the user is in Goods link page */
			String GoodsLinkTitle = driver.findElement(By.xpath(Xpath.VendorReturns.GoodsTitle)).getText();
			Assert.assertEquals(GoodsLinkTitle, ExpecGoodsTitle);
			log.info("User is in Goods Link Page");
			
			/*Clicking on Create Vendor Return Button */
			Library.Interaction.click(Xpath.VendorReturns.CreateVendorBtn);
			Thread.sleep(2000);
			
			/*Switching to new window */
			Library.Interaction.switchNewwindow();
			
			/*Entering Text in Doc Reference Number */
			WebElement DocRef = driver.findElement(By.xpath(Xpath.VendorReturns.DocRefNum));
			//DocRef.click();
			DocRef.sendKeys("15963");
			
			/*Entering Text in Qty Returned field */
			Library.Interaction.setTextBoxByXpath(Xpath.VendorReturns.QtyReturned, QtyReturnVal);
			
			/*Entering Text in Comments Section */
			Library.Interaction.setTextBoxByXpath(Xpath.VendorReturns.Comments, CommentsVal);
			
			/*Clicking on Create Button */
			Library.Interaction.click(Xpath.VendorReturns.CreateBtn);
			Library.Interaction.userWait();
			
			/*Verifying the Success Message*/
			WebElement SuccMsg = driver.findElement(By.xpath(Xpath.VendorReturns.SuccMsgVenReturn));
			String Success = SuccMsg.getText();
			log.info("Success Message is "+Success);
			Thread.sleep(2000);
			
			/*Clicking on Approve Btn */
			Library.Interaction.click(Xpath.VendorReturns.ApproveBtn);
			Thread.sleep(2000);
			
			/*Verifying the Success Message*/
			WebElement SuccMsgApp = driver.findElement(By.xpath(Xpath.VendorReturns.SuccMsgApp));
			String SuccessApp = SuccMsgApp.getText();
			log.info("Success Message is "+SuccessApp);
			Library.Interaction.userWait();
		
			/*Checking for Page Title Number */
			WebElement VerifyNumb = driver.findElement(By.xpath(Xpath.VendorReturns.TitleNumb));
			String str1 = VerifyNumb.getText();
			log.info("The page title is "+str1);
			
			/*Clicking on Print with Cost button 
			Library.Interaction.click(Xpath.VendorReturns.PrintWithCost);
			Library.Interaction.userWait();*/
			
			String str2 = "";
			String[] str3 =str1.split("Return ");
			log.info("The Random Number generated is "+str3[1]);
			
			/*Searching the created vendor returns*/
			
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.LocationCreation.merchandising);
			Library.Interaction.print("User Clicked on Merchandising");
			Library.Interaction.userWait();
			Library.Interaction.moveToElement(Xpath.StockAllocation.Search);
			Library.Interaction.print("User Clicked on Search");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.VendorReturns.SrchVendReturns);
			Library.Interaction.userWait();
			Library.Interaction.print("User Clicked on Search Vendor Returns");
			Thread.sleep(2000);
			
			/*Searching for Vendor ID */
			WebElement VendorId = driver.findElement(By.xpath(Xpath.VendorReturns.VendorID));
			VendorId.sendKeys(str3);
			
			
			/*Clicking on Search Button */
			Library.Interaction.click(Xpath.VendorReturns.VendorSrch);
			log.info("User clicked on Search Button");
			Thread.sleep(2000);
			
			/* Checking for the Same product Return datas*/
			WebElement VendSrchID = driver.findElement(By.xpath(Xpath.VendorReturns.VendorSrchId));
			String VenSrch = VendSrchID.getText();
			log.info("The Search ID of the product returned is-->"+VenSrch);
			
			WebElement StatusVR = driver.findElement(By.xpath(Xpath.VendorReturns.StatusVR));
			String text=StatusVR.getText();
			log.info("The Status of the Vendor return Product is--> "+text);
			
			WebElement CreatedDateVR = driver.findElement(By.xpath(Xpath.VendorReturns.CreatedDateVR));
			String CreatedDate = CreatedDateVR.getText();
			log.info("The Created Date of the Vendor return Product is--> "+CreatedDate);
			
			WebElement VendorVR = driver.findElement(By.xpath(Xpath.VendorReturns.VendorVR));
			String Vendor = VendorVR.getText();
			log.info("The Vendor of the Vendor return Product is--> "+Vendor);
			
			WebElement SendLoc = driver.findElement(By.xpath(Xpath.VendorReturns.SendingLocVR));
			String SendingLocation = SendLoc.getText();
			log.info("The Sending Location of the Vendor return Product is--> "+SendingLocation);
			
			WebElement ReceiptType = driver.findElement(By.xpath(Xpath.VendorReturns.StandardVR));
			String RT = ReceiptType.getText();
			log.info("The Receipt Type of the Vendor return Product is--> "+RT);
			
			WebElement GoodsRecID = driver.findElement(By.xpath(Xpath.VendorReturns.GoodsReceiptID));
			String Goods = GoodsRecID.getText();
			log.info("The Goods Receipt ID of the Vendor return Product is--> "+Goods);
			
			WebElement TotalCost = driver.findElement(By.xpath(Xpath.VendorReturns.TotCostVR));
			String TotCost = TotalCost.getText();
			log.info("The Total Cost of the Vendor return Product is--> "+TotCost);
			
			
		} catch (Exception e) {
		e.printStackTrace();
		captureScreen(driver, "VendorReturns");
		Assert.assertFalse(false);
		
		log.info("Test Failed");
	}

}
}

