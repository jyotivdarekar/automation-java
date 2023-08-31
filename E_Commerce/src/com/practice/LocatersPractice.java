package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatersPractice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vikas\\OneDrive\\Desktop\\JyotiClass\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.get("http://Myntra.com");
		driver.get("https://Flipkart.com/");

		// WebElement container = driver.findElement(By.id("container"));
		// container.click();

		// WebElement search = driver.findElement(By.name("search"));
		// search.click();
		
		//driver.get("https://www.firstcry.com");
		//driver.get("https://www.firstcry.com/m/login?URL=https://www.firstcry.com/");
		//WebElement email = driver.findElement(By.id("lemail"));
	    //email.click();
	    //email.sendKeys("jyotivdarekar1994@gmail.com");
	     
	    
	}

}
