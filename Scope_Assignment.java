package com.prac;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scope_Assignment {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption3")).click();
		String text = driver.findElement(By.xpath("html/body/div/div[4]/fieldset/label[3]")).getText();
		System.out.println(text);
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dropdown);
		s.selectByVisibleText(text);
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		if (alert.getText().contains(text)) {
			
			String text2 = alert.getText();
			System.out.println("Given text is present in the Alert");
			System.out.println(text2);
		
		}
		//alert.dismiss();
		
		
		
	}

}
