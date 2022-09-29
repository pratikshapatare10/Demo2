package assertdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertDemo {
  
	String s1="Hi";
	String s2="Hello";
	String s3="Hi";
	String s4=null;
	
	@Test
	public void t1()
	{
		//verification point
		Assert.assertEquals(s1, s2);   //F
		System.out.println("This is hard assert in t1 method");
		Assert.assertNotNull(s2);   //p
	}
	
	@Test
	public void t2()
	{
		Assert.assertEquals(s1, s3);  //P
		System.out.println("This is hard assert in t2method");
	}
	
	@Test
	public void t3()
	{
		Assert.assertNotEquals(s1, s2);   //p
	}
	
	@Test
	public void t4()
	{
		Assert.assertNotEquals(s1, s3);  //f
	}
	
	@Test
	public void t5()
	{
		Assert.assertNull(s1);  //f
	}
	
	@Test
	public void t6()
	{
		Assert.assertNull(s4);  //p
	}
	
	@Test
	public void t7()
	{
		Assert.assertNotNull(s1);  //p
	}
	
	@Test
	public void t8()
	{
		Assert.assertNotNull(s4);  //f
	}
}
