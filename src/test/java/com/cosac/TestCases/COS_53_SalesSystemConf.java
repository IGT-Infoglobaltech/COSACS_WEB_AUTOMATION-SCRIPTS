package com.cosac.TestCases;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;

/*
* Project Name : CosaCS -  Unicomer - COS_53_SalesSystemConf
* Author : Shivaprasad
* Version : v10.5.2.2124
* Reviewed By : 
* Date of Creation : 
* Date of change : 
* changed function : 
* Steps followed : Login-->Configuration-->System settings-->Edit ALl required fields-->POS -->Validate Changes made-->Re-correct previous data-->save
* * Modified By : 
*/

public class COS_53_SalesSystemConf extends BaseClass{
	
static String verifysysheader="System Settings";
static String productcode="MMT1EF";
static String soldbyname="UNICORP JAMAICA";
static String customerid="AD";
static String reason="siva siva";
static String user="./Configuration/config.properties/userName";
static String pwd="./Configuration/config.properties/passWord";
//static String taxfree="Tax Free";
//static String dutyfree="Duty Free";
public static  Robot r;
	@Test
	public static void Test1() throws Exception
	{
		try {
			Library.Interaction.userWait();
			Library.Interaction.switchduplicate();
			Library.Interaction.switchtochildwin1();			
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.manualreturn.configurationtab);
			log.info("User clicked on configuration tab");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.manualreturn.systemsetting);
			Library.Interaction.userWait();
			log.info("User clicked on system settings");
			String header = driver.findElement(By.xpath(Xpath.manualreturn.systemsettingheader)).getText();
		Assert.assertEquals(header, verifysysheader);
		log.info("User successfully logged into system setting page");
		Library.Interaction.userWait();
		Library.Interaction.click(Xpath.manualreturn.sales);
		log.info("User selected sales configuration setting");
		
	//********************Login to page***
		
		Library.Interaction.userWait();		
		 List<WebElement> val = driver.findElements(By.xpath(Xpath.manualreturn.presentreturnreason));
		 for (WebElement wb : val) {
			 System.out.println(wb.getText());
		}
		log.info("USer succesfully made a note of present reason list");
		 Thread.sleep(500);
		Library.Interaction.click(Xpath.manualreturn.returnediticon);
		 Thread.sleep(500);
		Library.Interaction.click(Xpath.manualreturn.editreturnreason);
		Thread.sleep(500);
		log.info("User logged into reason text area to update reason point");
		
		Thread.sleep(1000);
		Library.Interaction.keyuparrow();
		Thread.sleep(500);
		Library.Interaction.typeCharacter("siva siva");
		log.info("User updated the reason point as -->   siva siva ");
		r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		Library.Interaction.click(Xpath.manualreturn.saveiconreturnreason);
		log.info("User saved the changes made");
	
		
		//*******************Return / exchange************
		
		Library.Interaction.ScrollElemntsample(Xpath.manualreturn.countryname);
		String name1 = driver.findElement(By.xpath(Xpath.manualreturn.countryname)).getText(); 
		log.info("Name to be changed -->   "+name1);
		Library.Interaction.userWait();
		String countryname = driver.findElement(By.xpath(Xpath.manualreturn.presentcountryname)).getText();
		 log.info("Current country name -->  "+countryname);
		 Library.Interaction.userWait();
		 Library.Interaction.click(Xpath.manualreturn.countrynameediticon);		 
		 Library.Interaction.setTextBoxByXpath(Xpath.manualreturn.editcountrynametextbox, "123");
		 log.info("User successfully made few changes in country name field");
             Thread.sleep(100);
             Library.Interaction.click(Xpath.manualreturn.saveiconcountryname);
             log.info("User saved the changes made");
             
             //************COUNTRY NAME CHanged*********************
             
             Thread.sleep(100);
             String name2 = driver.findElement(By.xpath(Xpath.manualreturn.currencysymbolname)).getText();
             log.info("Name to be changed -->   "+name2);
             Library.Interaction.userWait();
             String currencysymbol = driver.findElement(By.xpath(Xpath.manualreturn.presentcurrency)).getText();
             log.info("Current currency symbol -->  "+currencysymbol);              
             Library.Interaction.click(Xpath.manualreturn.currencysymbolediticon);
             Library.Interaction.setTextBoxByXpath(Xpath.manualreturn.editcurrencysymbol, "$");
             log.info("User successfully made few changes in currency symbol field");
             Thread.sleep(500);
             Library.Interaction.click(Xpath.manualreturn.saveiconcurrency);
             log.info("User saved the changes made");
             
           //************CURRENCY CHanged*********************
             
             Thread.sleep(100);
             String name3 = driver.findElement(By.xpath(Xpath.manualreturn.companytaxnumber)).getText();
             log.info("Name to be changed -->   "+name3);
             Library.Interaction.userWait();
             String taxnumber = driver.findElement(By.xpath(Xpath.manualreturn.presenttaxnumber)).getText();
             log.info("Current Tax number -->  "+taxnumber);                          
             Library.Interaction.click(Xpath.manualreturn.taxnumberediticon);
             Thread.sleep(500);
             Library.Interaction.setTextBoxByXpath(Xpath.manualreturn.edittaxnumber, "123");
             log.info("User successfully made few changes in company Tax number field");
             Thread.sleep(500);
             Library.Interaction.click(Xpath.manualreturn.saveicontaxnumber);
             log.info("User saved the changes made");
             
             //****TAX number changed*************
             
             Thread.sleep(100);
             String name4 = driver.findElement(By.xpath(Xpath.manualreturn.Taxname)).getText();
             log.info("Name to be changed -->   "+name4);
             Library.Interaction.userWait();
             String taxname = driver.findElement(By.xpath(Xpath.manualreturn.presenttaxname)).getText();
             log.info("Current Tax name -->  "+taxname);                         
             Library.Interaction.click(Xpath.manualreturn.taxnameediticon);
             Library.Interaction.setTextBoxByXpath(Xpath.manualreturn.edittaxname, "GST");
             log.info("User successfully made few changes in company Tax name field");
             Thread.sleep(500);
             Library.Interaction.click(Xpath.manualreturn.saveicontaxname);
             log.info("User saved the changes made");
             
           //****TAX name changed*************  
            
             
             Thread.sleep(100);
             String name5 = driver.findElement(By.xpath(Xpath.manualreturn.dutyfree)).getText();
             log.info("Name to be changed -->   "+name5);
            Library.Interaction.userWait();
             String dutyfree = driver.findElement(By.xpath(Xpath.manualreturn.presentdutyfreesales)).getText();
             log.info("Current status 'true' or 'false' -->  "+dutyfree);                         
             Library.Interaction.click(Xpath.manualreturn.dutyfreeediticon);
             Library.Interaction.click(Xpath.manualreturn.editdutyfree);
             log.info("User successfully made changes by clicking on check box");
             Thread.sleep(500);
             Library.Interaction.click(Xpath.manualreturn.saveicondutyfree);
             log.info("User saved the changes made");
             
             //*********Duty free enable or disable******
             
             
            Library.Interaction.switchtoparent();
            Library.Interaction.userWait();
 			Library.Interaction.click(Xpath.Exchangerate.salesbut);
 			log.info("User successfully clicked on sales tab");
 			Library.Interaction.userWait();
 			Library.Interaction.click(Xpath.Exchangerate.pointofsalesbut);
 			log.info("User successfully clicked on Point of sales tab");
 			Library.Interaction.userWait(); 			
			 Library.Interaction.selectele(Xpath.manualreturn.soldbydroparrow, Xpath.PointOfSales.soldbytextbox, Xpath.PointOfSales.soldbyselectlist, "Jamaica", soldbyname);
				log.info("User successfully entered cashier name and selected");
 			Library.Interaction.userWait();
 			Library.Interaction.setTextBoxByXpath(Xpath.Exchangerate.POSsearchtextbox, productcode);
 			log.info("User entered product code in search box");
 			Thread.sleep(2000);
 			Library.Interaction.click(Xpath.Exchangerate.selectproductPOS);
 			log.info("User selected and added the product into basket");
            
 			Thread.sleep(500);
 			String vvv = driver.findElement(By.xpath(Xpath.manualreturn.taxfreecheckbox)).getText();
 			System.out.println(vvv);
            if(driver.findElement(By.xpath(Xpath.manualreturn.taxfreecheckbox)).isDisplayed()) {
            	log.info("Found Tax FRee option");
            }else {
            	System.out.println("Not Found Tax Free option");
            }
            Thread.sleep(5000);
            if (driver.findElement(By.xpath(Xpath.manualreturn.dutyfreecheckbox)).isDisplayed()) {
            	log.info("Found Duty tax option");
            }else {
            	System.out.println("Not Found Duty tax option ");
            }
            
 			Library.Interaction.userWait();
            Library.Interaction.click(Xpath.PointOfSales.customer);
            Library.Interaction.print("User clicked on Customer button");
            log.info("User is in Customer form fill up page");
           
            Library.Interaction.userWait();
            Library.Interaction.setTextBoxByXpath(Xpath.PointOfSales.customeridtextbox, customerid);
            Library.Interaction.print("User Entered customer id in the textbox");
            Library.Interaction.userWait();
            Library.Interaction.click(Xpath.PointOfSales.searchbutton);          
            log.info("Customer details is displayed related to customer id provided");
            Thread.sleep(2500);
            Library.Interaction.click(Xpath.PointOfSales.selectcustomer);
            log.info("User successfully selected customer detail");
        
            Thread.sleep(500);
            
           
            Library.Interaction.userWait();
            Library.Interaction.click(Xpath.PointOfSales.basketbutton);
            log.info("User is in basket page");
            Library.Interaction.userWait();
            Library.Interaction.click(Xpath.manualreturn.manualreturnbutton);
            Library.Interaction.userWait();
            log.info("User selected the manual return option");
            Library.Interaction.userWait();
            Library.Interaction.click(Xpath.manualreturn.returnicon);
            log.info("User clicked on return product icon");
            Library.Interaction.userWait();
            Library.Interaction.selectele(Xpath.manualreturn.reasondroparrow, Xpath.manualreturn.reasonselecttext, Xpath.manualreturn.reasonselectlist, "siva", reason);
            log.info("user selected the reason option in drop down");
            Thread.sleep(500);
            Library.Interaction.click(Xpath.manualreturn.authorizemanualreturn);
            Library.Interaction.userWait();
            log.info("System is displayed with authorisation pop up");
            Library.Interaction.setTextBoxByXpath(Xpath.manualreturn.user, user);
            Library.Interaction.userWait();
            Library.Interaction.setTextBoxByXpath(Xpath.manualreturn.pwd, pwd);
            Library.Interaction.userWait();
            Library.Interaction.click(Xpath.manualreturn.authorise);
            log.info("User successfully gave permission for manual return");
            
            
            Library.Interaction.userWait();
			Library.Interaction.click(Xpath.PointOfSales.paymentbutton);
			log.info("User clicked on payment screen");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.PointOfSales.cashoption);
		log.info("User successfully selected cash method to pay the cashier");
		Thread.sleep(2000);
		Library.Interaction.click(Xpath.PointOfSales.paybutton);
		log.info("User clicked on pay button");
		Thread.sleep(33000);
		
		Library.Interaction.POSzoompopup();
		log.info("User zoomed the bill generated sheet");
		
		
      Thread.sleep(6000);
      System.out.println("done 5 sec");
      r=new Robot();
      r.keyPress(KeyEvent.VK_PRINTSCREEN);
		
            
            /* Library.Interaction.userWait();
 			Library.Interaction.click(Xpath.Exchangerate.salesbut);
 			log.info("User successfully clicked on sales tab");
 			Library.Interaction.userWait();
 			Library.Interaction.click(Xpath.Exchangerate.pointofsalesbut);
 			log.info("User successfully clicked on Point of sales tab");
 			Library.Interaction.userWait(); 			
			 Library.Interaction.selectele(Xpath.manualreturn.soldbydroparrow, Xpath.PointOfSales.soldbytextbox, Xpath.PointOfSales.soldbyselectlist, "Jamaica", soldbyname);
				log.info("User successfully entered cashier name and selected");
 			Library.Interaction.userWait();
 			Library.Interaction.setTextBoxByXpath(Xpath.Exchangerate.POSsearchtextbox, productcode);
 			log.info("User entered product code in search box");
 			Thread.sleep(2000);
 			Library.Interaction.click(Xpath.Exchangerate.selectproductPOS);
 			log.info("User selected and added the product into basket");
					
 			//Thread.sleep(3000);
 			
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.PointOfSales.paymentbutton);
 			log.info("User clicked on payment screen");
 			Library.Interaction.userWait();
 			Library.Interaction.click(Xpath.PointOfSales.cashoption);
			log.info("User successfully selected cash method to pay the cashier");
			Thread.sleep(2000);
			Library.Interaction.click(Xpath.PointOfSales.paybutton);
			log.info("User clicked on pay button");
			log.info("Print pop up is displayed");
			//Thread.sleep(14000);
			 
			 
			Thread.sleep(35000);
			System.out.println("done");
			  Library.Interaction.POSzoompopup();
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			System.err.println("done");
			Thread.sleep(2000);
             r.keyPress(KeyEvent.VK_ENTER);
             System.out.println("done");
             r.keyRelease(KeyEvent.VK_ENTER);
             Thread.sleep(35000);
             Library.Interaction.Keyaction("sample1");
             Thread.sleep(1000);
             r.keyPress(KeyEvent.VK_ENTER);
             r.keyRelease(KeyEvent.VK_ENTER);
             
             
             Library.Interaction.POSzoompopup();
			
//             Thread.sleep(5000);
//             System.out.println("done 5 sec");
             r=new Robot();
             r.keyPress(KeyEvent.VK_PRINTSCREEN);
             
             
             
             
             */
             
             
             
             
             
             
             Thread.sleep(100);
             Library.Interaction.switchtochildwin1();
             
             Library.Interaction.click(Xpath.manualreturn.countrynameediticon);
             Thread.sleep(100);
             Library.Interaction.click(Xpath.manualreturn.editcountrynametextbox);
             Thread.sleep(100);
             Library.Interaction.cleartext();
             Thread.sleep(100);
    		 Library.Interaction.setTextBoxByXpath(Xpath.manualreturn.editcountrynametextbox, countryname);
    		 Thread.sleep(100);
             Library.Interaction.click(Xpath.manualreturn.saveiconcountryname);
             log.info("User succesfully Re entered the existing country name");
             Library.Interaction.ScrollElemntsample(Xpath.manualreturn.countryname);
             
    		  Thread.sleep(500);
    		  
    		  Library.Interaction.click(Xpath.manualreturn.currencysymbolediticon);
    		  Thread.sleep(100);
    		  Library.Interaction.click(Xpath.manualreturn.editcurrencysymbol);
    		  Thread.sleep(100);
              Library.Interaction.cleartext();
              Thread.sleep(100);
              Library.Interaction.setTextBoxByXpath(Xpath.manualreturn.editcurrencysymbol, currencysymbol);
              Thread.sleep(500);
              Library.Interaction.click(Xpath.manualreturn.saveiconcurrency);
              log.info("User successfully Re entered the existing currency symbol");
              
 Thread.sleep(500);
    		  
    		  Library.Interaction.click(Xpath.manualreturn.taxnumberediticon);
    		  Thread.sleep(100);
    		  Library.Interaction.click(Xpath.manualreturn.edittaxnumber);
    		  Thread.sleep(100);
              Library.Interaction.cleartext();
              Thread.sleep(100);
              Library.Interaction.setTextBoxByXpath(Xpath.manualreturn.edittaxnumber, taxnumber);
              Thread.sleep(500);
              Library.Interaction.click(Xpath.manualreturn.saveicontaxnumber);
              log.info("User successfully Re entered the existing Tax number");
              
 Thread.sleep(500);
    		  
    		  Library.Interaction.click(Xpath.manualreturn.taxnameediticon);
    		  Thread.sleep(100);
    		  Library.Interaction.click(Xpath.manualreturn.edittaxname);
    		  Thread.sleep(100);
              Library.Interaction.cleartext();
              Thread.sleep(100);
              Library.Interaction.setTextBoxByXpath(Xpath.manualreturn.edittaxname, taxname);
              Thread.sleep(500);
              Library.Interaction.click(Xpath.manualreturn.saveicontaxname);              
              log.info("User successfully Re entered the existing Tax name");
             
                       
             
  Thread.sleep(500);      
  Library.Interaction.click(Xpath.manualreturn.dutyfreeediticon);
  Thread.sleep(500);
  Library.Interaction.click(Xpath.manualreturn.editdutyfree);
  Thread.sleep(500);
  Library.Interaction.click(Xpath.manualreturn.saveicondutyfree);
     Thread.sleep(2000);        
  Library.Interaction.ScrollElemntdirectlocact(header);
           
		
		
		Thread.sleep(500);
		Library.Interaction.click(Xpath.manualreturn.returnediticon);
		 Thread.sleep(500);
			Library.Interaction.click(Xpath.manualreturn.editreturnreason);
		Thread.sleep(1000);		
		Library.Interaction.keyuparrow();
		Thread.sleep(1000);
		Library.Interaction.keydel();
		Thread.sleep(100);
		Library.Interaction.click(Xpath.manualreturn.saveiconreturnreason);
		 log.info("User successfully Re entered the existing Return Reason");
		 
		 Library.Interaction.click(Xpath.PointOfSales.homeicon);
		 log.info("User is in home page");
		
		
		//*********Return edit with old data*********
		
	}
		catch (InterruptedException e) {
			captureScreen(driver, "manualreturn");
			Assert.assertFalse(false);
			log.info("Test Failed");
			throw(e);		}
}
}