
public class argsLength {
	
	public static final int MIN = 1;
	
	
	public static void main(String[] args) {
		
		int x = args.length;
		
		if (checkLimit (x)) {
			System.out.print("java se");
		} else {
			System.out.print("java ee");
		}
	
	}
	public static boolean checkLimit(int x ) {
		return (x >= MIN) ? true : false;
	}

}
