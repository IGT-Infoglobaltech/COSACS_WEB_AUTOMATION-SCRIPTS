package com.cosac.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;

public class COS13_NonStockPromotions extends BaseClass{
	
	 static String Name="Maruthi";
	 static String SKU="123";
	 static String Discount="15";
	 static String ExpectedNonStockPromotions="Non-Stock Promotions";
	
	@Test
    public static void NonStockPromotion() throws InterruptedException, IOException
    {
		try {
			
		
		Library.Interaction.userWait();
		Library.Interaction.click(Xpath.NonStockPromotions.NonStocks);
		Library.Interaction.print("User Clicked on Non-Stocks link");
		Library.Interaction.userWait();
		Library.Interaction.click(Xpath.NonStockPromotions.NonStockProomotions);
		Library.Interaction.userWait();
		Library.Interaction.print("User Clicked on Non-Stock Promotions link");
		
		
		
		
		/*Library.Interaction.setTextBoxByXpath(Xpath.NonStockPromotions.Name,Name);
		Library.Interaction.userWait();
		Library.Interaction.print("User Entered Name");
		Library.Interaction.selectAndSerachEle(Xpath.NonStockPromotions.Fascia,Xpath.NonStockPromotions.FasciaSearch,Xpath.NonStockPromotions.FasciaData,"Courts Store");
		Library.Interaction.userWait();
		Library.Interaction.print("User selected on Fascia Dropwon");
		Library.Interaction.selectAndSerachEle(Xpath.NonStockPromotions.Branch,Xpath.NonStockPromotions.BranchSearch,Xpath.NonStockPromotions.BranchData,"171 LUCKY DOLLAR MAY PEN");
		Library.Interaction.userWait();
		Library.Interaction.print("User selected on Branch Dropwon");
		Library.Interaction.setTextBoxByXpath(Xpath.NonStockPromotions.SKU,SKU);
		Library.Interaction.userWait();
	    Library.Interaction.print("User Entered SKU Number");*/
	    Library.Interaction.ScrollDown();
		Library.Interaction.userWait();
		Thread.sleep(3000);
		Library.Interaction.print("User is able to scroll down page ");
	    Library.Interaction.click(Xpath.NonStockPromotions.PlusButton);
		//Library.Interaction.userWait();
	    Thread.sleep(5000);
		Library.Interaction.print("User clicked on plus button ");
		
		Library.Interaction.selectAndSerachEle(Xpath.NonStockPromotions.NonStock,Xpath.NonStockPromotions.NonStockSearch,Xpath.NonStockPromotions.NonStockData,"40209 - OPTIPLUS OP-225 SPORT COR PIXMA 3010 - CANON PIXMA 3010 AIO PRINTE");
		Library.Interaction.userWait();
		Library.Interaction.print("User Selected on NonStock Dropdown ");
	    Library.Interaction.selectAndSerachEle(Xpath.NonStockPromotions.Fascia,Xpath.NonStockPromotions.FasciaSearch,Xpath.NonStockPromotions.FasciaData,"Courts Store");
		Library.Interaction.userWait();
		Library.Interaction.print("User clicked on Fascia Dropdown ");
		Library.Interaction.selectAndSerachEle(Xpath.NonStockPromotions.Branch,Xpath.NonStockPromotions.BranchSearch,Xpath.NonStockPromotions.BranchData,"910 COURTS CROSS ROADS");
		Library.Interaction.userWait();
		Library.Interaction.print("User selected on Branch Dropwon");
		Library.Interaction.selectAndSerachEle(Xpath.NonStockPromotions.PromotionType,Xpath.NonStockPromotions.PromotionTypeSearch,Xpath.NonStockPromotions.PromotionData,"Percentage Discount");
		Library.Interaction.userWait();
		Library.Interaction.print("User selected on PromotionType Dropwon");
		Library.Interaction.setTextBoxByXpath(Xpath.NonStockPromotions.Discount,Discount);
		Library.Interaction.userWait();
		Library.Interaction.print("User Entered Discount");
		Library.Interaction.click(Xpath.NonStockPromotions.SaveButton);

		Library.Interaction.userWait();
	    Thread.sleep(5000);
		Library.Interaction.print("User Clicked on Save Button");
		
		Thread.sleep(5000);
		Library.Interaction.click(Xpath.NonStockPromotions.Logoutbutton);
		Library.Interaction.userWait();
		Library.Interaction.print("User clicked on Logout Button ");
		
		}catch(Exception e)
		{
			
		}
		
		
		
		
  }

}
