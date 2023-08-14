package T1;

import org.testng.annotations.Test;

import P1.Search;

public class SearchTest extends LoginTest {
	
	@Test(priority=2)
	    public void test2() throws InterruptedException
	{
		Search ob=new Search(driver);
		ob.search1("men night nivea cream moisturizer for face");
}


}
