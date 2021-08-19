package script;


import org.testng.Reporter;
import org.testng.annotations.Test;
import generic.BaseTest;

public class Test3 extends BaseTest{
	@Test(priority = 2)
	public void testB()
	{
		Reporter.log("testB",true);
	}
}
