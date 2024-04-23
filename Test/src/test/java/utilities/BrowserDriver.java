package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {

	
		// TODO Auto-generated method stub
		public static WebDriver driver;
		public ChromeOptions option;
		public BrowserDriver()
		{
		
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\Aniket\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		public void close()
		{
		driver.close();
	}

}
