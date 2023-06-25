package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Config {
	WebDriver driver;
	
	public void driverSetting(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe.exe");
		driver=new ChromeDriver();
		driver.get(url);
		
		}
	
	public void takeScreenShot() {
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\Users\\pwaware\\Desktop\\SeleniumWorkSpace\\ScreenShot\\PopupScreenshot.png");
		
		try {
			FileHandler.copy(source, target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
