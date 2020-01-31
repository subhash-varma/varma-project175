package find_elements;

import java.awt.List;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicComboBoxUI.ListDataHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Get_Specific_Data_From_DynamicRows {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "browsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx");			  
		driver.manage().window().maximize();
		
		
		WebElement Markets=driver.findElement(By.xpath("//a[contains(.,'markets')]"));
		Markets.click();
		
		
		WebElement Table=driver.findElement(By.id("dvToplooser"));
		
		
		List<WebElement> rows=Table.findElements(By.tagName("tr"));
		
		
		
		
		
		
		
		
		 
		
		

		
	}

}
