package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D02LocateByName {

	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement emailid = driver.findElement(By.name("email"));
		emailid.sendKeys("artiagec@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("123455");
		WebElement loginButton = driver.findElement(By.name("login"));
		
		loginButton.click();
	
		
		

	}

}
