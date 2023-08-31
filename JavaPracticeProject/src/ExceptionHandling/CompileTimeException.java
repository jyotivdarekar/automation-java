package ExceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CompileTimeException {

	public static void main(String[] args) throws IOException {
		fileMethod();
	}

	public static void fileMethod() {
		try {
			FileReader file = new FileReader("C:\\test\\a.txt");
			BufferedReader fileInput = new BufferedReader(file);
			for (int counter = 0; counter < 3; counter++)
				System.out.println(fileInput.readLine());
			fileInput.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
