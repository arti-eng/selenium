package SDETpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDates {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	WebElement dateoption = driver.findElement(By.xpath("//input[@id='datepicker']"));
		dateoption.click();
		String month = "April";
		String year = "2024";
		String date = "12";
		while (true){
			String monthpicker = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			if (monthpicker.equalsIgnoreCase(month)) 
				break;
			else
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			
			}
		while (true) {
			String yearPicker = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(yearPicker.equalsIgnoreCase(year)) {
				break;
				
			}
			else
				driver.findElement(By.xpath("//span[@class='ui-icon']")).click();
				
		}
		List<WebElement> dateoptions=driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']//tbody//tr/td"));
		for(WebElement ele : dateoptions) {
			String dt = ele.getText();
			if(dt.equals(date)) {
				ele.click();
				break;
			}
		
	}
				
		

	}
}


