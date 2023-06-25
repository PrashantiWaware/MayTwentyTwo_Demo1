package Modify_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class config {
	WebDriver driver;
	
	public void driverSetting(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe.exe");
		 driver=new ChromeDriver();
		 
		 driver.get(url);
		
	}
	
	public void iframeAccess() {
		//driver.switchTo().frame(1);
		driver.switchTo().frame("webform");
		//WebElement iframeElement=driver.findElement(By.xpath("//*[@id=\"grwf2_S4ibL_oiktt\"]/iframe"));
		//driver.switchTo().frame(iframeElement);
		
		try {
			Thread.sleep(5000);
			//driver.findElement(By.xpath("//*[@id=\"webform_preview\"]/div")).click();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		
		}
	
	public WebElement elementAccess(String elementxpath) {
		return driver.findElement(By.xpath(elementxpath));
	}
	
	public void loginAccess() {
		WebElement loginElement=elementAccess("/html/body/div/div/form/div/div[4]/div/div[2]/div[1]/div/input");
		loginElement.sendKeys("waware@gmail.com");
		
		WebElement buttonElement=elementAccess("/html/body/div/div/form/div/div[5]/div/button/span");
		 buttonElement.click();
	}
	

}
