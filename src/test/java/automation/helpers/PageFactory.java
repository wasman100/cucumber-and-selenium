package automation.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageFactory {

	WebDriver driver;
	Actions act;
	
	public PageFactory(WebDriver driver) {
		
		this.driver = driver;
	}
	
	@FindBy(how=How.XPATH, using=".//*[@id='block_top_menu']/ul/li[1]/a")
	WebElement hover;

public void hovering() {

	act = new Actions(driver);
	act.moveToElement(hover).build().perform();
}

}