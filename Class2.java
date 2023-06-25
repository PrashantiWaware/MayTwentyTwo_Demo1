package May_TwentryThree;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/pwaware/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
		String strTitle=driver.getTitle();
		System.out.println("=>> "+strTitle);
		
		String strPageSource=driver.getPageSource();
		System.out.println("=>> "+strPageSource);
		
		String strCurrentUrl=driver.getCurrentUrl();
		System.out.println("=>> "+strCurrentUrl);
		

	}

}
