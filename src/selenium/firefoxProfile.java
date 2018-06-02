package selenium;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class firefoxProfile {

	public static void main(String[] args) {
		
		ProfilesIni listProfile=new ProfilesIni();
		FirefoxProfile profile1=listProfile.getProfile("tester");
		FirefoxProfile profile2=listProfile.getProfile("default");
		//WebDriver driver = new FirefoxDriver((Capabilities) profile1);
		System.setProperty("webdriver.gecko.driver","C:\\tools\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver((Capabilities) profile1);
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		WebDriver driver2 = new FirefoxDriver((Capabilities) profile2);
		driver2.get("https://facebook.com");
		
		driver2.manage().window().maximize();
		

	}

}
