package com.auto;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSuggestionDropDown {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("ja");
		Thread.sleep(3000);
	    String chord = Keys.chord(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(chord);
		driver.findElement(By.id("autocomplete")).sendKeys(chord);
		driver.findElement(By.id("autocomplete")).sendKeys(chord);
		//casting jse
		//jse is an interface. Used to identify hidden element
        JavascriptExecutor js= (JavascriptExecutor) driver;
        String inputValue=(String) js.executeScript("return document.getElementById('autocomplete').value;");
        System.out.println("Input Value: " + inputValue);
        //casting the driver with the takesscreenshot method.
	    TakesScreenshot ts= (TakesScreenshot) driver;
	    File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenshotAs, new File ("C:\\Users\\ACW USER\\eclipse-workspace\\Selenium\\target.png"));
	}

}
