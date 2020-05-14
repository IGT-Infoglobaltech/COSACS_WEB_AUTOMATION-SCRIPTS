package com.cosac.TestCases;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;

public class COS49_WarrantySimulator extends BaseClass{
	
	
	String WarrantyItemVal = "202017";

	@Test
	public void WarrantySimulator() throws Throwable {
	
		try {
			
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.WarrantySimulator.WarrantyLink);
			Library.Interaction.print("User Clicked on warranty");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.WarrantySimulator.WarrantySimulator);
			Library.Interaction.print("User Clicked on Warranty Simulator");
			Library.Interaction.userWait();
			String ServReqTitle = driver.findElement(By.xpath(Xpath.WarrantySimulator.WarntySimulatorTitle)).getText();
			log.info("The Title is "+ServReqTitle);
			log.info("User is in Warranty Simulator Page");

		} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "Warranty Simulator");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}
	
	@Test(dependsOnMethods = "WarrantySimulator")
	
	public void WarrantySimulatorServices() throws IOException {
		try {
			
			//Entering the value in the Item Text box
			Library.Interaction.setTextBoxByXpath(Xpath.WarrantySimulator.WrntyItem, WarrantyItemVal);
			
			//Selecting Value from Location Drop down
			Library.Interaction.click(Xpath.WarrantySimulator.WrntyLocation);
			Library.Interaction.click(Xpath.WarrantySimulator.WarrantyLocName);
			
			//Clicking on Search Button 
			Library.Interaction.click(Xpath.WarrantySimulator.WarrantySrchButton);
			
			
			//Displaying the values
			WebElement ProductNum1 = driver.findElement(By.xpath(Xpath.WarrantySimulator.ProdNum1));
			String PN1 = ProductNum1.getText();
			log.info("The Product No is "+PN1);
			
			WebElement ProductDesc1 = driver.findElement(By.xpath(Xpath.WarrantySimulator.ProdDesc1));
			String PD1 = ProductDesc1.getText();
			log.info("The Product Desccription is "+PD1);
			
			WebElement ProdretailPrice1 = driver.findElement(By.xpath(Xpath.WarrantySimulator.ProdRetailPrice1));
			String PRP1 = ProdretailPrice1.getText();
			log.info("The Product Retail Price is "+PRP1);
			
			WebElement WarrantyProd1 = driver.findElement(By.xpath(Xpath.WarrantySimulator.WarrantyProdPrice1));
			String WP1 = WarrantyProd1.getText();
			log.info("The Warranty Product is is "+WP1);
			
			WebElement Link = driver.findElement(By.xpath(Xpath.WarrantySimulator.Link1));
			String L1 = Link.getText();
			log.info("The Link is "+L1);
			
			WebElement Warranty = driver.findElement(By.xpath(Xpath.WarrantySimulator.Warranty1));
			String Wrnty = Warranty.getText();
			log.info("The Warranty is "+Wrnty);
			
			WebElement WarrantyLength = driver.findElement(By.xpath(Xpath.WarrantySimulator.WarrantyLength1));
			String WL1 = WarrantyLength.getText();
			log.info("The Warranty Length is "+WL1);
			
			WebElement WarrantyTax = driver.findElement(By.xpath(Xpath.WarrantySimulator.WarrantyTax1));
			String WT = WarrantyTax.getText();
			log.info("The Warranty tax is "+WT);
			
			WebElement WarrantyPrice = driver.findElement(By.xpath(Xpath.WarrantySimulator.WarrantyPrice));
			String WP = WarrantyPrice.getText();
			log.info("The Warranty Price is "+WP);
			
			WebElement Free = driver.findElement(By.xpath(Xpath.WarrantySimulator.Free1));
			String Free1 = Free.getText();
			log.info("The Product Free Status is "+Free1);
			
			WebElement PromotionLink = driver.findElement(By.xpath(Xpath.WarrantySimulator.ProotionLink1));
			String PL1 = PromotionLink.getText();
			log.info("The Promotion Link is "+PL1);
			
			WebElement PromotionPrice = driver.findElement(By.xpath(Xpath.WarrantySimulator.PromotionPrice));
			String PP1 = PromotionPrice.getText();
			log.info("The Promotion Price is "+PP1);
			
			WebElement PromotionMatchType = driver.findElement(By.xpath(Xpath.WarrantySimulator.PromotionMatchType));
			String PMT1 = PromotionMatchType.getText();
			log.info("The Promotion Match Type is "+PMT1);
			
			
			
			
			/*To Print the values in a table
			WebElement Table = driver.findElement(By.xpath("//section[@id='productWithWarranties']//table[@class='table table-bordered table-striped']"));
			List<WebElement> Rows_Table = Table.findElements(By.tagName("tr"));
			int RowCount = Rows_Table.size();
			log.info("No Of Rows in table is "+RowCount);
			for(int rows=0;rows<RowCount;rows++)
			{
				List<WebElement> ColRow = Rows_Table.get(rows).findElements(By.tagName("td"));
				int ColCount = ColRow.size();
				log.info("No Of Columns in table is "+ColCount);
				log.info("No of cells in Row "+rows+" are "+ColCount);
				for(int Column=0;Column<ColCount;Column++)
				{
					String Text = ColRow.get(Column).getText();
					log.info("The Value of Row Number "+rows+" and Column number "+Column+" is "+Text);
				}
			}*/
			
		} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "Warranty Simulator Services");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}


}
