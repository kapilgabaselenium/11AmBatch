package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.BaseClass;
import org.testing.Pages.Login;
import org.testng.annotations.Test;

public class TC2 extends BaseClass
{
	
	@Test
	public void testcase2()
	{
		Login l=new Login(driver, pr);
		l.signin("sdeepa","sdfdgfb");
	}

}
