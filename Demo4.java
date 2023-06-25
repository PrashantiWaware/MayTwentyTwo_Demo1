package Programe1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/pwaware/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
		//**Enter Email id in Emailbox
		WebElement emailElement=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		emailElement.sendKeys("kiran@gmail.com");
		
		//**Shortcut method for password
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		
		//**Click on login button
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		
		
	    //Course Offered label name
		WebElement courseElement=driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1/small"));
		String strCourse=courseElement.getText();
		//**TASK**----->   String strCourse=courseElement.getTagName();
		System.out.println("=>>"+strCourse);
		
		//**Click on Users webElement
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a")).click();
		
		//**Click on Add Users
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		
		//**Access URL when click on Add Users
		String strCurrentUrl=driver.getCurrentUrl();
		System.out.println("--->"+strCurrentUrl);
		
		//**Enter Username 
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Prashanti");
		
		//**Enter mb no.
		driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("8600369561");
		
		//**Enter Email-id
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Waware@gmail.com");
		
		//**Enter Corse name
		driver.findElement(By.xpath("//*[@id=\"course\"]")).sendKeys("Selenium-Java");
		
		//**Gender male Radio button
		driver.findElement(By.xpath("//*[@id=\"Male\"]")).click();
		
		//**Gender Female Radio button
		driver.findElement(By.xpath("//*[@id=\"Female\"]")).click();
		
		
		//**Select dropDown state
		WebElement dropDownElement=driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
		
		Select select=new Select(dropDownElement);
		
		//select.selectByIndex(2);-----Its not fisible when there is large data
		
		//select.selectByValue("Maharashtra");
		
		select.selectByVisibleText("HP");
		
		//**Password Enter
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345");
		
		//**Enter friends Mb no.
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[3]/div/input")).sendKeys("7719057347");
		
		
		//**Click on Submit
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		//**Access Alert
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		
		

	}

}
