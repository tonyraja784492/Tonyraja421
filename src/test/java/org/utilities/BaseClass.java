package org.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jspecify.annotations.Nullable;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public static WebDriver driver;
	public static Actions ac;
	public static Robot r;
	public static Alert a;
	public static JavascriptExecutor js;
	public static TakesScreenshot ts;
	public static Select sc;
	public static WebDriverWait w;
	    
	
	
	public static void setup() {
		
				
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
	    	
	
	}
	
	public static void launchurl(String name) {

		driver.get(name);
	}
		
	
	public static void toImplicitWait(long sec) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));

	}
	
	public static void toExplicitWait(long sec, By locator) {
		 w = new WebDriverWait(driver, Duration.ofSeconds(sec));
		w.until(ExpectedConditions.visibilityOfElementLocated(locator));
		

	}
	
	public static void SetDate() {
		Date d = new Date();
		
		System.out.println(d);
	
		
		

	}
	
       public static void toFillText(WebElement element, String text) {
    	   
    	   element.sendKeys(text);
    	   
    	   	}	
       
       public static void toClick(WebElement element) {
    	   element.click();
    	   
    	   }
       
       public static String getText(WebElement element) {
    	   
    	   String text = element.getText();
    	   
    	   return text;
    	   
       }
       
       
       
       public static void toTakeScreenshot(String imgName) throws IOException {
    	   
    	   ts = (TakesScreenshot) driver;
    	   
    	   File temp = ts.getScreenshotAs(OutputType.FILE);
    	   
    	   File dest = new File("C:\\Users\\rober\\eclipse-workspace\\MavenProject\\src\\test\\java\\Screenshot\\"+imgName+".png");
    	   
    	   FileUtils.copyFile(temp, dest);
	}
       
       
       
       public static void clickElementViaJS(WebElement element) {
    	   js = (JavascriptExecutor) driver;
           js.executeScript("arguments[0].click();", element);
       }
       
       public static void scrollInto(WebElement element) {
    	   js = (JavascriptExecutor) driver;
    	   
    	   js.executeScript("arguments[0].scrollIntoView(true)", element);
    	   
    	   }

       public static String getTextJs(WebElement element, WebElement value) {
    	   js = (JavascriptExecutor) driver;
    	   
		Object execute = js.executeScript("return arguments[0].getAttribute('"+value+"')", element);
    	   
		String text = (String) execute;
		
		return text;

	}
       
       public static void inputFieldJS(String name, WebElement element) {
    	   js = (JavascriptExecutor) driver;
    	   js.executeScript("arguments[0].setAttribute('value','"+name+"')", element);
    	   
    	   

	}
       
       
       
       public static void moveToEle(WebElement element) {
    	   ac = new Actions(driver);
    	   
    	   ac.moveToElement(element).perform();

	}       
       
       public static void contextClk(WebElement element) {
    	   ac = new Actions(driver);
    	   ac.contextClick(element).perform();

	}
       
       public static void doubleClk(WebElement element) {
    	   ac = new Actions(driver);
    	   ac.doubleClick(element).perform();

	}
       
       public static void dragNDrop(WebElement source, WebElement target) {
    	   ac = new Actions(driver);
    	   ac.dragAndDrop(source, target).perform();

	}
       
       public static void keyDownKUp(String name) {
    	   ac = new Actions(driver);
    	   ac.keyDown(Keys.SHIFT).sendKeys(name).keyUp(Keys.SHIFT).build().perform();

	}
       

       public static void enterRobot() throws AWTException {
    	   r = new Robot();
    	   r.keyPress(KeyEvent.VK_ENTER);
    	   r.keyRelease(KeyEvent.VK_ENTER);

	}

       public static void controlX() throws AWTException {
    	   r = new Robot();
    	   r.keyPress(KeyEvent.VK_CONTROL);
    	   r.keyPress(KeyEvent.VK_X);
    	   
    	   r.keyRelease(KeyEvent.VK_CONTROL);
    	   r.keyRelease(KeyEvent.VK_X);

	}
       

       public static void controlV() throws AWTException {
    	   r = new Robot();
    	   r.keyPress(KeyEvent.VK_CONTROL);
    	   r.keyPress(KeyEvent.VK_V);
    	   
    	   r.keyRelease(KeyEvent.VK_CONTROL);
    	   r.keyRelease(KeyEvent.VK_V);
            
	}

       public static void controlA() throws AWTException {
    	   r = new Robot();
    	   r.keyPress(KeyEvent.VK_CONTROL);
    	   r.keyPress(KeyEvent.VK_A);
    	   
    	   r.keyRelease(KeyEvent.VK_CONTROL);
    	   r.keyRelease(KeyEvent.VK_A);
    	   
	}

       public static void tab() {
    	   r.keyPress(KeyEvent.VK_TAB);
    	   r.keyRelease(KeyEvent.VK_TAB);

	}
     

       public static void escape() {
    	   
    	   r.keyPress(KeyEvent.VK_ESCAPE);
    	   r.keyRelease(KeyEvent.VK_ESCAPE);
    	   

	}
       

       public static void delete() {
    	  r.keyPress(KeyEvent.VK_DELETE);
    	  r.keyRelease(KeyEvent.VK_DELETE);

	}
       

       public static void backSpace() throws AWTException {
    	   r = new Robot();
    	   r.keyPress(KeyEvent.VK_BACK_SPACE);
    	   r.keyRelease(KeyEvent.VK_BACK_SPACE);

	}
       
              
       

       public static void switchWindow(int i) {
    	    Set<String> allID = driver.getWindowHandles();
    	    List<String> li = new ArrayList<>(allID);
    	    
    	    if (i >= 0 && i < li.size()) {
    	        String targetWindow = li.get(i);
    	        driver.switchTo().window(targetWindow);
    	    }
    	}                  
           
           

       public static void switchToFrame(int index) {
           driver.switchTo().frame(index);
       }

       
        
       public static void switchToFrame(String nameOrId) {
           driver.switchTo().frame(nameOrId);
       }

       
       public static void switchToFrame(WebElement element) {
           driver.switchTo().frame(element);
       }
       
           
           public static void switchBackToWebpage() {
        	   
        	   driver.switchTo().defaultContent();

		}
           

           public static void switchAlert() {
        	   a = driver.switchTo().alert();

		}
           

           public static void alertAccept() {
        	   a.accept();

		}

           public static void alertDismiss() {
        	   a.dismiss();

		}
           
           public static void alertSendkeys(String name) {
        	   a.sendKeys(name);

		}
           public static String alertGetText(WebElement element) {
        	   String text = a.getText();
        	   
        	   return text;

		}
           
           public static void selectByVisible(WebElement element, String text) {
        	   
        	   sc = new Select(element);
        	   
        	   sc.selectByVisibleText(text);
        	         		   
        		   
        	   }
           
           public static void selectByValue(WebElement element, String name) {
        	   sc = new Select(element);
        	   
        	   sc.selectByValue(name);

		}
           
           public static void selectByInd(WebElement element, int in) {
        	   sc = new Select(element);
        	   
        	   sc.selectByIndex(in);

		}
           
           
public static String readExcelData(String excelName, String sheetNm, int rowNm, int cellNm) throws IOException {
        	   
   File f = new File("C:\\Users\\rober\\eclipse-workspace\\MavenProject\\target\\"+excelName+".xlsx");
       		
       		FileInputStream fis = new FileInputStream(f);
       		       				
       		Workbook w = new XSSFWorkbook(fis);
       		
       		Sheet sheet = w.getSheet(sheetNm);
       		Row row = sheet.getRow(rowNm);
       		Cell cell = row.getCell(cellNm);
       		
       		int cellType = cell.getCellType();
       		
       		String value = "";
       		
       		if (cellType == 1) {
       			
       			 value = cell.getStringCellValue();
       			  		}
       		else if (DateUtil.isCellDateFormatted(cell)) {
       			
       			java.util.Date dateCellValue = cell.getDateCellValue();
       			SimpleDateFormat s = new SimpleDateFormat();
       			value = s.format(dateCellValue);
       			
       		}
       		
       		else {
       			
       			double d = cell.getNumericCellValue();
       			
       			long l = (long) d;
       			
       			value = String.valueOf(l);
       			
       			
       		}
       		
       		return value;
       		
       		

		}

     
     public static void createNewExcel(String exlName, String newSheet, int newRow, int newCell, String setData) throws IOException {
    	 
    	 File f = new File("C:\\Users\\rober\\eclipse-workspace\\MavenProject\\target\\"+exlName+".xlsx");
 		
 		Workbook w = new XSSFWorkbook();
 		
 		Sheet s = w.createSheet(newSheet);
 		
 		Row r = s.createRow(newRow);
 		
 		Cell cell = r.createCell(newCell);
 		
 		cell.setCellValue(setData);
 		
 		FileOutputStream fos = new FileOutputStream(f);
 		
 		w.write(fos);
 		
 		System.out.println("Sheet, Row and Cell created");
 		

	}

       
       public static void createRowAndCell(String exlName, String sheetName, int newRow, int newCell, String setData) throws IOException {
    	   
    	File f = new File("C:\\Users\\rober\\eclipse-workspace\\MavenProject\\target\\"+exlName+".xlsx");
   		
   		FileInputStream fis = new FileInputStream(f);
   		
   		Workbook w = new XSSFWorkbook(fis);
   		
   		Sheet s = w.getSheet(sheetName);
   		
   		Row r = s.createRow(newRow);
   		
   		Cell cell = r.createCell(newCell);
   		
   		cell.setCellValue(setData);
   		
   		FileOutputStream fos = new FileOutputStream(f);
   		
   		w.write(fos);
   		
   		System.out.println("Row and Cell created");
   		

	}

                        
           
        
                
	     
       @AfterClass(alwaysRun = true)
       public static void closeBrowser() {
    	   
    	   driver.quit();

	}
       
	
	
	

}
