package com.cosac.TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;

public class COS20_HomeDelivery extends BaseClass{
	//Jamaica
		public static String ShipmentNUM;
		public static String ExpectedPageTitle="Picking";
		public static String ExpectedSearchPageTitle="Search Pick Lists";
		public static JavascriptExecutor js;
		public static String PickListNumber ;
		public static String PickedByEmp="Alicia";
		public static String CheckedEmp="Alicia";
		public static String comment="Item Picked and Checked Successfully";
		public static String SendingLocation="680 COURTS PORTMORE";
		public static String ExpectedSearchShipmentPageTitle="Search Shipments";
		public static String DeleveryBranch="680 COURTS PORTMORE";
		public static String ExpectedSchedulingPageTitle="Load and Delivery Schedule";
		public static String DeliveryScheduleNumber;
		public static String SrchDeliverySchdlExpectedTitle="Load and Delivery Schedule";
		public static String Type="External";
		public static String Truck="RTS";

		

		@Test
		public void Picking()throws Exception
		{
			try
			{
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.Logistics.Logistics);
				log.info("User is clicked on Merchandising");
				
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.Logistics.Picking);
				log.info("User is clicked on Picking");
				
				Library.Interaction.userWait();
				String ActualPageTitle = Library.Interaction.verifyPageTitle();
				Assert.assertEquals(ActualPageTitle, ExpectedPageTitle);
				log.info("Page Title is Verified SuccessFully");
				
				
				Library.Interaction.userWait();
				Library.Interaction.selectEleVisibleTextByContains(Xpath.Picking.SendingLocationClick, Xpath.Picking.SendingLocationSearch,Xpath.Picking.SendingLocationList, SendingLocation, SendingLocation);
				Library.Interaction.print("User is selcted Sending Location");
				
				Library.Interaction.userWait();
				Library.Interaction.selectEleVisibleTextByContains(Xpath.Picking.TypeClick, Xpath.Picking.TypeSearch, Xpath.Picking.TypeList, Type, Type);
				Library.Interaction.print("User is selcted Type");
				
//				Library.Interaction.userWait();
//				Library.Interaction.selectEleVisibleTextByContains(Xpath.Picking.RecevingLocation,Xpath.Picking.RecevingLocationSearch, Xpath.Picking.RecevingLocationList, RecevingLocation, RecevingLocation);
//				Library.Interaction.print("User is selcted Receving Location");
				
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.Picking.search);
				log.info("Shipment is Searched Successfully");
				
				Thread.sleep(3000);
				js = (JavascriptExecutor) driver;
				js.executeScript("scroll(0,200)");
				
				//TRuck
				Thread.sleep(2000);
				Library.Interaction.userWait();
				Library.Interaction.selectele(Xpath.Picking.Driver, Xpath.Picking.DriverSearch, Xpath.Picking.DriverList, Truck, Truck);
				Library.Interaction.print("Driver selected successfully");
				Thread.sleep(2000);
				
				Library.Interaction.userWait();
				Thread.sleep(3000);
				Library.Interaction.click(Xpath.Picking.ShipmentPick);
				log.info("Shipment is added to Truck Successfully");
				
				Thread.sleep(2000);
				Library.Interaction.userWait();
				String PickingSuccessMsg= Library.Interaction.verifyToastMessageWithNumbers(Xpath.Picking.PickingSuccessMsg);
				log.info(PickingSuccessMsg);
				
				ShipmentNUM=PickingSuccessMsg.replaceAll("[^0-9]", "").trim();
			    
				

				
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.Picking.PrintByTruck);
				Library.Interaction.print("User is clicked on Print Truck");
				
				String parent = driver.getWindowHandle();
				
				Thread.sleep(2000);
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.Picking.ExternalLink);
				Library.Interaction.print("User is clicked on ExternalLink");
				
				
				
				Library.Interaction.userWait();
				Library.Interaction.switchNewwindow();
				PickListNumber = Library.Interaction.getOnlyNumbers(Xpath.Picking.PickListNumber).trim().replaceFirst("^0*","");
				log.info("PickList Number is Generated Successfully");
				
				Thread.sleep(5000);
				driver.close();
				driver.switchTo().window(parent);
				Library.Interaction.click(Xpath.Picking.Ok);
				log.info("Shipment Picking Successfully");
				
				
				
				
			}
			catch (Exception e) {
				captureScreen(driver, "location");
				AssertJUnit.assertFalse(false);
				log.info("Test Failed");
				throw(e);
			}
		}
		
	@Test(dependsOnMethods="Picking")
		public void SearchPicklist()throws Exception
		{
			try
			{
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.Logistics.Logistics);
				log.info("User clicked on Logistics");
				
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.Logistics.SearchPicklist);
				log.info("User clicked on SearchPicklist");
				

				
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.SearchPickList.SearchPicklistTxtbox);
				
				Library.Interaction.setTextBoxByXpath(Xpath.SearchPickList.SearchPicklistTxtbox, PickListNumber);
				log.info("User is able to search picklist");
				
				Thread.sleep(3000);
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.SearchPickList.PickListNumberLink);
				log.info("User is able to select PickList");
				
				
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.SearchPickList.PickedOnDate);
				log.info("User is able to select Picked Date");
				Library.Interaction.selectele(Xpath.SearchPickList.pickeddroparrow, Xpath.SearchPickList.pickedtextbox, Xpath.SearchPickList.pickedselect, PickedByEmp, PickedByEmp);
				log.info("Shipment is Picked Successfully");
			    Thread.sleep(5000);
			    Library.Interaction.selectele(Xpath.SearchPickList.checkedby, Xpath.SearchPickList.checkedtextbox, Xpath.SearchPickList.checkedselect, CheckedEmp, CheckedEmp);
			    log.info("Shipment is Checked Successfully");
				Thread.sleep(3000);
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.SearchPickList.ShipmentComment);
				Library.Interaction.setTextBoxByXpath(Xpath.SearchPickList.ShipmentComment,comment);
				Library.Interaction.print("User is commented");
				
				Thread.sleep(3000);
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.SearchPickList.Save);
				log.info("Saved Successfully");
				
				Thread.sleep(3000);
				Library.Interaction.userWait();
				String PickingStatus = Library.Interaction.getElmtText(Xpath.SearchPickList.PickingRejectionStaus);
				log.info(PickingStatus);
				
				Thread.sleep(2000);
			}
			catch (Exception e) {
				captureScreen(driver, "location");
				AssertJUnit.assertFalse(false);
				log.info("Test Failed");
				throw(e);
			}
		}
				
		@Test(dependsOnMethods="SearchPicklist")
		public void Scheduling() throws Exception
		{
			try
			{
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.Logistics.Logistics);
				Library.Interaction.print("User Clicked On Merchandising");
				
				
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.Logistics.Scheduling);
				Library.Interaction.print("User Clicked On Scheduling");
				

				
				Library.Interaction.userWait();
				Library.Interaction.selectEleVisibleTextByContains(Xpath.Scheduling.DeliveryBranch, Xpath.Scheduling.DeliveryBranchSearch, Xpath.Scheduling.DeliveryBranchList, DeleveryBranch, DeleveryBranch);
				Library.Interaction.print("User able to select DeliveryBranch");
				
			
				Library.Interaction.selectEleVisibleTextByContains(Xpath.Scheduling.Truck, Xpath.Scheduling.TruckSearch, Xpath.Scheduling.TruckList,Truck , Truck);
				Library.Interaction.print("User able to select Truck");
				
				
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.Scheduling.Type);
				Library.Interaction.userWait();
				Library.Interaction.selectEleByIndex(Xpath.Scheduling.Type, 0);
				Library.Interaction.print("User selected  Type");
				
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.Scheduling.CreateDeliverySchedule);
				Library.Interaction.print("User able to click on CreateDeliverySchedule");
				
				

				
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.Scheduling.Comment);
				Library.Interaction.setTextBoxByXpath(Xpath.Scheduling.Comment, comment);
				Library.Interaction.print("User able to Comment");
				
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.Scheduling.Save);
				Library.Interaction.print("User able to Save");
				
				String parent = driver.getWindowHandle();
				
				Thread.sleep(2000);
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.Scheduling.DeliveryScheduleLink);
				Library.Interaction.print("User is clicked on ExternalLink");
				
				
			    Thread.sleep(3000);
				Library.Interaction.userWait();
				Library.Interaction.switchNewwindow();
				DeliveryScheduleNumber = Library.Interaction.getOnlyNumbers(Xpath.Scheduling.ReceiptDeliveryScheduleNumber).trim();
				
				driver.switchTo().window(parent);
				Library.Interaction.click(Xpath.Scheduling.Ok);
				log.info("Load and Delivery Schedule is Completed Successfully");
				
			}
			catch (Exception e) {
				captureScreen(driver, "location");
				AssertJUnit.assertFalse(false);
				log.info("Test Failed");
				throw(e);
			}
		}
		@Test(dependsOnMethods="Scheduling")	
		public void SearchDeliverySchedules() throws Exception
		{
			try
			{
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.Logistics.Logistics);
				Library.Interaction.print("User able to click on Logistics");
				
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.Logistics.SearchDeliverySchedule);
				Library.Interaction.print("User able to click on SearchDeliverySchedule");
				
				Library.Interaction.userWait();
				String SrchDeliverySchdlActualTitle = Library.Interaction.verifyPageTitle();
				Assert.assertEquals(SrchDeliverySchdlActualTitle, SrchDeliverySchdlExpectedTitle);
				log.info("Page Title is Verified Successfully");
				
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.SearchDeliverySchedules.SearchBox);
				Library.Interaction.setTextBoxByXpath(Xpath.SearchDeliverySchedules.SearchBox, DeliveryScheduleNumber);
				Library.Interaction.print("User able to Search Shipment");
				
				Thread.sleep(2000);
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.SearchDeliverySchedules.ScheduleNumberLink);
				log.info("User Clicked On ScheduleNumber");
				
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.SearchDeliverySchedules.ConfirmationDate);
				Library.Interaction.click(Xpath.SearchDeliverySchedules.ConfirmDate);
				log.info("User Confirmed Date Successfully");
				
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.SearchDeliverySchedules.Confirm);
				log.info("Delivery Confirmed Successfully");
				

				
			}
			catch (Exception e) {
				captureScreen(driver, "location");
				AssertJUnit.assertFalse(false);
				log.info("Test Failed");
				throw(e);
			}
		}
		@Test(dependsOnMethods="SearchDeliverySchedules")		
		public void SearchShipments() throws Exception
		{
			try
			{
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.Logistics.Logistics);
				log.info("User able to Click on Logistics");
				
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.Logistics.SearchShipments);
				log.info("User able to click on Search Shipments");
				
				Thread.sleep(2000);
				Library.Interaction.userWait();
				String ActualPageTitle = Library.Interaction.verifyPageTitle();
				Assert.assertEquals(ActualPageTitle, ExpectedSearchShipmentPageTitle);
				log.info("Page Title is Verified Successfully");
				
				
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.SearchShipments.ShipmentSearchBox);
				Library.Interaction.setTextBoxByXpath(Xpath.SearchShipments.ShipmentSearchBox, ShipmentNUM);
				Library.Interaction.print("User able to Search Shipment");
				
				Thread.sleep(2000);
				Library.Interaction.userWait();
				String ShipmentStatus = Library.Interaction.getElmtText(Xpath.SearchShipments.SearchShimpmentStatus);
				log.info("Shipment is "+ShipmentStatus);


			
			}
			catch (Exception e) {
				captureScreen(driver, "location");
				AssertJUnit.assertFalse(false);
				log.info("Test Failed");
				throw(e);
			}
		}
				


}
