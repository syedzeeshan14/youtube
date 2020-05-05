package package1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class YT1 {
	@Test
	public void tt()
	{
		System.out.println("I am Test annotation");
	}
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("I am Before Suite");
	}
	
	@AfterSuite
	public void AfterSuite ()
	{
		System.out.println("I am After Suite");
	}
	@BeforeTest
	public void Beforetest ()
	{
		System.out.println("I am Before test");
	}
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("I am Before Class");
	}

	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("I am Before Method");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("I am After Method");
	}
	
	@AfterClass
	public void AfterClass ()
	{
		System.out.println("I am After Class");
	}
	
	@AfterTest
	public void AfterTest ()
	{
		System.out.println("I am After Test");
	}
	
	
}

