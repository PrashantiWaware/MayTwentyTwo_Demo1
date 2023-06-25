package May_Twentytwo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");

		
	}

}
