package com.auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SpiceJet {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
//		List<WebElement> count = driver.findElements(By.xpath("//input[@type='checkbox']/following-sibling::label"));
//		for (WebElement webElement : count) {
//			String text = webElement.getText();
//			System.out.println(text);
//		}
		driver.findElement(By.xpath("(//div[contains(@class, 'r-1862ga2 r-1loqt21 r-1enofrn')])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-1srvcxg'])[1]")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe']/div[2]/div[2]/div[2]/div[5]"))
				.click();
		// div[@class='css-1dbjc4n r-b5h31w r-95jzfe']/div[2]/div[2]/div[2]/div[5]
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());

	}

}
