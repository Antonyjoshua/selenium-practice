package com.prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
//		driver.findElement(By.id("checkBoxOption1")).click();
//		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
//		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
//		driver.findElement(By.id("checkBoxOption1")).click();
//		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
//		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
//        List<WebElement> count = driver.findElements(By.xpath("//input[@type='checkbox']"));
//        System.out.println(count.size());
		driver.findElement(By.xpath("//input[contains(@class,'form-control ng-un')]")).sendKeys("Tester");
		driver.findElement(By.name("email")).sendKeys("tester@yopmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("welcome@123");
		driver.findElement(By.id("exampleCheck1")).click();;
        WebElement gender = driver.findElement(By.id("exampleFormControlSelect1"));
        Select s = new Select(gender);
        s.selectByVisibleText("Female");
        System.out.println(driver.findElement(By.id("inlineRadio2")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("inlineRadio2")).isSelected());
        driver.findElement(By.id("inlineRadio2")).click();
        System.out.println(driver.findElement(By.id("inlineRadio2")).isSelected());
        System.out.println(driver.findElement(By.id("inlineRadio2")).isEnabled());
        boolean enabled = driver.findElement(By.id("inlineRadio3")).isEnabled();
        System.out.println(enabled);
        System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).size());
        driver.findElement(By.name("bday")).sendKeys("12/24/2000");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        System.out.println("Result:" + driver.findElement(By.className("alert")).getText());
        
        
	}

}
