package com.auto;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calander_Final {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.path2usa.com/travel-companions");
		// to scroll the entire page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(driver
				.findElement(By.xpath("//div[contains(@class, 'elementor-field-group-travel_comp_date')]/input"))));
		WebElement date = driver
				.findElement(By.xpath("//div[contains(@class, 'elementor-field-group-travel_comp_date')]/input"));
		date.click();
		Thread.sleep(5000L);
		// to pick the month
		// !negation- convert true to false
			while(!driver.findElement(By.xpath("//div[@class='flatpickr-month']")).getText().contains("August"))

			{

			Thread.sleep(2000);

			     driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();
		}
		// to choose the date
		List<WebElement> days = driver.findElements(By.xpath("//span[contains(@class, 'flatpickr-day ')]"));
		for (int i = 0; i < days.size(); i++) {
			Thread.sleep(2000);
			String text = driver.findElements(By.xpath("//span[contains(@class, 'flatpickr-day ')]")).get(i).getText();
			if (text.equalsIgnoreCase("31")) {
				driver.findElements(By.xpath("//span[contains(@class, 'flatpickr-day ')]")).get(i).click();
				break;
			}
		}

	}

}
