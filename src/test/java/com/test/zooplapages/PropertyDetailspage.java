package com.test.zooplapages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PropertyDetailspage{
	public static WebDriver driver;

	public PropertyDetailspage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath ="//div[@class='ui-agent__text'] //h4[@class='ui-agent__name'][1]")
	WebElement agentName;

	  public String getAgentName() {
		  WebDriverWait wait=new WebDriverWait(driver,10);
		  WebElement clickontext=wait.until(ExpectedConditions.visibilityOf(agentName));
		  return clickontext.getText();

		/*String AgentNameDetails = agentName.getText();
		System.out.println("Agentname Details from Property Details page:" + AgentNameDetails);
		return AgentNameDetails;*/
		  
		

	}

	public Agentpage onClickAgentName() {
		agentName.click();
		return new Agentpage(driver);

	}

}
