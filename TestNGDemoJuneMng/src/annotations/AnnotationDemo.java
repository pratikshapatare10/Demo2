package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationDemo {
 
	@BeforeSuite
	public void s1()
	{
		System.out.println("This is before suite annotation");
	}
	
	@BeforeClass
	public void c1()
	{
		System.out.println("This is before class annotation");
	}
	
	@BeforeMethod
	public void m1()
	{
		System.out.println("This is before method annotation");
	}
	
	@Test
	public void test1()
	{
		System.out.println("This is test1 method..");
	}
	
	
	@Test
	public void test2()
	{
		System.out.println("This is test2 method..");
	}
	
	@AfterMethod
	public void m2()
	{
		System.out.println("This is after method annotation");
	}
	
	@AfterClass
	public void c2()
	{
		System.out.println("This is after class annotation");
	}
	
	@AfterSuite
	public void s2()
	{
		System.out.println("This is after suite annotation");
	}
}
