package com.cosac.TestCases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.PageObject.BaseClass;
import com.cosac.PageObject.Library;


public class WeeklyTradingReport extends BaseClass {
	
	
	String ExpectedWeeklyTradingReport="Weekly Trading Report";
	String Date="01052020";

	@Test
	public void Report() throws InterruptedException, IOException {

		try {
			Library.Interaction.userWait();
			Library.Interaction.click(Xpath.WeeklyTradingReport.Merchandsing);
			Library.Interaction.userWait();
			Library.Interaction.print("User Clicked on Merchandsing");

			Library.Interaction.userWait();
			Library.Interaction.moveToElement(Xpath.WeeklyTradingReport.Reports);

			Library.Interaction.userWait();
			Library.Interaction.print("Cursor moving to Reports");
			Library.Interaction.moveToElement(Xpath.WeeklyTradingReport.WTR);
			Library.Interaction.userWait();
			Library.Interaction.print("Cursor moving to Weekly Trading Report");
			
			Library.Interaction.click(Xpath.WeeklyTradingReport.WTR);
			Library.Interaction.userWait();
			Library.Interaction.print("User Clicked on Weekly Trading Report");
			
			String WTR = driver.findElement(By.xpath(Xpath.WeeklyTradingReport.VerifyWTR)).getText();
			Assert.assertEquals(WTR,ExpectedWeeklyTradingReport);
			Library.Interaction.userWait();
			
			Library.Interaction.setTextBoxByXpath(Xpath.WeeklyTradingReport.Date, Date);
			Library.Interaction.userWait();
			Library.Interaction.print("User Enter Date");
			
			Library.Interaction.click(Xpath.WeeklyTradingReport.Export);
			Library.Interaction.userWait();
			Library.Interaction.print("User clicked on Export Button");

		}catch(Exception e)
		{
			
			captureScreen(driver, "Report");
			Assert.assertFalse(false);
			log.info("Test Failed");
		}
	}

}




