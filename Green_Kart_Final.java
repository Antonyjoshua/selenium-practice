package com.prac;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Green_Kart_Final {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver= new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
			String[] item= {"Cauliflower - 1 Kg","Brocolli","Beetroot"};
			driver.get("https://rahulshettyacademy.com/seleniumPractise/");
			Thread.sleep(3000);
			List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
			for (int i = 0; i < products.size(); i++) 
			{
				//Brocolli - 1 Kg
				String allitem = products.get(i).getText();
				System.out.println(allitem);
				//allitem[0]=Brocolli 
				//allitem[1]= 1 Kg
				String[] split = allitem.split("-");
				//removed the white space
				String formattedtext = split[0].trim();
				System.out.println(formattedtext);
				List<String> alllist = Arrays.asList(item);
				if (alllist.contains(formattedtext)) {
					
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					
				}
			}
			}
			
			
	
		}


