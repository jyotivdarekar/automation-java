
package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.pack.SignIn;
import utilities.Utility;

public class TestNG {

	private WebDriver driver;
	SignIn signIn;
	String email;
	String pass;

	@BeforeClass
	public void launchBrowser() {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://Amazon.com");
	}

	@BeforeMethod
	public void createObject() {
		signIn = new SignIn(driver);
	}

	@Test
	public void verifySignInPage() throws InterruptedException, EncryptedDocumentException, IOException {
		/*
		 * String actual = driver.getCurrentUrl(); String expected =
		 * "https://Amazon.com"; Assert.assertEquals(actual, expected);
		 * signIn.clickAccountDropdown(); signIn.clickSignInOption(); email=
		 * Utility.getDataFromExcel(0, 0); signIn.clickContinue(); pass =
		 * Utility.getDataFromExcel(0, 1); signIn.clickSignInButton();
		 */

	}

	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("Quit Browser");
		driver.quit();
	}
}

