package corejava_method;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot {
	

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","browsers\\chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("http://gmail.com");
		chrome.manage().window().maximize();
		
		chrome.findElement(By.id("identifierId")).sendKeys("9676723976");
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
	

	}

}
