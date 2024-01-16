package com.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Myhotelai {

	public static void main(String[] args) {
		WebDriver driver= new EdgeDriver();
		driver.get("https://testadmin.myhotelai.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.name("email")).sendKeys("antony@yopmail.com"); 
		driver.findElement(By.cssSelector("Input[name='email']")).sendKeys("antony@yopmail.com"); //Tagname[Attribute='value']'
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("welcome@123");
		//driver.findElement(By.name("password")).sendKeys("welcome@123");
		driver.findElement(By.className("btn")).click();
		}

}
