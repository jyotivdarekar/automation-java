import java.util.Scanner;

public class Height {

	public static void main(String[] args) {
		
		Height height1 = new Height();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Height of person");
		double height = sc.nextDouble();
		
		height1.checkHeight(height);
		
	}
	

		
		
	public void checkHeight(double height) {
		if ((height >= 150.0) && (height <= 170.0))
		{
			System.out.println("Person is average height person");
		} 
		else if ((height > 170.0) && (height <= 195.0)) 
		{
			System.out.println("Person is taller");
		}
		else if (height < 150.0) 
		{
			System.out.println("Person is dwarf");
		} 
		else
			System.out.println("Abnormal height ");
	}
	
	
		
	

}
