package com.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] arg){
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		int size = driver.findElements(By.tagName("iframe")).size();//Size is a method of findelements
		System.out.println(size);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.id("draggable")).click();
        Actions a= new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        a.dragAndDrop(source, target).build().perform();
        driver.switchTo().defaultContent();
       
	}

}
