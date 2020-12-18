package com.test.zooplapages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.zooplautilities.Testbasezoopla;

public class Homepage extends Testbasezoopla{
	
	public static WebDriver driver;
	
	@FindBy(id="search-input-location")
	WebElement textbox;
	
	@FindBy(id="search-submit")
	WebElement button;
	
	public Homepage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	
	}
      //input location and click
	    public void entervalue() {
		textbox.sendKeys("london");
		}
	       public Listpage searchbutton() {
	    	button.click();
	    	return new Listpage(driver);
	    			
	    }
	

		
	}
	


