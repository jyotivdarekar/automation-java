package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import javafx.beans.property.SetProperty;

public class WebPageElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikas\\OneDrive\\Desktop\\JyotiClass\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://Amazon.com");
		
		driver.get("http://Facebook.com");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("pass"));
		WebElement element1 = driver.findElement(By.name("login"));
		element1.click();
	}

}
