package P1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
	WebDriver driver;
	By ccuser=By.xpath("//*[@id=\"navbarDropdownthree\"]");
	By cclogout=By.xpath("/html/body/header/div/div[2]/div/nav/div[3]/ul/li[4]/ul/li[5]/a/span");
    public Logout(WebDriver driver) {
		this.driver=driver;
	}
	public void logout() throws InterruptedException 
	{
		driver.findElement(ccuser).click();
		Thread.sleep(3000);
		driver.findElement(cclogout).click();

	}

}
