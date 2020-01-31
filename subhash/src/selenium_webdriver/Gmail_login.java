package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_login 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
	   
		System.setProperty("webdriver.chrome.driver","browsers\\chromedriver.exe");

		
		WebDriver driver=new ChromeDriver();
		driver.get("http:gmail.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("subhashsunkari92@gmail.com"+Keys.ENTER);
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("subhash999"+Keys.ENTER);
		
		
		
		
		
		
		
		
		
		
		
	}

}
