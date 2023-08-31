package ExceptionHandling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserService {

	public static void main(String[] args) {
		// list supposed of size 75 only
		List<String> data = new ArrayList<>(Collections.nCopies(100, "myweb"));
		try {
			System.out.println("Hello");
			analyzeData1(data);
			System.out.println("Hi How are you?");
		} catch (ListTooLargeException e) {
			System.out.println("Method1");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("Method2");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Method2");
			e.printStackTrace();
		} finally {
			
		}
	}

	public static void analyzeData1(List<String> data) {
		analyzeData2(data);

	}

	public static void analyzeData2(List<String> data) {
		if (data.size() > 75) {
			throw new ListTooLargeException("the size of the data is too large");
		}

	}

}
