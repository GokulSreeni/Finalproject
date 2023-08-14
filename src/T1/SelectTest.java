package T1;

import org.testng.annotations.Test;

import P1.Select;

public class SelectTest extends SearchTest {
	@Test(priority=3)
    public void test3() throws InterruptedException
{
	Select ob=new Select(driver);
	ob.shopping();
}


}
