package Programe1;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/pwaware/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
		
		//linkText locator
		//driver.findElement(By.linkText("Register a new membership")).click();
		
		//PartialLinkText locator
		driver.findElement(By.partialLinkText("Register a")).click();
		
		//NmaeLocator
		driver.findElement(By.name("name")).sendKeys("Prashanti");
		
		//Id Locator
		driver.findElement(By.id("mobile")).sendKeys("8600369561");
		
		//TagName Locator
		//driver.findElement(By.tagName("input")).sendKeys("waware@gmail.com");//it fails
		List<WebElement> listElement= driver.findElements(By.tagName("input"));
		System.out.println(listElement.size());
		
		for(int i=0;i<listElement.size();i++) {
			String strPlaceholder=listElement.get(i).getAttribute("placeholder");
			System.out.println("===>"+strPlaceholder);
			
			
			//Easy way
		/*if(strPlaceholder.compareTo("Email")==0) {
				System.out.println("Element found");
				listElement.get(i).sendKeys("waware@gmail.com");
			}*/
			
			
			//Alertanate way
			if(listElement.get(i).getAttribute("placeholder").compareTo("Email")==0){
				System.out.println("Element found");
				
				listElement.get(i).sendKeys("waware@gmail.com");
				
			 }
			//Enter Password
			else if(listElement.get(i).getAttribute("placeholder").compareTo("Password")==0) {
				 listElement.get(i).sendKeys("Prashanti@123");
			 }
		
			
			
		}	
		
		driver.findElement(By.className("btn")).click();
		
		//Display Alert message
		Alert alert=driver.switchTo().alert();
		
		alert.accept();
		
		driver.switchTo().defaultContent();//45.42time
		
		//Navigate to back window
		driver.navigate().back();
		
		//Navigate to Forward window
		driver.navigate().forward();
		
		
		//Refresh the page
		driver.navigate().refresh();
		
		//maximize the window
		driver.manage().window().maximize();
		
		
	}

}
