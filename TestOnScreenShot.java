package ScreenShot;

public class TestOnScreenShot extends Config{

	public static void main(String[] args) {
		TestOnScreenShot obj=new TestOnScreenShot();
		obj.driverSetting("https://www.qa.jbktest.com/");
		obj.takeScreenShot();
	

	}

}
