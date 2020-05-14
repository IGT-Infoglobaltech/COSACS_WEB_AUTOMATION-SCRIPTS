package com.cosac.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;

//**NOTE  --->>*************Before running the script change the 'date from' and 'date to' data as Today' date *****************

public class COS_26_Pointofsales extends BaseClass 
{
	 static String customerid="AAk120294";
	 static String verifysalepage="Sale";
	 static String discountcode="DSC - DISCOUNT";
	 static String discountpercentage="2";//if this is updated discount should be updated
	 static String soldbyname="UNICORP JAMAICA";
	 static String verifysearchorder="Search Order";
	 static String datefrom="04,11,2020";
	 static String dateto="05,11,2020";   //update date
	 public static String Todate="05/11/2020";
	 public static int qtyadded=1; 
	 public static int discount=2;
	 
	@Test
	
	public static void verifyproductinPOS() throws Exception  
	{
		
			
			try {
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.PointOfSales.salesbut);
				log.info("User successfully clicked on sales tab");
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.PointOfSales.pointofsalesbut);
				log.info("User successfully clicked on Point of sales tab");
				String saleverify = driver.findElement(By.xpath(Xpath.PointOfSales.saleverify)).getText();
				Assert.assertEquals(saleverify, verifysalepage);
				log.info("User is in Point of Sales Page ");
			Thread.sleep(2000);
			Library.Interaction.click(Xpath.PointOfSales.majorwhitegreen);
			log.info("User clicked on majorwhite division");
			Thread.sleep(2000);
			Library.Interaction.click(Xpath.PointOfSales.randaomproduct);
			Library.Interaction.print("User clicked on random product undermajorwhite division");
			log.info("User selected random product under Majorwhite division and added to basket");
			Thread.sleep(3000);
			Library.Interaction.click(Xpath.PointOfSales.resetbutton);
			Library.Interaction.print("User clicked on Reset button");
			log.info("User cleared all selected product");
			Thread.sleep(2000);

			Library.Interaction.click(Xpath.PointOfSales.majorwhitegreen);
			log.info("User clicked on majorwhite division");
			Thread.sleep(2000);
			Library.Interaction.click(Xpath.PointOfSales.randaomproduct1);
	            log.info("User successfully added a product");
	            
	            //**************************************PRoduct adding is done here**********************
	            
	            
	            
	            Library.Interaction.userWait();
	            Library.Interaction.click(Xpath.PointOfSales.customer);
	            Library.Interaction.print("User clicked on Customer button");
	            log.info("User is in Customer form fill up page");
	            Library.Interaction.userWait();
	            Library.Interaction.setTextBoxByXpath(Xpath.PointOfSales.customeridtextbox, customerid);
	            Library.Interaction.print("User Entered customer id in the textbox");
	            Library.Interaction.userWait();
	            Library.Interaction.click(Xpath.PointOfSales.searchbutton);
	            Library.Interaction.print("User clicked on Search button");
	            log.info("Customer details is displayed related to customer id provided");
	            Thread.sleep(3000);
	            Library.Interaction.click(Xpath.PointOfSales.clearbutton);
	            Library.Interaction.print("User clicked on Cleared button");
	            log.info("User successfully cleared the customer deatils");
	          
	            Thread.sleep(3000);
	            Library.Interaction.setTextBoxByXpath(Xpath.PointOfSales.customeridtextbox, customerid);
	            Library.Interaction.print("User Entered customer id in the textbox");
	            Library.Interaction.userWait();
	            Library.Interaction.click(Xpath.PointOfSales.searchbutton);
	            Library.Interaction.print("User clicked on Search button");
	            Library.Interaction.userWait();
	            Library.Interaction.click(Xpath.PointOfSales.selectcustomer);
	            Library.Interaction.print("User successfully selected the customer ");
	            log.info("User successfully selected customer detail");
	            	            
	         //   **********************Customer details*********************************
	            
	            
	            Library.Interaction.userWait();
	            Library.Interaction.click(Xpath.PointOfSales.basketbutton);
	            log.info("User is in basket page");
	            Library.Interaction.userWait();
	           
	            Library.Interaction.click(Xpath.PointOfSales.deleteselectedproduct);
	            log.info("User successfully deleted the added product");

	            log.info("User added 3 items to basket");
	            
	            //***************Qty added***************to Basket***********
	            
	          
	           //*************DIscount added************************ 
	            
	            
	            Thread.sleep(3000);	            
	            Library.Interaction.userWait();
	            String unitcost = Library.Interaction.retainonlynumbers(Xpath.PointOfSales.Basketunitcost);
	            int costunit = Integer.parseInt(unitcost.trim());
	            log.info(costunit+" <--Unit cost of product");
	            
	            Library.Interaction.userWait();
	            String taxcost = Library.Interaction.retainonlynumbers(Xpath.PointOfSales.Baskettaxcost);
	            int costtax = Integer.parseInt(taxcost.trim());
	            log.info(costtax+" <--tax cost of product");
	            
	            Library.Interaction.userWait();
	            String saleitemcost = Library.Interaction.retainonlynumbers(Xpath.PointOfSales.Salestotalitem);
	            int costitemsale = Integer.parseInt(saleitemcost.trim());
	            log.info(costitemsale+" <--Total item cost in sale");
	            
	            Library.Interaction.userWait();
	            String salecosttax = Library.Interaction.retainonlynumbers(Xpath.PointOfSales.Saletotaltax);
	            int taxcostsale = Integer.parseInt(salecosttax.trim());
	            log.info(taxcostsale+" <--Total tax cost item in sale");
	            
	            Library.Interaction.userWait();
	            String totalbalance = Library.Interaction.retainonlynumbers(Xpath.PointOfSales.Saletotalbalance);
	            int balancetotal = Integer.parseInt(totalbalance.trim());
	            log.info(balancetotal+" <--Toatal balance cost in sale");
	            
	          
	            
	            //*****************CAlculation Verify*****************
	            
	            
	            //Thread.sleep(2000);
	            System.out.println("kjdihsgknms");
	            Library.Interaction.userWait();
	            Library.Interaction.selectele(Xpath.PointOfSales.soldbydroparrow1, Xpath.PointOfSales.soldbytextbox, Xpath.PointOfSales.soldbyselectlist, "Jamaica", soldbyname);
				log.info("User succesfully entered cashier name and selected");
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.PointOfSales.paymentbutton);
				log.info("User is in paymnent page");
				Thread.sleep(3000);
				Library.Interaction.click(Xpath.PointOfSales.cashoption);
				log.info("User successfully selected cash method to pay the cashier");
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.PointOfSales.paybutton);
				log.info("User clicked on pay button");
				log.info("Print pop up is displayed");
				Thread.sleep(16000);
				Library.Interaction.POScancelpopup();
				log.info("USer clicked on cancel button in the window pop up");
				Library.Interaction.userWait();
				String invnumber = Library.Interaction.retainonlynumbers(Xpath.PointOfSales.invoicenumber);
				log.info("User successfully noted the invoice number");
				Thread.sleep(4000);
				Library.Interaction.click(Xpath.PointOfSales.menubutton);
				log.info("User clicked on menu tab for the visible of main tab");
	            
	            
	            //****************Closed the print pop up**************************
	            
	           
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.PointOfSales.salesbut);
				log.info("User successfully clicked on sales tab");
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.PointOfSales.searchorder);
				log.info("User clicked on search order button");
				Library.Interaction.userWait();
				String searchorder = driver.findElement(By.xpath(Xpath.PointOfSales.verifysearchorder)).getText();
				Assert.assertEquals(searchorder, verifysearchorder);
				log.info("User is in Search Order page");
				Thread.sleep(2000);
				Library.Interaction.setTextBoxByXpath(Xpath.PointOfSales.datefrom, datefrom);
				log.info("User selected from date");
				Thread.sleep(1000);
				Library.Interaction.click(Xpath.PointOfSales.Todate);
				Library.Interaction.setTextBoxByXpath(Xpath.PointOfSales.Todate, Todate);
				log.info("User selected To date");

				Thread.sleep(2000);
				Library.Interaction.click(Xpath.PointOfSales.SOsearchbutton);
				log.info("User clicked on search button");
				Thread.sleep(5000);
				Library.Interaction.verifylist(Xpath.PointOfSales.verifyinvnumberpresent, invnumber);
				log.info("User found the invoice number");
				log.info(invnumber+" <--Invoice number");
				
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.PointOfSales.homeicon);
				
				
				//*********************Verified the invoice number**************
				
			} catch (Exception e) {
				
				
				captureScreen(driver, "Directreceipt_verify_stockcount");
				Assert.assertFalse(false);
				log.info("Test Failed");
				
			}
			
			
			
		
		
			
		}
	}