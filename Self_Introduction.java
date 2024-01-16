
package com.auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Self_Introduction {

	public static void main(String[] args) {
		//invoking Browsers
        //Chrome- Chrome Driver( Class)-> Methods
		//Webdriver (interface) 
		//chromeDriver.exe-->chromeBrowser
		//Steps to invoke chrome driver
		//Manually
		//System.setproperty("webdriver.chrome.driver", "path of the exe file.exe")
		//Selenium manager -->automatically invoke the chromedriver 
		WebDriver driver= new EdgeDriver();
		driver.get("https://admin.myhotelai.com/");
		//String title=driver.getTitle();
		//System.out.println(title);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.close();//close the current window
		//driver.quit();//close the entire driver, close all the associated browser
		String[] s= {"nam1","hg","uhi"};
		for(int i=0; i<s.length;i++)
		
		{
			System.out.println(s[i]);
		}
		String str=("Antony");
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
		
	}

}
