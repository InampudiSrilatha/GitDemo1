package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day4 {
	@Test
	public void WebloginHome()
	{
		System.out.println("Webloginhome");
	}

	@Test(dependsOnMethods={"WebloginHome"})
	public void MobileloginHome()
	{
		System.out.println("mobileloginhome");
	}
	@Test(dataProvider ="getData")
	public void apiloginHome(String uname, String password)
	{
		System.out.println("apiloginhome");
		System.out.println(uname);
		System.out.println(password);
		
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0] = "username1";
		data[0][1] = "pwd1";
		
		data[1][0] = "username2";
		data[1][1] = "pwd2";
		
		data[2][0] = "username3";
		data[2][1] = "pwd3";
		
		return data;
		
	}
	}

