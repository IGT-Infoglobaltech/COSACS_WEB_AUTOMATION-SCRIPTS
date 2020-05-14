package com.cosac.TestCases;

import java.awt.Button;
import java.io.IOException;

import org.apache.xmlbeans.impl.store.Public2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;

public class COS35_TechnicalServices_InternalCustomer extends BaseClass {
	String Div_Name ="SDA";
	String Manufacture_Search="Accutek";
	String Manufacture_Send="Accu";
	String AccountNumber="940415514900";
	String CustomerName="Customer Number";
	String CustomerSend="Customer ";
	String CustomerID="[[W300479";
	String AddressLine2="GRATTO DISTRICT";
	String Tele="1256";
	String ServiceEvaluationDropDownName="Damage On Delivery";
	String ServiceEvaluationDropDownSend="Damage O";
	String ServiceLocationName ="Barnett Street";
	String ServiceLocationSend ="Barnett ";
	String ActionRequiredName="Send Technician";
	String ActionRequiredSend="Send Tech";
	String ClaimforfoodlossName="No";
	String ClaimforfoodlossSend="No";
	String RecievedDate="Wed, 18 March, 2020";
	String ExpectedDate="Wed, 18 March, 2020";
	String ServiceDate="Wed, 18 March, 2020";
	String FilterByDropDownName="BROWN GOODS";
	String FilterByDropDownSend="BROWN ";
	String TechnicianDropDownName="DAMION RUSSELL (3826)";
	String TechnicianDropDownSend="DAMION ";
	String SerialNumber="1452";
	String RepairTypeName="Assessment";
	String RepairTypeSend="Assess";
	String DeleveryChargeName="ALPHANSO SMITH";
	String DeleveryChargeSend="ALPHAN";
	String ReasonForExchangeName="Exchange - Item DOA";
	String ReasonForExchangeSend="Exchange - Item ";
	String ReasonForFailureName="Damage On Delivery";
	String ReasonForFailureSend="Damage On Del";
	String AddComments="Service Done Successfully by Jamaica911 user";
	public static String str="";
	
@Test
public void InternalCustomer() throws IOException {
	try {
		log.info("Service Creation for Internal Customer Starts");
		//user clicked on Service
		System.out.println("User clicked on Service");
		Library.Interaction.click(Xpath.TechnicalServicesInternalCustomer.Service);
		Library.Interaction.click(Xpath.TechnicalServicesInternalCustomer.SearchInstallation);
		Library.Interaction.setTextBoxByXpath(Xpath.TechnicalServicesInternalCustomer.TypeYourSearchHere, "567450");
		Library.Interaction.click(Xpath.TechnicalServicesInternalCustomer.Request1);
		Library.Interaction.click(Xpath.TechnicalServicesInternalCustomer.Resolution);
		Library.Interaction.click(Xpath.TechnicalServicesInternalCustomer.ResolutionAddpart);
		Library.Interaction.click(Xpath.TechnicalServicesInternalCustomer.ResolutionSearch);
		Library.Interaction.click(Xpath.TechnicalServicesInternalCustomer.AddPart);
		/*String mainWindowHandle = driver.getWindowHandle();
		for (String childWindowHandle : driver.getWindowHandles()) {
			  //If window handle is not main window handle then close it 
			  if(!childWindowHandle.equals(mainWindowHandle)){
			  driver.switchTo().window(childWindowHandle);
			  Library.Interaction.setTextBoxByXpath(Xpath.TechnicalServicesInternalCustomer.ItemSearch1, "sa");
			  // Close child windows
			  driver.close(); 
			  }
			}
		*/
		/*Library.Interaction.switchToNewWindow();*/
		/*Library.Interaction.click(Xpath.TechnicalServicesInternalCustomer.StockLocationDropDown);*/
		/*Library.Interaction.click(Xpath.TechnicalServicesInternalCustomer.ItemSearch1);*/
		Library.Interaction.setTextBoxByXpath(Xpath.TechnicalServicesInternalCustomer.ItemSearch1, "sa");
		Library.Interaction.click(Xpath.TechnicalServicesInternalCustomer.MatchingStockSearch);
		Library.Interaction.click(Xpath.TechnicalServicesInternalCustomer.MatchingStockClick);
		
		
		
		/*System.out.println("User clicked on new Service Request");
		Library.Interaction.click(Xpath.TechnicalServicesInternalCustomer.NewServiceRequest);
		System.out.println("User clicked on internal customer");
		Library.Interaction.click(Xpath.TechnicalServicesInternalCustomer.InternalCustomer);
		//user selected the customer id and do the service
		Library.Interaction.selectEl(Xpath.TechnicalServicesInternalCustomer.CustomerID, Xpath.TechnicalServicesInternalCustomer.ManufacturerSearch, Xpath.TechnicalServicesInternalCustomer.ManufacturerList, CustomerSend, CustomerName);
		Library.Interaction.setTextBoxByXpath(Xpath.TechnicalServicesInternalCustomer.AccountSearch, CustomerID);
		
		
		
		System.out.println("User entered account number");
		Library.Interaction.setTextBoxByXpath(Xpath.TechnicalServicesInternalCustomer.AccountSearch, AccountNumber);
		System.out.println("User clicked on Search");
		Library.Interaction.click(Xpath.TechnicalServicesInternalCustomer.Search);
		System.out.println("User clicked on Select");
		Library.Interaction.click(Xpath.TechnicalServicesInternalCustomer.Select);
	    log.info("Service Process Starts");
		System.out.println("User entered address line2");
		Library.Interaction.setTextBoxByXpath(Xpath.TechnicalServicesInternalCustomer.Addresssline2, AddressLine2);
		
		Library.Interaction.setTextBoxByXpath(Xpath.TechnicalServicesInternalCustomer.Telephone, Tele);
		
		System.out.println("User scroll down");
		Library.Interaction.scrollto_Element_Regular(Xpath.TechnicalServicesInternalCustomer.ModelNumber);
		System.out.println("User entered model number");
		Library.Interaction.selectEl(Xpath.TechnicalServicesInternalCustomer.ManufacturerDropDown, Xpath.TechnicalServicesInternalCustomer.ManufacturerSearch, Xpath.TechnicalServicesInternalCustomer.ManufacturerList, Manufacture_Send,Manufacture_Search );
		System.out.println("User entered manufacturer details");
		Library.Interaction.click(Xpath.TechnicalServicesInternalCustomer.Save);
		System.out.println("User Saves the page heading");
		Thread.sleep(10000);
		String text=Library.Interaction.getElmtText(Xpath.TechnicalServicesInternalCustomer.PageHeading);
	    System.out.println(text);
	    //Evaluation starts
	    log.info("Service Evaluation Starts");
	    System.out.println("Evaluation Starts");
	    Library.Interaction.click(Xpath.TechnicalServicesInternalCustomer.Evaluation1);
	    Library.Interaction.selectEl(Xpath.TechnicalServicesInternalCustomer.ServiceEvaluationDropdown, Xpath.TechnicalServicesInternalCustomer.ManufacturerSearch, Xpath.TechnicalServicesInternalCustomer.ManufacturerList, ServiceEvaluationDropDownSend, ServiceEvaluationDropDownName);
	    Library.Interaction.selectEl(Xpath.TechnicalServicesInternalCustomer.ServiceLocationDropDown, Xpath.TechnicalServicesInternalCustomer.ManufacturerSearch, Xpath.TechnicalServicesInternalCustomer.ManufacturerList, ServiceLocationSend, ServiceLocationName);
	    Library.Interaction.selectEl(Xpath.TechnicalServicesInternalCustomer.ActionRequiredDropDOwn, Xpath.TechnicalServicesInternalCustomer.ManufacturerSearch, Xpath.TechnicalServicesInternalCustomer.ManufacturerList,ActionRequiredSend, ActionRequiredName);
	    Library.Interaction.selectEl(Xpath.TechnicalServicesInternalCustomer.ClaimForFoodDropDown, Xpath.TechnicalServicesInternalCustomer.ManufacturerSearch, Xpath.TechnicalServicesInternalCustomer.ManufacturerList,ClaimforfoodlossSend, ClaimforfoodlossName);
	    Library.Interaction.click(Xpath.TechnicalServicesInternalCustomer.InstructionManualRadio);
	    Library.Interaction.click(Xpath.TechnicalServicesInternalCustomer.UnderwarrentyRadio);
	    Library.Interaction.click(Xpath.TechnicalServicesInternalCustomer.UsedomesticallyRadio);
	    Library.Interaction.click(Xpath.TechnicalServicesInternalCustomer.QualifiedPersonnalRadio);
	    Library.Interaction.click(Xpath.TechnicalServicesInternalCustomer.DeliveryRadio);
	   //Allocation Starts
	    log.info("Service Allocation Starts");
	    System.out.println("Allocation Starts");
	    Library.Interaction.click(Xpath.TechnicalServicesInternalCustomer.Allocation);
	    Library.Interaction.setTextBoxByXpath(Xpath.TechnicalServicesInternalCustomer.RecievedOn, RecievedDate);
	    Library.Interaction.setTextBoxByXpath(Xpath.TechnicalServicesInternalCustomer.ExpectedOn, ExpectedDate);
	    Library.Interaction.setTextBoxByXpath(Xpath.TechnicalServicesInternalCustomer.ServiceScheduled, ServiceDate);
	    Library.Interaction.selectEl(Xpath.TechnicalServicesInternalCustomer.FilterByCategoryDropDown, Xpath.TechnicalServicesInternalCustomer.ManufacturerSearch, Xpath.TechnicalServicesInternalCustomer.ManufacturerList, FilterByDropDownSend, FilterByDropDownName);
	    Library.Interaction.selectEl(Xpath.TechnicalServicesInternalCustomer.TechnicianDropDown, Xpath.TechnicalServicesInternalCustomer.ManufacturerSearch, Xpath.TechnicalServicesInternalCustomer.ManufacturerList, TechnicianDropDownSend, TechnicianDropDownName);
	    
	    Library.Interaction.DateFormat(Xpath.TechnicalServicesInternalCustomer.RecievedOn);
	    Library.Interaction.DateFormat(Xpath.TechnicalServicesInternalCustomer.ExpectedOn);
	    Library.Interaction.DateFormat(Xpath.TechnicalServicesInternalCustomer.ServiceScheduled);
        Library.Interaction.selectEl(Xpath.TechnicalServicesInternalCustomer.FilterByCategoryDropDown, Xpath.TechnicalServicesInternalCustomer.ManufacturerSearch, Xpath.TechnicalServicesInternalCustomer.ManufacturerList, FilterByDropDownSend, FilterByDropDownName);
        Library.Interaction.selectEl(Xpath.TechnicalServicesInternalCustomer.TechnicianDropDown, Xpath.TechnicalServicesInternalCustomer.ManufacturerSearch, Xpath.TechnicalServicesInternalCustomer.ManufacturerList, TechnicianDropDownSend, TechnicianDropDownName);
	    Library.Interaction.click(Xpath.TechnicalServicesInternalCustomer.TimeTrack);
	    log.info("Service Resolution Starts");
	    Library.Interaction.click(Xpath.TechnicalServicesInternalCustomer.Resolution);
	    Library.Interaction.setTextBoxByXpath(Xpath.TechnicalServicesInternalCustomer.SerialNumber, SerialNumber);
	    Library.Interaction.selectEl(Xpath.TechnicalServicesInternalCustomer.RepairTypeDropDown, Xpath.TechnicalServicesInternalCustomer.ManufacturerSearch, Xpath.TechnicalServicesInternalCustomer.ManufacturerList, RepairTypeSend, RepairTypeName);
	    Library.Interaction.selectEl(Xpath.TechnicalServicesInternalCustomer.DeliverToChargeDropDown, Xpath.TechnicalServicesInternalCustomer.ManufacturerSearch, Xpath.TechnicalServicesInternalCustomer.ManufacturerList, DeleveryChargeSend, DeleveryChargeName);
	    Library.Interaction.click(Xpath.TechnicalServicesInternalCustomer.Save);
	    System.out.println("User Saves the page heading");
		Thread.sleep(10000);
		String text1=Library.Interaction.getElmtText(Xpath.TechnicalServicesInternalCustomer.PageHeading);
	    System.out.println(text1);
	    log.info("Service Finalisation Starts");
	    Library.Interaction.click(Xpath.TechnicalServicesInternalCustomer.Finalise);
	    
	    Library.Interaction.selectEl(Xpath.TechnicalServicesInternalCustomer.ReasonForExchangeDropDown, Xpath.TechnicalServicesInternalCustomer.ManufacturerSearch, Xpath.TechnicalServicesInternalCustomer.ManufacturerList, ReasonForExchangeSend, ReasonForExchangeName);
	    Library.Interaction.selectEl(Xpath.TechnicalServicesInternalCustomer.ReasonForFailureDropDown, Xpath.TechnicalServicesInternalCustomer.ManufacturerSearch, Xpath.TechnicalServicesInternalCustomer.ManufacturerList, ReasonForFailureSend, ReasonForFailureName);
	    log.info("User add the comments for the service Request");
	    Library.Interaction.setTextBoxByXpath(Xpath.TechnicalServicesInternalCustomer.AddComment, AddComments);
	    Library.Interaction.click(Xpath.TechnicalServicesInternalCustomer.SaveComment);
	    Library.Interaction.click(Xpath.TechnicalServicesInternalCustomer.Save);
	    System.out.println("User Saves the page heading");
		Thread.sleep(10000);
		String text2=Library.Interaction.getElmtText(Xpath.TechnicalServicesInternalCustomer.PageHeading);
	    System.out.println(text2);*/
	    
	   
	    
	}
catch (Exception e) {
	e.printStackTrace();
	captureScreen(driver, "InternalCustomer");
	Assert.assertFalse(false);
	log.info("Test Failed");
}
}

@Test(dependsOnMethods={"InternalCustomer"})
public void CreateInternalCustomer() throws IOException {
	try {
		
	    log.info("Service Creation for Internal Customer Starts");
	    // if teh account number is not valid for the service repair the below statement will get executed
	    System.out.println("This customer is not assigned with the installation in the CoSaCS system");
	    String NoEle = Library.Interaction.getElmtText(Xpath.TechnicalServicesInternalCustomer.NoResultFound);
	    System.out.println(NoEle);
	    Library.Interaction.click(Xpath.TechnicalServicesInternalCustomer.NoResultOK);
	    
	    
	   /* Library.Interaction.click(Xpath.Combo_ProductCreation.Home);*/
	    
	    
	    }
	catch (Exception e) {
		captureScreen(driver, "InternalCustomer");
		Assert.assertFalse(false);
		log.info("Test Failed");
		}
}
}
