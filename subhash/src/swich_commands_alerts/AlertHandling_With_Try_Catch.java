package swich_commands_alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling_With_Try_Catch 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "browsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
		driver.manage().window().maximize();
		
		
		
		WebElement Search_button=driver.findElement(By.xpath("//input[@type='submit']"));
		Search_button.click();
		
		
	    try {
	    	
	    	Alert alert=driver.switchTo().alert();
			String alert_msg=alert.getText();
			System.out.println(alert_msg);
			
			Thread.sleep(3000);
			
			//Close alert window
			alert.accept();
	    
	    }catch (NoAlertPresentException e) {
	    	    System.out.println("alert not presented");
	    	    
	    }
	           System.out.println("Run Continued");
	           
			
	    } 
	    	
	    
	    	
	    
			 
		
		  
	}
	

			
	


