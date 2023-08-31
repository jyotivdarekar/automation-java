package com.pack;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.SnapShot;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	
	
	public static void main(String[] args) throws IOException {
		Locators loc = new Locators();
		SnapShot sp = new SnapShot();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		sp.takeSnapShot(driver, "ss1");
		
		
		WebElement userName = driver.findElement(By.xpath(loc.USERNAME));
		userName.sendKeys("standard_user");
		sp.takeSnapShot(driver, "ss2");

		
		WebElement passWord = driver.findElement(By.xpath(loc.PASSWORD));
		passWord.sendKeys("secret_sauce");
		sp.takeSnapShot(driver, "ss3");
		
		WebElement logInButton = driver.findElement(By.xpath(loc.LoginButton));
		logInButton.click();
	}

}
