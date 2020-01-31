package selenium_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class Chromebrowser_launch {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "browsers\\geckodriver.exe");
		WebDriver driver=new WebDriver();
		driver.get("https:facebook.com");
		driver.manage().window().maximize();
		
	

	}

}
