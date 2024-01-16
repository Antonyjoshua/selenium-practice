package com.prac;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Scroll_Page {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//JavaScript executor is a class
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(5000);
		// document- to select whole page/ css selector/scroll
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List<WebElement> data = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for (int i = 0; i < data.size(); i++) {
			//convert a string into integer
			int parseInt = Integer.parseInt(data.get(i).getText());
			sum=sum+parseInt;
		    System.out.println(parseInt);
		}
		System.out.println(sum);
	     String text = driver.findElement(By.cssSelector(".totalAmount")).getText();
	    System.out.println(text);
	    String[] split = text.split(":");
	    System.out.println(split[1]);
	    String trim = split[1].trim();
	    int parseInt1 = Integer.parseInt(trim);
	    if(sum==parseInt1) {
	    	System.out.println("Both are same");
	    	
	    }
	    System.out.println(parseInt1);
	}
}
