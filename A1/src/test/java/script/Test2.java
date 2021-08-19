package script;

import org.testng.Reporter;
import org.testng.annotations.Test;
import generic.BaseTest;

public class Test2 extends BaseTest{
	@Test(priority = 1)
	public void testA()
	{
		Reporter.log("testA",true);
	}
}
