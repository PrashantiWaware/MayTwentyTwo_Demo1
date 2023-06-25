package TabHandling;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/pwaware/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
		
		//Enter emailId
		WebElement emailElement=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		emailElement.sendKeys("kiran@gmail.com");
		
		
		//Enter Password
		WebElement passwordElement=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		passwordElement.sendKeys("123456");
		
		
		//Click on login button
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		
		//click on more info on PDF Selenium
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/a/i")).click();
		
		//click on PDF JAVA/Jee more info
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[2]/div/a")).click();
		
		//click on More info of PDF Python
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[3]/div/a")).click();
		
		//click on more info of PDF PHP
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[4]/div/a")).click();
		
		//Handle window tabs
		//driver.getWindowHandles();
		ArrayList<String> list=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(list.size());//Print No.of TAB
		
		
		//String format name of all Tabs
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			
			//Condition for closing tabs
			if(i!=0) {
				driver.switchTo().window(list.get(i));
				driver.close();
				
			}
			
			/*if(i==4) {
				driver.switchTo().window(list.get(i));
				driver.close();
			}*/
		}
		
		
		//Click on Users option from 1st window(0th index)
		driver.switchTo().window(list.get(0));
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a/span")).click();
		

	}

}
