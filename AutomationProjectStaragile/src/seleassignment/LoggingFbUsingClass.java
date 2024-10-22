package seleassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoggingFbUsingClass {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.className("inputtext")).sendKeys("artiagec@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("#123");
	driver.findElement(By.className("_42ft")).click();
	
	//if the classname is long and separated by spaces then took one part only
	
	
			

	}

}
