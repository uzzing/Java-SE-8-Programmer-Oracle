
public class NullObject {

	public static void main(String[] args) {
		
		String str = null;
		String str1 = new String();
		System.out.println(str); // null
		System.out.println(str1); // 0

		Integer x = new Integer("3");
		System.out.println(x); // 3
		
		DerivedB b = new DerivedB();
		System.out.println(b); // address
	}

}
