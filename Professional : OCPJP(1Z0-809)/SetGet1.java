
class Test2<T> {
	
	private T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}	
}


public class SetGet1 {

	public static void main(String[] args) {
		Test2<String> type = new Test2<>();
		Test2 type1 = new Test2<>();
		type.set("Java");
		type1.set(100);
		
		System.out.print(type.get() + " " + type1.get());

	}

}
