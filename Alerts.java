package com.auto;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerts {

	private static String text;

	public static void main(String[] args) {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("Antony");
		driver.findElement(By.id("alertbtn")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
        driver.findElement(By.cssSelector("input[id='confirmbtn']")).click();
        System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
       
	}

}
