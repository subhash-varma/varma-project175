package swich_commands.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Alert 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "browsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
		driver.manage().window().maximize();
		
		
		WebElement Search_button=driver.findElement(By.xpath("//input[@type='submit']"));
		Search_button.click();
		
		Alert alert=driver.switchTo().alert();
		
		
		//Get text displayed at alert window
		String alert_msg=alert.getText();
		
		
		//Static timeout
		Thread.sleep(3000);
		
		//close alert window
		alert.accept();
		

	}

}
