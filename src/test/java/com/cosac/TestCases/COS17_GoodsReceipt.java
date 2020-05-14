package com.cosac.TestCases;

import static org.testng.Assert.assertEquals;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Name;
import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;
import com.cosac.PageObject.Library.Interaction;

public class COS17_GoodsReceipt extends BaseClass{

	
	String Title = "Cosacs";
	String ExpectedGRN_Label = "Create Goods Receipt";
	String Seachvalue= "LUCKY DOLLAR";
	String SelectSuggestion= "LUCKY DOLLAR MAY PEN";
	String VendorsearchValue= "REG";
	String SelectVendor="REGAL WORLDWIDE TRADE";
	String Date="05/12/2020";
	String vendordeliveryno="654";
	String vendorInvoiceno="100563";
	String RecievedBy="System Administrator";
	String Comment="Verify the Goods Reciept No and confirm";
	String quantityRecived="1";
	
	String GRNMessage="Goods receipt saved successfully";
	String GRNCostMsg="Goods receipt costs have been verified";
	
	String newWndoLabel="Verify Goods Receipt Costs";
	static String PoNo;
	static String GRNumber;
	static String ProductCode;
	static String Onhand;
	
	
	@Test
	public void create_GoodsRcpt() throws IOException {

		try {
			Library.Interaction.userWait();
			boolean flag = driver.findElement(By.xpath(Xpath.LoginPage.Logo)).isDisplayed();
			Assert.assertTrue(flag);
			Library.Interaction.print("User has verified Company Logo successfully");
			String title = driver.getTitle();
			Assert.assertEquals(title, Title);
			Library.Interaction.print("User has verified Page Title successfully");
			Library.Interaction.click(Xpath.GoodsRecieptNO.merchandising);
			Library.Interaction.print("User Clicked on Merchandising");
			Library.Interaction.userWait();
			Library.Interaction.moveToElement(Xpath.GoodsRecieptNO.create);
			Library.Interaction.print("User Clicked on Create");
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.GoodsRecieptNO.Goodsreceipt);
			Library.Interaction.print("User Clicked on Goods Reciept");
			String create_GRNLabel = Library.Interaction.getelementText(Xpath.GoodsRecieptNO.Verify_GRNPage);
			Assert.assertEquals(create_GRNLabel, ExpectedGRN_Label);
			
			log.info("User are in Create Goods Reciept Page");
		} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "create_GoodsRcpt");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}
	
	
	@Test(dependsOnMethods = "create_GoodsRcpt")
	public void GoodsRecieptForm() throws IOException {

		try {
			Library.Interaction.userWait();
			Library.Interaction.selectSuggestions(Xpath.GoodsRecieptNO.RecievingArrow, Xpath.GoodsRecieptNO.RecievigSearch, Xpath.GoodsRecieptNO.SelectLocation, Seachvalue, SelectSuggestion);
			Library.Interaction.print("User has selected receiving location");
			Library.Interaction.userWait();
			Library.Interaction.moveToElement(Xpath.GoodsRecieptNO.SelectDate);
			Actions act=new Actions(driver);
			Thread.sleep(500);
			act.moveByOffset(105, 0).click().build().perform();
			Robot robo=new Robot();
			Library.Interaction.EnterTab();
			Thread.sleep(500);
			Library.Interaction.EnterTab();
			Thread.sleep(500);
			Library.Interaction.EnterTab();
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_ENTER);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(1000);
		
			
			Library.Interaction.print("User has entered the Date");
			Library.Interaction.EnterTab();
			Library.Interaction.setTextBoxByXpath(Xpath.GoodsRecieptNO.VendordelvryNO, vendordeliveryno);
			Library.Interaction.print("User has entered the Vendor delivery no");
			Library.Interaction.selectSuggestions(Xpath.GoodsRecieptNO.VendorArrow, Xpath.GoodsRecieptNO.VendorSearch, Xpath.GoodsRecieptNO.VendorSelect, VendorsearchValue, SelectVendor);
			Library.Interaction.print("User has selected Vendor");
			Thread.sleep(3000);
			Library.Interaction.selectVisibleText(Name.GRNCreation.GRNReciever, RecievedBy);
			Library.Interaction.print("User has selected Recieved by");
			Library.Interaction.setTextBoxByXpath(Xpath.GoodsRecieptNO.Comment, Comment);
			Library.Interaction.print("User has entered the Comment");
			Library.Interaction.selectLastDropDown(Name.GRNCreation.GRNR_POId);
			Library.Interaction.print("User has selected the purchage order");
			Library.Interaction.click(Xpath.GoodsRecieptNO.PlusMark);
			ProductCode=Library.Interaction.getelementText(Xpath.GoodsRecieptNO.ProductCode);
			log.info("ProductCode -->"+ProductCode);
			Library.Interaction.openNewTab(Xpath.GoodsRecieptNO.ProductCode);
			Library.Interaction.switchNewwindow();
			log.info("User switched to new window and checked the quantity available");
			String Onhand=Library.Interaction.getelementText(Xpath.GoodsRecieptNO.OnHandProduct);
			log.info("onhand quantity in recieving location are-->"+Onhand);
			String Available=Library.Interaction.getelementText(Xpath.GoodsRecieptNO.AvailableProduct);
			log.info("available quantity in recieving location are-->"+Available);
			String OnOrderQuantity=Library.Interaction.getelementText(Xpath.GoodsRecieptNO.OnOrderProduct);
			log.info("On order quantity in recieving location are-->"+OnOrderQuantity);
			driver.close();
			Library.Interaction.switchParentwindow();
			log.info("User switched to parent window");
			String poNumber=Library.Interaction.getelementText(Xpath.GoodsRecieptNO.PONumber);
			PoNo=poNumber.replaceAll("[^0-9]", "");
			log.info("Purchage order No -->"+PoNo);
			String QuantityPendng=Library.Interaction.getelementText(Xpath.GoodsRecieptNO.QuantityPendng);
			log.info(" Quantity pending -->"+QuantityPendng);
			
			if(Integer.parseInt(QuantityPendng)>0) {
				Thread.sleep(2000);
				Library.Interaction.setTextBoxByXpath(Xpath.GoodsRecieptNO.QuantityRecieved, quantityRecived);
			}else {
				System.out.println("Quantity pending is less <= zero");	
			}
			
			int backorder=Integer.parseInt(QuantityPendng)-Integer.parseInt(quantityRecived);
			Thread.sleep(5000);
			String QuantityBackordre=Library.Interaction.getelementText(Xpath.GoodsRecieptNO.QuantityBackordre);
			log.info("Back order Quantity-->"+QuantityBackordre);
			int QuantityBack=Integer.parseInt(QuantityBackordre);
			if(backorder==QuantityBack) {
				Library.Interaction.scrollDown(Xpath.GoodsRecieptNO.CreaterecptBTN);
				Library.Interaction.click(Xpath.GoodsRecieptNO.CreaterecptBTN);
				log.info("User clicked on Create reciept Button successfully");
			}
			String successMessage=Library.Interaction.verifyToastMessage(Xpath.GoodsRecieptNO.Message_catch);
			Assert.assertEquals(successMessage, GRNMessage);
			String GRN_No=Library.Interaction.getelementText(Xpath.GoodsRecieptNO.GRNLabel);
			GRNumber=GRN_No.replaceAll("[^0-9]", "");
			log.info("User got the Goods reciept No-->"+ (GRN_No.replaceAll("[^0-9]", "")));
			Library.Interaction.click(Xpath.GoodsRecieptNO.VerifyCostBTN);
			Thread.sleep(2000);
			Library.Interaction.switchNewwindow();
			String NewwindowLabel=Library.Interaction.getelementText(Xpath.GoodsRecieptNO.GRNLabel);
			log.info("User switched to new window GRN cost Page");
			Assert.assertEquals(NewwindowLabel, newWndoLabel);
			String GReciept=Library.Interaction.getelementText(Xpath.GoodsRecieptNO.ChildWndGoodReciept);
			String goodsRCptNo=GReciept.replaceAll("[^0-9]", "");
			Assert.assertEquals(goodsRCptNo, GRNumber);
			log.info("User switched to new window Validated Goods reciept No");
			String PurchageORD=Library.Interaction.getelementText(Xpath.GoodsRecieptNO.ChildWnd_PONo);
			String PurchaORDNo=PurchageORD.replaceAll("[^0-9]", "");
			Assert.assertEquals(PurchaORDNo, PoNo);
			log.info("User switched to new window Validated Purchage order No");
			Library.Interaction.click(Xpath.GoodsRecieptNO.ChildWnd_ConfirmBTN);
			Thread.sleep(5000);
			driver.close();
			Thread.sleep(5000);
			Library.Interaction.switchParentwindow();
			log.info("User switched to parent window");
			Library.Interaction.click(Xpath.GoodsRecieptNO.ApproveBTN);
			Thread.sleep(20000);
			String message3=Library.Interaction.verifyToastMessage(Xpath.GoodsRecieptNO.Message_catch);
			System.out.println(message3);
			Thread.sleep(5000);
			Library.Interaction.openNewTab(Xpath.GoodsRecieptNO.UpdatedProductCode);
			Library.Interaction.switchNewwindow();
			log.info("User switched to new window and checked the quantity available");
			String AfterOnhand=Library.Interaction.getelementText(Xpath.GoodsRecieptNO.OnHandProduct);
			int updated_onhandQ=Integer.parseInt(AfterOnhand);
			log.info("updated onhand quantity in recieving location are-->"+Onhand);
			String AfterAvailable=Library.Interaction.getelementText(Xpath.GoodsRecieptNO.AvailableProduct);
			log.info("Updated available quantity in recieving location are-->"+Available);
			String AfterOnOrderQuantity=Library.Interaction.getelementText(Xpath.GoodsRecieptNO.OnOrderProduct);
			log.info("Up dated On order quantity in recieving location are-->"+OnOrderQuantity);
			int UpdatedQuantity=Integer.parseInt(Onhand)+Integer.parseInt(quantityRecived);
			if(UpdatedQuantity==updated_onhandQ) {
				log.info("User Validated Updated quantity in recieving location");
			}
			driver.close();
			Library.Interaction.switchParentwindow();
			log.info("User switched to parent window");
			
			Thread.sleep(5000);
			log.info("User is in goods reciept Page");
		} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "GoodsRecieptForm");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}
	
	
}
