package Following_Child_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Following {
	WebDriver driver;
	
	public void driverSetting(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe.exe");
		driver=new ChromeDriver();
		driver.get(url);
	}
	
	public void att_elementAccess() {
		//Following-->Except first index[0]
		//driver.findElement(By.xpath("(//div[@id='HEADBAND0']//following::li)[2]//a")).click();
		
		//Child-->with first index[0] it consider as[1]
		driver.findElement(By.xpath("(//div[@id='HEADBAND0']//child::li)[3]//a")).click();
	}

}
