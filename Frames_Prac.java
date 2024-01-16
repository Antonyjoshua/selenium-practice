package com.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames_Prac {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("a[href*='nested'"))).click().build().perform();
		System.out.println(driver.findElements(By.tagName("frameset")).size());
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		String text = driver.findElement(By.xpath("//div[@id='content']")).getText();
		System.out.println(text);

	}

}
