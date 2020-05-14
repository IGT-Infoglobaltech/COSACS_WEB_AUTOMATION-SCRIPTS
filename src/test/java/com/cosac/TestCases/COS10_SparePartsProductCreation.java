
/**

* Project Name : COSAC

* Author : Vivek Bharti

* Version : 10.5.2.2124

* Reviewed By : SARAVANA KUMAR

* Date of Creation : Mar 17, 2020

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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;
import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;

public class COS10_SparePartsProductCreation extends BaseClass {
	String locationId = "123496";
	String SalesSystemId = "67811";
	String name = "Agra";
	String ExpectedSparePartLabel = "Create Spare Part";
	String POSDescription = "Spareda";
	String LongDescription = "Description of Spare data:Mobile Cov";
	String PartNumber = "2367";
	String VendorModelNumber = "7865443989";
	String CountryOfOrigin = "JMn";
	String searchPrimaryVendor = "REGAL";
	String PrimaryVendor = "REGAL WORLDWIDE TRADE";

	// User is creating and verifying Spare Part under Merchandising.
	@Test
	public void saprePartCreation() throws IOException {
		try {

			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.LocationCreation.merchandising);
			Library.Interaction.print("User Clicked on Merchandising");
			log.info("User Clicked on Merchandising");
			Library.Interaction.userWait();
			Library.Interaction.moveToElement(Xpath.LocationCreation.create);
			Library.Interaction.print("User Clicked on Create");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.SparePartsCreation.SparePart);
			Library.Interaction.print("User Clicked on Spare Part");
			log.info("User Clicked on Spare Part");
			String createSparePartLabel = driver.findElement(By.xpath(Xpath.SparePartsCreation.verifySparePartpage))
					.getText();
			Assert.assertEquals(createSparePartLabel, ExpectedSparePartLabel);
			log.info("User are in Create Spare Part Page");
		} catch (Exception e) {
			captureScreen(driver, "location");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}

	// Creating Spare Part
	@Test(dependsOnMethods = "saprePartCreation")
	public void verifysaprePartCreation() throws IOException {
		try {
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.SparePartsCreation.POSDescription, POSDescription);
			log.info("User Entered Description");
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.SparePartsCreation.LongDescription, LongDescription);
			log.info("User Entered Long Description");
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.SparePartsCreation.PartNumber, PartNumber);
			log.info("User Entered PartNumber");
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.SparePartsCreation.VendorModelNumber, VendorModelNumber);
			log.info("User Entered Long Vendor Model Number");
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.SparePartsCreation.CountryOfOrigin, CountryOfOrigin);
			Library.Interaction.userWait();
			Library.Interaction.selectEle(Xpath.SparePartsCreation.PrimaryVendor,
					Xpath.SparePartsCreation.searchPrimaryVendor, Xpath.SparePartsCreation.PrimaryVendorselect,
					searchPrimaryVendor, PrimaryVendor);
			log.info("User Selected Primary Vendor");
			Library.Interaction.userWait();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,100)");
			Library.Interaction.click(Xpath.SparePartsCreation.saveSparePart);
			log.info("User is able to save Spare Party");
			// Library.Interaction.userWait();
			Thread.sleep(7000);
			Library.Interaction.verifyToastMessage(Xpath.toastMassage.Message_catch);
			Library.Interaction.userWait();
			Library.Interaction.ExplicitWait(Xpath.SparePartsCreation.SKU);
			String SKUName = driver.findElement(By.xpath(Xpath.SparePartsCreation.SKU)).getText();
			Thread.sleep(7000);
			Library.Interaction.click(Xpath.LocationCreation.merchandising);
			Library.Interaction.print("User Clicked on Merchandising");
			Library.Interaction.userWait();
			Library.Interaction.moveToElement(Xpath.LocalProduct.SearchSubMenu);
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.SparePartsCreation.SrchProdEnquiry);
			Library.Interaction.userWait();
			Library.Interaction.ExplicitWait(Xpath.SparePartsCreation.searchFields);
			Library.Interaction.setTextBoxByXpath(Xpath.SparePartsCreation.searchFields, SKUName);
			try {
				if (driver.findElement(By.xpath(Xpath.SparePartsCreation.verifyProduct)).isDisplayed()) {
					String ProductStatus = driver.findElement(By.xpath(Xpath.SparePartsCreation.productStatus))
							.getText();
					Library.Interaction.print("User is able to search Product with product status: " + ProductStatus);
					log.info("User is able to search Product with product status: " + ProductStatus);
				}
			} catch (Exception e) {
				log.info("User is able to find searched Product");
			}
			Library.Interaction.userWait();
			Thread.sleep(5000);

		} catch (Exception e) {
			captureScreen(driver, "createLocationForm");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}

}
