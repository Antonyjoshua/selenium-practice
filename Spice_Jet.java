package com.prac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Spice_Jet {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("(//div[contains(@class, 'r-1862ga2 r-1loqt21 r-1enofrn')])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-1srvcxg'])[1]")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe']/div[2]/div[2]/div[2]/div[5]"))
				.click();
		driver.findElement(
				By.cssSelector(".css-1dbjc4n.r-1awozwy.r-16ru68a.r-y47klf.r-1loqt21.r-eu3ka.r-1otgn73.r-1aockid"))
				.click();
		if (driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e'])[2]"))
				.getAttribute("style").contains("1")) {

			Assert.assertTrue(false);//Program will start here
		} else {
			System.out.println("IsNotEnabled");
			Assert.assertTrue(true);
		}
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-zso239'])[2]")).click();
		System.out
				.println(driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e'])[2]"))
						.getAttribute("style"));
//Checking isenabled without using isenabled method
		if (driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e'])[2]"))
				.getAttribute("style").contains("1")) {
			System.out.println("IsEnabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		// int size = driver.findElements(By.xpath("//div[@style='margin-right:
		// 6px;']")).size();
//		System.out.println(size);
//		driver.findElement(By.xpath("(//div[@style='margin-right: 6px;'])[1]")).click();

	}

}
