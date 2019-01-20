package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.BaseClass;
import org.testing.Pages.Login;
import org.testng.annotations.Test;

public class TC1 extends BaseClass
{
	@Test
	public void testcase1()
	{
	 Login l=new Login(driver,pr);
	 l.signin("DeepakChanana", "password1");
	
	}

}
