package com.auto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions_class{

	public static void main(String[] args) {
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in/");
	  Actions a= new Actions(driver);
	  WebElement move = driver.findElement(By.id("nav-search-bar-form"));
	  //keydown(key shift) Press key
	  a.moveToElement(move).click().keyDown(Keys.SHIFT).sendKeys("men perfume").keyDown(Keys.ENTER).build().perform();
//	  WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-link-accountList")));
//	  WebElement move2 = driver.findElement(By.id("nav-link-accountList"));
//	  a.moveToElement(move2).contextClick().build().perform();
//	  

	}

}
