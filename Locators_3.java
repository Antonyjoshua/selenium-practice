package com.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators_3 {

	public static void main(String[] args) {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/");
		driver.findElement(By.xpath("//ul[@class='navigation clearfix']/li[7]")).click();
		//ul[@class='navigation clearfix']/li[1]/following-sibling::li[5]-- absolute xpath for dynamic element
		System.out.println(driver.findElement(By.xpath("//nav/div[2]/ul/li[1]/following-sibling::li[5]")).getText());
		//header/div/button[1]/following-sibling::button[1]
		// Sibling - Child to parent traverse\
		//traverse is only applicable for xpath not for css
		System.out.println(driver.findElement(By.linkText("Practice")).getText());
		////ul[@class='navigation clearfix']/li[1]/parent::ul/parent::div
	}

}
