package automation.helpers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BrowserHelperMethod {
	static WebDriverWait wait;
	static Actions act;
	static WebDriver driver;

public static WebDriver startBrowser(
String browserName) {
if(browserName.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	driver = new ChromeDriver();
}
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


return driver;
}

public static WebDriver getWebsite(String url) {
	driver.get(url);
	return driver;
}

public static void closeBrowser() {
	driver.manage().deleteAllCookies();
	driver.quit();
	driver.quit();
	driver = null;
}

}




