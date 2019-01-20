package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
    public ChromeDriver driver;
    public Properties pr;
	@BeforeMethod
	public void bmethod() throws IOException
	{	
	// System.setproperty
	// chrome instance
	// url hit	
	// maximize	
	File f=new File("D:\\mybatchtesting\\org.testing.YT\\OR.properties");
	FileInputStream fi=new FileInputStream(f);
	pr=new Properties();
	pr.load(fi);	
	}
	
	@AfterMethod
	public void amethod()
	{
		// driver close
	}
	

}
