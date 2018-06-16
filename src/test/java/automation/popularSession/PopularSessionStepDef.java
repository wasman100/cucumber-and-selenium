package automation.popularSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PopularSessionStepDef {
//	
//	WebDriver driver = null;
//	WebDriverWait wait;
//	Actions act;
//	
//	@Before
//	public void setup() {
//		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
//		this.driver = new ChromeDriver();
//		this.driver.manage().window().maximize();
//		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
////		BrowserHelperMethod.startBrowser("chrome");
//
//	}
//	
//	@After
//	public void tearDown() throws InterruptedException {
//		Thread.sleep(6000);
//		this.driver.manage().deleteAllCookies();
//		this.driver.quit();
//		this.driver = null;
////		BrowserHelperMethod.closeBrowser();
//
//	}
//
//	@Given("^User navigates to automationpractice website$")
//	public void user_navigates_to_automationpractice_website() throws Throwable {
////		BrowserHelperMethod.getWebsite("http://automationpractice.com/index.php");
//		driver.get("http://automationpractice.com/index.php");
//	}
//
//	@When("^User will click on image with the title Faded Short Sleeve T-Shirts$")
//	public void user_will_click_on_image_with_the_title_Faded_Short_Sleeve_T_Shirts() throws Throwable {
//		
//		driver.findElement(
//				By.xpath(
//				"//img[@title='Faded Short Sleeve T-shirts']")).click();
//	}
//
//	@And("^User clicks on Add to cart on Faded Short Sleeve T-Shirts pop up page$")
//	public void user_clicks_on_Add_to_cart_on_Faded_Short_Sleeve_T_Shirts_pop_up_page() throws Throwable {
//		WebElement iframe = driver.findElement(
//				By.xpath("//iframe[@src='http://automationpractice.com/index.php?id_product=1&controller=product&content_only=1']"));
//		new WebDriverWait(driver, 30).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
//		Thread.sleep(2000L);
//		driver.findElement(By.xpath(".//*[@id='add_to_cart']/button")).click();	
//	}
//
//	@And("^User will click on Continue shopping after Faded Shirt Sleeve T-Shirt has been added to cart$")
//	public void user_will_click_on_Continue_shopping_after_Faded_Shirt_Sleeve_T_Shirt_has_been_added_to_cart() throws Throwable {
//	
//		 Thread.sleep(2000L);
//	        driver.findElement(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/span/span")).click();
//			driver.switchTo().defaultContent();
//	}
//
//	@When("^User will click image with the title Printed Chiffllon Dress$")
//	public void user_will_click_image_with_the_title_Printed_Chiffllon_Dress() throws Throwable {
//	
//		driver.findElement(
//				By.xpath(
//				"//img[@title='Printed Chiffon Dress']")).click();	
//	}
//
//	@And("^User clicks on Add to cart on Printed Chiffllon Dress pop up page$")
//	public void user_clicks_on_Add_to_cart_on_Printed_Chiffllon_Dress_pop_up_page() throws Throwable {
//		WebElement iframe = driver.findElement(
//				By.xpath("//iframe[@src='http://automationpractice.com/index.php?id_product=7&controller=product&content_only=1']"));
//		new WebDriverWait(driver, 30).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
//		Thread.sleep(2000L);
//		driver.findElement(By.xpath(".//*[@id='add_to_cart']/button")).click();
//	
//	}
//
//	@And("^User will click on Continue shopping after Printed Chiffllon Dress has been added to cart$")
//	public void user_will_click_on_Continue_shopping_after_Printed_Chiffllon_Dress_has_been_added_to_cart() throws Throwable {
//	
//		Thread.sleep(2000L);
//        driver.findElement(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/span/span")).click();
//        driver.switchTo().defaultContent();
//        Thread.sleep(2000L);
//        
//	}
//
//	@When("^User will click image with the title Blouse$")
//	public void user_will_click_image_with_the_title_Blouse() throws Throwable {
//		Thread.sleep(2000L);
//		driver.findElement(
//				By.xpath(
//				".//*[@src=\'http://automationpractice.com/img/p/7/7-home_default.jpg\']")).click();	
//		
//	}
//
//	@And("^User clicks on Add to cart on Blouse pop up page$")
//	public void user_clicks_on_Add_to_cart_on_Blouse_pop_up_page() throws Throwable {
//	
//		WebElement iframe = driver.findElement(
//				By.xpath("//iframe[@src='http://automationpractice.com/index.php?id_product=2&controller=product&content_only=1']"));
//		new WebDriverWait(driver, 30).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
//		Thread.sleep(2000L);
//		driver.findElement(By.xpath(".//*[@id='add_to_cart']/button")).click();
//	}
//
//	@And("^User will click on Continue shopping after Blouse has been added to cart$")
//	public void user_will_click_on_Continue_shopping_after_Blouse_has_been_added_to_cart() throws Throwable {
//	
//		Thread.sleep(2000L);
//        driver.findElement(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/span/span")).click();
//        driver.switchTo().defaultContent();
//	}
//
//	@When("^User clicks on the Cart button$")
//	public void user_clicks_on_the_Cart_button() throws Throwable {
//	
//		driver.findElement(By.xpath(".//*[@href=\'http://automationpractice.com/index.php?controller=order\']")).click();
//	}
//
//	@Then("^User will be taken to Cart page to verify all his items were added$")
//	public void user_will_be_taken_to_Cart_page_to_verify_all_his_items_were_added() throws Throwable {
//	
//		String actualResult = driver.findElement(By.id("summary_products_quantity")).getText();
//		String expectedResult = "3 Products";
//		if(actualResult.equals(expectedResult)) {
//			System.out.println("Test was successful! There are three products inside the cart!");
//		}
//		else {
//			System.out.println("Houston, we have a problem");
//		}
//	}
//
//

}

