package T1;

import org.testng.annotations.Test;

import P1.Logout;

public class LogoutTest extends SelectTest {
	@Test(priority=4)
    public void test4() throws InterruptedException
{
	Logout ob=new Logout(driver);
	ob.logout();
}

}
