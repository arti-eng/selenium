package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D02LocateByid {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			driver.findElement(By.id("email")).sendKeys("arti");
			driver.findElement(By.id("pass")).sendKeys("1234");
		   // driver.findElement(By.name("login")).click();
		    driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
			

	}

}
