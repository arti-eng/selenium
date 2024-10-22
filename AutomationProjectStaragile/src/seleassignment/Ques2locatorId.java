package seleassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques2locatorId {

	public static void main(String[] args) {
		
		// LOGIN IN USING ID LOCATOR
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		driver.manage().window().maximize();
		//sending the keys to Username
		driver.findElement(By.id("txtCustomerID")).sendKeys("artiagarwal");
		//sending the keys to password
		driver.findElement(By.id("txtPassword")).sendKeys("12345");
		//Click on login button
		driver.findElement(By.id("Butsub")).click();
		
		
		//LOGIN IN USING NAME LOCATOR
		//Ask question Why the result is not write when istead of launching the page 
		//again we are refreshing the page
		//.navigate().refresh();
	
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		driver.manage().window().maximize();
	
		driver.findElement(By.name("txtCustomerID")).sendKeys("artiagarwal");
		//sending the keys to password
		driver.findElement(By.name("txtPassword")).sendKeys("12345");
		//Click on login button
		driver.findElement(By.name("Butsub")).click();
		
		//	READ THE ERROR MESSAGE
		WebElement errmsg = driver.findElement(By.id("lblMsg"));
		String msg = errmsg.getText();
		if(msg.contains("Invalid")){
			System.out.println("Test case failed");
		}
		else {
			System.out.println("Test case passed");
		}
		
		
		

		
	

	}

}
