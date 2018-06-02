package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;

public class Mouse_Move {

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\tools\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000l, TimeUnit.MILLISECONDS);
		//EventFireing
		Locatable hoverIte=(Locatable) driver.findElement(By.xpath("//*[@id='gbw']/div/div/div/div[2]/a"));
		
		System.out.println(hoverIte);
		
		Coordinates cord=hoverIte.getCoordinates();
		
		
		
		
		
		
		
		

	}

}
