package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@BeforeClass
	public void bfclass()
	{
		System.out.println("i am execute before class started");
	}
	@AfterClass
	public void afclass()
	{
		System.out.println("i am execute once class is completed");
	}
	
	@BeforeSuite
	
	public void bfsuite()
	{
		System.out.println("i am no1");
	}
	@BeforeMethod
	
	public void bfeverymethod()
	{
		System.out.println("i am execute before every menthod in class 3");
	}
@AfterMethod
	
	public void afeverymethod()
	{
		System.out.println("i am execute after every menthod in class 3");
	}
@Parameters("URL")
	@Test
	
	public void Weblogincar(String urlname1)
	{
		System.out.println("Weblogincar");
		System.out.println(urlname1);
	}

	@Test
	public void Mobilelogincar()
	{
		System.out.println("mobilelogincar");
	}
	@Test(groups= {"smoke"})
	public void Mobilesignincar()
	{
		System.out.println("mobilesigncar");
	}
	@Test
	public void Mobilesignoutcar()
	{
		System.out.println("mobilesignoutcar");
	}
	@Test
	public void apilogincar()
	{
		System.out.println("apilogincar");
	}
}
