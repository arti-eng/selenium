package seleassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ques5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f ");
		driver.findElement(By.id("txtCustomerID")).sendKeys("Arti");
		driver.findElement(By.id("txtPassword")).sendKeys("12345");
		
		
		
		
		
		

	}

}
