package com.cosac.TestCases;

import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class COS50_WarrantyPromotions extends BaseClass {
	
	
	String WarrantyText = "191022";
	String warrantyNameVal = "191022";
	String DiscountVal = "58";
	@Test
	public void WarrantyPromotions() throws Throwable {
	
		try {
			
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.WarrantyPromotions.WarrantyLink);
			log.info("User Clicked on warranty");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.WarrantyPromotions.WarrantyPromotions);
			log.info("User Clicked on Warranty Promotions");
			Library.Interaction.userWait();
			String ServReqTitle = driver.findElement(By.xpath(Xpath.WarrantyPromotions.WarntyPromotionsTitle)).getText();
			log.info("The Title is "+ServReqTitle);
			log.info("User is in Warranty Promotions Page");

		} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "Warranty Promotions");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}
	
	@Test(dependsOnMethods = "WarrantyPromotions")
	
	public void WarrantyPromotionsServices() throws IOException {
		try {
			
			
			
			/*To Scroll down the application */
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,750)", "");
			Thread.sleep(2000);
			
			//Clicking on Add Button
			Library.Interaction.click(Xpath.WarrantyPromotions.AddButton);
			
			//Clicking on Warranty Drop Down
			Library.Interaction.click(Xpath.WarrantyPromotions.WarrantyDrpDwn);
			Library.Interaction.setTextBoxByXpath(Xpath.WarrantyPromotions.WarrantySrchName, WarrantyText);
			List<WebElement> DropDownVal = driver.findElements(By.xpath(Xpath.WarrantyPromotions.WarrantyName));
			for (int i = 0; i < DropDownVal.size(); i++)
			{
				if (DropDownVal.get(i).getText().equals(warrantyNameVal))
				{
					log.info("Text-->"+DropDownVal.get(i).getText());
					Thread.sleep(2000);
					DropDownVal.get(i).click();
					break;
				}
			}
			log.info("User clicked 191203:TVS $1-29999");
			Thread.sleep(2000);
			
			//Clicking on Store Type Value
			
			Library.Interaction.click(Xpath.WarrantyPromotions.CourtsStore);
			Library.Interaction.click(Xpath.WarrantyPromotions.CourtsStoreVal);
			
			//Entering Start Date
			Library.Interaction.click(Xpath.WarrantyPromotions.StartDate);
			Library.Interaction.click(Xpath.WarrantyPromotions.StartDatePick);
			
			//Entering End Date
			Library.Interaction.click(Xpath.WarrantyPromotions.EndDate);
			Library.Interaction.click(Xpath.WarrantyPromotions.EndDatePick);
			
			//Selecting value from promotion drop down
			Library.Interaction.click(Xpath.WarrantyPromotions.PromotionDrpDwn);
			Library.Interaction.click(Xpath.WarrantyPromotions.Promotionval);
			Thread.sleep(2000);
			
			//Entering value in the Set Price Text Box
			Library.Interaction.setTextBoxByXpath(Xpath.WarrantyPromotions.DiscountTextBox, DiscountVal);
			
			//Clicking Save Button 
			Library.Interaction.click(Xpath.WarrantyPromotions.SaveBtnWarranty);
			Thread.sleep(2000);
			
			//Capturing the Toast Message
			WebElement SuccMsg = driver.findElement(By.xpath(Xpath.WarrantyPromotions.SuccMsgWarrantyPromo));
			String SuccMsgDisp = SuccMsg.getText();
			log.info("The Success Msg captured is "+SuccMsgDisp);
			log.info("User Created Warranty Promotions Successfully");
			Thread.sleep(2000);
			
			//Entering the value in the Item Text box
			Library.Interaction.setTextBoxByXpath(Xpath.WarrantyPromotions.WarrantyPromotionName, WarrantyText);
			
			
			//Clicking on Search Button 
			Library.Interaction.click(Xpath.WarrantyPromotions.SearchButton);
			Thread.sleep(2000);
			
			//Displaying the Promoted values
			WebElement FilterVal = driver.findElement(By.xpath(Xpath.WarrantyPromotions.Filters));
			String Filter = FilterVal.getText();
			log.info("The Filter column values are "+Filter);
			
			WebElement StartDt = driver.findElement(By.xpath(Xpath.WarrantyPromotions.StartDatePromo));
			String SD = StartDt.getText();
			log.info("The Start date is "+SD);
			
			WebElement EndDt = driver.findElement(By.xpath(Xpath.WarrantyPromotions.EndDatePromo));
			String ED = EndDt.getText();
			log.info("The End Date is "+ED);
			
			WebElement PromoPrice = driver.findElement(By.xpath(Xpath.WarrantyPromotions.PromotionPriceValue));
			String PPV = PromoPrice.getText();
			log.info("The Promotion Price value is "+PPV);

			
			
		} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "Warranty Promotion Services");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}




}
