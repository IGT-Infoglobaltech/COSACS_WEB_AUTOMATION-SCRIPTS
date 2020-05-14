package com.cosac.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;

public class COS60_Search_MyJobs extends BaseClass{
	
	
	String ExpectedSearchMyJobs="Search My Jobs";
	String FromDate="Wed, 1 January, 2020";
	String ToDate="Tue, 31 March, 2020";
	String ExpectedServiceRequest="2082203";
	String ExpectedBranch="650 COURTS PORT ANTONIO";
	String ExpectedRequestType="Internal Customer";
	String ExpectedAccountNumber="650088363171";
	
	@Test
	public void SearchMyJobs() throws IOException, InterruptedException {
		try
		{
		Library.Interaction.userWait();
		Library.Interaction.click(Xpath.SearchMyJobs.Service);
		Library.Interaction.print("User Clicked on Service");
		Thread.sleep(1000);
		Library.Interaction.click(Xpath.SearchMyJobs.Searchmyjobslink);
		Library.Interaction.print("User Clicked on Search my Job link");
		Thread.sleep(5000);
		String SearchMyJobs = driver.findElement(By.xpath(Xpath.SearchMyJobs.VerifySearchMyJobsPage)).getText();
		Assert.assertEquals(SearchMyJobs,ExpectedSearchMyJobs);
        log.info("User are in Search My Jobs Page");
        
		}catch (Exception e) {
			
			e.printStackTrace();
			captureScreen(driver, "SearchMyJobs");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
     }
		
	@Test(dependsOnMethods = {"SearchMyJobs"})
	
	public void SearchMyJobsPage() throws IOException {
		
		try
		{
			
		Library.Interaction.setTextBoxByXpath(Xpath.SearchMyJobs.FromDate, FromDate);
		Library.Interaction.userWait();
		Library.Interaction.print("User Entered date into From Text box");
		Library.Interaction.moveToElement(Xpath.SearchMyJobs.VerifySearchMyJobsPage);
		Library.Interaction.click(Xpath.SearchMyJobs.VerifySearchMyJobsPage);
		Library.Interaction.setTextBoxByXpath(Xpath.SearchMyJobs.ToDate, ToDate);
		Library.Interaction.userWait();
		Library.Interaction.print("User Entered date into To Text box");
		Library.Interaction.moveToElement(Xpath.SearchMyJobs.VerifySearchMyJobsPage);
		Library.Interaction.click(Xpath.SearchMyJobs.VerifySearchMyJobsPage);
		Library.Interaction.click(Xpath.SearchMyJobs.StatusValue);
		Library.Interaction.userWait();
		Library.Interaction.print("User Clicked on Status Data");
		Thread.sleep(3000);
		Library.Interaction.click(Xpath.SearchMyJobs.TypeValue);
		Library.Interaction.userWait();
		Library.Interaction.print("User Clicked on Type Data");
		Thread.sleep(3000);
		Library.Interaction.setTextBoxByXpath(Xpath.SearchMyJobs.SearchTextBox, ExpectedServiceRequest);
		Thread.sleep(5000);
		Library.Interaction.print("User Entered data into To Text box");
		Library.Interaction.click(Xpath.SearchMyJobs.RequestValue);
		Thread.sleep(5000);
		Library.Interaction.print("User Clicked on Request Value Link");
		
		
		
		//driver.navigate().back();
		
        String ServiceRequest = driver.findElement(By.xpath(Xpath.SearchMyJobs.VerifyServiceRequest)).getText();
		Assert.assertEquals(ServiceRequest,ExpectedServiceRequest);
        log.info("User are in Service Requets Page");
        
    	String Branch = driver.findElement(By.xpath(Xpath.SearchMyJobs.VerifyBranch)).getText();
		Assert.assertEquals(Branch,ExpectedBranch);
        log.info("User are in Service Requets Page");
		
		String RequestType = driver.findElement(By.xpath(Xpath.SearchMyJobs.VerifyRequestType)).getText();
		Assert.assertEquals(RequestType,ExpectedRequestType);
        log.info("User are in Service Requets Page");
		
		String AccountNumber = driver.findElement(By.xpath(Xpath.SearchMyJobs.VerifyAccountNumber)).getText();
		Assert.assertEquals(AccountNumber,ExpectedAccountNumber);
        log.info("User are in Service Requets Page");
		
		
		
		}catch (Exception e) {
			
			e.printStackTrace();
			captureScreen(driver, "SearchMyJobsPage");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
    }
}
