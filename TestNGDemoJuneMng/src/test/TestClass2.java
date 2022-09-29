package test;

import org.testng.annotations.Test;

public class TestClass2 {
 
	@Test(priority=1,invocationCount=3)
	public void login()
	{
		System.out.println("This is login method..");
	}
	
	@Test(priority=2)
	public void test()
	{
		System.out.println("This is test method..");
	}
	
	@Test(priority=3)
	public void abc()
	{
		System.out.println("This is abc method..");
	}
}
