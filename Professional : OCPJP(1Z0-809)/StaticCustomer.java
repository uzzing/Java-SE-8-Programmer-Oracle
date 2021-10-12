
class Customer1 {
	private String fName;
	private String lName;
	private static int count;
	
	public Customer1(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
		++count;
	}
	
	static { count = 0; } // ??
	
	public static int getCount() {
		return count;
	}
	
}

public class StaticCustomer {

	public static void main(String[] args) {
		
		Customer1 c1 = new Customer1("Larray", "Smith");
		Customer1 c2 = new Customer1("Larray", "Smith");
		Customer1 c3 = new Customer1("Larray", "Smith");
		Customer1 c4 = new Customer1("Larray", "Smith");
		
		c4 = null;
		c3 = c2;
		
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		System.out.print(Customer1.getCount());
	}

}
