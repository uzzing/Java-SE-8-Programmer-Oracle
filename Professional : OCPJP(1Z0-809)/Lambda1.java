
interface Moveable1<Integer> {
	public default void walk(Integer distance) {
		System.out.print("Walking");
	}
	
	public void run(Integer distance);
}

public class Lambda1 {

	public static void main(String[] args) {
		Moveable1<Integer> animal = n -> System.out.print("Running" + n);
		animal.run(100);
		animal.walk(20);

	}

}
