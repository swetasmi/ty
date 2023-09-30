package practice;

import org.testng.annotations.Test;

public class logintest {
	@Test
	public void test1()
	{
		System.out.println("bye");
	}
	
	@Test(groups= "smoke")
	public void test2()
	{
		System.out.println("bye2");
	}

}
