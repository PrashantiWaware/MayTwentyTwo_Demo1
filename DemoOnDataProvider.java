package com.tka.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoOnDataProvider {
	
	@Test(priority=1,dataProvider="testdata")
	public void loginTest(int id,String username,String password ) {
		System.out.println("Login Test execute");
		System.out.println("------------------");
		System.out.println("Id>>"+id);
		System.out.println("username>>"+username);
		System.out.println("Password>>"+password);
		
	}
	
	
	@DataProvider(name="testdata")
	public Object[][] dataProviderData() {
		return new Object[][] {
			{9,"Sumit","123"},
			{3,"Spurha","456"},
			{6,"Kiran","789"},
			
	};
	
	
	}

}
