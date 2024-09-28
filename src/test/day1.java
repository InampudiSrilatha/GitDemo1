package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	
@AfterSuite
	
	public void bfsuite()
	{
		System.out.println("i am last no1");
	}

	@AfterTest
	public void postrequisit()
	{
		System.out.println("i will execute last");
	}
	@Parameters ({ "URL" })
	@Test
	public void demo(String urlname)
	{
		System.out.println("hello");
		System.out.println(urlname);
		System.out.println("hello first time");
		System.out.println("hello by amerian guy");
	}
	@Parameters ({ "URL" })
	@Test
	public void demo1(String urlname)
	{
		System.out.println("hello");
		System.out.println(urlname);
		System.out.println("hello first time by developer");
		System.out.println("hello by amerian guy by developer");
	}
	@Test
	public void demo1()
	{
		System.out.println("bye");
		Assert.assertTrue(false);
	}

}
