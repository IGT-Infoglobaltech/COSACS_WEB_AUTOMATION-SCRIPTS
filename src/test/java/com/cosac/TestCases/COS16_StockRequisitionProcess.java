

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

public class COS16_StockRequisitionProcess extends BaseClass {
	
	String ExpecStckRequisitionTitle = "Create Stock Requisition";
	String SearchText = "LUCKY";
	String RecLocValue = "LUCKY DOLLAR MAY PEN";
	String WarehouseText = "LUCKY";
	String WarehouseVal = "LUCKY DOLLAR MAY PEN";
	String ProductSrchText = "SST773";
	String ProductText = "SST773";
	String ProductQuantity = "5";
	String ProductComments = "Testing";
	String CreatedDate = "03/09/2020";
	
	// The below method helps the user to land the Create Stock Requisition Page
	
	@Test
	public void StockRequisition() throws Throwable {
	
		try {
			Library.Interaction.userWait();
			
			Library.Interaction.click(Xpath.LocationCreation.merchandising);
			log.info("User Clicked on Merchandising");
			Library.Interaction.userWait();
			Library.Interaction.moveToElement(Xpath.LocationCreation.create);
			log.info("User Clicked on Create");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.StockRequisitionProcess.stockRequisition);
			Library.Interaction.userWait();
			log.info("User Clicked on StockRequisition");
			String StockRequisitionCreationTitle = driver.findElement(By.xpath(Xpath.StockRequisitionProcess.verifyStockRequisition)).getText();
			Assert.assertEquals(StockRequisitionCreationTitle, ExpecStckRequisitionTitle);
			log.info("User is in Stock Requisition Creation Page");

		} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "StockRequisition");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}


	// The below method helps the user to create stock Requisition
	@Test(dependsOnMethods = "StockRequisition")
	
	public void createStockRequisition() throws IOException {
		try {
			
			/*Selecting value from Receiving Location Drop Down */
			Library.Interaction.click(Xpath.StockRequisitionProcess.RecLocDrpDown);
			Library.Interaction.setTextBoxByXpath(Xpath.StockRequisitionProcess.RecLocSrch, SearchText);

			List<WebElement> DropDownVal = driver.findElements(By.xpath(Xpath.StockRequisitionProcess.RecLocName));
			for (int i = 0; i < DropDownVal.size(); i++)
			{
				if (DropDownVal.get(i).getText().equals(RecLocValue))
				{
					log.info("Text-->"+DropDownVal.get(i).getText());
					Thread.sleep(2000);
					DropDownVal.get(i).click();
					break;
				}
			}
			log.info("User clicked LUCKY DOLLAR MAY PEN");
		
			
			/*Selecting value from Warehouse Drop Down */
			Library.Interaction.click(Xpath.StockRequisitionProcess.WarehouseDro);
			Library.Interaction.setTextBoxByXpath(Xpath.StockRequisitionProcess.WarehouseSearch, WarehouseText);

			List<WebElement> WarehouseDropDownVal = driver.findElements(By.xpath(Xpath.StockRequisitionProcess.WarehouseName));
			for (int i = 0; i < WarehouseDropDownVal.size(); i++)
			{
				if (WarehouseDropDownVal.get(i).getText().equals(WarehouseVal))
				{
					WarehouseDropDownVal.get(i).click();
					break;
				}
			}
			log.info("User clicked LUCKY DOLLAR MAY PEN");
			
			/*Selecting value from Product Drop Down */
			
			Library.Interaction.selectEle(Xpath.StockRequisitionProcess.ProductDrp, Xpath.StockRequisitionProcess.ProductSrch, Xpath.StockRequisitionProcess.Productname, ProductSrchText, ProductText);
			
			log.info("User clicked  SST773:456510168-RED HYACINTH 95CM 456510168");
			
			/* Entering the Quantity in text field */
			Library.Interaction.setTextBoxByXpath(Xpath.StockRequisitionProcess.ProductQty, ProductQuantity);
			
			/*Entering the Product Comments */
			Library.Interaction.setTextBoxByXpath(Xpath.StockRequisitionProcess.ProductCmnts, ProductComments);
			
			/* Clicking on Add Button */
			Library.Interaction.click(Xpath.StockRequisitionProcess.AddButton);
			
			/*Verifying the SKU Number*/
			WebElement SKU = driver.findElement(By.xpath(Xpath.StockRequisitionProcess.SKUnumb));
			String SKUnumb = SKU.getText();
			log.info("SKU number is "+SKUnumb);
			
			/* Verifying The Description*/
			WebElement Description = driver.findElement(By.xpath(Xpath.StockRequisitionProcess.DescSRP));
			String Desc = Description.getText();
			log.info("Description of Product is " +Desc);
			
			/* Verifying the Comments */
			WebElement Comments = driver.findElement(By.xpath(Xpath.StockRequisitionProcess.CommentsSRP));
			String Cmnts = Comments.getText();
			log.info("Comments is "+Cmnts);
			
			/* Validating AWC */
			WebElement AvgWeighCost = driver.findElement(By.xpath(Xpath.StockRequisitionProcess.AvgWeighCostSRP));
			String str1 = AvgWeighCost.getText().replaceAll("[^0-9]","");
			int number1 = Integer.parseInt(str1);
			
			int LineCostProd = Integer.parseInt(ProductQuantity)*number1;
			log.info("The line cost is "+LineCostProd);
			
			/* Verifying the Line Cost in the grid */
			WebElement LineCost = driver.findElement(By.xpath(Xpath.StockRequisitionProcess.LineCostSRP));
			String Str2 = LineCost.getText().replaceAll("[^0-9]","");
			int number2 = Integer.parseInt(Str2);
			Assert.assertEquals(LineCostProd, number2);
			log.info("Line cost is displayed as per Quantity");
			
			/* Clicking on Save Button */
			Library.Interaction.click(Xpath.StockRequisitionProcess.SaveBtn);
			Library.Interaction.userWait();
			
			/* Verifying the Success Message */
			WebElement SuccMsg = driver.findElement(By.xpath(Xpath.StockRequisitionProcess.SuccMsgSRP));
			String Success = SuccMsg.getText();
			log.info("Success Message is "+Success);
			Library.Interaction.userWait();
			log.info("User Created Stock Requisition Successfully");
			
		} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "CreateStockAllocation");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}	
			
	// The below method helps the user to search the created stock Requisition		
@Test(dependsOnMethods = "createStockRequisition")
			
	public void SearchStockRequisition() throws IOException {
			try {
			
			/*Click on Merchandising,search and Stock Requisition*/
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.LocationCreation.merchandising);
			log.info("User Clicked on Merchandising");
			Library.Interaction.userWait();
			Library.Interaction.moveToElement(Xpath.StockAllocation.Search);
			log.info("User Clicked on Search");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.StockRequisitionProcess.SrchStockRequisitions);
			Library.Interaction.userWait();
			log.info("User Clicked on StockRequisitions");
			
			/*Entering Date in the Created Form field */
			Library.Interaction.setTextBoxByXpath(Xpath.StockRequisitionProcess.StockReqCreatedForm, CreatedDate);
			
			/*Clicking on Search Button*/
			Library.Interaction.click(Xpath.StockRequisitionProcess.StockReqSrchbtn);
			Library.Interaction.userWait();
			
			/* Verifying the Shipment ID */
			WebElement ShipmentID = driver.findElement(By.xpath(Xpath.StockRequisitionProcess.ShipmentIdSRP));
			String ShipmentNumb = ShipmentID.getText();
			log.info("Shipment ID is "+ShipmentNumb);
			log.info("Create and Search Stock Requisitions is Successfull");
			

		} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "SearchStockRequisition");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}
}

