package com.test.zooplapages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Agentpage {
	public static WebDriver driver;
    
    public Agentpage(WebDriver driver) {
   	 this.driver=driver;

		PageFactory.initElements(driver, this);
	
	}
    @FindBy(xpath="//h1[@class='bottom-half']//b[1]")
    WebElement agentDetails;
    
    public String getDetailsfromAgentPage() {
    	String agentName= agentDetails.getText();
    	System.out.println("Agent name from Agent page" +agentName);
		return agentName;
    	
    }
}
