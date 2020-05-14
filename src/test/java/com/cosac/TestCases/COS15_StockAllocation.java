
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


	public class COS15_StockAllocation extends BaseClass {

		String ExpecStckAllocTitle = "Create Stock Allocation";
		String WarehouseValue = "LUCKY DOLLAR MAY PEN";
		String Search_Text = "LU";
		String WarehouseComments = "Test";
		String ProductCode = "MNT00083";
		String ProductValue = "MNT00083";
		String Quantity = "2";
		String CreatedDate = "03/09/2020";
		
		
		// The below method helps the user to land the Create Stock Allocation Page

		@Test
		public void StockAllocation() throws Throwable {
		
			try {
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.LocationCreation.merchandising);
				Library.Interaction.print("User Clicked on Merchandising");
				Library.Interaction.userWait();
				Library.Interaction.moveToElement(Xpath.LocationCreation.create);
				Library.Interaction.print("User Clicked on Create");
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.StockAllocation.stockAllocation);
				Library.Interaction.userWait();
				Library.Interaction.print("User Clicked on StockAllocation");
				String StockAllocCreationTitle = driver.findElement(By.xpath(Xpath.StockAllocation.verifyStockAllocPage)).getText();
				Assert.assertEquals(StockAllocCreationTitle, ExpecStckAllocTitle);
				log.info("User is in Stock Allocation Creation Page");

			} catch (Exception e) {
				e.printStackTrace();
				captureScreen(driver, "StockAllocation");
				Assert.assertFalse(false);
				log.info("Test Failed");
			}
		}
	
		// The below method helps the user to create stock Allocation
		@Test(dependsOnMethods = "StockAllocation")
		
		public void createStockAllocation() throws IOException {
			try {
				
				/*Selecting value from Warehouse Drop Down */
				Library.Interaction.click(Xpath.StockAllocation.WarehouseDrpDwn);
				Library.Interaction.setTextBoxByXpath(Xpath.StockAllocation.WarehouseSrch, Search_Text);	
				List<WebElement> DropDownVal = driver.findElements(By.xpath(Xpath.StockAllocation.WarehousenName));
				for (int i = 0; i < DropDownVal.size(); i++)
				{
					if (DropDownVal.get(i).getText().equals(WarehouseValue))
					{
						System.out.println("Text-->"+DropDownVal.get(i).getText());
						Thread.sleep(2000);
						DropDownVal.get(i).click();
						break;
					}
				}		
				
				/*Entering value in comments section */
				Library.Interaction.setTextBoxByXpath(Xpath.StockAllocation.WarehouseCmnts, WarehouseComments);
				
				/*Clicking on + button */
				Library.Interaction.click(Xpath.StockAllocation.AddBtn);
				
				/*Selecting value from Receiving Location Drop Down */
				Library.Interaction.click(Xpath.StockAllocation.ReceivingLocDrpDwn);
				Library.Interaction.setTextBoxByXpath(Xpath.StockAllocation.ReceivingLocSrch, Search_Text);
				
				List<WebElement> ReceivingLocVal = driver.findElements(By.xpath(Xpath.StockAllocation.ReceivingLocName));
				for (int i = 0; i < ReceivingLocVal.size(); i++)
				{
					if (ReceivingLocVal.get(i).getText().equals(WarehouseValue))
					{
						Library.Interaction.userWait();
						ReceivingLocVal.get(i).click();
						break;
					}
				}
				
				/*Selecting value from Product code Drop Down */
				
				Library.Interaction.selectEle(Xpath.StockAllocation.ProductcodeDrpDwn, Xpath.StockAllocation.ProductCodeSrch, Xpath.StockAllocation.ProductCodeName, ProductCode, ProductValue);
				
				log.info("User Selected "+ProductValue);
				
				/* Verifying product name in description */
				Library.Interaction.userWait();
				WebElement ProdDesc = driver.findElement(By.xpath(Xpath.StockAllocation.ProductDesc));
				String ProductDescription = ProdDesc.getText();
				log.info("Product Name "+ProductDescription+" is displayed in the description");
				
				/* Verifying Quantity Available in the grid */
				WebElement QtyAvl = driver.findElement(By.xpath(Xpath.StockAllocation.QuantityAvl));
				String QuantityAvl = QtyAvl.getText();
				int Quant = Integer.parseInt(QuantityAvl);
				log.info("Quantity Available "+Quant+" is displayed");
				
				/*Entering value in quantity Text box*/
				Library.Interaction.setTextBoxByXpath(Xpath.StockAllocation.Quantity, Quantity);
				
				/*Verifying the Average Weighted cost in the grid*/
				WebElement AvgWeighCost = driver.findElement(By.xpath(Xpath.StockAllocation.AvgWeighCost));
				String str1 = AvgWeighCost.getText().replaceAll("[^0-9]","");
				int number1 = Integer.parseInt(str1);
				
				int LineCostProd = Integer.parseInt(Quantity)*number1;
				log.info("The line cost is "+LineCostProd);
				
				/* Verifying the Line Cost in the grid */
				WebElement LineCost = driver.findElement(By.xpath(Xpath.StockAllocation.LineCost));
				String Str2 = LineCost.getText().replaceAll("[^0-9]","");
				int number2 = Integer.parseInt(Str2);
				Assert.assertEquals(LineCostProd, number2);
				log.info("Line cost is displayed as per Quantity");
				
				/*Clicking on Save Allocation Product */
				Library.Interaction.click(Xpath.StockAllocation.SaveAllocProd);
			
				/*Clicking on Save Button */
				Library.Interaction.click(Xpath.StockAllocation.SaveButton);
				
				/*Verifying the Success Message*/
				WebElement SuccMsg = driver.findElement(By.xpath(Xpath.StockAllocation.SuccMessage));
				String Success = SuccMsg.getText();
				log.info("Success Message is "+Success);
				Library.Interaction.userWait();
				log.info("User Created Stock Allocation Successfully");
				
			} catch (Exception e) {
				e.printStackTrace();
				captureScreen(driver, "CreateStockAllocation");
				Assert.assertFalse(false);
				log.info("Test Failed");
			}
		}
		// The below method helps the user to search the created stock allocation	
		
			@Test(dependsOnMethods = "createStockAllocation")
				
			public void SearchStockAllocation() throws IOException {
				try {
						
				/*Click on Merchandising,search and Stock Allocations*/
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.LocationCreation.merchandising);
				log.info("User Clicked on Merchandising");
				Library.Interaction.userWait();
				Library.Interaction.moveToElement(Xpath.StockAllocation.Search);
				log.info("User Clicked on Search");
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.StockAllocation.SrchStckAllocs);
				Library.Interaction.userWait();
				log.info("User Clicked on StockAllocations");
				
				/*Entering Date in the Created Form field */
				Library.Interaction.setTextBoxByXpath(Xpath.StockAllocation.CreatedForm, CreatedDate);
				
				/*Clicking on Search Button*/
				Library.Interaction.click(Xpath.StockAllocation.ProdSrchBtn);
				log.info("User clicked on Search Button");
				Library.Interaction.userWait();
				
				/* Verifying the Shipment ID */
				WebElement ShipmentID = driver.findElement(By.xpath(Xpath.StockAllocation.ShipmentID));
				String ShipmentNum = ShipmentID.getText();
				log.info("Shipment ID is "+ShipmentNum);
				
				log.info("Stock Allocation Creation and Search is Successfull");
				

			} catch (Exception e) {
				e.printStackTrace();
				captureScreen(driver, "SearchStockAllocation");
				Assert.assertFalse(false);
				log.info("Test Failed");
			}
		}
	}

