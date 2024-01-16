package com.auto;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Broken_Link {

	public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// Broken URL
		// step- 1 get all the url tied up to the link using selenium
		// if the status code >400, the url is not working--> Which is broken link
		// String attribute =
		// driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		// System.out.println(attribute);
		// openconnection is a java method which present in URL class. We can get the
		// status of a particular click without clicking and opening it
		// HttpURLConnection openConnection = (HttpURLConnection) new
		// URL(attribute).openConnection();
		// HEAD request similarly to a GET request. However, well-implemented servers
		// should handle HEAD requests appropriately by providing only the headers
		// without the body content.
//		openConnection.setRequestMethod("HEAD");
//		openConnection.connect();
//		int requestMethod = openConnection.getResponseCode();
//	    System.out.println(requestMethod);
		List<WebElement> all_link = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		// soft Assert
		SoftAssert a = new SoftAssert();
		for (WebElement link : all_link) {

			String attribute = link.getAttribute("href");
			HttpURLConnection openConnection = (HttpURLConnection) new URL(attribute).openConnection();
			openConnection.setRequestMethod("HEAD");
			openConnection.connect();
			int responseCode = openConnection.getResponseCode();
			System.out.println(responseCode);
			// store all the failed test in soft assert
			a.assertTrue(responseCode < 400,
					"The link with text" + link.getText() + "is broken link and status code is" + responseCode);
			// Asserts are validations or checkpoints for an application. Assertions state
			// confidently that application behavior is working as expected. Asserts in
			// Selenium validate the automated test cases that help testers understand if
			// tests have passed or failed. Types of Assertions.
			// Hard Assertion
			// Assert.assertTrue(responseCode < 400,
//					"The link with text" + link.getText() + "is broken link and status code is" + responseCode);
//			System.out.println(responseCode);
//			if(responseCode>400)
//			{
//				System.out.println("The link with text" +link.getText()+ "is broken link and status code is" +responseCode);
//			}

		}
		// once the test execution is completed, if it have stored any failure it will
		// fail the script at the end. if no failure is stored, it will pass the script. it
		// shouldn't stop the execution until it is fully completed
		a.assertAll();
	}

}
