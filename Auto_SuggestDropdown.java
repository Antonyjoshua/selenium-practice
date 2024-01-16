package com.auto;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Auto_SuggestDropdown {
//Autosuggestion dropdown- list display based on the text
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Au");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));//here xpath contains three nodes so we used findelements here
		for (WebElement option : options) //to iterate the web elements
	        //here the variable option storing single webelement 
		{
			
			if (option.getText().equalsIgnoreCase("Australia")) {
				System.out.println(option.getText());
				option.click();
			}
		}
		
	}

}
//		WebDriver driver =new EdgeDriver();
//
//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//
//		driver.findElement(By.id("autosuggest")).sendKeys("ind");
//
//		Thread.sleep(3000);
//
//		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
//
//		for(WebElement option :options)
//
//		{
//
//		if(option.getText().equalsIgnoreCase("India"))
//
//		{
//
//		option.click();
//
//		break;
//
//		}
//
//		}
//
//		}
//
//
//
//		}
//
