package Implicit_Explicit_WaitInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitProperty {
	WebDriver driver;
	
	public void driverSetting(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe.exe");
		driver=new ChromeDriver();
		driver.get(url);
		
	}
	
	public void waitinSelenium() {
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);---it apply on  whole Web-application
		driver.switchTo().frame("webform");
		
		System.out.println("Before webdriver wait==>");
		
		WebDriverWait elementwait=new WebDriverWait(driver,10);//----explicit-->It aplly on perticular webelement
		WebElement waitWebelement=elementwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/form/div/div[4]/div/div[2]/div[1]/div/input")));
		waitWebelement.sendKeys("prashanti@gmail.com");
		
		System.out.println("After WebDriver Wait>>");
		
		
		
	}
	

}
