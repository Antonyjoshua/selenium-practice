package com.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//Dynamic dropdown- Show the options based on the previous action
public class Dynamic_dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.className("select_CTXT")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@value='MAA']")).click();

//		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();//using indexes
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		//using parent to child relationship
		//div[@id='familyandfriend']  //label[text()=' Family and Friends']

	}

}




//public class Dynamic_dropdown {
//
//
//
//public static void main(String[] args) throws InterruptedException {
//
//
//WebDriver driver =new ChromeDriver();
//
//driver.get("http://spicejet.com"); //URL in the browser
//
////  //a[@value='MAA']  - Xpath for chennai
//
////  //a[@value='BLR']
//
//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//
//driver.findElement(By.xpath("//a[@value='BLR']")).click();
//
//Thread.sleep(2000);
//
////driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
//
//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
//
//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
//
//}
//
//
//
//}

