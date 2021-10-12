

class Foo {
	public void methodB(String s) {
		System.out.print("Foo" + s);
	}
}

class Bar extends Foo {
	public void methodB(String s) {
		System.out.print("Bar" + s);
	}
}


class Baz extends Bar {
	public void methodB(String s) {
		System.out.print("Baz" + s);
	}
}


class Daze extends Baz {
	private Bar bb = new Bar();
	public void methodB(String s) {
		bb.methodB(s);
		super.methodB(s);
	}
}


public class Constructor1 {

	public static void main(String[] args) {
		
		Baz d = new Daze();
		d.methodB("Hello");
	}

}
