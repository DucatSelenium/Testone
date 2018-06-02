package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\tools\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		
		WebElement dropDown= driver.findElement(By.xpath("//select[@id='searchLanguage']"));
		
		dropDown.sendKeys("Dansk");
		
		Select select= new Select(dropDown);
		select.selectByValue("el");
		
		List<WebElement> values=dropDown.findElements(By.tagName("Option"));
		System.out.println(values.size());
		for(int i=0;i<values.size();i++) {
			
			System.out.println("Values are"+values.get(i).getText());
			
		}
		
		
		
		

	}

}
