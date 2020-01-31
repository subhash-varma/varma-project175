package selenium_ObjectID;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_login {

	public static void main(String[] args) throws Exception 
	{
	   System.setProperty("webdriver.chrome.driver","browsers\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("http:facebook.com");
	   driver.manage().window().maximize();
	   
	   
	    driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("9676723976"+Keys.ENTER);
		
		driver.findElement(By.name("pass")).clear();
		driver.findElement(By.name("pass")).sendKeys("subhash@999");
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//button[@value='1'][contains(.,'Log In')]")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
	   
	   
	   


	}

}