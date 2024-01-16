package com.prac;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autosuggestion_DD {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//	  driver.findElement(By.id("autocomplete")).sendKeys("ind");
//		Thread.sleep(3000);
//      List<WebElement> dd = driver.findElements(By.xpath("//li[@class='ui-menu-item']/div"));
//	 for (WebElement dt : dd) {
//		if(dt.getText().equalsIgnoreCase("India"))
//		{
//			dt.click();
//		}
//	}

		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("autocomplete"))).click().sendKeys("ind").build().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

	}
}

//WebDriver driver = new ChromeDriver();
//
//driver.get("http://qaclickacademy.com/practice.php");
//
//driver.findElement(By.id("autocomplete")).sendKeys("ind");
//
//Thread.sleep(2000);
//
//driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
//
//driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
//To get the text entered into an input element, use element. get_attribute("value") where element is the input element. The attribute text is used to get the text from the tags within an element.
//
//System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 
//
//driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);
//
//   
//
//   
//
//}
//
//}