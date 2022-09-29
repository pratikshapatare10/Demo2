package test;

import org.testng.annotations.Test;

public class TestClass3 {
  
	@Test
	public void login()
	{
		System.out.println("This is login method..");
	}
	
	@Test(timeOut=5000)
	public void test()
	{
		System.out.println("This is test method..");
	}
	
	@Test(enabled=false)
	public void abc()
	{
		System.out.println("This is abc method..");
	}
}
