package assertdemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
 
	String s1="Hi";
	String s2="Hello";
	String s3="Hi";
	String s4=null;
	
	SoftAssert soft =new SoftAssert();
	
	@Test
	public void t1()
	{
		soft.assertEquals(s1, s2);  //F
		System.out.println("This is soft assert in t1 method");
		soft.assertNotEquals(s1, s2);  //P
		//notify -if verification gets failed
		soft.assertAll();
	}
	
	@Test
	public void t2()
	{
		soft.assertNotNull(s2);  //P
	}
}
