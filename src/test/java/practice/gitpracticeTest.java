package practice;

import org.testng.annotations.Test;

public class gitpracticeTest {
	@Test
	public void demo()
	{
		System.out.println("hii");
	}
	@Test(groups="smoke")
	public void test()
	{
		System.out.println("hello");
	}
	

}
