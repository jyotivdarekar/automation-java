package StepDefinations;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginSteps {
	WebDriver driver;

	@Before
	public void setProperty() {
		System.setProperty("webdriver.chromedriver",
				"C:\\Users\\vikas\\Fusion-Nov\\CucumberDemo\\src\\test\\resources\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@Given("User should be on login page")
	public void user_should_be_on_login_page() {
		driver.get("https://www.facebook.com/login");
	}

	@When("User enters Username as {string}")
	public void user_enters_username_as(String UserName) {
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("jyotivdarekar1994@gmail.com");
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String PassWord) {
		WebElement password = driver.findElement(By.id("pass"));
		password.click();
		password.sendKeys("jyovika85");
	}

	@When("User clicks on login button {int}")
	public void user_clicks_on_login_button(Integer int1) {
		WebElement loginButton = driver.findElement(By.id("loginbutton"));
		loginButton.click();

	}

	@Then("User should be redirected to the Home page")
	public void user_should_be_redirected_to_the_home_page() {
		String Actual = driver.getCurrentUrl();
		String Expected = "https://www.facebook.com/mobileprotection?source=mobile_mirror_nux";
		Assert.assertEquals(Expected, Actual);
	}

	@When("User get the title of page")
	public void user_get_the_title_of_page() {
		System.out.println(driver.getTitle());
	}

	@Then("Page title should be verified")
	public void page_title_should_be_verified() {
		
	}

}
