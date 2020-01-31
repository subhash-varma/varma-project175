package switch_commands.Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Switchto_Window_Using_Target_Property 
{

	private static final String Main_Window_DynamicID = null;

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "browsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 	  	 
		driver.get("https://epass.apcfss.in/");  
		driver.manage().window().maximize();
		
		
		String Mainwindow_Dynamic_ID=driver.getWindowHandle();
		
		
		driver.switchTo().frame("messageFrame");
		
		
		WebElement College_Reports=driver.findElement(By.xpath("//a[@href='CollegeReports.html'][contains(.,'College Reports')]"));
		College_Reports.click();
		
		
		driver.switchTo().defaultContent();
		
		
		driver.switchTo().frame("bodyFrame");
		
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//a[@href='CollegeReport.do'][contains(.,'DistrictWise Colleges Report')]")).click();
		
		
		driver.switchTo().window("_new");
		
		Thread.sleep(3000);
		
		
		
		System.out.println("Current Focused Window title is=> "+driver.getTitle());
		
		
		WebElement AC_Year=driver.findElement(By.xpath("//select[@id='acyear']"));
		new Select(AC_Year).selectByIndex(3);
		
		
		
		driver.switchTo().window(Mainwindow_Dynamic_ID);
		System.out.println("Current Focused Window title is=> "+driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		

	}

}
