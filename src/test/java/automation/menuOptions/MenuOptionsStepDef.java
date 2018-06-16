package automation.menuOptions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automation.helpers.BrowserHelperMethod;
//import automation.helpers.BrowserHelperMethod;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MenuOptionsStepDef {
	WebDriver driver = null;
	WebDriverWait wait;
	Actions act;
	
	@Before
	public void setup() {
//		BrowserHelperMethod.startBrowser("chrome");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(6000);
		this.driver.manage().deleteAllCookies();
		this.driver.quit();
		this.driver = null;
//		BrowserHelperMethod.closeBrowser();
	}

	@Given("^User navigates to automation practise website$")
	public void user_navigates_to_automation_practise_website() throws Throwable {
	
//		BrowserHelperMethod.getWebsite("http://automationpractice.com/index.php");
		driver.get("http://automationpractice.com/index.php");
	}

	@When("^User hovers over women$")
	public void user_hovers_over_women() throws Throwable {
	
		
		WebElement hover = driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[1]/a"));
		act = new Actions(driver);
		act.moveToElement(hover).build().perform();
		

	}

	@And("^User selects evening from the sub menu$")
	public void user_selects_evening_from_the_sub_menu() throws Throwable {		
		
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='block_top_menu']/ul/li[1]/ul/li[2]/ul/li[2]/a")));
		driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[1]/ul/li[2]/ul/li[2]/a")).click();
	}

	@And("^User hovers over printed dress$")
	public void user_selects_printed_dress() throws Throwable {
	
		WebElement hover = driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img"));
		act = new Actions(driver);
		act.moveToElement(hover).build().perform();
	}

	@And("^User will click addtocart$")
	public void user_will_click_addtocart() throws Throwable {
	
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span")));
		driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span")).click();
	}

	@And("^User will click continue shopping$")
	public void user_will_click_continue_shopping() throws Throwable {
	
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/span/span")));
		driver.findElement(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/span/span")).click();

	}

	@When("^User hovers over women again$")
	public void user_hovers_over_women_again() throws Throwable {
	
		WebElement hover = driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[1]/a"));
		act = new Actions(driver);
		act.moveToElement(hover).build().perform();
	}

	@And("^User selects summer from the sub menu$")
	public void user_selects_summer_from_the_sub_menu() throws Throwable {
	
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='block_top_menu']/ul/li[1]/ul/li[2]/ul/li[3]/a")));
		driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[1]/ul/li[2]/ul/li[3]/a")).click();
	}

	@And("^User hovers over printed chiffon dress$")
	public void user_selects_printed_chiffon_dress() throws Throwable {
	
		WebElement hover = driver.findElement(By.xpath(".//*[@id='center_column']/ul/li[3]/div/div[1]/div/a[1]/img"));
		act = new Actions(driver);
		act.moveToElement(hover).build().perform();
	}

	@And("^User will click addtocart two$")
	public void user_will_click_addtocart_two() throws Throwable {
	
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='center_column']/ul/li[3]/div/div[2]/div[2]/a[1]/span")));
		driver.findElement(By.xpath(".//*[@id='center_column']/ul/li[3]/div/div[2]/div[2]/a[1]/span")).click();
	}

	@And("^User will click continue shopping two$")
	public void user_will_click_continue_shopping_two() throws Throwable {
	
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/span/span")));
		driver.findElement(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/span/span")).click();
	}

	@When("^User hovers over dresses$")
	public void user_hovers_over_dresses() throws Throwable {
	
		WebElement hover = driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/a"));
		act = new Actions(driver);
		act.moveToElement(hover).build().perform();
	}

	@And("^User selects casual from the sub menu$")
	public void user_selects_casual_from_the_sub_menu() throws Throwable {
		
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/ul/li[1]/a")));
		driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/ul/li[1]/a")).click();
	}

	@And("^User hovers over printed dress again$")
	public void user_selects_printed_dress_again() throws Throwable {
	
		WebElement hover = driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img"));
		act = new Actions(driver);
		act.moveToElement(hover).build().perform();
	}

	@And("^User will click addtocart three$")
	public void user_will_click_addtocart_three() throws Throwable {
	
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span")));
		driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span")).click();
	}

	@And("^User will click continue shopping three$")
	public void user_will_click_continue_shopping_three() throws Throwable {
	
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/span/span")));
		driver.findElement(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/span/span")).click();
	}

	@Then("^User will hover over and click on cart button$")
	public void user_will_hover_over_and_click_on_cart_button() throws Throwable {
	
		WebElement hover = driver.findElement(By.xpath(".//*[@id='header']/div[3]/div/div/div[3]/div/a"));
		act = new Actions(driver);
		act.moveToElement(hover).build().perform();
		
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='header']/div[3]/div/div/div[3]/div/a/b")));
		driver.findElement(By.xpath(".//*[@id='header']/div[3]/div/div/div[3]/div/a/b")).click();
	}

	@And("^User will verify there's three items in cart$")
	public void user_will_verify_there_s_three_items_in_cart() throws Throwable {
		
		String actualResult = driver.findElement(By.id("summary_products_quantity")).getText();
		String expectedResult = "3 Products";
		if(actualResult.equals(expectedResult)) {
			System.out.println("Test was successful! There are three products inside the cart!");
		}
		else {
			System.out.println("Houston, we have a problem");
	}

}
	
}
