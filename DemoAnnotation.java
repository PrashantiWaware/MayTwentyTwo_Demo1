package com.tha.annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoAnnotation {
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("---------Before Suite----------");
	}
	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("===========beforeTest==============");
		
	}
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("***************before Class****************");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("============beforeMethod==========");
	}
	
	@Test(priority=1)
	public void test1() {
		System.out.println("+++++++++Test execute1++++++++");
	}
	
	@Test(priority=2)
	public void test2() {
		System.out.println("+++++++++Test1 execute+++++++++");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("===========After method=========");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("*********After class**********");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("=======After Test=========");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("---------After Suite--------");
	}
	

	
}
