
package com.cosac.TestCases;

import java.awt.Button;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.xmlbeans.impl.store.Public2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;

public class COS103_Merchandising_Warehouse_OverSupply extends BaseClass {
	String Class_Name ="TV 32INCH";
	String Class_Send="TV 32INCH";
	String WarehouseSend="LUCKY DOLLAR";
	String WarehouseName="LUCKY DOLLAR MAY PEN";
	String DivSend="AUDIO";
	String DivName="AUDIO VISUAL";
	String DepSend="VISION";
	String DepName="VISION";
	
	
	
@Test
public void Reports_WarehouseOversupply() throws IOException {
	try {
		Library.Interaction.userWait();
		Library.Interaction.click(Xpath.Reports_WarehouseOversupply.merchandising);
		Library.Interaction.print("User Clicked on Merchandising");
		Library.Interaction.userWait();
		Library.Interaction.moveToElement(Xpath.Reports_WarehouseOversupply.Reports);
		Library.Interaction.print("User Clicked on Reports");
		Library.Interaction.userWait();
		Library.Interaction.click(Xpath.Reports_WarehouseOversupply.WarehouseOversupply);
		Library.Interaction.print("User Clicked on Warehouseoversupply reports");
		Library.Interaction.userWait();

	
}
catch (Exception e) {
	e.printStackTrace();
	captureScreen(driver, "location");
	Assert.assertFalse(false);
	log.info("Test Failed");
}
}

@Test(dependsOnMethods={"Reports_WarehouseOversupply"})
public void Reports_WarehouseOversupply1() throws IOException {
	try {
		Library.Interaction.print("User Enters the Warehouse");
		Library.Interaction.selectEle(Xpath.Reports_WarehouseOversupply.WarehouseDropDown, Xpath.Reports_WarehouseOversupply.WarehouseSearch, Xpath.Reports_WarehouseOversupply.WarehouseList, WarehouseSend, WarehouseName);
		Library.Interaction.print("User Enters the Heirarchy");
		Library.Interaction.selectEle(Xpath.Reports_WarehouseOversupply.DivisionDropDown, Xpath.Reports_WarehouseOversupply.DivisionSearch, Xpath.Reports_WarehouseOversupply.DivisionList, DivSend, DivName);
		Library.Interaction.selectEle(Xpath.Reports_WarehouseOversupply.DepartmentDropDown, Xpath.Reports_WarehouseOversupply.DepartmentSearch, Xpath.Reports_WarehouseOversupply.DepartmentList, DepSend, DepName);
		Library.Interaction.selectEle(Xpath.Reports_WarehouseOversupply.ClassDropDown, Xpath.Reports_WarehouseOversupply.ClassSearch, Xpath.Reports_WarehouseOversupply.ClassList, Class_Send, Class_Name);
		Library.Interaction.click(Xpath.Reports_WarehouseOversupply.Search);
		Library.Interaction.print("User Clicked on Search");
		Library.Interaction.click(Xpath.Reports_WarehouseOversupply.Print);
		Thread.sleep(5000);
		Library.Interaction.print("User Clicked on Print");
		Thread.sleep(5000);
		String windows = driver.getWindowHandle();
		
		driver.switchTo().window(windows);
		String Text = Library.Interaction.getElmtText(Xpath.Reports_WarehouseOversupply.WarehouseOversupply);
			
		System.out.println(Text);
		System.out.println("success");
		
		Library.Interaction.click(Xpath.Reports_WarehouseOversupply.Export);
		Library.Interaction.print("User Clicked on Export and Exported the File");
		Thread.sleep(4000);

	
	    
	}
	catch (Exception e) {
		captureScreen(driver, "createLocationForm");
		Assert.assertFalse(false);
		log.info("Test Failed");
		}
}
}

