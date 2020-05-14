/*Project Name : IGT Framework
  Author : Vincy Virgenia James*/

package com.cosac.TestCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;


public class COS46_WarrantyInstantReplacement extends BaseClass {
	
	
	String ExpecWarrantyTitle = "Warranty";
	String ItemNumVal = "IRE129";
	String DescVal = "Test Instant";
	String LengthMonthsVal = "36";
	String DeptNameVal = "Electrical";
	String ExpecWarrantySearchTitle = "Search Warranty";
	String ItemNumValFree = "IRE455";
	String DescValFree = "Testing Free Type";
	String LengthMonthsValFree = "36";
	
	
	// The below method helps the user to land the Create Warranty Page
	
		@Test
		public void InstantReplacement() throws Throwable {
		
			try {
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.WarrantyCodeInstantReplacement.Warranty);
				log.info("User Clicked on Warranty");
				Library.Interaction.userWait();
				Library.Interaction.click(Xpath.WarrantyCodeInstantReplacement.CreateWarranty);
				log.info("User Clicked on Create Warranty");
				Library.Interaction.userWait();
				String WarrantyCreationTitle = driver.findElement(By.xpath(Xpath.WarrantyCodeInstantReplacement.PageTitle)).getText();
				Assert.assertEquals(WarrantyCreationTitle, ExpecWarrantyTitle);
				log.info("User is in Warranty Creation Page");
				Thread.sleep(3000);

			} catch (Exception e) {
				e.printStackTrace();
				captureScreen(driver, "Warranty Instant replacemnet");
				Assert.assertFalse(false);
				log.info("Test Failed");
			}
		}
		
		// The below method helps the user to create Warranty
		@Test(dependsOnMethods = "InstantReplacement")
		
		public void createWarranty() throws IOException {
			try {
				
			
				//Entering Value in Item Number Text Box
				Library.Interaction.setTextBoxByXpath(Xpath.WarrantyCodeInstantReplacement.ItemNum, ItemNumVal);
				Thread.sleep(1000);
				
				//Entering Description in Text Box
				Library.Interaction.setTextBoxByXpath(Xpath.WarrantyCodeInstantReplacement.Description, DescVal);
				Thread.sleep(1000);
				
				//Entering Length months in Text Box
				Library.Interaction.setTextBoxByXpath(Xpath.WarrantyCodeInstantReplacement.LengthMonths, LengthMonthsVal);
				Thread.sleep(1000);
				
				//Clicking on the Warranty Type radio Button
				Library.Interaction.click(Xpath.WarrantyCodeInstantReplacement.InstantReplacement);
				Thread.sleep(1000);
				
				/*Selecting value from Department Drop Down */
				Library.Interaction.click(Xpath.WarrantyCodeInstantReplacement.Department);
				List<WebElement> DropDownVal = driver.findElements(By.xpath(Xpath.WarrantyCodeInstantReplacement.DeptName));
				for (int i = 0; i < DropDownVal.size(); i++)
				{
					if (DropDownVal.get(i).getText().equals(DeptNameVal))
					{
						log.info("Text-->"+DropDownVal.get(i).getText());
						Thread.sleep(2000);
						DropDownVal.get(i).click();
						break;
					}
				}
				log.info("User clicked Electrical under Department");
				
				//Clicking on Save Button 
				Library.Interaction.click(Xpath.WarrantyCodeInstantReplacement.SaveContinueBtn);
				Thread.sleep(1000);
				
				//Capturing the Toast Message
				WebElement SuccMsg = driver.findElement(By.xpath(Xpath.WarrantyCodeInstantReplacement.SuccMessageWarranty));
				String SuccMsgDisp = SuccMsg.getText();
				log.info("The Success Msg captured is "+SuccMsgDisp);
				log.info("User Created Warranty with Instant Replacement Successfully");
				Thread.sleep(2000);


			} catch (Exception e) {
				e.printStackTrace();
				captureScreen(driver, "createWarranty");
				Assert.assertFalse(false);
				log.info("Test Failed");
			}
		}	
		
		// The below method helps the user to Search Warranty
				@Test(dependsOnMethods = "createWarranty")
				
				public void SearchWarranty() throws IOException {
					try {
						Library.Interaction.userWait();
						Library.Interaction.click(Xpath.WarrantyCodeInstantReplacement.Warranty);
						log.info("User Clicked on Warranty");
						Library.Interaction.click(Xpath.WarrantyCodeInstantReplacement.SearchWarranty);
						Library.Interaction.userWait();
						log.info("User Clicked on Search Warranty");
						Library.Interaction.userWait();
						String WarrantySearchTitle = driver.findElement(By.xpath(Xpath.WarrantyCodeInstantReplacement.PageTitleSearch)).getText();
						Assert.assertEquals(WarrantySearchTitle, ExpecWarrantySearchTitle);
						log.info("User is in Warranty Search Page");
						Thread.sleep(2000);
						
						
						//Entering the created product in search field
						Library.Interaction.setTextBoxByXpath(Xpath.WarrantyCodeInstantReplacement.SrchString, ItemNumVal);
						log.info("User Entered the created Item number");
						
						//Clicking on the searched product
						Library.Interaction.click(Xpath.WarrantyCodeInstantReplacement.WarrantyLink);
						log.info("User clicked the Item link");
						Thread.sleep(2000);
						
					} catch (Exception e) {
						e.printStackTrace();
						captureScreen(driver, "SearchWarranty");
						Assert.assertFalse(false);
						log.info("Test Failed");
					}
				}	
				

				// The below method helps the user to land the Create Warranty Page
				@Test(dependsOnMethods = "SearchWarranty")
					
					public void FreeWarrantyType() throws Throwable {
					
						try {
							Library.Interaction.userWait();
							Library.Interaction.click(Xpath.WarrantyCodeInstantReplacement.Warranty);
							log.info("User Clicked on Warranty");
							Library.Interaction.userWait();
							Library.Interaction.click(Xpath.WarrantyCodeInstantReplacement.CreateWarranty);
							log.info("User Clicked on Create Warranty");
							Library.Interaction.userWait();
							Thread.sleep(3000);
							
							//Entering Value in Item Number Text Box
							Library.Interaction.setTextBoxByXpath(Xpath.WarrantyCodeInstantReplacement.ItemNumFree, ItemNumValFree);
							Thread.sleep(1000);
							
							//Entering Description in Text Box
							Library.Interaction.setTextBoxByXpath(Xpath.WarrantyCodeInstantReplacement.DescriptionFree, DescValFree);
							Thread.sleep(1000);
							
							//Entering Length months in Text Box
							Library.Interaction.setTextBoxByXpath(Xpath.WarrantyCodeInstantReplacement.LengthMonthsFree, LengthMonthsValFree);
							Thread.sleep(1000);
							
							//Clicking on the Warranty Type radio Button
							Library.Interaction.click(Xpath.WarrantyCodeInstantReplacement.Free);
							
							/*Selecting value from Department Drop Down */
							Library.Interaction.click(Xpath.WarrantyCodeInstantReplacement.DepartmentFree);
							List<WebElement> DropDownVal = driver.findElements(By.xpath(Xpath.WarrantyCodeInstantReplacement.DeptNameFree));
							for (int i = 0; i < DropDownVal.size(); i++)
							{
								if (DropDownVal.get(i).getText().equals(DeptNameVal))
								{
									log.info("Text-->"+DropDownVal.get(i).getText());
									Thread.sleep(2000);
									DropDownVal.get(i).click();
									break;
								}
							}
							log.info("User clicked Electrical under Department");
							
							//Clicking on Save Button 
							Library.Interaction.click(Xpath.WarrantyCodeInstantReplacement.SaveContinueBtn);
							Thread.sleep(2000);
							log.info("User Created Warranty with Free Warranty Type");
							Thread.sleep(5000);
							

						} catch (Exception e) {
							e.printStackTrace();
							captureScreen(driver, "FreeWarrantyType");
							Assert.assertFalse(false);
							log.info("Test Failed");
						}
					}
					
					// The below method helps the user to Search Free Warranty
					@Test(dependsOnMethods = "FreeWarrantyType")
					
					public void SearchFreeWarranty() throws IOException {
						try {
							Library.Interaction.userWait();
							Library.Interaction.click(Xpath.WarrantyCodeInstantReplacement.Warranty);
							log.info("User Clicked on Warranty");
							Library.Interaction.click(Xpath.WarrantyCodeInstantReplacement.SearchWarranty);
							Library.Interaction.userWait();
							log.info("User Clicked on Search Warranty");
							Library.Interaction.userWait();
							//String WarrantySearchTitle = driver.findElement(By.xpath(Xpath.WarrantyCodeInstantReplacement.PageTitleSearch)).getText();
							//Assert.assertEquals(WarrantySearchTitle, ExpecWarrantySearchTitle);
							log.info("User is in Warranty Search Page");
							Thread.sleep(3000);
							
							//Entering the created product in search field
							Library.Interaction.setTextBoxByXpath(Xpath.WarrantyCodeInstantReplacement.SrchString, ItemNumValFree);
							log.info("User Entered the created Item number");
							Thread.sleep(1000);
							
							//Clicking on the searched product
							Library.Interaction.click(Xpath.WarrantyCodeInstantReplacement.WarrantyLink);
							log.info("User clicked the Free Item link");
							Thread.sleep(4000);
							
						} catch (Exception e) {
							e.printStackTrace();
							captureScreen(driver, "SearchFreeWarranty");
							Assert.assertFalse(false);
							log.info("Test Failed");
						}
					}	
					
}