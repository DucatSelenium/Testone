package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileUpload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\tools\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/FileUpload/fileupload.html");
		driver.manage().window().maximize();
		Thread.sleep(5000l);
		driver.findElement(By.xpath("//html/body/form/input[1]")).sendKeys("C:\\Users\\Mohit Sharma\\Desktop\\Testing 121.jpg");

	}

}
