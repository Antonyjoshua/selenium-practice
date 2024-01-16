package com.auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		List<WebElement> count = driver.findElements(By.xpath("//div[@style='margin-right: 6px;']"));
		for (WebElement webElement : count) {
			String text = webElement.getText();
			System.out.println(text);
		}
		System.out.println(count.size());
		int size = driver.findElements(By.xpath("//div[@style='margin-right: 6px;']")).size();
		System.out.println(size);
//		boolean selected = driver.findElement(By.xpath("(//div[@style='margin-right: 6px;'])[1]")).isEnabled();
//		System.out.println(selected);
//		System.out.println(driver.findElement(By.xpath("(//div[@style='margin-right: 6px;'])[1]")).isSelected());
//		driver.findElement(By.xpath("(//div[@style='margin-right: 6px;'])[1]")).click();
//		System.out.println(driver.findElement(By.xpath("(//div[@style='margin-right: 6px;'])[1]")).isSelected());
		System.out.println(driver.findElement(By.xpath("(//div[@style='margin-right: 6px;'])[1]")).isEnabled());
		driver.findElement(By.xpath("(//div[@style='margin-right: 6px;'])[1]")).click();
		System.out.println(driver.findElement(By.xpath("(//div[@style='margin-right: 6px;'])[1]")).isEnabled());
        
	}
}
