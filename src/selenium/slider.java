package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\tools\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/slider/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement slider= driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		
		WebElement bar=driver.findElement(By.xpath("//*[@id=\"slider\"]"));
		
		System.out.println(slider.getSize());
		
		System.out.println(slider.getLocation());
		
		System.out.println(bar.getSize());
		
		System.out.println(bar.getLocation());
		
		Actions action = new Actions(driver);
		
		action.dragAndDropBy(slider, 400, 0).perform();
		
	}

}
