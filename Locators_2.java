package com.auto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;


public class Locators_2 {

	public static void main(String[] args) throws InterruptedException {
		 String name="Antony";
		 WebDriver driver= new EdgeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 String password = getpassword(driver);
		 driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("inputUsername")).sendKeys(name);
		 driver.findElement(By.name("inputPassword")).sendKeys(password);
		// Thread.sleep(2000);
		 driver.findElement(By.cssSelector("input[value='rmbrUsername']")).click();
	     driver.findElement(By.xpath("//input[@name='chkboxTwo']")).click();
		 driver.findElement(By.className("submit")).click(); 
		 Thread.sleep(2000);
		 System.out.println(driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText());
         Assert.assertEquals(driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText(), "You are successfully logged in.");
         Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Hello "+name+",");
	     driver.findElement(By.xpath("//button[contains(@class, 'logout')]")).click();
	     driver.close();
	}
	
	public static String getpassword(WebDriver driver) throws InterruptedException {
		 driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		 driver.manage().window().maximize();
		 driver.findElement(By.linkText("Forgot your password?")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		 String passwordtext= driver.findElement(By.cssSelector("form p")).getText();
//		 Please use temporary password 'rahulshettyacademy' to Login.
		 String[] passwordsplit=passwordtext.split("'");
//		 index[0]=Please use temporary password '
//	     index[1]= rahulshettyacademy' to Login.
		 String[] passwordsplit2= passwordsplit[1].split("'");
//		 index[0]=rahulshettyacademy
//	     index[1]=  to Login.
		 //String password= passwordsplit[1].split("'")[0];
		 String passwordfinal= passwordsplit2[0];
		 return passwordfinal;
	}

}
