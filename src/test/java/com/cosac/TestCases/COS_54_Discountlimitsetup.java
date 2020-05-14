package com.cosac.TestCases;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;

public class COS_54_Discountlimitsetup extends BaseClass {
	static String discountbranchcode="910";
	static String productcode="r55s";
	static String discountcode="DSC - DISCOUNT";
	public static String discountpercentage="12";//adding discount in POS
	static String adminpermission="Discount Limit Authorisation";
	static String user="Jamaica911";
	static String pwd="Jamaica911%%%";
	static String discountpercentage1="8";//Set the discount percentage limit rage
	
	
@Test 

public static void verifydiscount() throws Exception {
	
	try {
	
		Library.Interaction.userWait();
		Library.Interaction.switchduplicate();
			
		log.info("User opened a duplicate window ");
		
		
		//*************** Opening duplicate window ***************
		
		Library.Interaction.switchtochildwin1();
		
		log.info("User switched to child window");
		
		//*****************Switched to child window*****************
		
		
		Library.Interaction.userWait();
		Library.Interaction.click(Xpath.discountlimit.salesbut);
		log.info("USer clicked on sales tab");
		Library.Interaction.userWait();
		Library.Interaction.click(Xpath.discountlimit.discountlimitsetupbutton);
		log.info("USer clicked on discountlimit setup tab");
		Library.Interaction.userWait();		
		Library.Interaction.click(Xpath.discountlimit.addicon);
		Library.Interaction.userWait();
		Library.Interaction.selectele(Xpath.discountlimit.brachdroparrow2, Xpath.discountlimit.branchdroptextbox2, Xpath.discountlimit.branchdropselect2, discountbranchcode, discountbranchcode);
		Thread.sleep(1000);
		Library.Interaction.setTextBoxByXpath(Xpath.discountlimit.limitpercentage, discountpercentage1);
		Library.Interaction.userWait();
		Library.Interaction.click(Xpath.discountlimit.saveicon);
		log.info("User successfully added a discount percentage for particular location");
		
		//********************Adding Discount percentage limit*******
		
		Library.Interaction.switchtoparent();
		log.info("User switched back to parent window");
		
		
		Library.Interaction.userWait();
		Library.Interaction.click(Xpath.discountlimit.salesbut);
		log.info("User successfully clicked on sales tab");
		Library.Interaction.userWait();
		Library.Interaction.click(Xpath.discountlimit.pointofsalesbut);
		log.info("User successfully clicked on Point of sales tab");
		Library.Interaction.userWait();
		Library.Interaction.setTextBoxByXpath(Xpath.discountlimit.POSsearchtextbox, productcode);
		log.info("User entered product code in search box");
		Thread.sleep(2000);
		Library.Interaction.click(Xpath.discountlimit.basketicon);       
        log.info("User successfully added a product");
        Library.Interaction.userWait();
        Library.Interaction.click(Xpath.discountlimit.basketbutton);
        log.info("User is in basket page");
        Library.Interaction.userWait();
        
		//********USer added the product into basket********************
        
        Library.Interaction.userWait();
        Library.Interaction.click(Xpath.discountlimit.downarrow);
        log.info("User clicked on discount adding drop down for selecting discount code");
        Library.Interaction.userWait();
        Library.Interaction.selecteleequal(Xpath.discountlimit.discountdropdownarrow, Xpath.discountlimit.discounttextbox, Xpath.discountlimit.discounttextselectlist, "DSC -", discountcode);	            
        log.info("User successfully added the discount code");
        Library.Interaction.setTextBoxByXpath(Xpath.discountlimit.discountpercentagetextbox, discountpercentage);
        log.info("User successfully added the discount percentage given");
        Library.Interaction.userWait();
        Library.Interaction.click(Xpath.discountlimit.discountaddicon);
        log.info("User clicked on Discount Add icon ");
        Thread.sleep(1000);
//         boolean val = driver.findElement(By.xpath(Xpath.discountlimit.purchasetextname)).getText().contains("Purchasing");
//       System.out.println(val);
//       boolean val2 = driver.findElement(By.xpath(Xpath.discountlimit.purchasetextname)).isDisplayed();
//       System.out.println(val2);
//       Thread.sleep(1000);
//         boolean val1 = driver.findElement(By.xpath(Xpath.discountlimit.adminauthority)).isDisplayed();
//       System.out.println(val1);
       
       
       
        if(driver.findElement(By.xpath(Xpath.discountlimit.adminauthority)).getText().equals(adminpermission)) 
      
        //if(driver.findElement(By.cssSelector(Xpath.discountlimit.adminauthority)).isDisplayed())
        {
        	 
        	Library.Interaction.userWait();
        	Library.Interaction.setTextBoxByXpath(Xpath.discountlimit.user, user);
        	log.info("User entered user credentials");
        	Library.Interaction.userWait();
        	Library.Interaction.setTextBoxByXpath(Xpath.discountlimit.pwd, pwd);
        	log.info("User entered Password credentials");
        	Library.Interaction.userWait();
        	Library.Interaction.click(Xpath.discountlimit.authorise);
        	log.info("User successfully gave authority for granting discount");
        	Thread.sleep(1000);
        	Library.Interaction.switchtochildwin1();
        	Library.Interaction.userWait();
        	Library.Interaction.click(Xpath.discountlimit.deleteicon);
        	log.info("User deleted the added discount limit setup");
        	Thread.sleep(2000);
        	Library.Interaction.click(Xpath.discountlimit.deletepopup);
        	Library.Interaction.userWait();
        	Library.Interaction.click(Xpath.discountlimit.homeicon);
        	log.info("User is in Home page");
       
        	
        	
        }else 
        	if(driver.findElement(By.xpath(Xpath.discountlimit.purchasetextname)).getText().contains("Purchasing"))
        	{
        	log.info("User added the Discount value less or equal to discount limit setup");
        	Library.Interaction.userWait();
        	Library.Interaction.click(Xpath.discountlimit.menubutton);
        	Thread.sleep(2000);
        	for(int i=0;i<=1;i++)
        		Library.Interaction.switchtochildwin1();
        	
        	Library.Interaction.userWait();
        	Library.Interaction.click(Xpath.discountlimit.deleteicon);
        	log.info("User deleted the added discount limit setup");
        	Thread.sleep(2000);
        	Library.Interaction.click(Xpath.discountlimit.deletepopup);
        	Library.Interaction.userWait();
        	Library.Interaction.click(Xpath.discountlimit.homeicon);
        	log.info("User is in Home page");
        }
        	
        
		
        log.info("User successfully added discount to the product");
		
	} catch (InterruptedException e) {
		
		captureScreen(driver, "verifypaymentpage(");
		Assert.assertFalse(false);
		log.info("Test Failed"); 
	}
	
	
	
}
}
