package Implicit_Explicit_WaitInSelenium;

public class DemoOnWait extends WaitProperty {

	public static void main(String[] args) {
		DemoOnWait obj=new DemoOnWait();
		obj.driverSetting("https://www.qa.jbktest.com/");
		obj.waitinSelenium();
		

	}

}
