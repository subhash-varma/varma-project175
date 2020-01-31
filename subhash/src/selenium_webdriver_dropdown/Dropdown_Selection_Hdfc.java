package selenium_webdriver_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selection_Hdfc {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "browsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");       
		driver.manage().window().maximize(); 
		
		
		new Select(driver.findElement(By.id("customState"))).selectByVisibleText("Telangana");
		
		
		Thread.sleep(3000);
		new Select(driver.findElement(By.id("customCity"))).selectByValue("hyderabad");
		
		driver.findElement(By.id("customLocality")).clear();
		driver.findElement(By.id("customLocality")).sendKeys("Nampally");
		
		new Select(driver.findElement(By.id("customRadius"))).selectByIndex(4);
		
		driver.findElement(By.id("amenity_category_order_types49")).click();
		
		driver.findElement(By.xpath("//input[@value='SEARCH']")).click();
		
		
		
		
		
		
		
		
		

	}

}
