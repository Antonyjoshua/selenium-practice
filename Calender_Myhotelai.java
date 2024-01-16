package com.prac;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calender_Myhotelai {

	public static void main(String[] args) throws AWTException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testadmin.myhotelai.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement username = driver.findElement(By.xpath("//input[@type='email']"));
		username.sendKeys("info@myhotelai.com");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("pass123");
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement supplier = driver.findElement(By.xpath("(//a[text()='Supplier'])[1]"));
		Actions a= new Actions(driver);
		a.moveToElement(supplier).click();
       
	}

}
