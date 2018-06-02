package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HTMLunitDriver {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver","C:\\tools\\geckodriver.exe");
		
		System.setProperty("WebDriver.Chrome.Driver","C:\\tools\\chromedriver_win32\\chromedriver.exe");
		//Set Chrome Headless mode as TRUE
				//ChromeOptions options = new ChromeOptions();
				
				
				ChromeOptions options = new ChromeOptions();  
				options.addArguments("--headless");  
				//options.setHeadless(true);
				WebDriver driver = new ChromeDriver(options); 
				driver.get("http://google.com");
				System.out.println(driver.getTitle());
		

	}

}
