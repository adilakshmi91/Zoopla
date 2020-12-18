package com.test.zooplaTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.zooplapages.Agentpage;
import com.test.zooplapages.Homepage;
import com.test.zooplapages.Listpage;
import com.test.zooplapages.PropertyDetailspage;
import com.test.zooplautilities.Testbasezoopla;

public class zooplahome extends Testbasezoopla {

	Homepage home;
	Listpage list;
	PropertyDetailspage property;
	Agentpage agent;

	@Test
	public void appurl() throws Exception {
		// opening home page
		home = new Homepage(driver);

		Thread.sleep(5000);

		/*
		 * // Asserting the title String expectedTitle =
		 * "Search property to Buy, Rent, House Prices, Estate Agents"; String
		 * actualTitle = driver.getTitle(); System.out.println(actualTitle);
		 * Assert.assertTrue(actualTitle.contains(expectedTitle));
		 */

		// Enter the text london and click on submit
		home.entervalue();
		list = home.searchbutton();

		// clicking on low to high list
		list = new Listpage(driver);
		list.dropdownarrow();

		// getting all the listings
		list.getAlltheListings();

		// selecting the fifth list
		property = list.fifthListings();

		// getting Agent details on next page

		property = new PropertyDetailspage(driver);
		String agentfrompropertypage = property.getAgentName();

		// click on the name link to get into the agent's page
		agent=property.onClickAgentName();
		Thread.sleep(1000);

		// check that the properties belongs to same page
		agent = new Agentpage(driver);
		String agentfromagentpage = agent.getDetailsfromAgentPage();
		Assert.assertTrue(agentfromagentpage.contains(agentfromagentpage));

	}
}