package com.test.zooplapages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.zooplautilities.Testbasezoopla;

public class Listpage extends Testbasezoopla{
	
     public static WebDriver driver;
     
     public Listpage(WebDriver driver) {
    	 this.driver=driver;

 		PageFactory.initElements(driver, this);
 	
 	}
   
	 @FindBy(xpath="//select[@name='results_sort']")
	 WebElement mostrecent;
	  
	 @FindBy(xpath="//ul[@class='listing-results clearfix js-gtm-list']")
	 List<WebElement> listings;
	    public void dropdownarrow() throws InterruptedException
	    {
		 Select sort=new Select(mostrecent);
		 sort.selectByVisibleText("Highest price");
		 
		 Thread.sleep(2000);
	 }
	 public void getAlltheListings() {
		 System.out.println("All the listing in the pages are:" +listings.size());
		 for(int i=0;i<listings.size();i++) {
			 System.out.println("The property:" +listings.get(i).getText());
		 }
	 }
	      public  PropertyDetailspage fifthListings() throws InterruptedException {
	      Thread.sleep(2000);
		  WebElement fifthlisting = listings.get(0).findElement(By.xpath("//li[@data-listing-id='56110824']"));
		  System.out.println("The fifith listing is:"  +fifthlisting.getText());
		  WebDriverWait wait=new WebDriverWait(driver,10);
		  wait.until(ExpectedConditions.elementToBeClickable(fifthlisting));
		  fifthlisting.click();
		  return new PropertyDetailspage(driver);
		 
		 
	 }
	 

}
