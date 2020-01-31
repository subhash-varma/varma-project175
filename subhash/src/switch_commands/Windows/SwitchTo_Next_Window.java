package switch_commands.Windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Next_Window 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "browsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 	  	 
		driver.get("https://www.facebook.com/");  
		
		driver.manage().window().maximize();
		
		String Mainwindow_ID=driver.getWindowHandle();
		
		
		WebElement Instagram_Link=driver.findElement(By.xpath("//a[contains(.,'Instagram')]"));
		Instagram_Link.click();
		
		Set<String> Allwindow_IDS=driver.getWindowHandles();
		
		
		for (String EachwindowID : Allwindow_IDS) 
		{
			if(!EachwindowID.equals(Mainwindow_ID))
			{
				driver.switchTo().window(EachwindowID);
				break;
				
			}
			
		}
		
		Thread.sleep(3000);
		System.out.println("Current Focused window title is => "+driver.getTitle());
		
		
		WebElement Mobile_Num=driver.findElement(By.xpath("//input[@name='emailOrPhone']"));
		Mobile_Num.clear();
		Mobile_Num.sendKeys("9676723976");
		
		
		driver.switchTo().window(Mainwindow_ID);
		
		
		WebElement Email_EB=driver.findElement(By.id("email"));
		Email_EB.clear();
		Email_EB.sendKeys("9676723976");
		
	
		
		
		
		
	
		
		

	}

}
