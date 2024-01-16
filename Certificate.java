package com.prac;



import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Certificate {

	public static void main(String[] args) {
		//to handle certificate
//		EdgeOptions ed= new EdgeOptions();
//		ed.setAcceptInsecureCerts(true);
//		WebDriver driver= new EdgeDriver(ed);
//		driver.get("https://expired.badssl.com/");
//		System.out.println(driver.getTitle());
		
		ChromeOptions options = new ChromeOptions();

		Proxy proxy = new Proxy();

		proxy.setHttpProxy("ipaddress:4444");

		options.setCapability("proxy", proxy);

		Map<String, Object> prefs = new HashMap<String, Object>();



		prefs.put("download.default_directory", "/directory/path");



		options.setExperimentalOption("prefs", prefs);

		// FirefoxOptions options1 = new FirefoxOptions();

		// options1.setAcceptInsecureCerts(true);

		// EdgeOptions options2 = new EdgeOptions();

		options.setAcceptInsecureCerts(true);

		System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");



		WebDriver driver = new ChromeDriver(options);

		driver.get("https://expired.badssl.com/");

		System.out.println(driver.getTitle());


		
		

	}

}
