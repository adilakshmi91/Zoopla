package com.test.zooplautilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Testbasezoopla {
	
	
	public static zooplabrowser zoopbrow=new zooplabrowser();
	
	public static WebDriver driver;
	  
	@BeforeSuite
	    public void  launchzoopla()throws Exception{
		driver=zoopbrow.lauchingbrowser();
	}
	@AfterSuite
	    public void closezoopla()throws Exception {
	    	driver=zoopbrow.quitbrowser();
	    }

}
