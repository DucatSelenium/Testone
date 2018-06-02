package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\tools\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://flipkart.com/");
		driver.manage().window().maximize();
		JavascriptExecutor method=(JavascriptExecutor) driver;
		method.executeScript("history.go(0);");
		Thread.sleep(3000l);
		//method.executeScript("window.alert('you are on wrong window');");
		method.executeScript("window.scrollBy(0,500);");
		
	}

}
