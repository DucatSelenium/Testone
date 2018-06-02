package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class WebListner extends AbstractWebDriverEventListener {
	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("click performed");
	}
	public void afterNavigateBack(WebDriver driver) {
		System.out.println("Navigate Back");
		
	}
	public void afterNavigateForward(WebDriver driver) {
		System.out.println("Navigate forward");
	}
	public void afterNavigateRefresh(WebDriver driver) {
		System.out.println("refreshed");
	}
}
