package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByclassName {

	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	WebElement search=driver.findElement(By.className("gLFyf"));
	search.sendKeys("Rajnikant Jokes");
	search.sendKeys(Keys.ENTER);
	
	

	}

}
