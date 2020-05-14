
/**

* Project Name : COSAC

* Author : Chidanand

* Version : 10.5.2.2124

* Reviewed By : Vivek Bharti

* Date of Creation : Jan 16, 2020

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

public class COS100_TopSKUReports extends BaseClass {

	public static String pageLabel = "Top Sku Report";
	public static String fromDate = "20/2/2015";
	public static String ToDate = "16/03/2020";
	public static String SearchDiv = "COMPUTER";
	public static String DivText = "COMPUTER AND OFFICE";
	public static String SearchDept = "COMPUTER";
	public static String DeptText = "COMPUTER AND ACCESSORIES ";
	public static String SearchClass = "LAPTOP";
	public static String ClassText = "LAPTOPS";
	public static String SearchLocation = "LUCKY";
	public static String LocationText = "LUCKY DOLLAR MAY PEN";
	
// user should be able to generate TopSKU reports
	@Test
	public void topSkuReports() throws Exception {
		try {
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.TopskuReports.merchandising);
			log.info("User Clicked on Merchandising");
			Library.Interaction.moveToElement(Xpath.TopskuReports.Reports);
			Library.Interaction.click(Xpath.TopskuReports.TopSku);
			log.info("User Clicked on Top Sku reports");
			String Heirarchylabel = Library.Interaction.getelementText(Xpath.TopskuReports.TopSkulabel);
			Assert.assertEquals(Heirarchylabel, pageLabel);
			log.info("User is in Top SKU Reports Page");

			Library.Interaction.setTextBoxByXpath(Xpath.TopskuReports.fromDate, fromDate);
			Library.Interaction.setTextBoxByXpath(Xpath.TopskuReports.ToDate, ToDate);
			log.info("User Selected from date and to date successfully");
			Library.Interaction.selectSuggestions(Xpath.TopskuReports.Divsionarrow, Xpath.TopskuReports.DivSearchbox,
					Xpath.TopskuReports.DivSelectText, SearchDiv,DivText);
			Library.Interaction.selectSuggestions(Xpath.TopskuReports.Deptarrow, Xpath.TopskuReports.DeptSearchbox,
					Xpath.TopskuReports.DeptSelectText,SearchDept ,DeptText);
			Library.Interaction.selectSuggestions(Xpath.TopskuReports.Classarrow, Xpath.TopskuReports.ClassSearchbox,
					Xpath.TopskuReports.classSelectText,SearchClass ,ClassText);
			Library.Interaction.selectSuggestions(Xpath.TopskuReports.Locationarrow, Xpath.TopskuReports.LocationSearchbox,
					Xpath.TopskuReports.LocationSelectText,SearchLocation ,LocationText);
			log.info("User Selected Division,Department,Class and Location successfully");
			Library.Interaction.click(Xpath.TopskuReports.SearchBTN);
			log.info("User Clicked on Search button and result is displayed successfully");
			Thread.sleep(25000);
			String Text=Library.Interaction.getelementText(Xpath.TopskuReports.ResultsFound);
			Library.Interaction.print("Results found are---->"+Text);
			Thread.sleep(3000);
			String skuNo=Library.Interaction.getelementText(Xpath.TopskuReports.SkuLink);
			log.info("Sku No in results found is-->"+skuNo);
			String Quantity=Library.Interaction.getelementText(Xpath.TopskuReports.Quantity);
			log.info("No of quantities available in results are -->"+Quantity);
			String NetsaleValue=Library.Interaction.getelementText(Xpath.TopskuReports.NetsaleValue);
			log.info("NetsaleValue in results is -->"+NetsaleValue);
			Library.Interaction.click(Xpath.TopskuReports.printBTN);
			log.info("User Clicked on Print Button successfully");
			Library.Interaction.switchNewwindow();
			String PrintSkuLink=Library.Interaction.getelementText(Xpath.TopskuReports.PrintSkuLink);
			log.info("Sku No in printpage is-->"+PrintSkuLink);
			Assert.assertEquals(PrintSkuLink, skuNo);
			String PrintQuantity=Library.Interaction.getelementText(Xpath.TopskuReports.PrintQuantity);
			log.info("No of quantities available in printpage are -->"+PrintQuantity);
			Assert.assertEquals(Quantity, PrintQuantity);
			String PrintNetsalevalue=Library.Interaction.getelementText(Xpath.TopskuReports.PrintNetsalevalue);
			log.info("NetsaleValue in printpage is -->"+PrintNetsalevalue);
			Assert.assertEquals(PrintNetsalevalue, NetsaleValue);
			log.info("User navigated to print page and validated mandatory data");
			driver.close();	
		} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "topSkuReports");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}
}
