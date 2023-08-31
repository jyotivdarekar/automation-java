package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogInPage {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		

		WebElement uName = driver.findElement(By.id("email"));
		String path = "C:\\Users\\vikas\\OneDrive\\Desktop\\Fusion.xlsx";
		FileInputStream is = new FileInputStream(path);
		//getInput();
		double unameValue = WorkbookFactory.create(is).getSheet("Data").getRow(0).getCell(2).getNumericCellValue();
		System.out.println(unameValue);
		uName.sendKeys(String.valueOf(unameValue));

		// uName.sendKeys(Double.toString(unameValue));
		
		

		WebElement pass = driver.findElement(By.id("pass"));
		pass.click();
		String path1 = "C:\\Users\\vikas\\OneDrive\\Desktop\\Fusion.xlsx";
		FileInputStream is1 = new FileInputStream(path1);
		String passValue = WorkbookFactory.create(is1).getSheet("Data").getRow(1).getCell(1).getStringCellValue();
		System.out.println(passValue);
		pass.sendKeys(passValue);
		
	}

//	 static FileInputStream getInput() throws FileNotFoundException,EncryptedDocumentException {
//		String path = "C:\\Users\\vikas\\OneDrive\\Desktop\\Fusion.xlsx";
//		FileInputStream is = new FileInputStream(path);
//		return is;
		
	}


