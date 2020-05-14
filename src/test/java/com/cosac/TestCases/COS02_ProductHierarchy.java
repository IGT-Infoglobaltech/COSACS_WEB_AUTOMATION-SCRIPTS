/**

* Project Name : COSAC

* Author : Chidanand

* Version : 10.5.2.2124

* Reviewed By : Vivek Bharti

* Date of Creation : Jan , 2020

* Modification History :

* Date of change : 

* Version : V1.1

* changed function :

* change description :

* Modified By : 

*/

package com.cosac.TestCases;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;
import com.cosac.Utilities.JsonParser;

public class COS02_ProductHierarchy extends BaseClass {

	
	public static String pageLabel="Product Hierarchy";
	public static String Dev="JEWELLARY";
	public static String DevisionMessage="Tag JEWELLARY created under Level Division";
	
	public static String Dept="GOLD";
	public static String DeptMessage="Tag GOLD created under Level Department";
	
	
	public static String Class="KGF GOLD";
	public static String ClassMessage="KGF GOLD created under Level Class";
	
	//User Login with valid credentials
	@Test
	public  void createprdthierarchy() throws IOException {
		try {
			Library.Interaction.userWait();
			boolean flag=driver.findElement(By.xpath(Xpath.LoginPage.Logo)).isDisplayed();
			Assert.assertTrue(flag);
			Library.Interaction.print("User verified Company Logo successfully");
			log.info("User verified Company Logo successfully");
			String title=driver.getTitle();
			Assert.assertEquals(title, JsonParser.getLocation_Data("locationData.cos01.Title"));
			Library.Interaction.print("User has verified Page Title successfully");
			log.info("User has verified Page Title successfully");
			Library.Interaction.click(Xpath.LocationCreation.merchandising);
			Library.Interaction.print("User Clicked on Merchandising");
			log.info("User Clicked on Merchandising");
			Library.Interaction.userWait();
			Library.Interaction.click((Xpath.productHierarchy.ProductHierarchy));
			Library.Interaction.print("User Clicked on Product Hierarchy");
			log.info("User Clicked on Product Hierarchy");
			String Heirarchylabel=Library.Interaction.getelementText(Xpath.productHierarchy.Heirarchylabel);
			Assert.assertEquals(Heirarchylabel,pageLabel);
			log.info("User validated Product Hierarchy Label successfully");
			Library.Interaction.CreateHeirarchy(Xpath.productHierarchy.DivOptions, Xpath.productHierarchy.CreateDivTag, Dev);
			Library.Interaction.click(Xpath.productHierarchy.DIvBTN);
			log.info("User clicked on Division save button");
			String text=Library.Interaction.verifyToastMessage(Xpath.productHierarchy.Message_catch);
			log.info("User  Created Division successfully and Message is-->" +text);
			Assert.assertEquals(text, DevisionMessage);
			Library.Interaction.CreateHeirarchy(Xpath.productHierarchy.DeptOptions, Xpath.productHierarchy.CreateDepttag,Dept);
			Library.Interaction.click(Xpath.productHierarchy.DeptSaVeBTN);
			Thread.sleep(3000);
			String text1=Library.Interaction.verifyToastMessage(Xpath.productHierarchy.Message_catch);
			log.info("User  Created Department successfully and Message is -->" +text1);
			Library.Interaction.CreateHeirarchy(Xpath.productHierarchy.ClassOptions, Xpath.productHierarchy.CreateClasstag, Class);
			Library.Interaction.click(Xpath.productHierarchy.ClassSaVeBTN);
			Thread.sleep(2000);
			String text2=Library.Interaction.verifyToastMessage(Xpath.productHierarchy.Message_catch);
			log.info("User  Created Clas successfully and Message is-->" +text2);
/*			Thread.sleep(2000);
			Library.Interaction.click(Xpath.productHierarchy.Configuration);
			Library.Interaction.click(Xpath.productHierarchy.ReIndexing);
			Library.Interaction.click(Xpath.productHierarchy.ProductStLevelCheck);
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.productHierarchy.ReIndeBTN);
			log.info("User Clicked on Re-indexing" );
			Thread.sleep(9000);
			String text3=Library.Interaction.getelementText(Xpath.productHierarchy.Verify_ReindexingPage);
			log.info("User Cliked on Re-indexing successfully and Message is-->" +text3);*/
			log.info("User  Created Division,Department,Class successfully ");
			} 
		catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "createprdthierarchy");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
     }
	

	
	
}
