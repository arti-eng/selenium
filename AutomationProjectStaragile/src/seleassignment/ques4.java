package seleassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ques4 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details ");
	driver.manage().window().maximize();
	Thread.sleep(4000);

	driver.findElement(By.cssSelector("input[name^='name']")).sendKeys("Arti");
	//driver.findElement(By.xpath("//input[@name^='name']")).sendKeys("Arti");
	driver.findElement(By.cssSelector("input[name^='login']")).sendKeys("arti_9090");
	driver.findElement(By.cssSelector("input#newpasswd")).sendKeys("#123");
	driver.findElement(By.cssSelector("input[name^='confirm']")).sendKeys("#123");
	
	driver.findElement(By.cssSelector("input[name^='altemail']")).sendKeys("art@gmail.com");
	driver.findElement(By.cssSelector("input#mobno")).sendKeys("98789889");
	
	
	

	

	}

}
