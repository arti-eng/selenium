package SDETpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
	WebDriver driver  = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	//RIGHT CLICK
	
	WebElement button=driver.findElement(By.xpath("//div[@class = 'dropdown']/button"));
	Actions act = new Actions(driver);
	act.contextClick(button).perform();
	
	//DOUBLE CLICK
	
	
	
	
	
	

	}

}
