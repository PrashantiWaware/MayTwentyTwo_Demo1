package May_TwentyThree2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/pwaware/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
		WebElement emailElement=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		emailElement.sendKeys("Piraji@gmail.com");
		
		
		

	}

}
