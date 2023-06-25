package FileAccess;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class config  {
	WebDriver driver;
	
	public void driverSetting() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe.exe");
		driver=new ChromeDriver();
		driver.get(accessProperties());
		
	}
	
	
	
	public String accessProperties() {
		String strUrl=" ";
		
		
		
		try {
			FileInputStream fis=
					 new FileInputStream("C:\\SeleniumWorkSpace\\Configuration files\\config.properties");
			
			Properties props=new Properties();
			props.load(fis);
			System.out.println("Usernamr=> "+props.getProperty("username"));
			System.out.println("Password=> "+props.getProperty("password"));
			System.out.println("URL=> "+props.getProperty("url"));
			
			strUrl=props.getProperty("url");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return  strUrl;
		
	}

}
