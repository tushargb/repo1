package test_firstMaven;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class test_class1 {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Running before suite");
	}
	

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Running before class");
	}
	
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Running before method");
	}
	
	
	@Test
	public void TestCase_01()
	{
		System.out.println("Running test case 1");
	}
	
	@Test
	public void TestCase_02()
	{
		System.out.println("Running test case 2");
	}
	
	@Test
	public void TestCase_03()
	{
		System.out.println("Running test case 3");
		
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Running after method");
	}
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("Running after class");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Running after suite");
	}
	

}
