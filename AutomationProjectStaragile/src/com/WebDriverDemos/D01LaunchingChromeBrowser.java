package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D01LaunchingChromeBrowser {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.getPageSource();
		driver.getCurrentUrl();
		System.out.println("page Source is :" + driver.getPageSource());
		
		
	}

}