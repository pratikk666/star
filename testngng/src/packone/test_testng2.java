package packone;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test_testng2 {
	

	@Test()
	public void appl()
	{ System.out.println("appples");}
	
	@BeforeTest
	public void bt()
	{ System.out.println("BEGINNS two...");}
	
	
	@AfterTest
	public void at()
	{ System.out.println("endssS two class...");}
	

}
