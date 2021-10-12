

class DerivedB extends DerivedA {
	
	int test;
	
	public void test() {
		System.out.println("DerivedB");
	}

	public static void main(String[] args) {
		Base b1 = new DerivedB();
		Base b2 = new DerivedA();
		Base b3 = new DerivedB();
		
		b1.test();
		b2.test();
		b3.test();
		
		b1 = (Base) b2;
		
		Base b4 = (DerivedA) b2;
		
		b1.test();
		b3.test();
		b4.test();
		
		DerivedA b5 = new DerivedA();
		b5 = (DerivedB) b3;
		b5.test();

	}

}
