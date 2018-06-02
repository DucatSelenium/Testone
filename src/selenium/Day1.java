package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\tools\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"u_0_l\"]")).sendKeys("Tester007");
		Thread.sleep(5000l);
		driver.findElement(By.xpath("//*[@id=\"u_0_c\"]")).click();
		
		driver.navigate().to("https://www.makemytrip.com/flights?cmp=SEM%7CD%7CDF%7CG%7CBrand%7CB_M_Makemytrip_Search_Exact%7CBrand_Top_5_Exact%7CExpanded%7C162031058804&s_kwcid=AL!1631!3!162031058804!e!!g!!makemytrip&ef_id=WSei2AAAAFoVLlTf%3A20180304051208%3As");
		driver.findElement(By.xpath("/html/body/div[2]/page-view/main/div/div/div[6]/div/div[5]/ul/li[9]/span/a[1]/span[2]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/page-view/main/div/div/div[4]/div/div/div[1]/label/span/span")).click();
		
		
		

	}

}
