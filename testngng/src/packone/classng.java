package packone;

import org.testng.annotations.Test;



import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;



public class classng  {
	
	@Test(priority=2)
	public void m1()
	{ System.out.println("mthod one");}
	
	@Test(priority=3)
	public void m2()
	{  Assert.assertEquals("pr", "pr");
		System.out.println("mthod two");}
	

	@Test(priority=1)
	public void m3()
	{ System.out.println("mthod three");}
	
	@BeforeMethod
	public void bm()
	{ System.out.println("before each methods lol");}
	
	
	@AfterMethod
	public void am()
	{ System.out.println("aftr each methods lol");}
	
	
	@BeforeTest
	public void bt()
	{ System.out.println("BEGINNS...");}
	
	
	@AfterTest
	public void at()
	{ System.out.println("endssS...");}
	
	@BeforeClass
	 void bc()
	 {System.out.println("class ke pehle");}
	

	@AfterClass
	 void ac()
	 {System.out.println("class ke adfter");}	
	

	@BeforeSuite
	 void bs()
	 {System.out.println("god ke pehle");}
	

	@AfterSuite
	 void asu()
	 {System.out.println("god ke baad");}

}
