package switch_commands.Windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Required_Window_From_Multiple_Windows 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "browsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 	  	 
		driver.get("https://www.cleartrip.com/trains");  
		driver.manage().window().maximize(); 
		
		
		driver.findElement(By.xpath("//a[contains(@title,'Check PNR Status')]")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[@title='Rail Tour Packages']")).click();
		Thread.sleep(2000);
		
		Set<String> AllWindow_IDS=driver.getWindowHandles();
		
		
		for (String EachwindowID : AllWindow_IDS) 
		{
			driver.switchTo().window(EachwindowID);
			
			String Runtime_Title=driver.getTitle();
			System.out.println(Runtime_Title);
			
			if(Runtime_Title.contains("Rail Tour Packages"))
			{
				break;
				
			}	
			
		}
		
		
		System.out.println("Focused Window title is==> "+driver.getTitle());
		
	
			
		
		
		
		
		
		
		

	}

}
