package com.auto;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Wait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(5));
		String[] item = { "Cauliflower", "Brocolli", "Beetroot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		additem(driver, item);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
	}

	public static void additem(WebDriver driver, String[] item) {
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for (int i = 0; i < products.size(); i++) {
			// Brocolli - 1 Kg
			String allitem = products.get(i).getText();
			System.out.println(allitem);
			// allitem[0]=Brocolli
			// allitem[1]= 1 Kg
			String[] split = allitem.split("-");
			// removed the white space
			String formattedtext = split[0].trim();
			System.out.println(formattedtext);
			List<String> alllist = Arrays.asList(item);
			if (alllist.contains(formattedtext)) {

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

			}
		}
	}
}
