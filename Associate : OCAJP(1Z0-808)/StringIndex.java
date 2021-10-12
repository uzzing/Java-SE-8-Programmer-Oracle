
public class StringIndex {
	public static void main(String[] args) {
		String myStr = " Hello Hello ";
		myStr = myStr.trim();
		
		int i = myStr.indexOf("lo", 6);
		System.out.println(i);
	}
}
