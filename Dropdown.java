package com.auto;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
//Static dropdown- Select
public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select s= new Select(dropdown);
		s.selectByIndex(2);
		String firstSelectedOption = s.getFirstSelectedOption().getText();
		System.out.println(firstSelectedOption);
		s.selectByVisibleText("USD");
		System.out.println(s.getFirstSelectedOption().getText());
		s.selectByValue("INR");
		System.out.println(s.getFirstSelectedOption().getText());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		int i=1;//local variable
		
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
	        i++; //5
		}
		
		for(i=0;i<4;i++)//no need to initialize i since it was already initialized for while loop
		{
		 driver.findElement(By.id("hrefIncChd")).click();
		}
			
		
		driver.findElement(By.xpath("//input[@value='Done']")).click();
		System.out.println("Actual Result" + driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5Adult, 4 Child");
		

	}
}

	