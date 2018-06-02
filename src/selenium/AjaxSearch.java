package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AjaxSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\tools\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("lst-ib")).sendKeys("seleniu");
		
		String first="//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul/li[";
		String last="]";
		int x=1;
		try {
		while(true)
		{
			System.out.println(driver.findElement(By.xpath(first+x+last)).getText());
			x++;
		}
		}catch(Throwable t) {
			System.out.println("done");
		}
	}

}
