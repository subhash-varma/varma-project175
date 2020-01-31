package selenium_webdriver_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selection_Multiple_Dropdown_Options 
{

	public static void main(String[] args) throws exception
	{
		
		System.setProperty("webdriver.chrome.driver", "browsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");       
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		((JavascriptExecutor)driver).executeScript("document.getElementById('customState')"
				
				+ ".setAttribute('multiple','multiple')");
		
		Thread.sleep(5000);
		
		boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Dropdoen Multiple Selection status is = "+flag);
		
		//Write decision statement to accept execution on multiple selection type.
		
		if(flag==true)
		{
			//Write multiple selection commands to make multiple option selection dropdown
			
			Select StateDropdown=new Select(driver.findElement(By.id("customState")));
			StateDropdown.selectByIndex(3);
			StateDropdown.selectByIndex(5);
			StateDropdown.selectByIndex(7);
			
		}
		else
		{
			throw new Exception("Dropdown is a single option selection type");
			
		}
		
		   System.out.println("Test Completed");
		   
			
			
			
			
		}
		
				

      

	}

}
