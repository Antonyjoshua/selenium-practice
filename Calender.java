package com.auto;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.path2usa.com/travel-companions");
		//driver.findElement(By.xpath("//div[contains(@class, 'elementor-field-group-travel_comp_date')]/input")).click();
		// Scroll the Page

		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("window.scrollBy(0,1200)");

		// Click on the Date field

		Thread.sleep(3000);

		WebElement Date = driver.findElement(By.xpath("//*[@id='form-field-travel_comp_date']"));

		// js.executeScript("arguments[0].scrollIntoView(true);", Date);

		Date.click();
//		WebElement findElement = driver.findElement(By.cssSelector(".elementor-field.elementor-size-sm.elementor-field-textual.elementor-date-field.flatpickr-input"));
//		String attribute = findElement.getAttribute("class");
//		
//		System.out.println(attribute);
//		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//        jsExecutor.executeScript("arguments[0].scrollIntoView(findElement);");
//		WebElement findElement = driver.findElement(By.id("form-field-travel_comp_date"));
//
//		Actions actions = new Actions(driver);
//		actions.moveToElement(findElement).build().perform();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("findElement")));
//		findElement.click();

//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

//		Actions actions = new Actions(driver);
//		actions.moveToElement(findElement).click().build().perform();

//		 JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//	        jsExecutor.executeScript("arguments[0].click();", findElement);
//		Actions actions = new Actions(driver);
//		actions.moveToElement(findElement).click(findElement).build().perform();
		
//		if(driver.findElement(By.xpath("//div[contains(@class, 'elementor-field-group-travel_comp_date')]/input")).getAttribute("class").contains("active")) {
//			Assert.assertTrue(false);
//		}
//		else
//		{
//			System.out.println("Avolodha");
//			Assert.assertTrue(false);
//			
//		}
		driver.findElement(By.xpath("//div[contains(@class, 'elementor-field-group-travel_comp_date')]/input")).click();
	}

}
