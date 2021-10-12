
class Customer {
	private String fName;
	private String lName;
	private static int count;
	
	public Customer(String first, String last) {
		fName = first;
		lName = last;
		++count;
	}
	
	static { count = 0; System.out.print("done"); }
	
	public static int getCount() {
		return count;
	}
}

public class static1 {

	public static void main(String[] args) {
		
		StaticCustomer c1 = new StaticCustomer("1", "Smith");
		StaticCustomer c2 = new StaticCustomer("2", "Smith");
		StaticCustomer c3 = new StaticCustomer("3", "Smith");
		StaticCustomer c4 = new StaticCustomer("4", "Smith");
		
		c4 = null;
		c3 = c2;
		System.out.print(StaticCustomer.getCount());
	}

}
