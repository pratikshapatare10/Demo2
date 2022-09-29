package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass4 {
 
	@Test
	public void login()
	{
		Assert.fail();
		System.out.println("This is login method..");
	}
	
	@Test(dependsOnMethods= {"login"})
	public void verifyLogo()
	{
		System.out.println("This is verifyLogo method..");
	}
	
}
