
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

public class relativeXpath {

	public static void main(String[] args) {
		

		

				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://facebook.com/");
				
				driver.findElement(By.xpath("//form[@class=\"_9vtf\"]/div/div/input")).sendKeys("ankushvankore@gmail.com");
				driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("123456799");
				driver.findElement(By.tagName("button")).click();
				
			}

		

	}


