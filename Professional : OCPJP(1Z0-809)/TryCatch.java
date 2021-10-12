
public class TryCatch {
	
	public static void doStuff(String s) {
		try {
			if (s == null) {
				throw new NullPointerException();
			}
		} 
		finally {
			System.out.print("finally");
		}
		
		System.out.print("doStuff");
	}

	public static void main(String[] args) {
		try {
			doStuff(null);
		} catch (NullPointerException e) {
			System.out.print("catch");
		}


	}

}
