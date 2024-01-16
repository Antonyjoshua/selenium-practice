package com.auto;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Green_Kart_Prac {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		String item= "Tomato";
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(2000);
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		//Not possible since the exact index not known to the selenium. Clicking the first item it sees
//		for (WebElement product : products) {
//			if(product.getText().equals(item))
//			{
//				String text = product.getText();
//				System.out.println(text);
//				driver.findElements(By.xpath("(//div[@class='product-action']/button)[6]"));
//				break;
//			}
//	
//		}
		for (int i = 0; i < products.size(); i++) {
			if(products.get(i).getText().contains(item))
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
			}
			
		}
		}

	}

//public class Green_Kart_Final {
//
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver= new EdgeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
//		String item= "Tomato - 1 Kg";
//		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
//		driver.manage().window().maximize();
//		clickitem(driver, item);
//	}
//	   public static void clickitem(WebDriver driver, String item) throws InterruptedException{
//		Thread.sleep(2000);
//		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
//		for (int i = 0; i < products.size(); i++) {
//			if(products.get(i).getText().contains(item))
//			{
//				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
//				break;
//				
//			}
//			
//		}
//		
//		}
//
//	
//
//}

