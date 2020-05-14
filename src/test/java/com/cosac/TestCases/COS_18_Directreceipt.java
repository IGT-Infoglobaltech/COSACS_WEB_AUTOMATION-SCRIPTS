package com.cosac.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;

public class COS_18_Directreceipt extends BaseClass {

	 static String recinputval="luc";
		static String recval="LUCKY DOLLAR MOBAY";
		static String vendinputval="/";
		static String vendval="Frigidaire / Electrolux";
		static String vendornum="124515";
		static String vendorinvnum="1247515";
		static String Sku="j3";
		static String val="J3681SP";
		static String qty="2";
		static String reftext="in";
		static String reftextval="Invoice Number";
		static String reftextnum="12345";
		static String comment="direct receipt has been refered";
		static String procomment="qty received";
		static String headerpage="Create Direct Receipt";
		static String propage="Product Enquiry";
		static String sparepage="Spare Part Maintenance ";
		static String directreceiptpage="Direct Receipt";
		static String scount1="";
		public static int countv;
		 public static int qty1=2;

	

	@Test

	public static void Directreceipt_verify_stockcount() throws Exception {

		try {
			// *******Log into product enquiry page for selecting required product**********

			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.Directreceipt.merchandising);
			log.info("User clicked on merchandising");
			;
			Library.Interaction.moveToElement(Xpath.Directreceipt.search);
			Library.Interaction.print("mouse over action on search");
			Library.Interaction.click(Xpath.Directreceipt.productenquiry);
			log.info("User clicked on product enquiry");
			;
			Library.Interaction.userWait();
			String verifypage = driver.findElement(By.xpath(Xpath.Directreceipt.verifyproductpage)).getText();
			Assert.assertEquals(verifypage, propage);
			log.info("User successfully logged into Product Enquiry page");

			// ******************Noting the stock value of the product before generating GRN

			Library.Interaction.setTextBoxByXpath(Xpath.Directreceipt.searchtext, "j3681sp");
			log.info("User entered the product code");
			;
			Thread.sleep(2000);
			Library.Interaction.click(Xpath.Directreceipt.product);
			log.info("User selected required product for next process");
			;
			Library.Interaction.userWait();
			String verifysparepage = Library.Interaction.splitsymbol(Xpath.Directreceipt.verifysparepartpage);

			System.out.println(verifysparepage + "<--");
			Assert.assertEquals(verifysparepage, sparepage);
			log.info("User successfully logged into spare part maintenance page");// verify spare part maintain page
			Library.Interaction.ScrollElemntdirectloc(Xpath.Directreceipt.verifylocation);
			log.info("User scrolled down to required location for noting the stock value");
			Library.Interaction.userWait();
			String locname = driver.findElement(By.xpath(Xpath.Directreceipt.verifylocation)).getText();
			Library.Interaction.print(locname + " <--Stock Count Location Name");
			String scount1 = driver.findElement(By.xpath(Xpath.Directreceipt.verifylocationcount1)).getText();
			Library.Interaction.print(scount1 + "   <----Stock count value");
			Library.Interaction.userWait();
			Library.Interaction.ScrollElemntdirectlocact(Xpath.Directreceipt.merchandising);
			Library.Interaction.userWait();
			log.info("User noted the stockcount of the product");
			countv = Integer.parseInt(scount1.trim());

		} catch (InterruptedException e) {

			captureScreen(driver, "Directreceipt_verify_stockcount");
			Assert.assertFalse(false);
			log.info("Test Failed");

		}

	}

	// ***************Generating Direct Receipt for the product****************

	@Test(dependsOnMethods = { "Directreceipt_verify_stockcount" })
	public void Directreceipt_form() throws Exception {
		try {

			Library.Interaction.click(Xpath.Directreceipt.merchandising);
			log.info("clicked on merchandising");
			Library.Interaction.moveToElement(Xpath.Directreceipt.create);
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.Directreceipt.directreceipt);
			log.info("clicked on direct receipt");
			Thread.sleep(4000);
			String header = driver.findElement(By.xpath(Xpath.Directreceipt.verifydirectpage)).getText();
			Assert.assertEquals(header, headerpage);
			log.info("USer successfully logged into Direct Receipt page");
			Library.Interaction.print("create direct receipt page is dislayed successfully");
			Library.Interaction.userWait();
			Library.Interaction.selectele(Xpath.Directreceipt.recarrowclick, Xpath.Directreceipt.recsearchval,
					Xpath.Directreceipt.recslectlist, recinputval, recval);
			log.info("User successfully selected the receiving location");
			Library.Interaction.selectele(Xpath.Directreceipt.vendorarrowclick, Xpath.Directreceipt.vendorsearchval,
					Xpath.Directreceipt.vendorselectlist, vendinputval, vendval);
			log.info("User successfully selected the vendor");
			Library.Interaction.selectEleByIndex(Xpath.Directreceipt.receivedby, 4);
			log.info("User successfully selected the receiving person");
			Library.Interaction.setTextBoxByXpath(Xpath.Directreceipt.vendordevnum, vendornum);
			log.info("User successfully entered the vendor referance number");
			Library.Interaction.setTextBoxByXpath(Xpath.Directreceipt.vendorinvnum, vendorinvnum);
			log.info("User successfully entered the vendor invoice number");
			Library.Interaction.click(Xpath.Directreceipt.refaddicon);
			Library.Interaction.print("Referance add icon is clicked");
			Library.Interaction.selectele(Xpath.Directreceipt.refarrow, Xpath.Directreceipt.reftext,
					Xpath.Directreceipt.refselect, reftext, reftextval);
			log.info("User successfully selected the referance option");
			Library.Interaction.setTextBoxByXpath(Xpath.Directreceipt.refinput, reftextnum);
			log.info("User successfully entered contacts details");
			Library.Interaction.setTextBoxByXpath(Xpath.Directreceipt.textarea, comment);
			log.info("User successfully updated comment details");
			Library.Interaction.click(Xpath.Directreceipt.addicon);
			Library.Interaction.print("clicked on add icon");
			Library.Interaction.userWait();
			Library.Interaction.selectele(Xpath.Directreceipt.addproductarrow, Xpath.Directreceipt.productcode,
					Xpath.Directreceipt.productselect, Sku, val);
			log.info("User successfully entered product code and selected");
			Library.Interaction.setTextBoxByXpath(Xpath.Directreceipt.qtyReceived, qty);
			log.info("User successfully entered product code and selected");
			Library.Interaction.setTextBoxByXpath(Xpath.Directreceipt.procomment, procomment);
			log.info("User successfully updated comment details of product");
			Library.Interaction.click(Xpath.Directreceipt.tickmark);
			log.info("product added successfully");
			Library.Interaction.ScrollElemntsmallH(Xpath.Directreceipt.addicon);
			Library.Interaction.print("scrolled down");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.Directreceipt.createreceiptbut);
			log.info("User successfully clicked on create receipt button");
			log.info("User successfully logged into directreceipt page for approval");
		

			// ********************Noted with the Direct receipt code***********************

			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.Directreceipt.approvebut);
			log.info("User successfully clicked on approved button");
			;
			Library.Interaction.userWait();
			String statusdirect1 = driver.findElement(By.xpath(Xpath.Directreceipt.awaitingapprove)).getText();
			Library.Interaction.print(statusdirect1 + "   <-----Status after approval");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.Directreceipt.printcostbut);
			log.info("User successfully clicked on print cost button for printing");
			;
			Thread.sleep(4000);
			Library.Interaction.click(Xpath.Directreceipt.okbutton);
			log.info("Clicked on ok button for confirmation");
			Thread.sleep(4000);
			String win = driver.getWindowHandle();
			driver.switchTo().window(win);
			log.info("User is now successfully switched back to main page from print page");

		} catch (InterruptedException e) {

			captureScreen(driver, "Directreceipt_form");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}

	// *********************Verify The Stock Count****************************
	@Test(dependsOnMethods = { "Directreceipt_form" })
	public void Directreceipt_stockcount_afterDRN() throws IOException {

		try {

			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.Directreceipt.merchandising);
			Library.Interaction.print("clicked on merchandising");
			Library.Interaction.moveToElement(Xpath.Directreceipt.search);
			Library.Interaction.print("mouse over action on search");
			Library.Interaction.click(Xpath.Directreceipt.productenquiry);
			Library.Interaction.print("clicked on product enquiry");
			Library.Interaction.userWait();
			String verifypage1 = driver.findElement(By.xpath(Xpath.Directreceipt.verifyproductpage)).getText();
			Assert.assertEquals(verifypage1, propage);
			log.info("User is in Product Enquiry page");

			Library.Interaction.setTextBoxByXpath(Xpath.Directreceipt.searchtext, "j3681sp");
			Library.Interaction.print("Entered the product code");
			Thread.sleep(2000);
			Library.Interaction.click(Xpath.Directreceipt.product);
			Library.Interaction.print("randomly one product is selected");
			Library.Interaction.userWait();
			String verifysparepage = Library.Interaction.splitsymbol(Xpath.Directreceipt.verifysparepartpage);
			Assert.assertEquals(verifysparepage, sparepage);
			log.info("USer is in sapre part maintenance page");

			Library.Interaction.ScrollElemntdirectloc(Xpath.Directreceipt.verifylocation);
			Library.Interaction.print("scrolled to required location");
			Library.Interaction.userWait();
			String locname1 = driver.findElement(By.xpath(Xpath.Directreceipt.verifylocation)).getText();
			Library.Interaction.print(locname1 + " <--Stock Count Location Name");
			String scount1v = driver.findElement(By.xpath(Xpath.Directreceipt.verifylocationcount1)).getText();

			Library.Interaction.print(scount1v + "   <----Stock count value");
			int count = Integer.parseInt(scount1v.trim());
			log.info("User successfully noted the stock value after DRN generated");
			if (countv + qty1 == count) {
				Library.Interaction.print("successsss");
			} else {
				Library.Interaction.print("dhammaraaa");
			}

			System.out.println(countv + qty1 == count);
			int wow = countv + qty1;
			System.out.println(wow);

			Assert.assertEquals(wow, count);
			log.info("User successfully validated teh total quantity added to the location");

			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.Directreceipt.homeicon);
			Library.Interaction.print("User is in Home page");
			log.info("User is in Home Page");

		} catch (InterruptedException e) {

			captureScreen(driver, "Directreceipt_stockcount_afterDRN");
			Assert.assertFalse(false);
			log.info("Test Failed");

		}

	}

}
