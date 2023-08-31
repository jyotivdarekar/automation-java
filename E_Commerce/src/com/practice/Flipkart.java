package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vikas\\\\OneDrive\\\\Desktop\\\\JyotiClass\\\\chromedriver_win32 (3)\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://Flipkart.com");
	}

}
