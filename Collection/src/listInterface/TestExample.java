package listInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter list size");
		int alSize = sc.nextInt();
		List<Integer> al = new ArrayList<Integer>(alSize);
		
		 int count = 0;
		 System.out.println("Enter a values ");
		 
		for(int i=0;i<alSize;i++) {
			int value = sc.nextInt();
			al.add(value);
			if(value%2==0) {
				count++;
			}
			
		}
		System.out.println("Even count = "+count);
		
	}

}
