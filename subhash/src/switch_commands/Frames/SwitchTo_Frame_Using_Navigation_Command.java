package switch_commands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame_Using_Navigation_Command 
{

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver", "browsers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");
		 driver.manage().window().maximize();
		 
		 
		 String FrameURL="https://www.cleartrip.com/signinstatic/tripidlogin.shtml?popup=no&guest=true";
		 driver.navigate().to(FrameURL);
		 
		 
		 WebElement Email_EB=driver.findElement(By.xpath("//input[@id='email']"));
		 Email_EB.clear();
		 Email_EB.sendKeys("iamsubhaash@gmail.com");
		 
		 
		 WebElement Trip_ID=driver.findElement(By.xpath("//input[@id='tripidSecond']"));
		 Trip_ID.clear();
		 Trip_ID.sendKeys("9676723976");
		 
		 
		 driver.navigate().back();
		 
		 

	}

}
