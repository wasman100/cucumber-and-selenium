package automation.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperMethods {

	static WebDriver driver;
	static WebDriverWait wait;
	static Actions act;
	
	public HelperMethods(WebDriver driver) {
		HelperMethods.driver = driver;
	}
	
	public static WebDriver GetWebsite(String url) {
		driver.get(url);
		
		return driver;
	}
	
//	public static WebDriver hoverOverElement(String path) {
//		
//		WebElement hover = driver.findElement(By.xpath(path));
//		act = new Actions(driver);
//		act.moveToElement(hover).build().perform();
//		
//		return driver;
//	}
}
