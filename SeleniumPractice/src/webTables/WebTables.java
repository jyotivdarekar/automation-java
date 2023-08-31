package webTables;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTables {
	public static void main(String[] args) {

		System.setProperty("webdriver.chromedriver",
				"C:\\Users\\vikas\\OneDrive\\Desktop\\a\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_table_intro");

		driver.switchTo().frame("iframeResult");

		List<WebElement> row = driver.findElements(By.xpath("//table//tr"));
		List<WebElement> column = driver.findElements(By.xpath("//table//tr//th"));

		System.out.println("rows = " + row.size());
		System.out.println("column = " + column.size());

		for (int i = 1; i <= column.size(); i++) {
			String heading = driver.findElement(By.xpath("//table//tr[1]//th[" + i + "]")).getText();
			System.out.print(heading + "          ");

		}
		System.out.println();
		
		for(int i = 2; i<=row.size();i++) {
			for(int j = 1;j<=column.size();j++) {
				String data = driver.findElement(By.xpath("//table//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(data + "          ");
			}System.out.println();
		}
		
		

	}

}
