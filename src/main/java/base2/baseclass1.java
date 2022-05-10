package base2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class baseclass1 {
	
	
	@BeforeSuite
	public void Before_suite()
	{
		System.out.println("Before suite");
	}
	@BeforeTest   //It will run before the first @Test
	public void Before_Test()
	{
		System.out.println("Before test");
	}
		
	@BeforeMethod
	public void Before_Method()
	{
		System.out.println("Before method");
	}
	
	@AfterMethod  //It will be applicaple for every @Test
	public void After_Method()
	{
		System.out.println("After method");
	}
	
	@AfterTest  //It will run after all @Test
	public void After_Test()
	{
		System.out.println("After test");
	}

	@AfterSuite
	public void After_Suite()
	{
		System.out.println("After suite");
	}

}
