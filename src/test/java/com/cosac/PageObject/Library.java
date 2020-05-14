package com.cosac.PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Library extends BaseClass {

	public static class Interaction {

		public static JavascriptExecutor js;
		public static Robot robo;
		public static Actions act;
		public static Iterator<String> itr;
		public static Set<String> all;

		// To Capture Screenshot
		protected static Logger log;

		public static void captureScreen(WebDriver driver, String tname) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
			FileUtils.copyFile(source, target);
			System.out.println("Screenshot taken");
		}

		// Send Data in Text Box by Xpath
		public static void setTextBoxByXpath(String xpath, String data) throws IOException {
			try {
				driver.findElement(By.xpath(xpath)).sendKeys(data);
			} catch (Exception e) {
				captureScreen(driver, "setTextBoxByXpath");
				Assert.assertFalse(false);
				log.info("User not able to send data in Text Box 'Test Failed'");
			}
		}

		// Send Data in Text Box by Name
		public static void setTextBoxByName(String Name, String data) throws IOException {
			try {
				driver.findElement(By.name(Name)).sendKeys(data);
			} catch (Exception e) {
				captureScreen(driver, "setTextBoxByName");
				Assert.assertFalse(false);
				log.info("User not able to send data in Text Box 'Test Failed'");
			}
		}

		// Send Data in Text Box by ID
		public static void setTextBoxByID(String id, String data) throws IOException {
			try {
				driver.findElement(By.id(id)).sendKeys(data);
			} catch (Exception e) {
				captureScreen(driver, "setTextBoxByID");
				Assert.assertFalse(false);
				log.info("User not able to send data in Text Box 'Test Failed'");
			}
		}

		// Navigate Element
		public static void moveToElement(String xpath) throws IOException {
			try {
				act = new Actions(driver);
				WebElement ele = driver.findElement(By.xpath(xpath));
				act.moveToElement(ele).build().perform();
			} catch (Exception e) {
				captureScreen(driver, "moveToElement");
				Assert.assertFalse(false);
				log.info("User not able to navigate to element 'Test Failed'");
			}
		}

		// Click on Element
		public static void click(String xpath) throws IOException {
			try {
				WebElement ele = driver.findElement(By.xpath(xpath));
				ele.click();
			} catch (Exception e) {
				captureScreen(driver, "click");
				Assert.assertFalse(false);
				log.info("User not able to Click to element 'Test Failed'");
			}
		}

		// Search and Select element from Drop down
		public static void selectAndSerachEle(String xpath1, String xpath2, String xpath3, String eleText)
				throws IOException {
			try {
				driver.findElement(By.xpath(xpath1)).click();
				driver.findElement(By.xpath(xpath2)).sendKeys(eleText);
				driver.findElement(By.xpath(xpath3)).click();
			} catch (Exception e) {
				captureScreen(driver, "selectAndSerachEle");
				Assert.assertFalse(false);
				log.info("User not able to Search and Select element 'Test Failed'");
			}
		}

		// Select Element by Text
		public static void selectEleByText(String xpath, String eleText) throws IOException {
			try {
				driver.findElement(By.xpath(xpath)).click();
				WebElement selectEle = driver.findElement(By.xpath(xpath));
				Select sel = new Select(selectEle);
				sel.selectByVisibleText(eleText);
			} catch (Exception e) {
				captureScreen(driver, "selectEleByText");
				Assert.assertFalse(false);
				log.info("User not able to Select element 'Test Failed'");
			}
		}

		// Select Element by VisibleText
		public static void selectVisibleText(String Name, String eleText) throws IOException {
			try {
				Select sel = new Select(driver.findElement(By.name(Name)));
				sel.selectByVisibleText(eleText);
			} catch (Exception e) {
				captureScreen(driver, "selectVisibleText");
				Assert.assertFalse(false);
				log.info("User not able to Select element 'Test Failed'");
			}
		}

		// Select Element by select Last DropDown Value
		public static void selectLastDropDown(String Name) throws IOException {
			try {
				Select selectBox = new Select(driver.findElement(By.name(Name)));
				int TotalOptions = selectBox.getOptions().size();
				selectBox.selectByIndex(TotalOptions - 1);

			} catch (Exception e) {
				captureScreen(driver, "selectLastDropDown");
				Assert.assertFalse(false);
				log.info("User not able to Select last element 'Test Failed'");
			}
		}

		// Select Element by Index
		public static void selectEleByIndex(String xpath, int IndText) throws IOException {
			try {
				WebElement selectEle = driver.findElement(By.xpath(xpath));
				Select sel = new Select(selectEle);
				sel.selectByIndex(IndText);
			} catch (Exception e) {
				captureScreen(driver, "selectEleByIndex");
				Assert.assertFalse(false);
				log.info("User not able to Select element 'Test Failed'");
			}
		}

		// Select Element by Value
		public static void selectEleByValue(String xpath, String ValText) throws IOException {
			try {
				WebElement selectEle = driver.findElement(By.xpath(xpath));
				Select sel = new Select(selectEle);
				sel.selectByValue(ValText);
			} catch (Exception e) {
				captureScreen(driver, "selectEleByValue");
				Assert.assertFalse(false);
				log.info("User not able to Select element 'Test Failed'");
			}
		}

		// User defined wait
		public static boolean userDefinedWait(WebElement element) throws InterruptedException {
			int maxWait = 1000;
			int intervalWait = 2;
			int counter = 0;
			while (counter > maxWait) {
				Thread.sleep(intervalWait * 1000);
				counter += intervalWait;
				System.out.println("counter....... " + counter);
				try {
					if (element.isDisplayed()) {
						System.out.println("Element found...." + element.getText());
						return true;
					}
				} catch (NoSuchElementException noelememt) {
					noelememt.getMessage();
				}

			}
			return false;
		}

		// User defined wait
		public static boolean userWait() throws InterruptedException {
			int maxWait = 2000;
			int intervalWait = 2;
			int counter = 0;
			while (counter > maxWait) {
				Thread.sleep(intervalWait * 20000);
				counter += intervalWait;
				// System.out.println("counter....... "+counter);
			}
			return true;
		}

		public static void print(String printText) throws IOException {
			System.out.println(printText);
		}

		// Scrolling VirticallyDown
		public static void scrollDown(String element) {
			js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,7000);", element);
		}

		// Scrolling VirticallyUp
		public static void scrollUp(String element) {
			js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,-3000);", element);
		}

		// Catch the Toast Messages
		public static String verifyToastMessage(String xpath) throws IOException {
			String elementText = driver.findElement(By.xpath(xpath)).getText().replaceAll("[^A-Za-z]", " ").trim();
			return elementText;
		}

		// Get the Element text
		public static String getelementText(String xpath) throws IOException {
			String elementText = driver.findElement(By.xpath(xpath)).getText().trim();
			return elementText;
		}

		// Select Suggestions from SearchBox
		public static void selectSuggestions(String xpath1, String xpath2, String xpath3, String searchValue,
				String value) throws InterruptedException {
			driver.findElement(By.xpath(xpath1)).click();
			driver.findElement(By.xpath(xpath2)).sendKeys(searchValue);
			List<WebElement> ProdCodeVal = driver.findElements(By.xpath(xpath3));
			for (int i = 0; i < ProdCodeVal.size(); i++) {
				if (ProdCodeVal.get(i).getText().equals(value)) {
					Thread.sleep(2000);
					ProdCodeVal.get(i).click();
					break;
				}
			}
		}

		// Select Suggestions from SearchBox
		public static void selectSuggestion(String xpath1, String xpath2, String xpath3, String searchValue,
				String value) throws InterruptedException {
			driver.findElement(By.xpath(xpath1)).click();
			driver.findElement(By.xpath(xpath2)).sendKeys(searchValue);
			List<WebElement> ProdCodeVal = driver.findElements(By.xpath(xpath3));
			for (int i = 0; i < ProdCodeVal.size(); i++) {
				if (ProdCodeVal.get(i).getText().equals(value)) {
					Thread.sleep(3000);
					ProdCodeVal.get(i).click();
					break;
				}
			}
		}

		public static void selectele(String xpath1, String xpath2, String xpath3, String searchValue, String value)
				throws InterruptedException {
			driver.findElement(By.xpath(xpath1)).click();
			driver.findElement(By.xpath(xpath2)).sendKeys(searchValue);
			List<WebElement> ProdCodeVal = driver.findElements(By.xpath(xpath3));
			for (int i = 0; i < ProdCodeVal.size(); i++) {
				if (ProdCodeVal.get(i).getText().contains(value)) {
					Thread.sleep(3000);
					ProdCodeVal.get(i).click();
					break;
				}
			}
		}

		// EnterTab
		public static void EnterTab() throws AWTException {
			robo = new Robot();
			robo.keyPress(KeyEvent.VK_TAB);
		}

		// create Heirarchy
		public static void CreateHeirarchy(String elements, String CreateDivion, String text) throws AWTException {
			try {

				List<WebElement> divisions = driver.findElements(By.xpath(elements));
				for (int i = 0; i < divisions.size(); i++) {
					String str = divisions.get(i).getText();
					if (!str.equals(text)) {
						WebElement element = driver.findElement(By.xpath(CreateDivion));
						element.sendKeys(text);
						Thread.sleep(2000);
						break;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		public static void switchNewwindow() {
			all = driver.getWindowHandles();
			itr = all.iterator();
			String w1 = (String) itr.next();
			String w2 = (String) itr.next();
			driver.switchTo().window(w2);
		}

		public static void switchParentwindow() {
			all = driver.getWindowHandles();
			itr = all.iterator();
			String w1 = (String) itr.next();
			driver.switchTo().window(w1);
		}

		// open the link in new tab
		public static void openNewTab(String xpath) {
			String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
			driver.findElement(By.xpath(xpath)).sendKeys(selectLinkOpeninNewTab);
		}

		/* Enter and select data from drop down menu using contains */
		public static void selectEleVisibleTextByContains(String xpath1, String xpath2, String xpath3,
				String searchValue, String value) throws InterruptedException {
			driver.findElement(By.xpath(xpath1)).click();
			driver.findElement(By.xpath(xpath2)).sendKeys(searchValue);
			List<WebElement> ProdCodeVal = driver.findElements(By.xpath(xpath3));
			for (int i = 0; i < ProdCodeVal.size(); i++) {
				if (ProdCodeVal.get(i).getText().contains(value)) {
					Thread.sleep(5000);
					ProdCodeVal.get(i).click();
					break;
				}
			}
		}

		// Select Element by VisibleText
		public static void selectEleByVisibleText(String xpath, String ValText) throws IOException {
			try {
				WebElement selectEle = driver.findElement(By.xpath(xpath));
				Select sel = new Select(selectEle);
				sel.selectByVisibleText(ValText);
			} catch (Exception e) {
				captureScreen(driver, "moveToElement");
				Assert.assertFalse(false);
				log.info("User not able to Select element 'Test Failed'");
			}
		}

	




		// ***************Kartik**********

		// scrolldown till Regular Price
		public static void scrollto_Element_Regular(String saveBTN) {
			js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,400);", saveBTN);
		}

		// scrolldown till Cash Price
		public static void scrollto_Element_Cash(String saveBTN) {
			js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,-800);", saveBTN);
		}

		public static void selectEle(String xpath1, String xpath2, String xpath3, String searchValue, String value)
				throws InterruptedException {
			driver.findElement(By.xpath(xpath1)).click();
			driver.findElement(By.xpath(xpath2)).sendKeys(searchValue);
			List<WebElement> ProdCodeVal = driver.findElements(By.xpath(xpath3));
			for (int i = 0; i < ProdCodeVal.size(); i++) {
				if (ProdCodeVal.get(i).getText().contains(value)) {
					Thread.sleep(3000);
					ProdCodeVal.get(i).click();
					break;
				}
			}
		}

		public static void CashFormat(String xpath, String Num) throws Exception {
			robo = new Robot();
			driver.findElement(By.xpath(xpath)).click();
			robo.keyPress(KeyEvent.VK_LEFT);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_LEFT);
			Thread.sleep(2000);
			driver.findElement(By.xpath(xpath)).sendKeys(Num);
			robo.keyPress(KeyEvent.VK_RIGHT);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_BACK_SPACE);
			Thread.sleep(2000);
		}

		public static void selectEl(String xpath1, String xpath2, String xpath3, String searchValue, String value)
				throws InterruptedException {
			driver.findElement(By.xpath(xpath1)).click();
			driver.findElement(By.xpath(xpath2)).sendKeys(searchValue);
			List<WebElement> ProdCodeVal = driver.findElements(By.xpath(xpath3));
			for (int i = 0; i < ProdCodeVal.size(); i++) {
				if (ProdCodeVal.get(i).getText().equals(value)) {
					Thread.sleep(1000);
					ProdCodeVal.get(i).click();
					break;
				}
			}
		}

		public static String getElmtText(String element) {
			String text = driver.findElement(By.xpath(element)).getText();

			return text;
		}

		// ScrollDown for An Element
		public static void scrollto_Element(String saveBTN) {
			js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,7000);", saveBTN);
		}


		public static void setTomorrowDate(String xpath) throws IOException {
			try {
				Calendar calendar = Calendar.getInstance();
				calendar.add(Calendar.DAY_OF_YEAR, 1);
				Date tomorrow = calendar.getTime();
				String tommorowsDate = new SimpleDateFormat("MM/dd/yyyy").format(tomorrow);
				driver.findElement(By.xpath(xpath)).sendKeys(tommorowsDate);

			} catch (Exception e) {
				captureScreen(driver, "setTextBoxByXpath");
				Assert.assertFalse(false);
				log.info("User not able to send data in Text Box 'Test Failed'");
			}
		}

		// Explicitwait for an element
		public static void ExplicitWaitly(String xpath) {
			WebDriverWait wait = new WebDriverWait(driver, 500);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

		}

		public static void minWait() throws InterruptedException {
			Thread.sleep(3000);
		}

		public static void MaxWait() throws InterruptedException {
			Thread.sleep(5000);
		}

		// ******Santosh*****
		/* Enter and select data from drop down menu */

		// ScrollDown for An Element
		public static void ScrollAWC(String xpath) {
			js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,9000);", xpath);
		}

		/* Enter and select data from drop down menu */
		public static void selectEleVisibleText(String xpath1, String xpath2, String xpath3, String searchValue,
				String value) throws InterruptedException {
			driver.findElement(By.xpath(xpath1)).click();
			driver.findElement(By.xpath(xpath2)).sendKeys(searchValue);
			List<WebElement> ProdCodeVal = driver.findElements(By.xpath(xpath3));
			for (int i = 0; i < ProdCodeVal.size(); i++) {
				if (ProdCodeVal.get(i).getText().equals(value)) {
					Thread.sleep(3000);
					ProdCodeVal.get(i).click();
					break;
				}
			}
		}
		// Select Element by VisibleText

		public static String verifyPageTitle() {
			return driver.getTitle();
		}

		public static String verifyToastMe(String xpath) throws IOException {
			String elementText = driver.findElement(By.xpath(xpath)).getText().replaceAll("[^A-Za-z]", " ");
			return elementText;
		}
		
		
	//******Vivek***	
		public static void verifyToastMSg(String xpath) throws IOException {
			try
			{
				if (driver.findElement(By.xpath(xpath)).isDisplayed()) {
			
				String elementText = driver.findElement(By.xpath(xpath)).getText().replaceAll("[^A-Za-z]", " ").toString();
				//return elementText;
				Library.Interaction.print("Toast Massage is displaying with massage: "+elementText);
				log.info("Toast Massage is displaying with massage: "+elementText);
				}
			} 
			catch(Exception e) 
			{
				Library.Interaction.print("Toast massage not Displaying");
			}
			}
		
		//*****************SANTOSH*********************
		
		
		public static String verifyToastMessageWithNumbers(String xpath) throws IOException {
			String elementText = driver.findElement(By.xpath(xpath)).getText().replaceAll("[^A-Za-z0-9]", " ");
			return elementText;
	}
		
		
		//VerifySKU
		public static String verifySKU(String xpath) throws IOException {
			String[] elementText = driver.findElement(By.xpath(xpath)).getText().split(" ");
			return elementText[1];
	}
	//verifyPO
		public static String verifyPONumber(String xpath) throws IOException {
			String[] elementText = driver.findElement(By.xpath(xpath)).getText().split("#");
			return elementText[1];
	}
		//PrintPOMessage
		public static String verifyPrintPONumber(String xpath) throws IOException {
			String elementText = driver.findElement(By.xpath(xpath)).getText().replaceAll("[^0-9]", " ");
			return elementText;
	}
		
	
	//Replace Text
		public static String ReplaceText(String xpath, String Value) throws IOException {
			String[] elementText = driver.findElement(By.xpath(xpath)).getText().split(Value);
			return elementText[1];
	}
	//Trim Text by space
	public String TrimSpace(String Value)
	{
		String text=Value.trim();
		return text;
	}
	//Retain only numbers and ,. for Cost
	public static String RetainNumberAndDecimalPoints(String xpath)
	{
		String element = driver.findElement(By.xpath(xpath)).getText().replaceAll("[^0-9-0.0-0,0]", "");
		return element;
	
	}
	//Retain only numbers and . for Cost
	public static String RetainNumberAndDecimalPointsOnlyComma(String xpath)
	{
		String element = driver.findElement(By.xpath(xpath)).getText().replaceAll("[^0-9-0.0-9.9]", "");
		return element;
	
	}
	//ExplicitWait
	public static void ExplicitWait(String xpath)
	{
		WebDriverWait wait=new WebDriverWait(driver,20000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
	
	//PrintReceiptNumber
	public static String getOnlyNumbers(String xpath) throws IOException {
		String elementText = driver.findElement(By.xpath(xpath)).getText().replaceAll("[^0-9]", " ");
		return elementText;
}	
	

	// ***************ShivaPrasad**********

	public static String splitsymbol(String Xpath) {
		String ele = driver.findElement(By.xpath(Xpath)).getText();
		String[] val = ele.split("-");
		String value = val[0];
		return value;
	}

	public static void ScrollElemntsmallH(String ele) {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", ele);
	}

	public static void ScrollElemntdirectloc(String ele) {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5500)", ele);

	}
	  

	  public static void keydel() throws Exception
	  		{
	  			robo=new Robot();
	  			robo.keyPress(KeyEvent.VK_CONTROL);
	  			Thread.sleep(50);
	  			robo.keyPress(KeyEvent.VK_DELETE);
	  			robo.keyRelease(KeyEvent.VK_DELETE);
	  			Thread.sleep(50);
	  			robo.keyPress(KeyEvent.VK_DELETE);
	  			robo.keyRelease(KeyEvent.VK_DELETE);
	  			Thread.sleep(50);
	  			robo.keyPress(KeyEvent.VK_DELETE);	
	  			robo.keyRelease(KeyEvent.VK_DELETE);
	  			Thread.sleep(50);
	  			robo.keyRelease(KeyEvent.VK_CONTROL);
	  			Thread.sleep(50);
	  		}

	  public static void keyuparrow() throws Exception 
	  		
	  		{
	  			robo=new Robot();
	  			robo.keyPress(KeyEvent.VK_CONTROL);
	  			Thread.sleep(50);
	  			robo.keyPress(KeyEvent.VK_UP);
	  			robo.keyRelease(KeyEvent.VK_UP);
	  			Thread.sleep(50);
	  			robo.keyPress(KeyEvent.VK_UP);
	  			robo.keyRelease(KeyEvent.VK_UP);		
	  			Thread.sleep(50);
	  			robo.keyRelease(KeyEvent.VK_CONTROL);		
	  		}

	  public static void ScrollElemntdirectlocact(String ele)
	  		{
	  			js=(JavascriptExecutor)driver;
	  			
	  			js.executeScript("window.scrollBy(0,-5500)", ele);
	  		}


	  public static void cleartext() throws Exception {
	  			robo=new Robot();
	  			robo.keyPress(KeyEvent.VK_CONTROL);
	  			robo.keyPress(KeyEvent.VK_A);
	  			Thread.sleep(200);
	  			robo.keyRelease(KeyEvent.VK_CONTROL);
	  			robo.keyRelease(KeyEvent.VK_A);
	  			robo.keyPress(KeyEvent.VK_BACK_SPACE);
	  			robo.keyRelease(KeyEvent.VK_BACK_SPACE);
	  			
	  		}

	  public static void ScrollElemntsample(String Xpath) throws Exception
	  		{
	  		try
	  		{
	  				
	  			js=(JavascriptExecutor)driver;
	  			
	  			 WebElement loc = driver.findElement(By.xpath(Xpath));
	  			 Point l = loc.getLocation();
	  			int x = l.getX();
	  			int y = l.getY();
	  			js.executeScript("window.scrollBy("+x+","+y+")","");
	  			
	  		}
	  		
	  		catch (Exception e) 
	  		{
	  			captureScreen(driver, "ScrollElemntsample");
	              Assert.assertFalse(false);
	              log.info("Failed to scrroll down");
	  		}
	  		}

	  public static void switchtochildwin1() {
	  			
	  			Set<String> win = driver.getWindowHandles();
	  			List<String> l = new ArrayList<String>(win);			
	  			for(int i=0;i<=1;i++)
	  			{
	  				driver.switchTo().window(l.get(1));
	  			}
	  			
	  		}

	  public static void POSzoompopup() throws Exception {
	              robo=new Robot();
	  			robo.keyPress(KeyEvent.VK_TAB);
	  			Thread.sleep(1000);
	  			robo.keyPress(KeyEvent.VK_TAB);
	  			Thread.sleep(1000);
//	  			r.keyPress(KeyEvent.VK_TAB);
//	  			Thread.sleep(1000);
//	  			r.keyPress(KeyEvent.VK_TAB);
//	  			Thread.sleep(1000);
//	  			r.keyPress(KeyEvent.VK_TAB);
//	  			Thread.sleep(1000);
//	  			r.keyPress(KeyEvent.VK_TAB);
//	  			Thread.sleep(1000);
//	  			r.keyPress(KeyEvent.VK_TAB);
//	  			Thread.sleep(1000);
//	  			r.keyPress(KeyEvent.VK_TAB);
//	  			Thread.sleep(1000);
	  			robo.keyPress(KeyEvent.VK_TAB);
	  			robo.keyRelease(KeyEvent.VK_TAB);
	  			Thread.sleep(2000);
	  			robo.keyPress(KeyEvent.VK_ENTER);
	  			robo.keyRelease(KeyEvent.VK_ENTER);			
	  			robo.keyPress(KeyEvent.VK_ENTER);
	  			robo.keyRelease(KeyEvent.VK_ENTER);
	  			robo.keyPress(KeyEvent.VK_ENTER);          
	  			robo.keyRelease(KeyEvent.VK_ENTER);
	  			robo.keyPress(KeyEvent.VK_ENTER);
	  			robo.keyRelease(KeyEvent.VK_ENTER);
	  		}
	  		

	  public static void switchtoparent() {
	  			
	  		Set<String> win = driver.getWindowHandles();
	  		List<String> l = new ArrayList<String>(win);			
	  		for(int i=0;i<=1;i++)
	  		{
	  			driver.switchTo().window(l.get(0));
	  		}
	  		}
	  public static void switchduplicate() throws Exception{
			robo=new Robot();
			robo.keyPress(KeyEvent.VK_ALT);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_D);
			robo.keyRelease(KeyEvent.VK_ALT);
			robo.keyRelease(KeyEvent.VK_D);		
			Thread.sleep(1000);		
			robo.keyPress(KeyEvent.VK_ALT);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_ENTER);			
			robo.keyRelease(KeyEvent.VK_ALT);			
			robo.keyRelease(KeyEvent.VK_ENTER);
		}
	//To select drop down list by equals method
			public static void selecteleequal(String arrowclick, String searchval, String selectval, String inputvalue, String value) throws Exception
			{
				driver.findElement(By.xpath(arrowclick)).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(searchval)).sendKeys(inputvalue);
				List<WebElement> listval = driver.findElements(By.xpath(selectval));
				for(int i=0;i<listval.size();i++)
				{
					if(listval.get(i).getText().equals(value))
					{
						Thread.sleep(1000);
						listval.get(i).click();
						break;
					}
					
				}
						
			}
			
			public static void POScancelpopup() throws Exception {
				Robot r=new Robot();
				r.keyPress(KeyEvent.VK_TAB);			
				r.keyPress(KeyEvent.VK_TAB);			
				r.keyPress(KeyEvent.VK_TAB);			
				r.keyPress(KeyEvent.VK_TAB);			
				r.keyPress(KeyEvent.VK_TAB);			
				r.keyPress(KeyEvent.VK_TAB);			
				r.keyPress(KeyEvent.VK_TAB);
				r.keyRelease(KeyEvent.VK_TAB);			
				Thread.sleep(2000);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				
			
			}
			
			public static void verifylist(String Xpath, String Xpath2)

			{
				List<WebElement> val = driver.findElements(By.xpath(Xpath));
				 for (WebElement val1 : val) {
					String val2 = val1.getText().replaceAll("[^0-9]", "");
					
					if(val2.equals(Xpath2))
					{
						System.out.println("Found the invoice number");
						System.out.println(val2);
						
					}else {
						System.out.println("Did not find your invoice number");
					}
					
				}  }
			
			public static String retainonlynumbers(String Xpath)
			{
				String val = driver.findElement(By.xpath(Xpath)).getText().replaceAll("[^0-9]", "");
				return val;
			}
			
			public static void refreshpage() throws Exception {
				Robot r=new Robot();
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_R);			
				r.keyRelease(KeyEvent.VK_CONTROL);
				r.keyRelease(KeyEvent.VK_R);
			}
			
			public static String retainonlynumberswithdeci(String Xpath)
			{
				String val = driver.findElement(By.xpath(Xpath)).getText().replaceAll("[^0.-9.9]", "");
				return val;
			}
			
			public static String splithequal(String Xpath)
			{
			String ele = driver.findElement(By.xpath(Xpath)).getText();
		       String[] val = ele.split("=");
			String value = val[0];
			String valint = value.replaceAll("[^0-9]", "");
		       return valint;  		   
			}
			
			public static void ScrollDown() throws InterruptedException
			{
				JavascriptExecutor j = (JavascriptExecutor)driver;
				
				for(int i=1;i<=10;i++)
				{
					j.executeScript("window.scrollBy(0,50)");
					Thread.sleep(300);
				}
				
			}
			public static void ScrollUp() throws InterruptedException
			{
				JavascriptExecutor j = (JavascriptExecutor)driver;
				
				for(int i=1;i<=10;i++)
				{
					j.executeScript("window.scrollBy(0,-500)");
					Thread.sleep(300);
				}
				
			}
			
			public static void DateFormat(String xpath1) throws Exception {
				robo=new Robot();
				driver.findElement(By.xpath(xpath1)).click();
				
				
				Thread.sleep(2000);
				//Add the Xpath of the Text Available in the page for referance Click operation
				
				robo.keyPress(KeyEvent.VK_ENTER);
				
				
				Thread.sleep(2000);
				robo.keyRelease(KeyEvent.VK_ENTER);
			}
			
			public static void writeKeyboardString(Robot bot, String st) throws Throwable, Throwable {
			    String upperCase = st.toUpperCase();
			    for(int i = 0; i < upperCase.length(); i++) {
			        char Char = upperCase.charAt(i);
			        String letter = Character.toString(upperCase.charAt(i));
			        
			        if ((Char>='A' && Char<='Z')||(Char>='a' && Char<='z')||(Char>='0' && Char<='9')) {
			        	String code = "VK_" + letter;
				        

				        Field f = KeyEvent.class.getField(code);
				        int keyEvent = f.getInt(null);
				        //System.out.println(keyEvent);
				        bot.keyPress(keyEvent);
				        bot.keyRelease(keyEvent);
						
					}
			        else if(letter.equals("@")) {
			        	bot.keyPress(KeyEvent.VK_SHIFT);
			        	Thread.sleep(100);
			        	bot.keyPress(KeyEvent.VK_2);
			        	//Thread.sleep(500);
				        bot.keyRelease(KeyEvent.VK_2);
				        //Thread.sleep(500);
				        bot.keyRelease(KeyEvent.VK_SHIFT);
						
					}
			        else if(letter.equals(".")) {
			
			        	bot.keyPress(KeyEvent.VK_PERIOD);
			        	
						
					}
			        else if(letter.equals(" ")) {

			        	bot.keyPress(KeyEvent.VK_SPACE);
			      
						
					}
			        
			    }
			}
			
			public static String copyText(Robot bot) throws Throwable, Throwable 
			{
				bot.keyPress(KeyEvent.VK_CONTROL);
				Thread.sleep(500);
				bot.keyPress(KeyEvent.VK_C);
				Thread.sleep(1000);
				bot.keyRelease(KeyEvent.VK_C);
				Thread.sleep(500);
				bot.keyRelease(KeyEvent.VK_CONTROL);
				Toolkit toolkit2 = Toolkit.getDefaultToolkit();
				Clipboard clipboard2 = toolkit2.getSystemClipboard();
				String result2 = (String) clipboard2.getData(DataFlavor.stringFlavor);
		        return result2;

			}
			
			public static void writeKeyboard(Robot bot, String st) throws Throwable, Throwable {
			    String upperCase = st.toUpperCase();

			    for(int i = 0; i < upperCase.length(); i++) {
			        String letter = Character.toString(upperCase.charAt(i));
			        String code = "VK_" + letter;
			        

			        Field f = KeyEvent.class.getField(code);
			        int keyEvent = f.getInt(null);
			        //System.out.println(keyEvent);
			        bot.keyPress(keyEvent);
			        bot.keyRelease(keyEvent);
			    }
			}



	  public static void typeCharacter(String text)
	  	    { if (text != null) {
	  	        try {
	  	            final Robot robot = new Robot();
	  	            for (int i = 0; i < text.length(); i++) {
	  	                final char ch = text.charAt(i);
	  	                final boolean upperCase = Character.isUpperCase(ch);
	  	                final int keyCode = KeyEvent.getExtendedKeyCodeForChar(ch);
	  	                robot.delay(10);
	  	                if (upperCase) {
	  	                    robot.keyPress(KeyEvent.VK_SHIFT);
	  	                }
	  	                robot.keyPress(keyCode);
	  	                robot.keyRelease(keyCode);
	  	                if (upperCase) {
	  	                    robot.keyRelease(KeyEvent.VK_SHIFT);
	  	                }
	  	            }
	  	        }catch(Exception e) {
					e.printStackTrace();
				}

	  	    }

	  	    }
	  }
}
