package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D02 {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	String actTitle;
	String expTitle="Google";
	actTitle = driver.getTitle();
	if(actTitle.equals(expTitle)) {
		System.out.println("title is same");
		}
	else
		System.out.println("not same title");
	driver.close();
	}
	
	
	
	
	
	

}

