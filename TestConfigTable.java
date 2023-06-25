package DemoTable;

public class TestConfigTable extends Config {

	public static void main(String[] args) {
		TestConfigTable obj=new  TestConfigTable();
		obj.driverSetting("file:///C:/Users/pwaware/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		obj.loginAccess();
		obj.dashBoard();
		obj.operatorsDashboard();
		obj.usefulLinks();
		obj.downLoads();
		obj.logOut();

	}

}
		
