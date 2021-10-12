
interface I {
	public void displayI();
}

class C2 {
	public void displayC2() {
		System.out.print("c2");
	}
}

class C3 extends C2 implements I {
	public void displayI() {
		System.out.print("c3");
	}
}

public class C1 {
	C2 obj1 = new C3();
	I obj2 = new C3();
	
	C2 s = (C3) obj2;
	I t = (C3) obj1;
	
	
}
