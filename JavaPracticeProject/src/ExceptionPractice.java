
public class ExceptionPractice {

	public static void main(String[] args) {
		
		//Null pointer Exception
		String name = null;
		
		if(name != null) {
		System.out.println(name.length());
		}
		
		try {
			System.out.println(name.length());
		}catch(NullPointerException e){
			e.printStackTrace();//print log=log file
		}
	}

}
