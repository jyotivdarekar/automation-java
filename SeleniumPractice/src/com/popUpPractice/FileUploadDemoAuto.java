package com.popUpPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemoAuto {
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "C:\\Users\\vikas\\OneDrive\\Desktop\\JyotiClass\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement choose = driver.findElement(By.id("imagesrc"));
		choose.sendKeys("C:\\Users\\vikas\\OneDrive\\Desktop\\JyotiClass\\InstagramTestCases.xlsx");
		
		
		
		

		
	}

}
