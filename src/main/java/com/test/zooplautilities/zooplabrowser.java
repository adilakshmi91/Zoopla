package com.test.zooplautilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;

import io.github.bonigarcia.wdm.WebDriverManager;

public class zooplabrowser extends Testbasezoopla {
	public static WebDriver driver;
	public static ExtentReports reports;

	public static WebDriver lauchingbrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.get("https://www.zoopla.co.uk/");
		return driver;

	}

	public static ExtentReports createReports() {
		String uniquedate = new SimpleDateFormat("'sample 'yyyymmddHHmm''").format(new Date());
		String path = System.getProperty("user.dir") + "//zooplareport//Report" + uniquedate + ".html";
		reports = new ExtentReports(path);
		return reports;
	}

	public WebDriver quitbrowser() {
		driver.quit();
		return driver;
	}

}
