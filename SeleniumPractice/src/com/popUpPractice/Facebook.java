package com.popUpPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

//Hidden Division Popup
public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vikas\\OneDrive\\Desktop\\a\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");

		// Hidden Division popup practice

		/*
		 * WebElement email = driver.findElement(By.id("email")); email.click();
		 * email.sendKeys("jyotivdarekar1994@gmail.com");
		 * 
		 * WebElement password = driver.findElement(By.id("pass")); password.click();
		 * password.sendKeys("jyovika85");
		 * 
		 * WebElement logIn = driver.findElement(By.xpath("//button[@name='login']"));
		 * logIn.click(); Thread.sleep(7000);
		 */

		WebElement createNewAccount = driver.findElement(By.xpath("(//a[@rel = 'async'])"));
		createNewAccount.click();
		Thread.sleep(7000);

		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("Jyoti");

		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastName.click();
		lastName.sendKeys("Darekar-Jadhav");

		WebElement email2 = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email2.click();
		email2.sendKeys("jyotivdarekar1994@gmail.com");

		WebElement reEmail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		reEmail.click();
		reEmail.sendKeys("jyotivdarekar1994@gmail.com");

		WebElement newPassword = driver.findElement(By.id("password_step_input"));
		newPassword.click();
		newPassword.sendKeys("jyovika85");

		WebElement day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select sDay = new Select(day);
		sDay.selectByIndex(9);

		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select sMonth = new Select(month);
		sMonth.selectByValue("8");

		WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select sYear = new Select(year);
		sYear.selectByVisibleText("1994");

		WebElement gender = driver.findElement(By.xpath("//input[@value='1']"));
		gender.click();

		WebElement signUp = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		signUp.click();

	}

}
