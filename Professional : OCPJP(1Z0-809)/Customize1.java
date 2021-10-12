
class Test<T> {
	private T t;
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
}


public class Customize1 {

	public static void main(String[] args) {
		Test<String> type = new Test<>();
		Test type1 = new Test();
		
		type.set("Java");
		type1.set(100);
		
		System.out.print(type.get());
		System.out.print(type1.get());

	}
}
