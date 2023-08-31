 package com.popUpPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vikas\\OneDrive\\Desktop\\JyotiClass\\chromedriver_win32 (3)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement alert1 = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		alert1.click();
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		WebElement alert2 = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		alert2.click();
		driver.switchTo().alert().accept();
		
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		
		
		
		
		Alert alert3 = driver.switchTo().alert();
		
		System.out.println(alert3.getText());
		alert3.sendKeys("welcome");
		alert3.accept();

		
		
		
		
		
		
		

	}
	}