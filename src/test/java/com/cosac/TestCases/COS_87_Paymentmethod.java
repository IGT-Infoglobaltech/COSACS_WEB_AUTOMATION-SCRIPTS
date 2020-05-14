package com.cosac.TestCases;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;

public class COS_87_Paymentmethod extends BaseClass {
   
	static String verifypage="Payment Methods Setup";
	static String productcode="r55s";
	@Test
	public static void verifypaymentpage() throws Exception
	{
		try {
						
			Library.Interaction.userWait();
			Library.Interaction.switchduplicate();		
			
			log.info("User switched to child window");
			
			//******************Opening new tab with same Ip address*******************
			
			Library.Interaction.switchtoparent();
			log.info("User is in main window");
			
			//***************Switching to parent window*********************88
			
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.paymentmethod.salesbut);
			log.info("User successfully clicked on sales tab");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.paymentmethod.pointofsalesbut);
			log.info("User successfully clicked on Point of sales tab");
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.paymentmethod.POSsearchtextbox, productcode);
			log.info("User entered product code in search box");
			Thread.sleep(2000);
			Library.Interaction.click(Xpath.paymentmethod.selectproductPOS);
			log.info("User selected and added the product into basket");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.paymentmethod.paymentbuttonPOS);
			log.info("User clicked on payment screen");			
			Thread.sleep(3000);
			
			//********************USer is able to view the payment screen with active payment methods*******************
			
			log.info("************Start of payment method list present******");
			List<WebElement> payvalue = driver.findElements(By.xpath(Xpath.paymentmethod.paymentoption));
			for (WebElement wb : payvalue) {				
				String text = wb.getText();				
				log.info("  "+text);				
			} 
			log.info("************End of payment method list present**********");
			
			
			//***************Print the active payment methods present in screen************************
			
			
				Thread.sleep(2000);				
			Library.Interaction.switchtochildwin1();
			
			//****************Switching to child window******************
			
			Library.Interaction.userWait();			
        	Library.Interaction.click(Xpath.paymentmethod.paymenttab);
			log.info("User clicked on payment tab");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.paymentmethod.paymentsetup);
			log.info("User clicked on paymentsetup tab");
			Library.Interaction.userWait();
		    String verifysetuppage = driver.findElement(By.xpath(Xpath.paymentmethod.verifypaymentsetuppage)).getText();
			Assert.assertEquals(verifysetuppage, verifypage);
			log.info("User successfully logged into payment setup page");
			List<WebElement> val = driver.findElements(By.xpath(Xpath.paymentmethod.tablelist));
			for (WebElement wb : val) {
				String va = wb.getText();
				System.out.print(va+"-");
				
			}
			log.info("User successfully noted all the present list of payment method");
			
			//******************Noted all the payment method name***************
			
			Library.Interaction.userWait();
			 List<WebElement> res = driver.findElements(By.xpath(Xpath.paymentmethod.tdd));//click
			for (WebElement check : res) {								
					//boolean wat = check.isSelected();
					//if(wat) {
						check.click();
														}
			log.info("User successfully checked the unchecked check box in teh list");
			
			//**************check the unchecked check box****************
			
			Library.Interaction.switchtoparent();
			
			//****************switching to parent window***************************
			
			Thread.sleep(1000);
			Library.Interaction.refreshpage();
			
			//************Refresh the page**************************
      	    
			Thread.sleep(2000);
			Library.Interaction.click(Xpath.paymentmethod.selectproductPOS);
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.paymentmethod.paymentbuttonPOS);
			log.info("User is in payment screen");			
			Library.Interaction.userWait();
			log.info("********Start of payment method list present after update in payment list******");
			List<WebElement> paymethodverify = driver.findElements(By.xpath(Xpath.paymentmethod.paymentoption));
			for (WebElement wb : paymethodverify) {				
				String text = wb.getText();
				log.info("  "+text);				
			}
			log.info("************End of payment method list present**********");
			
			//*******Noted all the payment methods present*************
						
			Library.Interaction.userWait();
			Library.Interaction.switchtochildwin1();	
	
			//**********Switching to child window********************
			
			 List<WebElement> res1 = driver.findElements(By.xpath(Xpath.paymentmethod.tdd));//click
				for (WebElement check : res1) {								
//						boolean wat = check.isSelected();
//						if(wat) {
							check.click();
															}
				log.info("User checked the unchecked check box");
				
			//**************Check the unchecked once**************
				
				Library.Interaction.userWait();
				Library.Interaction.switchtoparent();				
				Thread.sleep(1000);
				Library.Interaction.refreshpage();	      	    
				Thread.sleep(2000);
				Library.Interaction.click(Xpath.paymentmethod.selectproductPOS);
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.paymentmethod.paymentbuttonPOS);
				log.info("User is in payment screen with active payment methods");
				
				//***************User is able to see the atcive payment methods**********
				
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.paymentmethod.menubutton);
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.paymentmethod.homeicon);
				log.info("User is in home page");
				
				
			
			
		} catch (InterruptedException e) {
			captureScreen(driver, "verifypaymentpage(");
			Assert.assertFalse(false);
			log.info("Test Failed"); 
		}
	}
	
	
	
}
