package com.prac;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_Window {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.linkText("Multiple Windows"))).click().build().perform();//a[href*='windows']
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> it = windowHandles.iterator();
		String parent_Wd = it.next();//returns the next element in the iteration
		String child_Wd = it.next();
		driver.switchTo().window(child_Wd);
		String child = driver.findElement(By.xpath("/html/body/div/h3")).getText();
		System.out.println(child);
		driver.switchTo().window(parent_Wd);
		String parent = driver.findElement(By.xpath("/html/body/div[2]/div/div/h3")).getText();
		System.out.println(parent);
        
	}

}
