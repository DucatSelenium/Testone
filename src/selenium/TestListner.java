package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TestListner {

	public static void main(String[] args) throws InterruptedException {
		
		WebListner listner= new WebListner();
		System.setProperty("webdriver.gecko.driver","C:\\tools\\geckodriver.exe");
		WebDriver webdriver = new FirefoxDriver();
		
		EventFiringWebDriver driver= new EventFiringWebDriver(webdriver);
		driver.register(listner);
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000l);
		driver.findElement(By.xpath("//*[@id=\"loginsubmit\"]")).click();
		driver.navigate().back();
		Thread.sleep(3000l);
		driver.navigate().forward();
		Set<String> wind=driver.getWindowHandles();
		Iterator<String> iterate=wind.iterator();
		System.out.println(wind+"\n"+iterate);
		String wind1=iterate.next();
		String wind2=iterate.next();
		System.out.println(wind1+"\n"+wind2);
		System.out.println(driver.switchTo().window(wind2).getTitle());
		System.out.println(driver.switchTo().window(wind1).getTitle());
		

	}

}
