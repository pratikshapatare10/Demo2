package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass1 {
 
	@Test
	public void login()
	{
		System.out.println("This is login method..");
	}
	
	@Test
	public void test()
	{
		System.out.println("This is test method..");
	}
	
	@Test
	public void abc()
	{
		System.out.println("This is abc method..");
	}
	
	//we can fail any test case forcefully
	@Test
	public void test2()
	{
		Assert.fail();
	}
}
