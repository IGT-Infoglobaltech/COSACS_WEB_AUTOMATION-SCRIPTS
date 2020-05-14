
package com.cosac.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;

public class COS61_TechnicianPayments extends BaseClass{
	
	String ExpectedTechnicianPayments="Technician Payments";
	
	@Test
	public void TechnicianPayments() throws IOException, InterruptedException {
		try
		{
			
		Library.Interaction.userWait();
		Library.Interaction.click(Xpath.TechnicianPayments.Service);
		Library.Interaction.print("User Clicked on Service");
		Thread.sleep(3000);
		Library.Interaction.click(Xpath.TechnicianPayments.TechnicianPaymentslink);
		Library.Interaction.print("User Clicked on TechnicianPaymentslink link");
		Thread.sleep(5000);
		String TechnicianPayments = driver.findElement(By.xpath(Xpath.TechnicianPayments.VerifyTechnicianPayments)).getText();
		Assert.assertEquals(TechnicianPayments,ExpectedTechnicianPayments);
        log.info("User are in ExpectedTechnicianPayments Page");
        
		}catch (Exception e) {
			
			captureScreen(driver, "TechnicianPayments");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
     }
	
	@Test(dependsOnMethods =   {"TechnicianPayments"})
public void TechnicianPaymentsPage() throws IOException {
		
		try
		{
			Library.Interaction.click(Xpath.TechnicianPayments.SelectButton);
			Library.Interaction.print("User Clicked on Select Button");
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.TechnicianPayments.PaymentsTo, "Tue, 14 April, 2020");
			Library.Interaction.userWait();
			Library.Interaction.print("User Entered date into To Payments box");
			Library.Interaction.moveToElement(Xpath.TechnicianPayments.VerifyTechnicianPayments);
			Library.Interaction.click(Xpath.TechnicianPayments.VerifyTechnicianPayments);
			Library.Interaction.selectAndSerachEle(Xpath.TechnicianPayments.StatusFilter,Xpath.TechnicianPayments.StatusFilterSearch,Xpath.TechnicianPayments.StatusFilterData,"Pending");
			Library.Interaction.userWait();
			Library.Interaction.print("User Selected on Status Filter Dropdown");
			Library.Interaction.click(Xpath.TechnicianPayments.SearchButton);
			Library.Interaction.print("User Clicked on Search Button");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.TechnicianPayments.Checkbox);
			Library.Interaction.print("User Clicked on Check Box");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.TechnicianPayments.PayButton);
			Thread.sleep(5000);
			Library.Interaction.print("User Clicked on Pay Button");
			
			
			
			Library.Interaction.click(Xpath.TechnicianPayments.ClearButton);
			Library.Interaction.print("User Clicked on Clear Button");
			Thread.sleep(5000);
			Library.Interaction.setTextBoxByXpath(Xpath.TechnicianPayments.PaymentsTo2, "Tue, 14 April, 2020");
			Library.Interaction.userWait();
			Library.Interaction.print("User Entered date into To Payments box");
			Library.Interaction.moveToElement(Xpath.TechnicianPayments.VerifyTechnicianPayments);
			Library.Interaction.click(Xpath.TechnicianPayments.VerifyTechnicianPayments);
			Library.Interaction.selectAndSerachEle(Xpath.TechnicianPayments.StatusFilter2,Xpath.TechnicianPayments.StatusFilterSearch2,Xpath.TechnicianPayments.StatusFilterData2,"Paid");
			Library.Interaction.userWait();
			Library.Interaction.print("User Selected on Status Filter Dropdown");
			Library.Interaction.click(Xpath.TechnicianPayments.SearchButton2);
			Library.Interaction.print("User Clicked on Search Button");
			Thread.sleep(5000);
			
			Library.Interaction.click(Xpath.TechnicianPayments.ClearButton);
			Library.Interaction.print("User Clicked on Clear Button");
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.TechnicianPayments.PaymentsTo3, "Tue, 14 April, 2020");
			Library.Interaction.userWait();
			Library.Interaction.print("User Entered date into To Payments box");
			Library.Interaction.moveToElement(Xpath.TechnicianPayments.VerifyTechnicianPayments);
			Library.Interaction.click(Xpath.TechnicianPayments.VerifyTechnicianPayments);
			Library.Interaction.selectAndSerachEle(Xpath.TechnicianPayments.StatusFilter3,Xpath.TechnicianPayments.StatusFilterSearch3,Xpath.TechnicianPayments.StatusFilterData3,"Deleted");
			Library.Interaction.userWait();
			Library.Interaction.print("User Selected on Status Filter Dropdown");
			Library.Interaction.click(Xpath.TechnicianPayments.SearchButton3);
			Library.Interaction.print("User Clicked on Search Button");
			Thread.sleep(3000);

			
		}catch (Exception e) {
			captureScreen(driver, "TechnicianPaymentsPage");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
    }
}



