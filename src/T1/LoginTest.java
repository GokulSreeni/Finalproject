package T1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import P1.Login;

public class LoginTest {
	WebDriver driver;
	
	
	@BeforeTest
		public void test()
		{
			driver=new ChromeDriver();
			driver.get("https://www.ubuy.co.in/");
			driver.manage().window().maximize();
		}
	@Test
		
	public void create() throws InterruptedException
	{
	  Login ob=new Login(driver);
	  ob.setvalues("gokulunni5@gmail.com","gouthami112");
		
	}
	

}
