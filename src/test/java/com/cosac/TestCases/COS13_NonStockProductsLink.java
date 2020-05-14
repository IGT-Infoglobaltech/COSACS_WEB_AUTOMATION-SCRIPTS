package com.cosac.TestCases;

import java.io.IOException;

import org.apache.xmlbeans.impl.common.XPath;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;

public class COS13_NonStockProductsLink extends BaseClass{
	
	String Name="Canon Printer";

	@Test
	public void NonStockProduct() throws InterruptedException, IOException
	{   
		try
		{
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.NonStockProductLink.NonStock);
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.NonStockProductLink.NonStockProductLinks);
			

			Thread.sleep(5000);
			Library.Interaction.click(Xpath.NonStockProductLink.AddNewButton);
			Library.Interaction.userWait();
			Library.Interaction.print("User Clicked on AddNewButton");
			Library.Interaction.setTextBoxByXpath(Xpath.NonStockProductLink.Name,Name);
			Library.Interaction.userWait();
			Library.Interaction.print("User Entered Name");
			Library.Interaction.click(Xpath.NonStockProductLink.Plusbutton1);
			Thread.sleep(5000);
			Library.Interaction.selectAndSerachEle(Xpath.NonStockProductLink.Divison,Xpath.NonStockProductLink.DivisonSearch,Xpath.NonStockProductLink.DivisonData,"COMPUTER AND OFFICE");
			Library.Interaction.userWait();
			Library.Interaction.print("User Selected on Divison");
			
			Library.Interaction.selectAndSerachEle(Xpath.NonStockProductLink.Department,Xpath.NonStockProductLink.DepartmentSearch,Xpath.NonStockProductLink.DepartmentData,"COMPUTER AND ACCESSORIES");
			Library.Interaction.userWait();
			Library.Interaction.print("User Selected on Department");
			
			Library.Interaction.selectAndSerachEle(Xpath.NonStockProductLink.Class,Xpath.NonStockProductLink.ClassSearch,Xpath.NonStockProductLink.ClassData,"PRINTER");
			Library.Interaction.userWait();
			Library.Interaction.print("User Selected on Class");
			Library.Interaction.click(Xpath.NonStockProductLink.SaveButton1);
			Library.Interaction.userWait();
			Library.Interaction.print("User Clicked on Save Button1");
			Thread.sleep(5000);
			Library.Interaction.ScrollDown();
			Library.Interaction.print("User is able to scrolldown");
            Thread.sleep(3000);
		    Library.Interaction.click(Xpath.NonStockProductLink.plusbutton2);
	        Thread.sleep(3000);
			Library.Interaction.selectAndSerachEle(Xpath.NonStockProductLink.NonStockDropDown,Xpath.NonStockProductLink.NonStockDropDownSearch,Xpath.NonStockProductLink.NonStockDropDownData,"40209 - OPTIPLUS OP-225 SPORT COR PIXMA 3010 - CANON PIXMA 3010 AIO PRINTE");
			Library.Interaction.userWait();
			Library.Interaction.print("User Selected on NonStock Dropdown Data");
			Library.Interaction.click(Xpath.NonStockProductLink.SaveButton2);
			Library.Interaction.userWait();
			Library.Interaction.print("User Clicked on Save Button2");
			Thread.sleep(3000);
		
			Library.Interaction.ScrollUp();
			Library.Interaction.print("User is able to scrollup");
			Thread.sleep(3000);
			
			Library.Interaction.click(Xpath.NonStockProductLink.SaveButtonDisble);
			Library.Interaction.userWait();
			Thread.sleep(3000);
			Library.Interaction.print("User Clicked on Main Save Button");
			
		}catch (Exception e) 
		{
			e.printStackTrace();
			captureScreen(driver, "locatNonStockProduction");
			Assert.assertFalse(false);
			log.info("Test Failed");

		}

	}
}
