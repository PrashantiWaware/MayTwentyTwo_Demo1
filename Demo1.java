package CLASS_OBJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	
	WebDriver driver;
	
	Demo1(){
		
	}
	
	public void Demo1() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe.exe");
		
		this.driver=new ChromeDriver();
		this.driver.get("file:///C:/Users/pwaware/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	}
	
	
	

}
