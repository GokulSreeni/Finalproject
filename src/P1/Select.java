package P1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Select {
	WebDriver driver;
	By ccviewcart=By.xpath("/html/body/header/div/div[2]/nav/div[3]/ul/li[4]/a/img");
	By ccdelete=By.xpath("//*[@id=\"cart-popup-items\"]/div/div[1]/div[2]/div[2]/div/div[1]/button");
	By ccremove=By.xpath("//*[@id=\"ubuy-confirm-modal-btn1\"]");
	By cconline=By.xpath("//*[@id=\"cart-popup-items\"]/p[3]/a");
	By ccuser=By.xpath("//*[@id=\"navbarDropdownthree\"]");
	public Select(WebDriver driver) {
		this.driver=driver;
	}
	public void shopping() throws InterruptedException
	{	
		driver.findElement(ccviewcart).click();
		Thread.sleep(3000);
		driver.findElement(ccdelete).click();
		Thread.sleep(3000);
		driver.findElement(ccremove).click();
		Thread.sleep(3000);
		driver.findElement(cconline).click();
		Thread.sleep(3000);
	}


}
