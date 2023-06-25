package absolute_Relative_xpath;

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
	
	public void accessElement() {
		
		//-----Absolute xpath html-body-div-a
		//driver.findElement(By.xpath("/html/body/div/a[3]")).click();
		
		
		//Relative xpath-->check unic attribute
		driver.findElement(By.xpath("//a[@id='navbtn_exercises']")).click();
		
	}
	
	public void elementAccess() {
		WebElement elementName=driver.findElement(By.xpath("//input[contains(@name,'firstName')]"));
		elementName.sendKeys("Prashanti Waware");
		
		
		//contains--> if 'password123' in this 'password' is constant(not changable) then use contains
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("1234");
		
          //starts-with-->if 'confirm_passwd123' in this 'confirm_passwd' is constant(not changable) then use starts-with		
		driver.findElement(By.xpath("input[starts-with(@name,'confirm_passwd')]")).sendKeys("6767623");

	}
	
	
	

}
