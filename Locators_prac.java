package com.auto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators_prac {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver= new EdgeDriver();
	 driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 driver.findElement(By.id("inputUsername")).sendKeys("Antony");
	 driver.findElement(By.name("inputPassword")).sendKeys("welcome@123");
	 driver.findElement(By.className("submit")).click(); //If there is a space b/w two words inside the class then it is considered as two class, we can use any one of that
	 
	 String text = driver.findElement(By.cssSelector("p.error")).getText();//tagname.classname
     System.out.println("The obtained result is:" +text);
     driver.findElement(By.linkText("Forgot your password?")).click();
     driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Tester");
     driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("test@yopmail.com");
     Thread.sleep(5000);
     driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
     driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("tester@yopmail.com");
     /*tagname[attribute name='value']:nth-child(index value) */
     driver.findElement(By.xpath("//form/input[3]")).sendKeys("8748378278");
     /*//parenttagname/childtagname[index]*/
     driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
     /*//.clasname]*/
     String text1 = driver.findElement(By.cssSelector("form p")).getText();
     /*parenttagname childtagname*/
     System.out.println("The new password is:" +text1);
     driver.findElement(By.xpath("//div[contains(.,'Go to Login')]/button[1]")).click();
     Thread.sleep(5000);
     driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Tester");
     //#tagnameIdvalue
     driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
     driver.findElement(By.cssSelector("input[value='rmbrUsername']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//input[@name='chkboxTwo']")).click();
     driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

	}

}
