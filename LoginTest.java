package com.tka.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.server.handler.CaptureScreenshot;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.tka.fullIntegration.Config;

public class LoginTest extends Config {
	WebDriver loginDriver;
	
	
	@BeforeClass
	public void openBrowser() {
		driverSetting("file:///C:/Users/pwaware/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		loginDriver=getDriver();
		
	}
	
	//If u want test on different browser
	/*@BeforeMethod
	public void openBrowser() {
		driverSetting("file:///C:/Users/pwaware/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		loginDriver=getDriver();
		
	}*/
	
	
	@Test(priority=1,dataProvider="logintestdata")
	public void loginTest(String username,String password) {
		//Object[][]  obj=readExcelSheet("C:\\Users\\pwaware\\Desktop\\excelSheetData\\loginTestData.xlsx");
		//System.out.println("Username=> "+username);
		//System.out.println("Password=> "+password);
		
		WebElement email_Element =elementAccessByID("email");
		email_Element.sendKeys(username);
		
		WebElement pwd_Element=elementAccessByID("password");
		pwd_Element.sendKeys(password);
		
		WebElement login_element=elementAccessByXpath("//form[@id='form']//button");
		login_element.click();
		
		//email_Element.clear();
		//pwd_Element.clear();
		
		try {
		File source=((TakesScreenshot)loginDriver).getScreenshotAs(OutputType.FILE);
		File target=new  File("C:\\Users\\pwaware\\Desktop\\ScreenShot\\login_"+username+".png");
		Thread.sleep(2000);
		
		FileHandler.copy(source, target);
		
		//Test Case Execution
		WebElement emaiError_element=elementAccessByID("email_error");
		
		String actualResult_emailError=emaiError_element.getText();
		System.out.println(actualResult_emailError);
		String expectedResult_emailError="Please enter email as kiran@gmail.com.";
		
		
		WebElement passwordError_element=elementAccessByID("password_error");
		
		String actualResult_password=passwordError_element.getText();
		String expectedResult_password="Please enter password 123456";
		
		SoftAssert softassert=new SoftAssert();
		
		softassert.assertEquals(actualResult_emailError, expectedResult_emailError);
		
		//System.out.println("------After assert Execution---------");
		
		softassert.assertEquals(actualResult_password, expectedResult_password);
		
		email_Element.clear();
		pwd_Element.clear();
		softassert.assertAll();
				}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		}
	
	
	
	@DataProvider(name="logintestdata")
	public Object[][] LoginDataProvider(){
		
		Object[][] testObjArray=readExcelSheet("C:\\Users\\pwaware\\Desktop\\excelSheetData\\loginTestData.xlsx");
		return testObjArray;
		
	}
	
	
	public Object[][] readExcelSheet(String path){
		String [][] tabarray=null;
		int ci,cj;
		
		try {
			FileInputStream fis=new FileInputStream(path);
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			XSSFSheet objSheet=workbook.getSheetAt(0);
			
			int rowcount=objSheet.getLastRowNum();
			//System.out.println(rowcount);
			
			tabarray=new String [rowcount][2];
			ci=0;
			
			for(int i=1;i<=rowcount;i++,ci++) {
				cj=0;
				XSSFRow row=objSheet.getRow(i);
				
				for(int j=0;j<2;j++,cj++) {
					//System.out.println("----> "+row.getCell(j));
					tabarray[ci][cj]=row.getCell(j).getStringCellValue();
					//System.out.println("Table data--->"+tabarray[ci][cj]);
				}
				//System.out.println("=================");
				
			}
			
			workbook.close();
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tabarray;
		
		
	}
	

}
