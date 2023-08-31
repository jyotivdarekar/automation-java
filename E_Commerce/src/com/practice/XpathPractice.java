package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikas\\OneDrive\\Desktop\\JyotiClass\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://msbte.org.in/");
		Thread.sleep(2000);
		
		Dimension d = new Dimension(400,600);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
		WebElement openMenu = driver.findElement(By.xpath("//button[text() = 'Open menu']"));
		openMenu.click();
		
		Dimension d1 = new Dimension(800,800);
		driver.manage().window().setSize(d1);
		Thread.sleep(2000);
		
		
		
		WebElement regionalOffices = driver.findElement(By.xpath("//a[text() = 'Regional Offices']"));
		regionalOffices.click();
		
		WebElement puneRegion = driver.findElement(By.xpath("//a[text() = 'Pune Region']"));
		puneRegion.click();
		System.out.println("puneRegion.getText()");
		
		Thread.sleep(4000);
		
		driver.navigate().back();
		driver.navigate().back();
		
		WebElement examination = driver.findElement(By.xpath("//a[text() = 'Examination']"));
		examination.click();
		
		
		WebElement questionpaper = driver.findElement(By.xpath(" //a[text() = 'Question Paper Search']"));
		questionpaper.click();
		 
		
		
		
		
		
		
		//driver.close();
	}

}
