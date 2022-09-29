package test;

import org.testng.annotations.Test;

public class TestClass5 {
  
	@Test(groups= {"smoke", "regression"})
	public void login()
	{
		System.out.println("This is login method..");
	}
	
	@Test(groups= {"regression"})
	public void test()
	{
		System.out.println("This is test method..");
	}
	
	@Test
	public void abc()
	{
		System.out.println("This is abc method..");
	}
}
