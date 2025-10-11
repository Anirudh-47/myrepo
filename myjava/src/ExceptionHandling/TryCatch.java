package ExceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.length());	
		}catch(NullPointerException e) {
			System.out.println("The null values can't be read");
		}

	}

}
