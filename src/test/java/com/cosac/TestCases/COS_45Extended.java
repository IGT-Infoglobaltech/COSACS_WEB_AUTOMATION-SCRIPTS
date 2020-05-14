package com.cosac.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;

public class COS_45Extended extends BaseClass {
	String Duty_Price1="42000";
	String Duty_Price2="66000";
	//vary the test daa all the time
	String ItemNbr="B0256";
	String f="M";
	String Free=ItemNbr+f;
			
	
	
	
	
@Test
public void ExtendedAndFree() throws IOException {
	try {
		log.info("Warrenty creation Starts for extended type");
		System.out.println("creation strts");
		Library.Interaction.click(Xpath.WarrentyExtended.Warrenty);
		System.out.println("Click on create warrenty");
		Library.Interaction.click(Xpath.WarrentyExtended.CreateWarrenty);
		
		//enter the item number
		System.out.println("added item");
		Thread.sleep(3000);
	
		Library.Interaction.setTextBoxByXpath(Xpath.WarrentyExtended.ItemNumber, ItemNbr);
		Library.Interaction.setTextBoxByXpath(Xpath.WarrentyExtended.Description, "Add Electrical Warrenty");
		Library.Interaction.setTextBoxByXpath(Xpath.WarrentyExtended.LengthInMths, "36");
		Library.Interaction.selectEle(Xpath.WarrentyExtended.DepartmentDropDown, Xpath.WarrentyExtended.Search_Dept, Xpath.WarrentyExtended.List_Dept, "Electr", "Electrical");
		System.out.println("clicked on extended warrenty");
		Library.Interaction.click(Xpath.WarrentyExtended.ExtendedCheckBox);
		//need to add the code to save the text in the item number
		/*Library.Interaction.selectEl(Xpath.WarrentyExtended.ClassDropDown, Xpath.WarrentyExtended.Search_Dept, Xpath.WarrentyExtended.List_Dept, "Bedr", "Bedroom");*/
		Thread.sleep(2000);
		
		Library.Interaction.click(Xpath.WarrentyExtended.SaveAndContinue);
		Library.Interaction.click(Xpath.WarrentyExtended.Home);
		
		//warrenty verificationstsrts
		log.info("Warrenty Verification starts for the Extended warrenty");
		System.out.println("Verification starts");
		Library.Interaction.click(Xpath.WarrentyExtended.Warrenty);
		Library.Interaction.click(Xpath.WarrentyExtended.SearchWarrenty);
		Library.Interaction.setTextBoxByXpath(Xpath.WarrentyExtended.SearchbyItemNumber, ItemNbr);
		Library.Interaction.click(Xpath.WarrentyExtended.Dots);
		Thread.sleep(3000);
		Library.Interaction.click(Xpath.WarrentyExtended.Dots);
		Library.Interaction.click(Xpath.WarrentyExtended.AddNew);
		Library.Interaction.setTextBoxByXpath(Xpath.WarrentyExtended.CostPrice, "1500");
		Library.Interaction.setTextBoxByXpath(Xpath.WarrentyExtended.RetailsPrice, "1800");
		Library.Interaction.DateFormat(Xpath.WarrentyExtended.EnterDate);
		Library.Interaction.click(Xpath.WarrentyExtended.Save);
		Library.Interaction.click(Xpath.WarrentyExtended.Home);
		
		
		
		
}
catch (Exception e) {
	e.printStackTrace();
	captureScreen(driver, "ExtendedAndFree");
	Assert.assertFalse(false);
	log.info("Test Failed");
}
}

@Test(dependsOnMethods={"ExtendedAndFree"})
public void Extended() throws IOException {
	try {
		log.info("Warrenty creation Starts for New type");
		Thread.sleep(3000);
		System.out.println("creation strts");
		Library.Interaction.click(Xpath.WarrentyExtended.Warrenty);
		System.out.println("Click on create warrenty");
		Library.Interaction.click(Xpath.WarrentyExtended.CreateWarrenty);
		
		//enter the item number
		System.out.println("added item");
		Thread.sleep(3000);
		Library.Interaction.setTextBoxByXpath(Xpath.WarrentyExtended.ItemNumber, Free);
		Library.Interaction.setTextBoxByXpath(Xpath.WarrentyExtended.Description, "Add Electrical Warrenty");
		Library.Interaction.setTextBoxByXpath(Xpath.WarrentyExtended.LengthInMths, "36");
		Library.Interaction.selectEle(Xpath.WarrentyExtended.DepartmentDropDown, Xpath.WarrentyExtended.Search_Dept, Xpath.WarrentyExtended.List_Dept, "Electr", "Electrical");
		/*System.out.println("clicked on extended warrenty");
		Library.Interaction.click(Xpath.WarrentyExtended.ExtendedCheckBox);*/
		//need to add the code to save the text in the item number
		/*Library.Interaction.selectEl(Xpath.WarrentyExtended.ClassDropDown, Xpath.WarrentyExtended.Search_Dept, Xpath.WarrentyExtended.List_Dept, "Bedr", "Bedroom");*/
		Library.Interaction.click(Xpath.WarrentyExtended.SaveAndContinue);
		Library.Interaction.click(Xpath.WarrentyExtended.Home);
		log.info("Warrenty Verification starts for new");
		        //warrenty verificationstsrts
				System.out.println("Verification starts");
				Library.Interaction.click(Xpath.WarrentyExtended.Warrenty);
				Library.Interaction.click(Xpath.WarrentyExtended.SearchWarrenty);
				Library.Interaction.setTextBoxByXpath(Xpath.WarrentyExtended.SearchbyItemNumber, Free);
				Library.Interaction.click(Xpath.WarrentyExtended.Dots);
				Thread.sleep(3000);
				Library.Interaction.click(Xpath.WarrentyExtended.Dots);
				Library.Interaction.click(Xpath.WarrentyExtended.AddNew);
				Library.Interaction.setTextBoxByXpath(Xpath.WarrentyExtended.CostPrice, "1500");
				/*Library.Interaction.setTextBoxByXpath(Xpath.WarrentyExtended.RetailsPrice, "1800");*/
				Library.Interaction.DateFormat(Xpath.WarrentyExtended.EnterDate);
				Library.Interaction.click(Xpath.WarrentyExtended.Save);
				Library.Interaction.click(Xpath.WarrentyExtended.Home);
		
		
		
		
		
	    }
	catch (Exception e) {
		captureScreen(driver, "CreateExtendedAndFree");
		Assert.assertFalse(false);
		log.info("Test Failed");
		}
}
}
