package com.cosac.TestCases;

import java.awt.Button;
import java.io.IOException;

import org.apache.xmlbeans.impl.store.Public2;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;

public class COS112_Logistics_DeliveryPerformanceSummary extends BaseClass {
	String text1="";
	String DeliveryFrom="Sat, 1 February, 2020";
	String DeliveryTo="Tue, 17 March, 2020";
	String PivotSearch="Fas";
	String PivotSelect="Fascia";
	String DelTypeSearch="Deli";
	String DelTypeSelect="Delivery";
	String DataTypeSearch="Orde";
	String DataTypeSelect="Ordered";
	
	public static String str="";
	
@Test
public void Delivery_PerformanceSummary() throws IOException {
	try {
		
		//Search for the delivary report
		System.out.println("Search for the delivary report");
		Library.Interaction.click(Xpath.Logistics_DeliveryPerformanceSummary.Logistics);
		//user clicked on the Reports
		System.out.println("user clicked on the Reports");
		Library.Interaction.moveToElement(Xpath.Logistics_DeliveryPerformanceSummary.Reports);
		// user clicked on the Delivary Performance
		System.out.println("user clicked on the Delivary Performance");
		Library.Interaction.click(Xpath.Logistics_DeliveryPerformanceSummary.Delivery_Performance_summary);
        //user entered the pivotType
		System.out.println("user entered the pivotType");
		Library.Interaction.selectEle(Xpath.Logistics_DeliveryPerformanceSummary.Pivot_DropDown, Xpath.Logistics_DeliveryPerformanceSummary.Search_Report, Xpath.Logistics_DeliveryPerformanceSummary.List_Report, PivotSearch, PivotSelect);
        //user entered the Deliverytype
		System.out.println("user entered the Deliverytype");
		Library.Interaction.selectEle(Xpath.Logistics_DeliveryPerformanceSummary.Delivery_TypeDropDown, Xpath.Logistics_DeliveryPerformanceSummary.Search_Report, Xpath.Logistics_DeliveryPerformanceSummary.List_Report, DelTypeSearch, DelTypeSelect);
        //user entered the data type
		System.out.println("user entered the data type");
	    Library.Interaction.selectEle(Xpath.Logistics_DeliveryPerformanceSummary.Data_typeDropDown, Xpath.Logistics_DeliveryPerformanceSummary.Search_Report, Xpath.Logistics_DeliveryPerformanceSummary.List_Report, DataTypeSearch, DataTypeSelect);
		//user entered the delivery From
	    System.out.println("user entered the delivery From");
		Library.Interaction.setTextBoxByXpath(Xpath.Logistics_DeliveryPerformanceSummary.DeliveredFrom, DeliveryFrom);
	    //user entered the delivery To
		System.out.println("user entered the delivery To");
		Library.Interaction.setTextBoxByXpath(Xpath.Logistics_DeliveryPerformanceSummary.DeliveredTo, DeliveryTo);
		//user clicked on the Run
		System.out.println("user clicked on the Run");
        Library.Interaction.click(Xpath.Logistics_DeliveryPerformanceSummary.Run1); 
        //user time wait
        System.out.println("user time wait");
        Thread.sleep(10000);
        //user click on the Export
        System.out.println("user click on the Export");
        Library.Interaction.click(Xpath.Logistics_DeliveryPerformanceSummary.Export);
	}
catch (Exception e) {
	e.printStackTrace();
	captureScreen(driver, "location");
	Assert.assertFalse(false);
	log.info("Test Failed");
}
}

@Test(dependsOnMethods={"Delivery_PerformanceSummary"})
public void CreateCombo() throws IOException {
	
	try {
		// Validate the delivary report status if there
	    
	    Thread.sleep(4000);
	    Library.Interaction.click(Xpath.Combo_ProductCreation.Home);
	    
	    
	    }
	catch (Exception e) {
		captureScreen(driver, "createLocationForm");
		Assert.assertFalse(false);
		log.info("Test Failed");
		}
}
}
