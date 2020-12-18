package com.test.zooplautilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class Listners implements ITestListener {

	
		public static ExtentTest extentTest;

		public static ExtentReports extent = zooplabrowser.createReports();

		public void onTestStart(ITestResult result) {

			System.out.println("Test started- " + result.getName());
			extentTest = extent.startTest(result.getName());

		}

		public void onTestSuccess(ITestResult result) {
			System.out.println("Test completed successfully- " + result.getName());

			extentTest.log(LogStatus.PASS, "Test success");

		}

		public void onTestFailure(ITestResult result) {
			System.out.println("Test Failed- " + result.getName());
			extentTest.log(LogStatus.FAIL, "Test Failure");

		}

		public void onTestSkipped(ITestResult result) {
			System.out.println("Test Skipped- " + result.getName());

		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		}

		public void onStart(ITestContext context) {
			System.out.println("Started- " + context.getName());
		}

		public void onFinish(ITestContext context) {
			System.out.println("Finished- " + context.getName());
			
			extent.flush();

		}

	}

