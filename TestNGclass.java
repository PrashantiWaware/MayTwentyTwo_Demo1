package DemoTESTNG;

import org.testng.annotations.Test;

public class TestNGclass {
	@Test(priority=1)
	public void aTest() {
		System.out.println("----atest execute---");
		
	}
	
	@Test(priority=2)
	public void lTest() {
		System.out.println("---lTest Execute---");
	}
	
	
	@Test(priority=3)
	public void bTest() {
		System.out.println("-----bTest execute---");
	}

}
