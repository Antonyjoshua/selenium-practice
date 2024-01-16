package com.prac;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Assignment {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//label/span[@class='checkmark'])[2]")).click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement type = driver.findElement(By.xpath("//select[@data-style='btn-info']"));
		Select s = new Select(type);
		s.selectByValue("consult");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-info']")));
		List<WebElement> additem = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		for (int i = 0; i < additem.size(); i++) {
			additem.get(i).click();

		}
		driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Checkout')]")));
		driver.findElement(By.xpath("//button[contains(text(),'Checkout')]")).click();

	}

}
