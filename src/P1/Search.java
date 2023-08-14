package P1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {
	WebDriver driver;
	By ccsearch=By.xpath("//input[@title=\"Search\"]");
	By ccclick=By.xpath("//*[@id=\"search-form\"]/button/em");
	By ccproduct=By.xpath("//*[@id=\"usstore-products\"]/div[2]/div/a/figure/img");
    By ccselect=By.xpath("//button[@type='button' and @class='btn btn-primary add-to-cart-btn' and @id='add-to-cart-btn']");
    By ccConti=By.xpath("//*[@id=\"addToCartPopup\"]/div/div/div[2]/div[2]/div/a[1]");
    public Search(WebDriver driver) {
		this.driver=driver;
	}
	public void search1(String search) throws InterruptedException
	{
		Thread.sleep(2000);
	    driver.findElement(ccsearch).sendKeys(search);
	    Thread.sleep(3000);
	    driver.findElement(ccclick).click();
	    Thread.sleep(3000);
		driver.findElement(ccproduct).click();
		Thread.sleep(3000);
		String parenthandle=driver.getWindowHandle();
		
		Set<String>handles=driver.getWindowHandles();
		for(String h:handles)
		{
			if(!h.equals(parenthandle))
				{
				  driver.switchTo().window(h);
				  Thread.sleep(3000);
				  driver.findElement(ccselect).click();
				  
				}
			
		}
		Thread.sleep(3000);
		driver.findElement(ccConti).click();	
		
	}
	

}
