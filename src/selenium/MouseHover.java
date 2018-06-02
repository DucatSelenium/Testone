package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\tools\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//html/body/div[2]/div/div/button")).click();
		WebElement menu= driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[3]/div/ul/li[3]/a/span")); 
		
		Actions action = new Actions(driver);
		//action.moveToElement(menu).build();
		//Thread.sleep(5000l);
		
		action.moveToElement(menu).perform();
		Thread.sleep(5000l);
		driver.findElement(By.xpath("//span[text()='Casio']")).click();
		
		
	
		
		//driver.quit();
		
		
		
		
		

	}

}
