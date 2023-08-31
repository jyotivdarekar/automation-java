package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	public static String getDataFromExcel(int row, int col) throws EncryptedDocumentException, IOException {

		int r = row;
		int c = col;

		String path = "C:\\Users\\vikas\\OneDrive\\Desktop\\Fusion.xlsx";
		FileInputStream File = new FileInputStream(path);
		String input = WorkbookFactory.create(File).getSheet("Data").getRow(r).getCell(c).getStringCellValue();
		return input;

	}
	
//	public static void takeScrrenshot(WebDriver driver, int testID) throws IOException
//	{
//		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File dest = new File("test-output"+File.pathSeparator+"testScreenshots"+File.separator+"Test_"+testID+"Date and Time"+".jpg");
//		FileHandler.copy(source, dest);
//	}
	
	
}
