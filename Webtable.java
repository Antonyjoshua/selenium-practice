package com.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Webtable {

	public static void main(String[] args) {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement table = driver.findElement(By.id("product"));
		//total row
		//int size = table.findElements(By.xpath("//table/tbody/tr")).size();
		int size = table.findElements(By.tagName("tr")).size();
		System.out.println(size);
		//total column
		int size2 = table.findElements(By.xpath("//table/tbody/tr/th")).size();
		System.out.println(size2);
		//to get a particular row data
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[3]")).getText());
		

	}

}
