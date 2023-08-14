package P1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
WebDriver driver;
	
	By ccaccount=By.xpath("//*[@id=\"navbarDropdownthree\"]");
	By cccllick=By.xpath("//a[@href=\"https://www.ubuy.co.in/customer/account/login\"]");
	By ccemail=By.xpath("//*[@id=\"login.username\"]");
	By ccpassword=By.xpath("//*[@id=\"login.password\"]");
	By cclogin=By.xpath("//*[@id=\"login-form-btn\"]");
	By ccback=By.xpath("//img[@src=\"https://d3ulwu8fab47va.cloudfront.net/skin/frontend/default/ubuycom-v1/images/header/logo-ubuy.jpg\"]");
	public Login(WebDriver driver) {
		this.driver=driver;
	}
	public void setvalues(String email,String password) throws InterruptedException
	{
		driver.findElement(ccaccount).click();
		Thread.sleep(1500);
		driver.findElement(cccllick).click();
		driver.findElement(ccemail).sendKeys(email);
		Thread.sleep(3000);
		driver.findElement(ccpassword).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(cclogin).click();
		driver.findElement(ccback).click();
		
	}

	

}
