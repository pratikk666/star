package packone;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test_testng3 {

	
	@Test()
	public void mango()
	{ System.out.println("mango");}
	
	@BeforeTest
	public void bt()
	{ System.out.println("BEGINNS three...");}
	
	
	@AfterTest
	public void at()
	{ System.out.println("endssS three...");}
	

}
