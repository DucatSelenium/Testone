package selenium;

import java.net.StandardSocketOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class captch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\tools\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://timesofindia.indiatimes.com/home/polls");
		driver.manage().window().maximize();
		Thread.sleep(5000l);
		driver.findElement(By.xpath("//html/body/div[3]/div[2]/span/a[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"pollform\"]/div/div[2]/div/input[1]")).click();
		
		String str= driver.findElement(By.xpath("//*[@id=\"mathq\"]")).getText();
		
		System.out.println(str);
		
		String first=str.substring(0,1);
		String second=str.substring(4,5);
		String opt=str.substring(2,3);
		
		System.out.println(first+"\t"+second+"\t"+opt);
		
		int sum = 0;
		
		switch(opt) {
		case"+":
		{
			sum=Integer.parseInt(first)+Integer.parseInt(second);
			break;
		}
		case"-":{
			sum=Integer.parseInt(first)-Integer.parseInt(second);
		break;
		}
		
		}
		driver.findElement(By.xpath("//*[@id=\"mathuserans\"]")).sendKeys(Integer.toString(sum));
		
		
		
		

	}

}
