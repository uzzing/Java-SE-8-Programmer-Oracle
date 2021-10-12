
public class TryCatch {

	public static void main(String[] args) {
		
		try {
			int num = 10;
			int div = 0;
			int ans = num / div;
		} catch (ArithmeticException e) {
			int ans = 0;
		}

	}

}
