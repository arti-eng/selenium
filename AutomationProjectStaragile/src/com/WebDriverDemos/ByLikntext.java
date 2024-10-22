package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLikntext {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	//Partial link
	String PLinktext = driver.findElement(By.partialLinkText("Search")).getText();
	System.out.println("link Text :" + PLinktext);
	//link
	String Linktext = driver.findElement(By.linkText("Images")).getText();
	System.out.println("link Text :" + Linktext);
	//get all the  links
	List<WebElement>links =  driver.findElements(By.tagName("a"));
	System.out.println("Total no. of links are : " + links.size());
	for(WebElement ele : links) {
		String text = ele.getText();
		System.out.println("Text : " + text);
		
		
	}

	}

}
