package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.annotation.processing.FilerException;

public class ReadFile {
	
	public static void main(String[] args){
		//FileInputStream file = null;
		
		try {
			FileInputStream file = new FileInputStream("F://folder//temp.txt");
		}catch(FileNotFoundException e) {
			try {
				throw new FileException("please check your file path", e);
			}catch(Exception ex){
				ex.getMessage();
				ex.printStackTrace();
			}
		}
		
	}

}
