package DemoTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	WebDriver driver;
	
	public void driverSetting(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe.exe");
		driver=new ChromeDriver();
		driver.get(url);
	}
	
	public  void loginAccess() {
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.tagName("button")).click();
		
	}
	
	public void dashBoard() {
		//---------------Click on users-------------------
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
		
		//Heading row
		List <WebElement> list_row= driver.findElements(By.tagName("tr"));
		System.out.println("==> Row Size==>"+list_row.size());
		
		for(int i=1;i<list_row.size();i++) {
			//List <WebElement> list_col=driver.findElements(By.tagName("td"));
			List <WebElement> list_col=list_row.get(i).findElements(By.tagName("td"));
			//System.out.println("==>Col Size==>"+list_col.size());
			for(int j=0;j<8;j++) {
				System.out.print(list_col.get(j).getText()+"\t");
			}
			System.out.println("");
			
			
			}
		
		
	}
	
	public void operatorsDashboard() {
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[4]/a/span")).click();
		
	     List <WebElement> list_row= driver.findElements(By.tagName("tr"));
	     System.out.println("==>Row size==> "+list_row.size());
	     
	     for(int i=1;i<list_row.size();i++) {
	    	//List<WebElement> list_col= driver.findElements(By.tagName("td"));
	    	List <WebElement> list_col=list_row.get(i).findElements(By.tagName("td"));
	    	//System.out.println("==>Col Size==> "+list_col.size());
	    	for(int j=0;j<6;j++) {
	    		System.out.print(list_col.get(j).getText()+"\t");
	    	}
	    	System.out.println();
	     }
	}
	
	public void usefulLinks() {
		driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[5]/a/span")).click();
		List <WebElement> list_row=driver.findElements(By.tagName("tr"));
		System.out.println("==>Row Size==> "+list_row.size());
		
		for(int i=1;i<list_row.size();i++) {
			//List <WebElement> list_col=driver.findElements(By.tagName("td"));
			List<WebElement> list_col=list_row.get(i).findElements(By.tagName("td"));
			
			//System.out.println("==Col Size== "+list_col.size());
			for(int j=0;j<3;j++) {
				System.out.print(list_col.get(j).getText()+"\t");
			}
			System.out.println();
		}
	}
	
	public void downLoads() {
		driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[6]/a/span")).click();
		
		List <WebElement> list_row=driver.findElements(By.tagName("tr"));
		System.out.println("==Row size "+list_row.size());
		
		for(int i=1;i<list_row.size();i++) {
			//List <WebElement> list_col=driver.findElements(By.tagName("td"));
			List<WebElement> list_col=list_row.get(i).findElements(By.tagName("td"));
			for(int j=0;j<8;j++) {
				System.out.print(list_col.get(j).getText()+"\t");
			}
			System.out.println();
			
		}
	}
	
	public void logOut() {
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[7]/a/span")).click();
	}
	

}
