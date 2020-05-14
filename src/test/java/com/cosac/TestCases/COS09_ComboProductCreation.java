package com.cosac.TestCases;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;

public class COS09_ComboProductCreation extends BaseClass{

	String Div_Name = "SDA";
	String Div_Send = "S";
	String Dep_Name = "AUDIO";
	String Dep_Send = "AUDIO";
	String Class_Name = "BABY CHAIRS";
	String Class_Send = "BABY";
	String Num = "2";
	String Num1 = "2";
	String Cash_Price1 = "42000";
	String Cash_Price2 = "66000";
	String Regular_Price1 = "42000";
	String Regular_Price2 = "66000";
	String Duty_Price1 = "42000";
	String Duty_Price2 = "66000";
	String text1 = "";

	public static String str = "";

	@Test
	public void ComboProduct() throws IOException {
		try {
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.Combo_ProductCreation.merchandising);
			Library.Interaction.print("User Clicked on Merchandising");
			Library.Interaction.userWait();
			Library.Interaction.moveToElement(Xpath.Combo_ProductCreation.create);
			Library.Interaction.print("User Clicked on Create");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.Combo_ProductCreation.combo);
			Library.Interaction.print("User Clicked on combo");
			Library.Interaction.userWait();
			log.info("Product Creation Starts");
			String gf = driver.findElement(By.xpath(Xpath.Combo_ProductCreation.combo_page)).getText();
			Assert.assertEquals(gf, "Create Combo");
			Library.Interaction.userWait();
			Library.Interaction.setTextBoxByXpath(Xpath.Combo_ProductCreation.description, "COMBO Product");
			Library.Interaction.print("User entered data on 'combo'");
			Library.Interaction.moveToElement(Xpath.Combo_ProductCreation.start_date);
			Actions act=new Actions(driver);
			Thread.sleep(500);
			act.moveByOffset(105, 0).click().build().perform();
			Robot robo=new Robot();
			Library.Interaction.EnterTab();
			Thread.sleep(500);
			Library.Interaction.EnterTab();
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_ENTER);
			act.sendKeys(Keys.ENTER).build().perform();
	
			Library.Interaction.moveToElement(Xpath.Combo_ProductCreation.end_date);
			Thread.sleep(500);
			act.moveByOffset(105, 0).click().build().perform();
			Library.Interaction.EnterTab();
			Thread.sleep(500);
			Library.Interaction.EnterTab();
			Thread.sleep(500);
			Library.Interaction.EnterTab();
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			Library.Interaction.print("User entered Start date");
			
			Dimension i = driver.manage().window().getSize(); 
			 System.out.println("Dimension x and y :"+i.getWidth()+" "+i.getHeight()); 
			 int x = (i.getWidth()/2-30); 
			 int y = (i.getHeight()/2)+140;
			 robo.mouseMove(x,y); 
			 Thread.sleep(500);
			 robo.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
			 robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			 Thread.sleep(1000);
			 robo.keyPress(KeyEvent.VK_ENTER);
			Library.Interaction.print("User entered end date");
			Library.Interaction.click(Xpath.Combo_ProductCreation.Price_Ticket);
			Library.Interaction.print("User clicked on the price ticekt");
			Library.Interaction.click(Xpath.Combo_ProductCreation.save_button);
			Library.Interaction.print("User clicked on the Save Button");

			Thread.sleep(5000);
			String text = Library.Interaction.getElmtText(Xpath.Combo_ProductCreation.PageLabel);
			System.out.println(text);

			String[] text2 = text.split("#");
			for (int j = 0; j < text2.length - 1; j++) {
				text1 = text2[j + 1];
			}
			System.out.print(text1);

			Library.Interaction.selectEle(Xpath.Combo_ProductCreation.Div_dropdown,
					Xpath.Combo_ProductCreation.Div_Search, Xpath.Combo_ProductCreation.Div_List, Div_Send, Div_Name);
			Library.Interaction.print("User entered division");
			Library.Interaction.selectEle(Xpath.Combo_ProductCreation.Dep_dropdown,
					Xpath.Combo_ProductCreation.Dep_Search, Xpath.Combo_ProductCreation.Dep_List, Dep_Send, Dep_Name);
			Library.Interaction.print("User entered department");
			Library.Interaction.selectEle(Xpath.Combo_ProductCreation.class_dropdown,
					Xpath.Combo_ProductCreation.class_Search, Xpath.Combo_ProductCreation.class_List, "BABY",
					"BABY CHAIRS");
			Library.Interaction.print("User entered class");
			Library.Interaction.selectEle(Xpath.Combo_ProductCreation.Tag_Click, Xpath.Combo_ProductCreation.Tag_Search,
					Xpath.Combo_ProductCreation.Tag_List, "a", "Fact2000 Deleted");
			Library.Interaction.print("User entered Tag");
			Library.Interaction.click(Xpath.Combo_ProductCreation.Add);
			Library.Interaction.scrollto_Element(Xpath.Combo_ProductCreation.Plus_Button);
			Library.Interaction.click(Xpath.Combo_ProductCreation.Plus_Click);
			Library.Interaction.selectEle(Xpath.Combo_ProductCreation.SKU_Dropdown,
					Xpath.Combo_ProductCreation.SKU_Search, Xpath.Combo_ProductCreation.SKU_List, "ORUA8D", "ORUA8D");
			Library.Interaction.print("User entered Product");
			driver.findElement(By.xpath(Xpath.Combo_ProductCreation.QTY)).clear();
			Library.Interaction.setTextBoxByXpath(Xpath.Combo_ProductCreation.QTY, Num);
			Library.Interaction.print("User entered quantity");
			Library.Interaction.click(Xpath.Combo_ProductCreation.Check);
			Library.Interaction.click(Xpath.Combo_ProductCreation.Plus_Click1);

			Library.Interaction.selectEle(Xpath.Combo_ProductCreation.SKU_Dropdown1,
					Xpath.Combo_ProductCreation.SKU_Search1, Xpath.Combo_ProductCreation.SKU_List1, "OPW46F", "OPW46F");
			Library.Interaction.print("User entered 2nd Product");
			driver.findElement(By.xpath(Xpath.Combo_ProductCreation.QTY1)).clear();
			Library.Interaction.setTextBoxByXpath(Xpath.Combo_ProductCreation.QTY1, Num1);
			Library.Interaction.print("User entered quantity");
			Library.Interaction.click(Xpath.Combo_ProductCreation.Check1);

			Library.Interaction.scrollto_Element(Xpath.Combo_ProductCreation.Add1);
			Library.Interaction.selectEle(Xpath.Combo_ProductCreation.Select_FasciaDropdown,
					Xpath.Combo_ProductCreation.Select_FasciaSearch, Xpath.Combo_ProductCreation.Select_FasciaList,
					"Cour", "Courts");
			Library.Interaction.print("User entered Fascia");
			Library.Interaction.click(Xpath.Combo_ProductCreation.Add1);
			Library.Interaction.click(Xpath.Combo_ProductCreation.Pencil);

			Library.Interaction.scrollto_Element_Regular(Xpath.Combo_ProductCreation.Regular_Price);
			Library.Interaction.print("User Scrolls down");

			Library.Interaction.CashFormat(Xpath.Combo_ProductCreation.CashPriceInclusive1, "42000");
			Library.Interaction.print("User entered cash Price");
			Thread.sleep(3000);

			Library.Interaction.CashFormat(Xpath.Combo_ProductCreation.CashPriceInclusive2, "66000");
			Library.Interaction.print("User entered Cash Price");

			Library.Interaction.scrollto_Element_Regular(Xpath.Combo_ProductCreation.Regular_Price);
			Library.Interaction.print("User Scrolls Down");
			Library.Interaction.CashFormat(Xpath.Combo_ProductCreation.RegularPriceInclusive1, "42000");
			Library.Interaction.print("User entered Regular Price");
			Library.Interaction.CashFormat(Xpath.Combo_ProductCreation.RegularPriceInclusive2, "66000");
			Library.Interaction.print("User entered Regular Price");
			Library.Interaction.scrollto_Element(Xpath.Combo_ProductCreation.DutyFree);

			Library.Interaction.CashFormat(Xpath.Combo_ProductCreation.DutyFree1, "42000");
			Library.Interaction.print("User entered Duty Free Price");
			Library.Interaction.CashFormat(Xpath.Combo_ProductCreation.DutyFree2, "62000");
			Library.Interaction.print("User entered Duty Free Price");
			Library.Interaction.scrollto_Element_Cash(Xpath.Combo_ProductCreation.CashPriceInclusive1);

			Library.Interaction.click(Xpath.Combo_ProductCreation.Click1);

			Library.Interaction.scrollto_Element_Cash(Xpath.Combo_ProductCreation.description);
			Library.Interaction.print("User Scroll to top");
			Library.Interaction.click(Xpath.Combo_ProductCreation.Save);
			Library.Interaction.print("User click on save");

			Library.Interaction.print("COMBO product Status validation");

		} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "location");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}

	@Test(dependsOnMethods = { "ComboProduct" })
	public void CreateCombo() throws IOException {
		try {

			log.info("Product Validation Starts");

			Library.Interaction.click(Xpath.Combo_ProductCreation.merchandising);
			Library.Interaction.print("User entered Merchandising");
			Library.Interaction.moveToElement(Xpath.Combo_ProductCreation.Search);
			Library.Interaction.print("User click Search");
			Library.Interaction.click(Xpath.Combo_ProductCreation.Product_Enquiry);
			Library.Interaction.print("User entered Product Enquiry page");
			Library.Interaction.setTextBoxByXpath(Xpath.Combo_ProductCreation.ProductSearch, text1);
			Library.Interaction.print("User entered Combo Product Code");

			Library.Interaction.scrollto_Element(Xpath.Combo_ProductCreation.Volume);
			Thread.sleep(4000);
			Library.Interaction.click(Xpath.Combo_ProductCreation.Home);

		} catch (Exception e) {
			captureScreen(driver, "createLocationForm");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}

}
