package com.prac;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieExample {
    public static void main(String[] args) throws AWTException {
        
        // Create an instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the login page
        driver.get("https://testadmin.myhotelai.com");

        // Perform login actions...
        
        WebElement username = driver.findElement(By.xpath("//input[@type='email']"));
		username.sendKeys("info@myhotelai.com");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("pass123");
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

        // Capture and print all cookies
        System.out.println("All Cookies: " + driver.manage().getCookies());

        // Add a new cookie
        Cookie newCookie = new Cookie("user_type", "premium");
        driver.manage().addCookie(newCookie);

        // Print cookies after adding a new one
        System.out.println("Cookies after adding a new one: " + driver.manage().getCookies());

        // Perform logout actions...
 
        // Delete a specific cookie by name
        driver.manage().deleteCookieNamed("user_type");

        // Print cookies after deleting a specific one
        System.out.println("Cookies after deleting a specific one: " + driver.manage().getCookies());

        // Close the browser
        driver.quit();
    }
}
