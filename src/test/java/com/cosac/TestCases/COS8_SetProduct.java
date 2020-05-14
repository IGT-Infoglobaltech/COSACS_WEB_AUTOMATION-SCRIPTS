package com.cosac.TestCases;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;

public class COS8_SetProduct extends BaseClass{
	
	String ExpecSetProdTitle = "Create Set";
	String SetProdDesc = "Set Product Creation";
	String HierDivValue = "RADIO SHACK";
	String HierDeptValue = "WASHING MACHINE AND DRYER";
	String HierClassValue = "RS RADIOS";
	String AddTagsVal = "Fact";
	String TagsVal = "Fact2000 Deleted";
	String SetProdSrch = "OC0258";
	String ProdValue = "OC0258";
	String QuantitySetProd = "2";
	String SetProdSrch2 = "OCC004";
	String ProdValue2 = "OCC004";
	String QuantitySetProd2 = "1";
	String EffectiveDate = "05/14/2020";
	String FasciaName = "Courts";
	String FasciaValue = "Courts";
	
	
	@Test
	public void SetProduct() throws Throwable {
	
		try {
			Library.Interaction.userWait();
			//driver.findElement(By.xpath(Xpath.LocationCreation.merchandising)).click();
			Library.Interaction.click(Xpath.LocationCreation.merchandising);
			log.info("User Clicked on Merchandising");
			Library.Interaction.userWait();
			Library.Interaction.moveToElement(Xpath.LocationCreation.create);
			log.info("User Clicked on Create");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.SetProduct.setProduct);
			Library.Interaction.userWait();
			log.info("User Clicked on Set");
			String SetProdCreationTitle = driver.findElement(By.xpath(Xpath.SetProduct.verifySetProduct)).getText();
			Assert.assertEquals(SetProdCreationTitle, ExpecSetProdTitle);
			log.info("User is in Set Product Creation Page");

			} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "SetProduct");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}
	
	
	@Test(dependsOnMethods = "SetProduct")
	
	public void createSetProduct() throws IOException {
		try {
			
			/*Entering Text to the Description field */
			Library.Interaction.setTextBoxByXpath(Xpath.SetProduct.SetProdDesc, SetProdDesc);
			
			/* Clicking on the check box */
			Library.Interaction.click(Xpath.SetProduct.CheckBox);
			Library.Interaction.userWait();
			
			/* Clicking on the Save Button */
			Library.Interaction.click(Xpath.SetProduct.SaveBtn);
			
			/* Verifying the Success Message */
			WebElement SuccMsg = driver.findElement(By.xpath("//div[@id='growlcontainer']"));
			String Success = SuccMsg.getText();
			Library.Interaction.print("Success Message is "+Success);
			Library.Interaction.userWait();
			log.info("User Saved Set Product");
			
			/*Verifying the SKU number */
			WebElement SetID = driver.findElement(By.xpath("//h2[@id='page-heading']"));
			String SetProdID = SetID.getText();
			String[] Str3 = SetProdID.split(" ");
			log.info("The Set ID is "+Str3[1]);
			Library.Interaction.userWait();
			
			/*verifying the status */
			WebElement StatusNA = driver.findElement(By.xpath("//select[@name='status']"));
			String StatusNonActive = StatusNA.getText();
			log.info("The Status is "+StatusNonActive);
			
			/*Selecting value from Hierarchy Division Drop Down */
			Library.Interaction.click(Xpath.SetProduct.HierDiv);

			List<WebElement> HierDivDropDownVal = driver.findElements(By.xpath("//div[contains(text(),'RADIO SHACK')]"));
			for (int i = 0; i < HierDivDropDownVal.size(); i++)
			{
				if (HierDivDropDownVal.get(i).getText().equals(HierDivValue))
				{
					HierDivDropDownVal.get(i).click();
					break;
				}
			}
			log.info("User clicked RADIO SHACK");
			
			/* Verifying the Success Message */
			WebElement SuccMsgDiv= driver.findElement(By.xpath("//div[@id='growlcontainer']"));
			String SuccessDiv = SuccMsgDiv.getText();
			log.info("Success Message is "+SuccessDiv);
			Library.Interaction.userWait();
			
			
			/*Selecting value from Hierarchy Department Drop Down */
			Library.Interaction.click(Xpath.SetProduct.HierDept);

			List<WebElement> HierDeptDropDownVal = driver.findElements(By.xpath("//div[contains(text(),'WASHING MACHINE AND DRYER')]"));
			for (int i = 0; i < HierDeptDropDownVal.size(); i++)
			{
				if (HierDeptDropDownVal.get(i).getText().equals(HierDeptValue))
				{
					HierDeptDropDownVal.get(i).click();
					break;
				}
				Thread.sleep(2000);
			}
			log.info("User clicked WASHING MACHINE AND DRYER");
			
			/* Verifying the Success Message */
			WebElement SuccMsgDept= driver.findElement(By.xpath("//div[@id='growlcontainer']"));
			String SuccessDept = SuccMsgDept.getText();
			log.info("Success Message is "+SuccessDept);
			Library.Interaction.userWait();
			
			
			/*Selecting value from Hierarchy Class Drop Down */
			Thread.sleep(3000);
			Library.Interaction.click(Xpath.SetProduct.HierClasss);

			List<WebElement> HierClassDropDownVal = driver.findElements(By.xpath("//div[contains(text(),'RS RADIOS')]"));
			for (int i = 0; i < HierClassDropDownVal.size(); i++)
			{
				if (HierClassDropDownVal.get(i).getText().equals(HierClassValue))
				{
					HierClassDropDownVal.get(i).click();
					break;
				}
				Thread.sleep(2000);
			}
			log.info("User clicked 12 MONTHS SERVICE PACKAGE");
			
			/* Verifying the Success Message */
			WebElement SuccMsgClass= driver.findElement(By.xpath("//div[@id='growlcontainer']"));
			String SuccessClass = SuccMsgClass.getText();
			log.info("Success Message is "+SuccessClass);
			Library.Interaction.userWait();
			
			/* Entering the value to Add Tag Input field */
			Thread.sleep(3000);
			Library.Interaction.setTextBoxByXpath(Xpath.SetProduct.AddTags, AddTagsVal);
			
			/* Selecting value from Add Tags Drop down */
			List<WebElement> AddTagDrpDown = driver.findElements(By.xpath("//li[@class='ng-scope active']/a[@class='ng-binding']"));
			for(int i = 0; i < AddTagDrpDown.size(); i++)
			{
				if (AddTagDrpDown.get(i).getText().equals(TagsVal))
				{
					AddTagDrpDown.get(i).click();
					break;
				}
				Thread.sleep(2000);
			}
			log.info("User clicked Fact 2000 Deleted");
			
			/* Clicking on the Add Button */
			Library.Interaction.click(Xpath.SetProduct.AddButton);
			log.info("User Clicked on Add Button");
			
			/* Clicking on + button */
			Library.Interaction.click(Xpath.SetProduct.AddProdBtn);
			log.info("User Clicked on Add Product Button");
			
			/*Selecting value from Product Drop Down*/
			Library.Interaction.selectEle(Xpath.SetProduct.SetProdDrpDown, Xpath.SetProduct.SetProdSrch, Xpath.SetProduct.SetProdName, SetProdSrch, ProdValue);
			log.info("User clicked  OC0219: RA704110365100 - LEOPARD YELLOW");
			Library.Interaction.userWait();
			
			/*Verifying the description of the product*/
			WebElement Description = driver.findElement(By.xpath("//tr[@class='ng-scope ng-valid-required ng-dirty ng-valid ng-valid-min-length']/td[4]"));
			String Desc = Description.getText();
			log.info("Description of Product is " +Desc);
			Thread.sleep(2000);
			
			/*Entering the Quantity*/
			WebElement Quantity = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-valid ng-valid-required']"));
			Quantity.clear();
			Quantity.sendKeys("2");
			Thread.sleep(1000);
			
			/*Click on Save Button*/
			Library.Interaction.click(Xpath.StockAllocation.SaveAllocProd);
			Library.Interaction.userWait();
			log.info("User saved the Product");
			
			/* Clicking on + button */
			Library.Interaction.click(Xpath.SetProduct.AddProdBtn);
			log.info("User Clicked on Add Product Button");
			
			/*Selecting value from Product Drop Down*/
			Library.Interaction.selectEle(Xpath.SetProduct.AddProd2, Xpath.SetProduct.AddProdSrch2, Xpath.SetProduct.SetProdName2, SetProdSrch2, ProdValue2);
			log.info("User clicked  OPW1D3:  VO293725355100 - VO2937 ACETATE OPAL PINK FULL RIM");
			Library.Interaction.userWait();
			
			/*Verifying the description of the product*/
			WebElement Description2 = driver.findElement(By.xpath("(//td[@class='ng-binding'])[2]"));
			String Desc2 = Description2.getText();
			log.info("Description of Product is " +Desc2);
			Thread.sleep(2000);
			
			/*Entering the Quantity*/
			WebElement Quantity2 = driver.findElement(By.xpath("(//td[@class='quantity'])[2]//input[@name='quantity']"));
			Quantity2.clear();
			Quantity2.sendKeys("2");
			Thread.sleep(1000);
			
			/*Click on Save Button*/
			Library.Interaction.click(Xpath.StockAllocation.SaveAllocProd);
			Library.Interaction.userWait();
			log.info("User saved the Product");
			
			
			/*Entering the Date*/
			Library.Interaction.setTextBoxByXpath(Xpath.SetProduct.EffecDate, EffectiveDate);
			
			/*Selecting Value from Fascia Drop Down */
			Library.Interaction.selectEle(Xpath.SetProduct.FasciaDrpDwn, Xpath.LocationCreation.fasciaSerch, Xpath.SetProduct.FasciaNameVal, FasciaName, FasciaValue);
			
			/*Clicking on Add Button*/
			Library.Interaction.click(Xpath.SetProduct.AddBtnClick);
			Thread.sleep(2000);
			log.info("User Clicked on Add Button");
			
			/*clicking on Product Edit Icon*/
			Library.Interaction.click(Xpath.SetProduct.ProdEditIcon);
			log.info("User clicked on Edit Icon");
			
			/*To Scroll down the application */
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,250)", "");
			Library.Interaction.userWait();
			
			//Entering the value in the cash price
			Library.Interaction.CashFormat("(//pb-tax-input[@class='ng-isolate-scope ng-scope'])[2]/input[@class='form-control ng-pristine ng-valid']","40000");
			log.info("User Entered Cash Price");
			Thread.sleep(1000);
			
			/*To Scroll down the application */
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,250)", "");
			Thread.sleep(1000);
			
			/*Entering the value in the Regular price*/
			Library.Interaction.CashFormat("(//div[@class='panel panel-default buffer all buffer-sm']//pb-tax-input[@name='setPrice'])[2]/input[1]","50000");
			log.info("User Entered Regular Price");
			Thread.sleep(1000);
			
			/*Entering the value in the Duty Free price*/
			//Library.Interaction.CashFormat("(//pb-tax-input[@class='ng-isolate-scope ng-scope'])[6]/input[@class='form-control ng-pristine ng-valid']","40000");
			//log.info("User Entered Duty Free Price");
			
			/*Clicking on the Save Button*/
			Library.Interaction.click(Xpath.SetProduct.ProdsAddBtn);
			Thread.sleep(2000);
			
			/*To Scroll up the application */
			JavascriptExecutor jsUp = (JavascriptExecutor) driver;
			jsUp.executeScript("window.scrollBy(0,-750)", "");
			Thread.sleep(2000);
			
			/*Clicking on Save Button */
			Library.Interaction.click(Xpath.SetProduct.SaveBtnSet);
			Thread.sleep(2000);
			log.info("User Clicked on Save Button");
			
			/* Verifying the Success Message */
			WebElement SuccMsgSave= driver.findElement(By.xpath("//div[@id='growlcontainer']"));
			String SuccessSave = SuccMsgSave.getText();
			log.info("Success Message is "+SuccessSave);
			
			
			/*Comments*/
			//log.info("The Status will be changed to Active after EOD Job");
			
			}
	
		catch(Exception e) {
			e.printStackTrace();
			captureScreen(driver, "SetProduct");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}
}

