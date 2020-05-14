package com.cosac.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;

/*
* Project Name : CosaCS -  Unicomer - COS_86_Exchangerate
* Author : Shivaprasad
* Version : v10.5.2.2124
* Reviewed By : 
* Date of Creation : 
* Date of change : 
* changed function : 
* Steps followed : Login-->Payments-->update Exchange rate-->POS-->Purchase sale--->Payment screen-->Validate Exchange rate
* Modified By : 
*/

public class COS_86_Exchangerate extends BaseClass {
	static String codeselect="ERN";
	static String verifyheader="Exchange Rate";
	static String date="03/21/2020";//update tomorrow's date 
	static String currencyselect="USD";
	static String productcode="r55s";
	static String poscurrency="United";
	
	@Test
	
	public static void verifyexchangerate() throws Exception{

		try {
			
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.Exchangerate.paymenttab);
			log.info("User cliced on payment tab");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.Exchangerate.exchangeratetab);
			log.info("User clicked on exchangerate tab");
			Library.Interaction.userWait();
			String header = driver.findElement(By.xpath(Xpath.Exchangerate.verifyheader)).getText();
			Assert.assertEquals(header, verifyheader);
			log.info("User successfully logged into Exchange Rate page");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.Exchangerate.addicon);
			log.info("User clicked on add icon for adding currency rate");
			Library.Interaction.userWait();
			Library.Interaction.selectele(Xpath.Exchangerate.currencydroparrow2, Xpath.Exchangerate.currencydroptextbox2, Xpath.Exchangerate.currencydropselect2, codeselect, codeselect);
			log.info("User selected the required currency in the list");
			Thread.sleep(1000);
			Library.Interaction.setTextBoxByXpath(Xpath.Exchangerate.rateinput, "100");
			log.info("User added the exchangerate for selected currency");
			Thread.sleep(1000);
			Library.Interaction.setTextBoxByXpath(Xpath.Exchangerate.datefrom, date);
			log.info("User slected the date from when the exchangerate should be in active in application");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.Exchangerate.undoicon);
			log.info("User clicked on undo icon");
			Library.Interaction.userWait();
			Library.Interaction.selectele(Xpath.Exchangerate.currencydroparrow1, Xpath.Exchangerate.currencytextbox1, Xpath.Exchangerate.currencyselect1, currencyselect, currencyselect);
			Thread.sleep(1000);
			log.info("USer selecetd teh required currency for fetching the details of exchange rate");
			Library.Interaction.setTextBoxByXpath(Xpath.Exchangerate.effdate, date);
			Library.Interaction.userWait();
			log.info("User selcted the effected date");
			Library.Interaction.click(Xpath.Exchangerate.searchbutton);
			log.info("All related currency exchange rate details is displayed");
			Thread.sleep(1000);
			log.info(driver.findElement(By.xpath(Xpath.Exchangerate.currencydisplayed)).getText());
			log.info("Currency name");
			Library.Interaction.userWait();
		String digit = Library.Interaction.retainonlynumberswithdeci(Xpath.Exchangerate.Ratedisplayed);
		double rate = Double.parseDouble(digit);
		int verifyrate = (int)rate;
		log.info("$"+verifyrate);
			log.info("Exchange rate for above currency");
			Library.Interaction.userWait();
			log.info(driver.findElement(By.xpath(Xpath.Exchangerate.datedisplayed)).getText());
			log.info("Effective date for above currency");
			
			
			//**************Verify the currency **********************
			
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.Exchangerate.salesbut);
			log.info("User successfully clicked on sales tab");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.Exchangerate.pointofsalesbut);
			log.info("User successfully clicked on Point of sales tab");
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.Exchangerate.POSsearchtextbox, productcode);
			log.info("User entered product code in search box");
			Thread.sleep(2000);
			Library.Interaction.click(Xpath.Exchangerate.selectproductPOS);
			log.info("User selected and added the product into basket");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.Exchangerate.paymentbuttonPOS);
			log.info("User clicked on payment screen");			
			Thread.sleep(2000);
			
			Library.Interaction.click(Xpath.Exchangerate.foriengcashPOS);
			Library.Interaction.userWait();
			Library.Interaction.selectele(Xpath.Exchangerate.currencydroparrowPOS, Xpath.Exchangerate.currencytextboxPOS, Xpath.Exchangerate.currencyselectPOS, currencyselect, poscurrency);
			Thread.sleep(2000);
			String posrate = Library.Interaction.splithequal(Xpath.Exchangerate.verifyconversionpos);
			int verifyposrate = Integer.parseInt(posrate);
			log.info("$"+verifyposrate);
			Assert.assertEquals(verifyrate, verifyposrate);
			log.info("Conversion Exchange rate is verified accordingly");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.Exchangerate.menubutton);
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.Exchangerate.homeicon);
			log.info("User is in home page");
									
			
		} catch (InterruptedException e) {
			captureScreen(driver, "verifypaymentpage(");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
		
	}

}
