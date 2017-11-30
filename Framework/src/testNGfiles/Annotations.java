package testNGfiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@AfterMethod
	public void UserRegistration()
	{
		System.out.println("UserRegistration");
	}
	@BeforeTest
	public void VerifyPage()
	{
		System.out.println("VerifyPage");
	}
	
	@Test
	public void AOpeningBrowser()
	{
	
	//This open the browser
	System.out.println("test");
	}
@Test
public void ClickSignIn()
{
	System.out.println("ClickSignIn");

}	

}
