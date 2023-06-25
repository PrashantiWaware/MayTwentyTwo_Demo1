package com.tka.integration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.tka.utility.config;

public class login extends config  {
	
WebDriver loginDriver;
	
	@BeforeClass
	public void initialization() {
		driverSetting();
		loginDriver=getDriver();
		
		
	}
	
	@Test(priority=1)
	public void emailvalidation() {
		
	//loginDriver.findElement(By.id("email")).sendKeys("prashanti");
		WebElement emailElement=elementAccessByID("email");
		//emailElement.sendKeys("prashanti");
		emailElement.sendKeys("");
	}
	
	
	
	@Test(priority=2)
	public void passwordValidation() {
		//WebDriver  loginDriver=getDriver();
		//loginDriver.findElement(By.id("password")).sendKeys("prashanti123");
		WebElement passwordElement=elementAccessByID("password");
		//passwordElement.sendKeys("prashanti123");
		passwordElement.sendKeys("");
		}
	
	
	/*@Test(priority=3)
	public void buttonClick() {
		//loginDriver.findElement(By.xpath("//form[@ id='form']//button")).click();
		elementAccessByXpath("//form[@ id='form']//button").click();
		
		//Step1 expected result from BRD
		String expectedEmailMsg="Please enter email as kiran@gmail.com";
		String expectedPasswordMsg="Please enter password 123456";
		
		
		//Step2
		//Actual Access element=>email error msg element access
		//Actual Access element=>password error msg element access
		WebElement emailMsgElement=elementAccessByID("email_error");
		WebElement passwordMsgElement=elementAccessByID("password_error");
		
		
	
		
		//Step3
		//read actual message from element
		String actualEmailMsg=emailMsgElement.getText();
		String actualPasswordMsg=passwordMsgElement.getText();
		
		
		SoftAssert softAssert=new SoftAssert();
		
		
		softAssert.assertEquals(actualEmailMsg, expectedEmailMsg);
		System.out.println("----------Before-----------");
		softAssert.assertEquals(actualPasswordMsg, expectedPasswordMsg);
		System.out.println("----------After------------");
		
		
		
		softAssert.assertAll();
		
		
		
	}*/
	
	@Test(priority=4)
	public void blankFields() {
		elementAccessByXpath("//form[@ id='form']//button").click();
		//Step1
		//It is present in BRD document
		String expectedEmailMsg="Please enter email.";
		String expectedPasswordMsg="Please enter password.";
		
		//Step2
		//Actual access element=blank email msg element
		//actual access element=blank password msg element
		WebElement blankEmailMsgElement=elementAccessByID("email_error");
		WebElement blankPasswordMsgElement=elementAccessByID("password_error");
		
		//Step 3
		//Read actual msg from element
		String actualEmailMsg=blankEmailMsgElement.getText();
		String actualPasswordMsg=blankPasswordMsgElement.getText();
		
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(actualEmailMsg, expectedEmailMsg);
		softAssert.assertEquals(actualPasswordMsg, expectedPasswordMsg);
		
		softAssert.assertAll();
		
		
		}
	
	
	@Test(priority=5)
	public void labelValidation() {
		//It is present in BRD document
		String expectedLabelMsg="Sign in to start your sessions";
		
		//Actual label msg element
		WebElement labelMsgElement=elementAccessByXpath("/html/body/div/div[2]/p");
		
		//read actual label msg
		String actualLabelMsgElement=labelMsgElement.getText();
		
		SoftAssert softAssert=new SoftAssert();
		
		softAssert.assertEquals(actualLabelMsgElement, expectedLabelMsg);
		
		softAssert.assertAll();
		
	}
	
	
	
	/*@Test(priority=4)
	public void wrongEmailID() {
		//It is present in BRD document
		String expectedEmailMsg="Please enter email as kiran@gmail.com";
		WebElement emailMsgElement=elementAccessByID("email_error");
		String actualEmailMsg=emailMsgElement.getText();
		
		Assert.assertEquals(actualEmailMsg, expectedEmailMsg);//-------hard assert
		System.out.println("After the assert Equal method");//Not execute after hard assert
	}
	
	@Test(priority=5)
	public void wrongPassword() {
		//It is present in BRD document
		String expectedPasswordMsg="Please enter password 123458";
		WebElement passwordMsgElement=elementAccessByID("password_error");
		String actualPasswordMsg=passwordMsgElement.getText();
		
		Assert.assertEquals(actualPasswordMsg, expectedPasswordMsg);
		
		
		
	}*/
	
	/*@AfterClass
	public void closeBrowser() {
		driver.close();
	}*/
	

}
