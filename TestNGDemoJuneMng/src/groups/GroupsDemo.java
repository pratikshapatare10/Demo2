package groups;

import org.testng.annotations.Test;

public class GroupsDemo {
 
	@Test(groups= {"sanity"})
	public void t1()
	{
		System.out.println("This is t1 method");
	}
	
	@Test(groups= {"regression"})
	public void t2()
	{
		
		System.out.println("This is t2 method");
	}
	
	@Test(groups= {"sanity","regression"})
	public void t3()
	{
		System.out.println("This is t3 method");
	}
}
