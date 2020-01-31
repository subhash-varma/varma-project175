package corejava_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Firefox_browser {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mypc\\Downloads\\subhash selenium\\subhash\\browsers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("iamsubhaash");
		
		
		
		

	}
}