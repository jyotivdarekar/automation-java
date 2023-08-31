package com.popUpPractice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUploadingPractice {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chromedriver", "C:\\Users\\vikas\\chromedriver_win32_111.0.556\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		Thread.sleep(3000);
		WebElement select =driver.findElement(By.xpath("//span[text()='Select WORD files']"));
		
		
		
		Thread.sleep(3000);
		select.click();
		//Thread.sleep(3000);
		
		
		//  JavascriptExecutor js = (JavascriptExecutor)driver; Thread.sleep(3000);
		 //js.executeScript("arguments[0].click();", select); Thread.sleep(3000);
		 
		
		Runtime.getRuntime().exec("C://Users//vikas//OneDrive//Desktop//AutoItScript//upload1.exe"+" "+"C:\\Users\\vikas\\OneDrive\\Desktop\\JyotiClass\\ExternalMockInterviewQue26feb.rtf.doc");
		Thread.sleep(5000);
		WebElement convert = driver.findElement(By.id("processTaskTextBtn"));
		convert.click();
		
		
		Thread.sleep(5000);
		
		
		Runtime.getRuntime().exec("C://Users//vikas//OneDrive//Desktop//AutoItScript//download.exe"+" "+"C:\\Users\\vikas\\OneDrive\\Desktop\\DownloadAutoIt");
		Thread.sleep(7000);
		WebElement download = driver.findElement(By.id("pickfiles"));
		Thread.sleep(4000);
		download.click();
		/*
		 * driver.get("https://the-internet.herokuapp.com/upload");
		 * 
		 * WebElement choose =
		 * driver.findElement(By.xpath("//input[@id='file-upload']"));
		 * choose.sendKeys("C:\\Users\\vikas\\OneDrive\\Desktop\\JyotiClass\\jira.rtf");
		 * 
		 * WebElement upload1 =
		 * driver.findElement(By.xpath("//input[@value='Upload']")); upload1.click();
		 */
		
		//C:\Users\vikas\OneDrive\Desktop\JyotiClass\ExternalMockInterviewQue26feb.rtf.doc
		
		//System.out.println("Program finished");
	}

}
