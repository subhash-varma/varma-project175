package javascript_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Examples 
{

	private static final String Runrime_url = null;

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "browsers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		String Runtime_title=js.executeScript("return document.title").toString();
		System.out.println("Current window title is => "+Runtime_title);
		
		
		String Runtime_url=js.executeScript("return window.location.href").toString();
		System.out.println("Current window title is => "+Runrime_url);
		
		
		js.executeScript("document.getElementBy()")
		
		
		
		
		
		
		
		
		

	}

}
